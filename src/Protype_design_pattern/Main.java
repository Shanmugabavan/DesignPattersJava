package Protype_design_pattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student(180596,"Shanmugabavan");
        Student student1= (Student) student.clone();
        student1.setName("Naveneethan");
        System.out.println(student.getName());
        System.out.println(student1.getName());
    }
}
