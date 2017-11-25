import java.io.IOException;

/**
 * Created by gorshkov on 21.11.2017.
 */
public class Main {
    /**
<<<<<<< HEAD
     * @param args parameters:
     *             absoluteFilePathPattern
     *             fileNamePattern
     *             firstDay
     *             weekNumber
     *             workingDaysPerWeekNumber
     *             notWorkingDaysPerWeekNumber.
     * @throws IOException If an I/O error occurred
     */
    public static void main(String[] args) throws IOException {
//        final String absoluteFilePathPattern = "M:\\4DI\\ДП\\Exchange_DP\\Радио\\Радио_2017\\Перепелкина_Шахова\\Texts\\";
//        final String fileNamePattern = ".12.17_Radio.docx";
//        int firstDay = 11;
//        final int weekNumber = 3;
//        final int workingDaysPerWeekNumber = 5;
//        final int notWorkingDaysPerWeekNumber = 2;

        final String absoluteFilePathPattern = args[0];
        final String fileNamePattern = args[1];
        int firstDay = Integer.parseInt(args[2]);
        final int weekNumber = Integer.parseInt(args[3]);
        final int workingDaysPerWeekNumber = Integer.parseInt(args[4]);
        final int notWorkingDaysPerWeekNumber = Integer.parseInt(args[5]);

        GroupOfFilesCreator.createFilesForWorkingDays(
                absoluteFilePathPattern,
                fileNamePattern,
                firstDay,
                weekNumber,
                workingDaysPerWeekNumber,
                notWorkingDaysPerWeekNumber);
    }
}



