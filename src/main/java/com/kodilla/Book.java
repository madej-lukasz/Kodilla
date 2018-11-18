package com.kodilla;

import java.util.HashMap;
import java.util.LinkedList;

class Book {
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public boolean equals(Object o){
        Book e = (Book) o;
        return (author.equals(e.getAuthor())) &&
                (title.equals(e.getTitle()));
    }
}

class BookList {

    public static void main(String[] args) {

        int milion = 1000 *1000;

        LinkedList<Book> bookList = new LinkedList<Book>();

        for(int i= 0; i< milion; i++) {
            bookList.add(new Book("Author" +i, "Title " +i));
        }
        Book linkBook = new Book("Miczkiewicz ", "Pan Tadeusz");

        System.out.println("Start");
        System.out.println("LinkedList");

        long begin = System.nanoTime();
        bookList.add(0, new Book("Author", "title"));
        long end = System.nanoTime();

        System.out.println("Adding the first element has taken: " + (end - begin));

        begin = System.nanoTime();
        Book remove = bookList.remove(0);
        end = System.nanoTime();

        System.out.println("Remove the first element has taken: " + (end-begin));

        begin = System.nanoTime();
        bookList.add(bookList.size(), new Book("Author" , "title"));
        end = System.nanoTime();

        System.out.println("Adding last element has taken: " + (end-begin));

        begin = System.nanoTime();
        bookList.remove(bookList);
        end = System.nanoTime();

        System.out.println("Remove last element has taken: " + (end-begin));

        HashMap<Book, String> bookList2 = new HashMap<Book, String>();

        for( int n=0; n< 10000; n++) {
            bookList2.put(new Book("Author" +n, "Title" +n), ("Signature number"  + 1000));

        }
        Book hashBook = new Book("Miczkiewicz", "Pan Tadeusz");
        long begin2 = System.nanoTime();
        bookList2.put(new Book("Author", "Title"), ("Signature number" ));
        long end2 = System.nanoTime();


        System.out.println("HashMap:");
        System.out.println("Adding new element has taken: " + (end2-begin2));

        begin2 = System.nanoTime();
        bookList2.containsKey(bookList2);
        end2 = System.nanoTime();
        System.out.println("Search time of the key is: " + (end2-begin2));

        begin2 = System.nanoTime();
        bookList2.remove(bookList2);
        end2 = System.nanoTime();
        System.out.println("Remove has taken: " + (end2-begin2));


    }
}

