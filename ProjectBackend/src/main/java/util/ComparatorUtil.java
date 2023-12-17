package util;
import comparator.*;
import enums.UniversityComparator;
import enums.StudentComparator;

public class ComparatorUtil {
    private ComparatorUtil(){
    }
    public static comparator.StudentComparator getStudentComparator(StudentComparator studentComparator) {
        switch (studentComparator) {
            case FULL_NAME:
                return new StudentFullNameComparator();
            case UNIVERSITY_ID:
                return new StudentUniversityIdComparator();
            case COURSE:
               return new StudentCourseNumber();
            case FACULTY:
                return new StudentFacultyComparator();
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            default:
                return new StudentFullNameComparator();
        }
    }
    public static comparator.UniversityComparator getUniversityComparator(UniversityComparator universityComparator){
        switch (universityComparator){
            case ID:
                return new UniversityIdComparator();
            case YEAR:
                return new UniversityYearComparator();
            case PROFILE:
                return new UniversityProfileComparator();
            case FULL_NAME:
                return new UniversityFullNameComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }
}
