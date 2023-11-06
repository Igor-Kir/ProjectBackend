import enums.StudyProfile;
import model.Student;
import model.University;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketOption;

public class chief {
    public static void main(String[] args) {
        Student student=new Student();
        student.setFullName("Попов Пётр Петорвич")
                .setfaculty("Механизации")
                .setCurrentCourseNumber(2)
                .setAvgExamScore((float)4.3);
        System.out.println(student);
        University university = new University();
        university.setFullName("Kuban State Agrarian University")
                .setYearOfFoundation(1922).setShortName("КУБГАУ").setMainProfile(StudyProfile.PHYSICS);
        System.out.println(university);


    }
}
