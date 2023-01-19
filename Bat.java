public class Bat extends Mammal {

   public int displayEnergy() {
      EnergyLevel = 300;
      super.displayEnergy();
      return EnergyLevel;
   }

   public void fly(int flyingTimes){
      System.out.println("Flying away now");
      EnergyLevel -= 50 *flyingTimes;
      EnergyLevel = super.displayEnergy();
   }

   public void eatHumans(int numOfHumans){
      System.out.println("EATING HUMANS");
      EnergyLevel -= 25*numOfHumans;
      EnergyLevel = super.displayEnergy();

      
   }

   public void attackTown(int townsAttacked){
      System.out.println("Attacking the town");
      EnergyLevel -= 100 * townsAttacked;
      EnergyLevel = super.displayEnergy();

   }
}
