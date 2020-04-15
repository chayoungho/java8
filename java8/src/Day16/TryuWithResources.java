package Day16;

import java.io.File;
import java.util.Scanner;

public class TryuWithResources {
	public void getData(String file) {
		Scanner sc =null;
	try {
	sc= new Scanner(new File(file));
		System.out.println(sc.nextLine());
	}catch (Exception e) {
	System.out.println("���ܹ߻�");	
	System.out.println();
	e.getMessage();
	System.out.println();
	e.printStackTrace();
	System.out.println();
	
	}finally {
		if(sc !=null) {
			sc.close();
		}
	}
	}
	public static void main(String args) {
		TryuWithResources twr =new TryuWithResources();
		twr.getData("test.txt");
	}
}
