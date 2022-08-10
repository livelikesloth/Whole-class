package practice_8_5;


import java.sql.Connection;
import java.sql.PreparedStatement;
import test.util.DBConnect;

public class MainClass06 {
   public static void main(String[] args) {
      String name="Jazz";
      String addr="Shrinrim";
 
      
      Connection conn=null;
      PreparedStatement pstmt=null;
      try {
         conn=new DBConnect().getConn();
         String sql="INSERT INTO friends"
               + " (num, name, addr)"
               + " VALUES(friends_seq.nextval, ?, ?)";
         pstmt=conn.prepareStatement(sql);
         pstmt.setString(1, name);
         pstmt.setString(2, addr);

         pstmt.executeUpdate();
         System.out.println("회원정보를 저장했습니다.");
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