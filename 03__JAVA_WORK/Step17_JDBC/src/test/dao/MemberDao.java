package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
   
   //1. 전체 회원의 목록을 리턴하는 메소드
   public List<MemberDto> getList(){
      //전체 회원 목록을 담을 ArrayList 객체는 미리 생성해 둔다.
      List<MemberDto> list=new ArrayList<>();
      
      //필요한 객체를 담을 지역 변수를 미리 만든다. 
      Connection conn=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      try {
         conn=new DBConnect().getConn();
         //실행할 sql문 구성하기 
         String sql="SELECT num, name, addr"
               + " FROM member"
               + " ORDER BY num ASC";
         pstmt=conn.prepareStatement(sql);
         // ? 에 바인딩 할 내용이 있으면 한다.
      
         // select 문 수행하고 결과를 ResultSet 으로 얻어내기
         rs=pstmt.executeQuery();
         //반복문 돌면서 
         while(rs.next()) { //커서를 한칸씩 내리고
            //커서가 위치한 곳의 회원 한명의 정보를 MemberDto 객체에 담고
            MemberDto dto=new MemberDto();
            dto.setNum(rs.getInt("num"));
            dto.setName(rs.getString("name"));
            dto.setAddr(rs.getString("addr"));
            //MemberDto 객체의 참조값을 ArrayList 객체에 누적 시킨다. 
            list.add(dto);
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(rs!=null)rs.close();
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e) {}
      }
      //MemberDto 객체의 참조값이 순서대로 누적된 ArrayList 객체의 참조값을 리턴해 준다.
      return list;
   }

   //2. 특정 회원 한명의 정보를 리턴하는 메소드 
   public MemberDto getData(int num) {
      //필요한 객체를 담을 지역 변수를 미리 만든다. 
      Connection conn=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      
      MemberDto dto=null;
      try {
         conn=new DBConnect().getConn();
         //실행할 sql문 구성하기 
         String sql="SELECT name, addr"
               + " FROM member"
               + " WHERE num=?";
         pstmt=conn.prepareStatement(sql);
         // ? 에 바인딩 할 내용이 있으면 한다.
         pstmt.setInt(1, num);
         // select 문 수행하고 결과를 ResultSet 으로 얻어내기
         rs=pstmt.executeQuery();
         /*
          *  primary key 로 select 를 하게 되면 select 된 row 는 최대 1개 이므로
          *  cursor 를 반복문 돌면서 여러번 내릴 필요가 없다. 
          *  즉 rs.next() 는 한번만 수행되면 된다. 
          */
         if(rs.next()) {
            //MemberDto 객체를 생성해서 
            dto=new MemberDto();
            //지역변수에 있는 회원 번호를 담고
            dto.setNum(num);
            //ResultSet 으로 부터 이름을 얻어내서 담고 
            dto.setName(rs.getString("name"));
            //ResultSet 으로 부터 주소를 얻어내서 담는다. 
            dto.setAddr(rs.getString("addr"));
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(rs!=null)rs.close();
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e) {}
      }
      //select 된 row 가 없다면 dto 는 null 이다. 
      return dto;
   }
   
   //회원 한명의 정보를 추가하고 성공여부를 리턴하는 메소드
   public boolean insert(MemberDto dto) {
      Connection conn=null;
      PreparedStatement pstmt=null;
      //변화된(추가, 수정, 삭제) 행의 갯수를 담을 지역변수를 미리 만들어 둔다. 
      int updatedRowCount=0;
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
         pstmt.setString(1, dto.getName());
         pstmt.setString(2, dto.getAddr());
         //실행후 메소드가 리턴해주는 변화된 행의 갯수를 지역변수에 담는다. 
         updatedRowCount=pstmt.executeUpdate();
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e) {}
      }
      //만일 변화된 행의 갯수가 0보다 크면
      if(updatedRowCount > 0) {
         //작업 성공의 의미이기 때문에 true 를 리턴하고 
         return true;
      }else {
         //작업이 실패면 false 를 리턴한다. 
         return false;
      }
   }
   //회원 한명의 정보를 수정하고 성공여부를 리턴하는 메소드
   public boolean update(MemberDto dto) {
      Connection conn=null;
      PreparedStatement pstmt=null;
      //변화된(추가, 수정, 삭제) 행의 갯수를 담을 지역변수를 미리 만들어 둔다. 
      int updatedRowCount=0;
      try {
         //DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다. 
         conn=new DBConnect().getConn();
         //실행할 sql 문
         String sql="UPDATE member"
               + " SET name=?, addr=?"
               + " WHERE num=?";
         //PreparedStatement 객체 얻어내기 
         pstmt=conn.prepareStatement(sql);
         //? 바인딩 할게 있으면 바인딩 한다.
         pstmt.setString(1, dto.getName());
         pstmt.setString(2, dto.getAddr());
         pstmt.setInt(3, dto.getNum());
         //실행후 메소드가 리턴해주는 변화된 행의 갯수를 지역변수에 담는다. 
         updatedRowCount=pstmt.executeUpdate();
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e) {}
      }
      //만일 변화된 행의 갯수가 0보다 크면
      if(updatedRowCount > 0) {
         //작업 성공의 의미이기 때문에 true 를 리턴하고 
         return true;
      }else {
         //작업이 실패면 false 를 리턴한다. 
         return false;
      }
   }
   //회원 한명의 정보를 삭제하고 성공여부를 리턴하는 메소드
   public boolean delete(int num) {
      Connection conn=null;
      PreparedStatement pstmt=null;
      //변화된(추가, 수정, 삭제) 행의 갯수를 담을 지역변수를 미리 만들어 둔다. 
      int updatedRowCount=0;
      try {
         //DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다. 
         conn=new DBConnect().getConn();
         //실행할 sql 문
         String sql="DELETE FROM member"
               + " WHERE num=?";
         //PreparedStatement 객체 얻어내기 
         pstmt=conn.prepareStatement(sql);
         //? 바인딩 할게 있으면 바인딩 한다.
         pstmt.setInt(1, num);
         //실행후 메소드가 리턴해주는 변화된 행의 갯수를 지역변수에 담는다. 
         updatedRowCount=pstmt.executeUpdate();
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(pstmt!=null)pstmt.close();
            if(conn!=null)conn.close();
         }catch(Exception e) {}
      }
      //만일 변화된 행의 갯수가 0보다 크면
      if(updatedRowCount > 0) {
         //작업 성공의 의미이기 때문에 true 를 리턴하고 
         return true;
      }else {
         //작업이 실패면 false 를 리턴한다. 
         return false;
      }
   }
}










