import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreator2 {

    static void main(String[] args) {
        try{
            String fileLocation = "/home/gamp/Desktop";
            Path path = Paths.get(fileLocation);
            Files.write(path,"Ther".getBytes());

        } catch (IOException exception) {
            exception.printStackTrace();
            System.err.println(exception.getMessage());
        }
    }
}
