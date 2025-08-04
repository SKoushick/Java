class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    
    public Person(String firstName, String lastName, int age, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        }
    public String getFullName() {
        return firstName + "" + lastName;
        }
    public int getAge() {
        return age;

        }
    public String getEmail() {
        return email;
        }
}
public class PersonInfo {
    public static void main(String[] args) {
// Create a Person object to encapsulate information
        Person person = new Person("John", "Doe", 30,"johndoe@example.com");

// Access and display the information
    System.out.println("Full Name:"+ person.getFullName());
    System.out.println("Age: " + person.getAge());
    System.out.println("Email: " + person.getEmail());
    }
}