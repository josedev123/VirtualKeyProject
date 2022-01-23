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
		System.out.println("==Main Menu [enter an option from the list] ==");
		System.out.println("1. List files in Ascending order");
		System.out.println("2. Display file options");
		System.out.println("3. Exit");
			try(Scanner sc = new Scanner(System.in)) {
			int option = sc.nextInt();
			switch(option) {
	            case 1 : {
	            	System.out.println("<<List files>>");
	            	MainMenu();
	            }
	            case 2 : {
	            	FileOptionsMenu();
	            }
	            case 3 : {
	                System.out.println("Thank You");
	                System.exit(0);
	            }
	            	default: MainMenu();
				}
			}
	        catch (Exception e){
	            System.out.println("Please enter 1, 2 or 3");
	            MainMenu();
	        }
	}
	
	public static void FileOptionsMenu() {
		System.out.println("==File Options [enter an option from the list] ==");
		System.out.println("1. Add new file");
		System.out.println("2. Delete a file");
		System.out.println("3. Search a file");
		System.out.println("4. Return to main menu");
        try(Scanner sc = new Scanner(System.in)) {
        	int option = sc.nextInt();
            switch (option){
                case 1 : {
                    System.out.print("Please enter the file name: ");
                    String filename = sc.next().trim().toLowerCase();
	            	System.out.println("<<new file:>> " + filename);
                    break;
                }
                case 2 : {
                    System.out.print("Please enter the file name to delete: ");
                    String filename = sc.next().trim();
	            	System.out.println("<<delete file:>> " + filename);
                    break;
                }
                case 3 : {
                    System.out.print("Please enter a file name to search:");
                    String filename = sc.next().trim();
	            	System.out.println("<<search file:>> " + filename);
                    break;
                }
                case 4 : {
                    System.out.println("Back to main menu");
                    MainMenu();
                    break;
                }
                default : System.out.println("Please enter option from the list");
            }
            FileOptionsMenu();
        }
        catch (Exception e){
            System.out.println("Please enter correct values to search the data in list");
            FileOptionsMenu();
        }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Welcome();
		InitilizeFolder();
		MainMenu();
	}
}


