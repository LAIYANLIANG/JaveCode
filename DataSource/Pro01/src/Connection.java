import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;

public class Connection {
	public static void main(String[] args) throws SQLException {
		Driver driver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();
		
		String arg0 = null;
		Properties arg1 = null;
		driver.connect(arg0, arg1);
		String url="jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=p@ssw0rd;";
		         //  "jdbc:sqlserver://localhost:1433;" + "databaseName=AdventureWorks;user=MyUserName;password=_****;"; 
		Properties info=null;
		java.sql.Connection conn=driver.connect(url, info);
		System.out.println(conn);
	}
}
