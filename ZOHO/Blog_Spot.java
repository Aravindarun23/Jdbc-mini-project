package ZOHO;
import java.util.Scanner;
import java.sql.*;

public class Blog_Spot {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		View_BLog vb=new View_BLog();
//		try (Scanner Scan = new Scanner(System.in)) {
			do {
				System.out.println("------------Welcome To Blog Spot------------");
				System.out.println("|          1 : Create Blog                 |");
				System.out.println("|          2 : View Blog                   |");
				System.out.println("|          3 : Update Blog                 |");
				System.out.println("|          4 : Delete Blog                 |");
				System.out.println("--------------------------------------------");
				System.out.println("<--Choose Any One Function:--> ");
				try (Scanner Scan = new Scanner(System.in)) {
					 int choice=Scan.nextInt();
				}
				switch(choice) {
				case 1:
					
					break;
				case 2:
					vb.View();
					break;
				}
			}
			while(choice!=5);
			System.out.println("jbfsjbj");
	}
}		 }
		}
		
			 
	}
		
		
		
		
