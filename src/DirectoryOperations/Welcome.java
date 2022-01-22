package DirectoryOperations;

import java.io.File;
import java.util.Scanner;

public class Welcome {

	static String Path;
    static File myFolder;

    public static void InitilizeFolder() {
    	Path = System.getProperty("user.dir");
    	myFolder = new File(Path+"/files");
        if (!myFolder.exists())
        	myFolder.mkdirs();
        
        System.out.println("Directory path : "+ myFolder.getAbsolutePath());
    }
    
	
	public static void Welcome() {
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developed by Jose Thomas");
	}
	
	
	public static void MainMenu() {
		System.out.println("1. List files in Ascending order");
		System.out.println("2. Display file options");
		System.out.println("3. Exit");
	}
	
	public static void FileOptionsMenu() {
		System.out.println("1. Add new file");
		System.out.println("2. Delete a file");
		System.out.println("3. Search a file");
		System.out.println("4. Return to main menu");
		System.out.println("5. Back");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Welcome();
		InitilizeFolder();
		MainMenu();
	}
}


