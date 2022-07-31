import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int operation = 0;
	        System.out.println("Welcome to Lockers Pvt.Ltd!!!!! \n \n");
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter 1 .To create file and add \n 2.To delete file \n 3.To display files in the selected folder \n 4.To search for the file \n 5.To exit from the app:");
			operation=sc.nextInt();
			switch(operation)
			{
			case 1:
				String path="C:\\PracticeProject\\";
				Scanner sc1=new Scanner(System.in);

				ArrayList<String> al=new ArrayList<>();
				while(true) {
				System.out.println("enter the file name to create");
				String filename=sc.next();
				String finalname=path+filename;
				System.out.println(finalname);

				//create a file 

				File f=new File(finalname);
				boolean b=f.createNewFile();
				if(b!=true) {
					System.out.println("the file not created");
				}
				else {
					al.add(filename);
					System.out.println("file created");
					break;
				}
				

				System.out.println("the collection of files is "+ al);
				}
	
				break;
			case 2:
				String path1="C:\\PracticeProject";
				Scanner sc2=new Scanner(System.in);
				System.out.println("enter the file name to be deleted");
				String filname=sc.next();
				String finalfile=path1+filname;
				File file=new File(finalfile);
				file.delete();
				System.out.println("file deleted");
				break;

				
			case 3:
				String path2="C:\\PracticeProject\\";
				System.out.println("Enter the file name to display:");
				File f=new File(path2);
				File filename[]=f.listFiles();
				for(File ff:filename) {
					System.out.println(ff.getName());
				}
				break;


				
			case 4:
				String path3="C:\\PracticeProject\\";
				File f1=new File(path3);
				Scanner sc3=new Scanner(System.in);
				System.out.println("enter the file name to search");
				String filsearchname=sc3.next();
				File filename1[]=f1.listFiles();
				int flag=0;
				for(File ff:filename1) {
					if(ff.getName().equals(filsearchname)) {
						flag=1;
						break;
					}
					else {
						flag=0;
					}
					
					
					
				}

				if(flag==1) {
					System.out.println("found the file");
				}
				else {
					System.out.println("file is not found");
				}
				break;
				

			case 5: System.exit(0);
			break;
			default:
				System.out.println("Check your Choice:");
				break;
				
			}
		}

	}

}
