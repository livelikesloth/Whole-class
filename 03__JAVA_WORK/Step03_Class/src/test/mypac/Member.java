package test.mypac;
/*
 * Member 객체에 회원의 번호, 이름, 주소를 담고싶다면
 * 클래스를 어떻게 설계 해야 할 까?
 * 
 * 저장소(field)가 3개 필요하다.
 * field의 type 은 int String, String 이 적당할 것 같음
 * field에 값은 나중에 new Member() 한 이후에 담을 예정.
 * 
*/
public class Member {
public int cNumber;
public String cName;
public String cAddr;
//field는 =0 ,=null 할 필요 없이 초기값이 정해져 있다. 

}
