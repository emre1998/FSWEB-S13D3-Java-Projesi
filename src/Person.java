public class Person {
    // Instance variables
     String firstName;
     String lastName;
     int age;
    // Additional instance variables
     String occupation;
     String address;
     boolean isEmployed;

    // Constructors
    // Constructor with firstname, lastname, and age parameters
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Overloaded constructor with additional parameters
    public Person(String firstName, String lastName, int age, String occupation, String address, boolean isEmployed) {
        // Using constructor chaining to call the first constructor
        this(firstName, lastName, age);
        this.occupation = occupation;
        this.address = address;
        this.isEmployed = isEmployed;
    }

    // Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        // Creating multiple instances of the Person class
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Jane", "Smith", 16, "Student", "123 Main St", true);

        System.out.println("Person 1 - Firstname: " + person1.getFirstName());
        System.out.println("Person 1 - LastName: " + person1.getLastName());
        System.out.println("Person 1 - Age: " + person1.getAge());
        System.out.println("Person 1 - IsTeen: " + person1.isTeen());

        System.out.println();

        System.out.println("Person 2 - Firstname: " + person2.getFirstName());
        System.out.println("Person 2 - LastName: " + person2.getLastName());
        System.out.println("Person 2 - Age: " + person2.getAge());
        System.out.println("Person 2 - IsTeen: " + person2.isTeen());
        System.out.println("Person 2 - Occupation: " + person2.occupation);
        System.out.println("Person 2 - Address: " + person2.address);
        System.out.println("Person 2 - IsEmployed: " + person2.isEmployed);
    }
}
