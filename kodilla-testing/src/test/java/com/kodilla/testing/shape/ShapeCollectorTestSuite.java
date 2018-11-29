package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }
    @Before
    public static void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" +testCounter);
    }
    @Test
    public void testAddFigure (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();

        //When
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(1, shapeCollector.getShowFigures());
    }
    @Test
    public void testRemoveFigure () {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();

        //When
        shapeCollector.addFigure(square);
        shapeCollector.removeFigure(square);

        //Then
        Assert.assertEquals(0, shapeCollector.getShowFigures());
    }
    @Test
    public void testGetFigure () {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();

        //When
        for (int n= 0; n < 10; n++) {
            shapeCollector.square.add(square);
            }
        //Then
        Assert.assertEquals(square, shapeCollector.getFigure(5));
    }


}
