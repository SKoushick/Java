public class Student {
private String name;
private int age;
public Student(String name, int age) {
this.name = name;
this.age = age;
}
public void displayInfo() {
System.out.println(&quot;Name: &quot; + name);
System.out.println(&quot;Age: &quot; + age);
}
public static void main(String[] args) {
Student student1 = new Student(&quot;Alice&quot;, 20);
Student student2 = new Student(&quot;Bob&quot;, 22);
student1.displayInfo();
student2.displayInfo();

}
}
