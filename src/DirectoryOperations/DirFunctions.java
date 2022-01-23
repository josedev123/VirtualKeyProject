package DirectoryOperations;
import java.io.File;
import java.util.Arrays;
import java.io.IOException;


public class DirFunctions {
    public static void listFiles(File myFolder) {
        if (myFolder.list().length==0)
            System.out.println("The folder is empty");
        else {
            String[] list = myFolder.list();
            System.out.println("The files in "+ myFolder +" are :");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
    }
    
    public static void addFile(File myFolder, String filename) throws IOException {
        File filepath = new File(myFolder +"/"+filename);
        String[] list = myFolder.list();
        for (String file: list) {
            if (filename.equalsIgnoreCase(file)) {
                System.out.println("File " + filename + " already exists in " + myFolder);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("Created new file " + filename + " in " + myFolder);
    }
    
    public static void deleteFile(File myFolder, String filename) {
        File filepath = new File(myFolder +"/"+filename);
        String[] list = myFolder.list();
        for (String file: list) {
            if (filename.equals(file) && filepath.delete()) {
                System.out.println("File " + filename + " deleted from " + myFolder);
                return;
            }
        }
        System.out.println("File doesn\'t exist");
    }
    public static void searchFile(File myFolder, String filename) {
        String[] list = myFolder.list();
        for (String file: list) {
            if (filename.equals(file)) {
                System.out.println("Found filename: " + filename + " in " + myFolder);
                return;
            }
        }
        System.out.println("File doesn\'t exist");
    }
}

