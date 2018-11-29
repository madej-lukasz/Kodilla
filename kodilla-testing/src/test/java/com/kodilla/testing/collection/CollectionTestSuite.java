package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    ArrayList<Integer> normalArrayList = new ArrayList<>();
    ArrayList<Integer> oddArrayExtract = new ArrayList<>();
    ArrayList<Integer> emptyArrayList = new ArrayList<>();


    @Before
    public void before(){
        System.out.println("Test Case: begin");
        normalArrayList = new ArrayList<>();
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
        System.out.println("Empty arrayList size: " + emptyArrayList.size());
        System.out.println("Normal arrayList size: " + normalArrayList.size());
        //When
        OddNumbersExterminator completedList = new OddNumbersExterminator(emptyArrayList);
        completedList.exterminate(emptyArrayList);
        System.out.println("Empty arrayList size: " + emptyArrayList.size());
        System.out.println("Normal arrayList size: " + normalArrayList.size());
        //Then
        Assert.assertEquals(normalArrayList, emptyArrayList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
      /*  Random generator = new Random();
        int randomNumber = generator.nextInt(30);
        for (int i=0; i < randomNumber; i++) {

            normalArrayList.add(generator.nextInt(30));
        */

        ArrayList<Integer> normalArrayList = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> oddArrayExtract = new ArrayList(Arrays.asList(2,4,6,8));
        for (int i=0; i < normalArrayList.size(); i++) {
            if (normalArrayList.get(i) % 2 == 0)

            System.out.println(normalArrayList.get(i));

        }
        System.out.println("ArrayList size: " + normalArrayList.size());
        //When
        OddNumbersExterminator completedList = new OddNumbersExterminator(normalArrayList);
        completedList.exterminate(normalArrayList);

        for (Object i : normalArrayList) {
            System.out.println(i.toString());
        }
        System.out.println("ArrayList size: " + completedList.size());

        for (Object i : oddArrayExtract) {
            System.out.println(i.toString());
        }
        System.out.println("ArrayList size: " + oddArrayExtract.size());
        //Then
        Assert.assertEquals(oddArrayExtract, normalArrayList);
    }
}