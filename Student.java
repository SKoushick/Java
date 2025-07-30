public class Student {
private String name;
private int age;
public Student(String name, int age) {
this.name = name;
this.age = age;
}
public void displayInfo() {
System.out.println("Name:" + name);
System.out.println("Age: " + age);
}
public static void main(String[] args) {
Student student1 = new Student("Alice", 20);
Student student2 = new Student("Bob";, 22);
student1.displayInfo();
student2.displayInfo();

}
}
