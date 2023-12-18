/**
 * Test
 */
public class Test {
 String name;
 int age;
 void setName(String name) { 
  this.name = name;
 }
 void setAge(int age) {
  this.age = age;
 }
 void getName() {
  System.out.println("Name: " + this.name+"\n");
 }
  void getAge() {
  System.out.println("Age: " + this.age+"\n");
 }


  public static void main(String[] args) {
    Test test = new Test();
    test.setName("Amresh");
    test.setAge(23);
    test.getName();
    test.getAge();
  }
}
