import comparator.StudentComparator;
import comparator.UniversityComparator;
import model.Statistics;
import model.Student;
import model.University;
import readerio.XlsReader;
import readerio.XlsWriter;
import util.ComparatorUtil;
import util.StatisticsUtil;

import java.io.IOException;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Chief {

    private static final Logger logger = Logger.getLogger(Chief.class.getName());

    public static void main(String[] args) throws IOException {

        try {
            LogManager.getLogManager().readConfiguration(
                    Chief.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }

        logger.log(INFO, "Application started, Logger configured");

        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                ComparatorUtil.getUniversityComparator(enums.UniversityComparator.YEAR);
        universities.sort(universityComparator);

        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                ComparatorUtil.getStudentComparator(enums.StudentComparator.AVG_EXAM_SCORE);
        students.sort(studentComparator);

        List<Statistics> statisticsList = StatisticsUtil.createStatistics(students, universities);
        XlsWriter.writeXlsStatistics(statisticsList, "statistics.xlsx");

        logger.log(INFO, "Application finished");
    }
}