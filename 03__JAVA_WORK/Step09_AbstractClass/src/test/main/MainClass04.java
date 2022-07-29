package test.main;

import test.mypac.Weapon;

public class MainClass04 {
   /*
    *  Weapon 추상클래스를 상속받은 inner class
    *  
    *  main() 메소드는 static 메소드 이기 때문에 main() 메소드에서 사용하려면 
    *  
    *  inner class 도 static 영역에 올라가 있어야 하기 때문에 static 예약어가 필요하다 
    */
   static class Pen extends Weapon{
      @Override
      public void attack() {
         System.out.println("잉크가 없다");
      }
   }
   
   public static void main(String[] args) {
      Weapon w1=new Pen();
      useWeapon(w1);
      // local inner class
      class Paper extends Weapon{
         @Override
         public void attack() {
            System.out.println("물에 젖었다");
         }
      }
      Weapon w2=new Paper();
      useWeapon(w2);
      
      //객체를 생성해서 지역변수에 담지 않고 바로 생성해서 useWeapon() 메소드 호출하기
      useWeapon(new Paper());
   }
   
   public static void useWeapon(Weapon w) {
      w.prepare();
      w.attack();
   }
}















	
