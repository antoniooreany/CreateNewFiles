import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;

/**
 * Created by gorshkov on 21.11.2017.
 */
class FileCreator {
    /**
     * @param absoluteFilePath absolute path of the file, which will be created.
     * @throws IOException If an I/O error occurred
     */
    static void createFile(String absoluteFilePath) throws IOException {
        File file = new File(absoluteFilePath);
        if (file.createNewFile()) {
            System.out.println(MessageFormat.format("File \"{0}\" created", absoluteFilePath));
        } else {
            System.out.println(MessageFormat.format("File \"{0}\" already exists", absoluteFilePath));
        }
    }

}
