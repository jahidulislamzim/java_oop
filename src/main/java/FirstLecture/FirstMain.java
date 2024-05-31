
package FirstLecture;

public class FirstMain {
    
    public void firstLecture(){
        
        Student one = new Student();
        Student two = new Student();
        Student three = new Student();
        
        one.id = 101;
        one.name = "Zim Islam";
        one.email = "jahidulislamzim845@gmail.com";
        one.home = "Kurigram";
        one.dept = "CSE";
        one.cgpa = 3.98D;
        
        two.id = 102;
        two.name = "Junaidul Zoy";
        two.email = "test@gmail.com";
        two.home = "Kurigram";
        two.dept = "MBBS";
        two.cgpa = 4.00D;
        
        three.id = 103;
        three.name = "Shithil";
        three.email = "test@gmail.com";
        three.home = "Kurigram";
        three.dept = "EEE";
        three.cgpa = 4.00D;
                
                
        one.display();
        two.display();
        three.display();
        

    }
    
}
