package Day16;

public class ThrowsEx {

	public static void calc1() throws ArithmeticException {
		calc2();
	}

	public static void calc2() throws ArithmeticException {
		int num = 5 / 0;
	}

	public static void main(String[] args) {
		System.out.println("메소드에서 던지는 예외알리기");
		try {
			calc1();
		} catch (ArithmeticException e) {
			System.out.println("메시지:" + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("메소드에서 던지는 예외알리기 프로그램 종료");
		}
	}
		
		
		public static void calc3() throws InterruptedException{
			try {
				Thread.sleep(1000);
				
			}catch (InterruptedException e) {
				throw new ArithmeticException();
			}
		}
	
}
