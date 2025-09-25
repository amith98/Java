import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BookStoreLog {
    public static void main(String[] args) {
        String content = "Book order placed at 16:59";
        char array[] = new char[100];
        // Creating a file
        File fileObj = new File("log.txt");
        try {
            boolean value = fileObj.createNewFile();
            if (value) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        // Writing content to file
        try {
            FileWriter fileWriterObj = new FileWriter("log.txt");
            fileWriterObj.write(content);
            System.out.println("Content is written to file");
            fileWriterObj.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
        // Reading content from the file
        try {
            FileReader fileReaderObj = new FileReader("log.txt");
            fileReaderObj.read(array);
            String readContent = new String(array);
            System.out.println("Content from file:\n" + readContent);
            fileReaderObj.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
        // Deleting the file
        boolean value = fileObj.delete();
        if (value) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not deleted");
        }
    }

}
