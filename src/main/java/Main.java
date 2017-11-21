import java.io.IOException;

/**
 * Created by gorshkov on 21.11.2017.
 */
public class Main {
    /**
     * @param args redundant parameter
     * @throws IOException If an I/O error occurred
     */
    public static void main(String[] args) throws IOException {
        final String absoluteFilePathPattern = "M:\\4DI\\ДП\\Exchange_DP\\Радио\\Радио_2017\\Перепелкина_Шахова\\Texts\\";
        final String fileNamePattern = ".12.17_Radio.docx";
        int firstDay = 11;
        final int weekNumber = 3;
        final int workingDaysPerWeekNumber = 5;
        final int notWorkingDaysPerWeekNumber = 2;

        GroupOfFilesCreator.createFilesForWorkingDays(
                absoluteFilePathPattern,
                fileNamePattern,
                firstDay,
                weekNumber,
                workingDaysPerWeekNumber,
                notWorkingDaysPerWeekNumber);
    }
}



