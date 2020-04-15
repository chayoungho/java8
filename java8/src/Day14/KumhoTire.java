package Day14;

public class KumhoTire extends Tire {
	   // 필드

	   // 생성자
	   public KumhoTire(String location, int maxRotation) {
	         super(location, maxRotation);
	      }

	   // 메소드
	   @Override
	   public boolean roll() {
	      ++accumilatedRotation;
	      if(accumilatedRotation < maxRotation) {
	         System.out.println(location+"KumhoTire 수명:"+(maxRotation-accumilatedRotation)+"회");
	         return true;
	      }else {
	         System.out.println("****"+location+"KumhoTire펑크****");
	         return false;
	      }
	   }
	}