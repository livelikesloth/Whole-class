package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass06 {
   public static void main(String[] args) {
      //member_seq 이라는 시퀀스를 이용해서 아래의 회원정보를 추가 하고자 한다.
      String name="Soju";
      String addr="Richmond";
      
      Connection conn=null;
      PreparedStatement pstmt=null;
      try {
         //DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다. 
         conn=new DBConnect().getConn();
         //실행할 sql 문
         String sql="INSERT INTO member"
               + " (num, name, addr)"
               + " VALUES(member_seq.NEXTVAL, ?, ?)";
         //PreparedStatement 객체 얻어내기 
         pstmt=conn.prepareStatement(sql);
         //? 바인딩 할게 있으면 바인딩 한다.
         pstmt.setString(1, name);
         pstmt.setString(2, addr);
         //실행
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












