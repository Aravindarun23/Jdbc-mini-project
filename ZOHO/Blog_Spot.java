package ZOHO;
import java.util.Scanner;
import java.sql.*;

public class Blog_Spot {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ZOHO","root","root");
		
		while(true){
			System.out.println("----------Welcome To Blog Spot--------------");
			System.out.println("|          1 : Create Blog                 |");
			System.out.println("|          2 : View Blog                   |");
			System.out.println("|          3 : Update Blog                 |");
			System.out.println("|          4 : Delete Blog                 |");
			System.out.println("|          5 : Exit                        |");
			System.out.println("--------------------------------------------");
			
				System.out.println("<--Choose Any One Function:--> ");
				Scanner Scan = new Scanner(System.in);
				int User_Input=Scan.nextInt();
				switch(User_Input) {
				case 1:
					Create_Blog cb=new Create_Blog();
					cb.Create(con);
					break;
				case 2:
					View_BLog vb=new View_BLog();
					vb.View(con);
					break;
				case 3:
					Update_Blog ub=new Update_Blog();
					ub.Update(con);
					break;
				case 4:
					Delete_Blog db=new Delete_Blog();
					db.Delete(con);
					break;
				case 5:
					System.out.println("                ###  Thanks For Using  BlogSpot  ###              ");
					return;
				default:
					System.out.println("                                <<Please Choose  A Valid Function>>                    \\n\n");
				}
		}
	}
}