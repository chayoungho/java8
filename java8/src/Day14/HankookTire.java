package Day14;

public class HankookTire extends Tire{
	   //필드
	   
	   //생성자
	   public HankookTire(String location, int maxRotation) {
	      super(location, maxRotation);
	   }
	   
	   //메소드
	   @Override
	   public boolean roll() {
	      ++accumilatedRotation;
	      if(accumilatedRotation < maxRotation) {
	         System.out.println(location+"HankookTire 수명:"+(maxRotation-accumilatedRotation)+"회");
	         return true;
	      }else {
	         System.out.println("****"+location+"HankookTire펑크****");
	         return false;
	      }
	   }
	}