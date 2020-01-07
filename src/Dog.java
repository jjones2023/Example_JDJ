/**
 * This class models a Dog.
 * @author David Jones
 * @version 1.0
 */

public class Dog {

    //INSTANCE FIELDS
    private String name;
    private int age;

    //CONSTRUCTORS

    /**
     * This is the default constructor
     */
    public Dog() {

        name = "null";
        age = 0;

    } //end empty-argument constructor

    /**
     * This is the preferred constructor for this object.
     * @param name
     * @param age
     */
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    } //end preferred constructor

    /**
     * This method returns a String that represents a dog's bark.
     * @return
     */
    public String bark() {
        return "Bark, bark, bark!!!";
    } //end bark

    //GETTERS/SETTERS/TOSTRING

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Dog [" + "name= " + name + ", age=" + age + "]";
    } //end ToString
} //end class
