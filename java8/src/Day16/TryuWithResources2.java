package Day16;

import java.io.File;
import java.util.Scanner;

public class TryuWithResources2 {
	public void getData(String file) {

		try (Scanner sc = new Scanner(new File(file)); 
				Scanner sc2 = new Scanner(System.in);) {

			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.out.println("예외발생");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
			System.out.println();

		}
	}

	public static void main(String args) {
		TryuWithResources2 twr = new TryuWithResources2();
		twr.getData("test.txt");
	}
}
