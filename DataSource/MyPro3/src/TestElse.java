import java.sql.Connection;
import java.sql.DriverManager;

public class TestElse {
	public static void main(String[] args) {
		int h = (int) (6 * Math.random() + 1);
		System.out.println(h);
		if (h < 3) {
			System.out.println("小");
		} else {
			System.out.println("大");
		}
	}
	
/*	public static Connection main(String[] args) {
		String dataBaseName = "MyDB";
		Connection con = null;
		String DbDriver = "com.microsoft.jdbc.sqlserver.SQLServerDrive";
		String URL = "jdbc:microsoft:sqlserver://127.0.0.1:1433;integratedSecurity=true;databaseName=" + dataBaseName;
		try {
			Class.forName(DbDriver);
			con = DriverManager.getConnection(URL);
			if (con != null) {
				System.out.println("連線成功");
			} else {
				System.out.println("連線失敗");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}*/
}
