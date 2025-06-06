package day6_super_keyword;

class Person{
  String name="Raja";
  int age=45;
  
  void displayPersonInfo(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
  }
}

class Student extends Person{
  String course="Java full stack";
  void displayPersonInfo(){
    System.out.println("Course: "+course);
  }
}

public class InheritanceDemo{
  public static void main(String []args){
    
    Student s=new Student();
    s.displayPersonInfo();
    System.out.println("Inherited Name: "+s.name);
    s.displayPersonInfo();
  }
}
