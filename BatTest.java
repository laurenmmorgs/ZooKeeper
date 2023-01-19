public class BatTest {
      public static void main(String[] args) {
         Bat bat = new Bat();

         bat.attackTown(3);
         bat.eatHumans(2);
         bat.fly(2);

         System.out.println("The energy level of the Bat is " + bat.displayEnergy());
   } 
}


