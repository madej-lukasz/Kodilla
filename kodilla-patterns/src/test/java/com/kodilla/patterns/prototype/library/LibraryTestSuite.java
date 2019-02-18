package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks (){
        //Given
        Book book1 = new Book("ksiazka 1", "Autor 1", LocalDate.of(1952,1,1));
        Book book2 = new Book("ksiazka 2", "Autor 2", LocalDate.of(1972,1,1));
        Book book3 = new Book("ksiazka 3", "Autor 3", LocalDate.of(1982,1,1));
        Book book4 = new Book("ksiazka 4", "Autor 4", LocalDate.of(2005,1,1));

        Library library = new Library("Library number 1");
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);

        Library clonedLibrary =null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        library.books.remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3,library.getBooks().size());
        Assert.assertEquals(3,clonedLibrary.getBooks().size());
        Assert.assertEquals(4,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());
    }
}
