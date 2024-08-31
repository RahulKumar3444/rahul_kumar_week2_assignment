public class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor to initialize the attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the name
    public void displayName() {
        System.out.println("Name: " + name);
    }

    // Method to display the age
    public void displayAge() {
        System.out.println("Age: " + age);
    }

    // Method to display all attributes
    public void displayDetails() {
        displayName();
        displayAge();
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person("Anurag Sharma", 25);

        // Displaying the attributes
        person.displayDetails();
    }
}

