

package nuig_ct417.eamon_cullen_ct417_assigment_1;

import nuig_ct417.ct417.parta.Course;
import nuig_ct417.ct417.parta.Module;
import nuig_ct417.ct417.parta.Student;
import org.joda.time.DateTime;

public class Main {
    public static void main(String[] args) {
        String[] modules = {"SoftEng", "AdvancedTY", "Programming"};
        String[] courseStudents = {"Jim Allister", "Willie Fraser", "Michael Stone"};
        DateTime startDate = new DateTime(2015,6,6,4,5);
        DateTime endDate = new DateTime(2019,6,6,4,5);

        Course compSci = new Course("BCT", modules, courseStudents, startDate, endDate);
        System.out.println(compSci.toString());

        
        String[] moduleStudents = {"Jim Allister", "Willie Fraser", "Michael Stone"};
        String[] moduleCourses = {"BCT", "BSC"};
        
        Module softEng = new Module("Software Engineering", "CT417", moduleStudents, moduleCourses);
        System.out.println(softEng.toString());
        
        String[] studentModule = {"CT5106", "CT404", "CT417"};       
        Student jim = new Student("Jim Allistar", 21,14041997, 15910831, "BCT", studentModule);
        System.out.println(jim.toString());
        
    }
    
}
