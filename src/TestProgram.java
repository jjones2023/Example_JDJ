//David Jones
//Written: January 7, 2020

/**
 * This program tests the Dog class
 * @author David Jones
 * @version 1.0
 *
 */
public class TestProgram {
    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");
        int a = 10;
        double g = 36.54;
        String temp = "Interesting factoid";

        System.out.printf("This an integer %d, this is a double %.2f, this is a String %s%n", a, g ,temp);
        */

        Dog d = new Dog();
        Dog fido = new Dog("Fido", 13);

        System.out.println(d.toString());

        System.out.println(fido.toString());

    } //end main
} //end class