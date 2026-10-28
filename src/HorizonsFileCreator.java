import java.nio.file.Path;

public class HorizonsFileCreator {

    public static void main(String[] args) {

        //1.  Defining the path that points to the file you are trying to work with
        //2. Use a method from files
        String fileLocation = "/home/gamp/Desktop";

        Path path = Path.of(fileLocation);
        System.out.println(path.getFileSystem());
        System.out.println(path.getRoot());

    }
}
