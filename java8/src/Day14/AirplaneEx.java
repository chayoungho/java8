package Day14;

public class AirplaneEx {
   public static void main(String[] args) {
      SupersonicAirplane sa= new SupersonicAirplane();
      sa.takeOff();
      sa.fly();
      sa.flyMode=SupersonicAirplane.SUPERSONIC;
      sa.fly();
      sa.flyMode=SupersonicAirplane.SUPERSONIC;
      sa.fly();
      sa.land();
            
      
   }
}