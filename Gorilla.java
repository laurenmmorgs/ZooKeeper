public class Gorilla extends Mammal{


   public void throwSomething(int timesThrown) {
      System.out.println("Throwing my banana peels at you hehe");
      EnergyLevel -= 5 *timesThrown;
      EnergyLevel = super.displayEnergy();
   }

   public void eatBananas(int numOfBananas) {
      System.out.println("Yum eating my bananas ");
      EnergyLevel += 10 *numOfBananas;
      EnergyLevel = super.displayEnergy();

   }
   public void climb(int climbingTimes) {
      System.out.println("Climbing the tree now to get more bananas");
      EnergyLevel -= 10 * climbingTimes;
      EnergyLevel = super.displayEnergy();

   }
}
