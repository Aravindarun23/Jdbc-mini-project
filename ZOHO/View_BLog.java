package ZOHO;
import java.sql.*;
import java.util.Scanner;

public class View_BLog {
	
	public void View(Connection con) throws SQLException{
		try{
			Scanner Scan = new Scanner(System.in);
			Statement st=con.createStatement();		
			ResultSet rs=st.executeQuery("select * from BlogSpot");
			System.out.println("Blogger Names                Topic Names                     BlogId");
			System.out.println("-------------                -----------                     ------\n");
			while(rs.next()){  
				System.out.println(rs.getString("Name") +"                         "+rs.getString("TopicName")+"                     "+rs.getInt("UserId"));	
			}
			System.out.println("--------------------------------------------------------------------------");
			
				ResultSet Rrs=st.executeQuery("select * from BlogSpot");
				System.out.println("<--Enter the BlogId-->");
				int BlogId=Scan.nextInt();
				boolean flag=false;
				while(Rrs.next()){
					if(BlogId==Rrs.getInt("UserId")){
						System.out.println("-------------------------------------------"+Rrs.getString("TopicName")+"-----------------------------------------\n\n");
						System.out.println(Rrs.getString("Content"));
						flag=true;
						
					}	
				}
				if (flag==true) {
					System.out.println("\n\n------------------I hope this blog is very usefull for u."+"Thanks for using!!----------------------");
					
				}
				else {
					System.out.println("---------------------------invalid BlogId please check------------------------------");
				}
		}
		catch(Exception e) {
			System.out.println("                                <<Please Enter A Valid Inputs>>                    \n");
			
		}
	}

}
