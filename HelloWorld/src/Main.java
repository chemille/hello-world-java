import java.util.Date;

import java.awt.*;
public class Main {
    public static void main(String[] args) {
        // Primitive types are used to store simple values.
        // Reference types are used to store complex objects.
        int age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        byte years = 30;
        // When declaring primitive types you don't have to allocate memory.
        // Memory is allocated and released by the java run time environment.
        // When dealing with reference types, you always have to allocate memory
        // using the new operator.
        Date now = new Date(); // This is an instance of the date class.
        // An object is an instance of a class.
        // These objects or classes have members that we can access using the dot operator.
        // now.getTime() // returns time component of this object
        System.out.println(now);

        // These two variables are in different locations in memory.
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y); // y is not affected because x and y are independent of each other.
        // Primitive types are referenced by their values which are completely independent of each other.

        // In Java, we have a Point class. (import java.awt.*;)
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        // With reference types, it will hold the address or reference to point in memory.
        // Reference types do not store values of the object. point1 and point2 are
        // referencing the same object in memory. These 2 variables are not independent of each other.
        point1.x = 2; // If you change one of these variables, the changes will be visible to the other.
        System.out.println(point2);
    }
}