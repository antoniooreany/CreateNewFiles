import java.io.IOException;

/**
 * Created by gorshkov on 21.11.2017.
 */
class GroupOfFilesCreator {
    /**
     * @param absoluteFilePathPattern is a path of directory, in which files should be created.
     * @param fileNamePattern is a pattern for the file name.
     * @param firstDay first day, in which a file should be created.
     * @param weekNumber number of weeks for the file creation.
     * @param workingDaysPerWeekNumber number of working days per week.
     * @param nonWorkingDaysPerWeekNumber number of non-working days per week.
     * @throws IOException If an I/O error occurred
     */
    static void createFilesForWorkingDays(String absoluteFilePathPattern,
                                          String fileNamePattern,
                                          int firstDay,
                                          int weekNumber,
                                          int workingDaysPerWeekNumber,
                                          int nonWorkingDaysPerWeekNumber) throws IOException {
        String absoluteFilePath;
        for (int weekCounter = 0; weekCounter < weekNumber; weekCounter++) {
            int dayCounter;
            for (dayCounter = firstDay; dayCounter < firstDay + workingDaysPerWeekNumber; dayCounter++) {
                absoluteFilePath = absoluteFilePathPattern + dayCounter + fileNamePattern;
                FileCreator.createFile(absoluteFilePath);
            }
            firstDay = dayCounter + nonWorkingDaysPerWeekNumber;
        }
    }
}
