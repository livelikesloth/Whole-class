package practice_8_5;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		int num=105;
		delete(num);
		
		
		
	}

	private static void delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=new DBConnect().getConn();
			String sql="delete from friends"
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("절교");
		}catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	      }
	}
}
