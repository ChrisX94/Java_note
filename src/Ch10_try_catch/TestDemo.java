package Ch10_try_catch;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDemo {
	public static void main(String[] args) {
//		// 這裡是示範SQL connect 回傳空值
//		Connection conn = null;
//		try {
//			conn.commit();
//		}catch(SQLException e){
//			e.printStackTrace();
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			try {
//			conn.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
	
	/***********************************************************/
	
		User user = new User();
		// 這裡是用Optional的.orElse("替代值")如果是空值的話則會傳入orElse中的("替代值")
		user.getName().orElse("test");
		System.out.println(user.getName().orElse("test"));
		
		// 即便有設定給實體變數使用時也要加上user.getName().orElse("test") 才會回傳字串
		user.setName("Amy");
		System.out.println(user.getName().orElse("test"));
	
	}
}
