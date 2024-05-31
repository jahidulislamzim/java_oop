package FirstLecture;

public class Student {
    
    int id;
    String name;
    String email;
    String dept;
    String home;
    double cgpa;
    
    
    public void display(){
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Email = " + email);
        System.out.println("Hometown = " + home);
        System.out.println("Department = " + dept);
        System.out.println("CGPA = " + cgpa);
        System.out.println("");
    }
}
