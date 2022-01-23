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
    
	
	public static void WelcomeScreen() {
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developed by Jose Thomas");
	}
	
	
	public static void MainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== Main Menu [enter an option from the list] ==");
		System.out.println("1. List files in Ascending order");
		System.out.println("2. Display file options");
		System.out.println("3. Exit");
			try {
			int option = sc.nextInt();
				switch(option) {
		            case 1 : {
		            	DirFunctions.listFiles(myFolder);
		            	MainMenu();
	                    break;
		            }
		            case 2 : {
		            	FileOptionsMenu();
	                    break;
		            }
		            case 3 : {
		                System.out.println("Thank You");
		                System.exit(0);
	                    break;
		            }
	            	default: {
	            		System.out.println("Please enter 1, 2 or 3");
	            		MainMenu();
	            	}
				}
			}
	        catch (Exception e){
	            System.out.println("Please enter 1, 2 or 3");
	            MainMenu();
	        }
			sc.close();
	}
	
	public static void FileOptionsMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("== File Options [enter an option from the list] ==");
		System.out.println("1. Add new file");
		System.out.println("2. Delete a file");
		System.out.println("3. Search a file");
		System.out.println("4. Return to main menu");
        try {
        	int option = sc.nextInt();
            switch (option){
                case 1 : {
                    System.out.print("Please enter the file name: ");
                    String filename = sc.next().trim().toLowerCase();
                    DirFunctions.addFile(myFolder, filename);
                    break;
                }
                case 2 : {
                    System.out.print("Please enter the file name to delete: ");
                    String filename = sc.next().trim();
                    DirFunctions.deleteFile(myFolder, filename);
                    break;
                }
                case 3 : {
                    System.out.print("Please enter a file name to search:");
                    String filename = sc.next().trim();
                    DirFunctions.searchFile(myFolder, filename);
                    break;
                }
                case 4 : {
                    System.out.println("Back to main menuFile");
                    MainMenu();
                    break;
                }
                default: System.out.println("Please enter 1, 2, 3 or 4");
            }
            FileOptionsMenu();
        }
        catch (Exception e){
            System.out.println("Please enter 1, 2, 3 or 4");
			FileOptionsMenu();
        }
        sc.close();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WelcomeScreen();
		InitilizeFolder();
		MainMenu();
	}
}


