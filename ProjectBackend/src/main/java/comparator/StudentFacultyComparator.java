package comparator;

import model.Student;
import org.apache.commons.lang3.StringUtils;

public class StudentFacultyComparator implements StudentComparator{
    @Override
    public int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getfaculty(),o2.getfaculty());
    }
}
