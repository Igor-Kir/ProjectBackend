import model.Student;
import model.University;
import readerio.XlReader;
import comparator.StudentComparator;
import comparator.UniversityComparator;
import util.ComparatorUtil;
import java.io.IOException;
import java.util.List;

public class chief {
    public static void main(String[] args) throws IOException {
        List<University> universities =
                XlReader.readXlUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                ComparatorUtil.getUniversityComparator(enums.UniversityComparator.FULL_NAME);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students =
                XlReader.readXlStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                ComparatorUtil.getStudentComparator(enums.StudentComparator.AVG_EXAM_SCORE);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
        }
    }

