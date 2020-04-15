package Day23;

import java.io.FileReader;
import java.io.IOException;

public class FileIOStream {
	static String tfile;
	public static void main(String[] args) {
		int cnt;
		char chr;
		if(args.length !=1) {
			System.out.println("�Ű������� �ؽ�Ʈ���� �̸��� �Է��ϼ���");
			System.exit(0);
			
		}
		tfile=args[0];
		try (FileReader fr=new FileReader(tfile)){
			System.out.println("���� �̸�:"+tfile);
			System.err.println("-------------");
			while((cnt=fr.read())!=-1) {
				chr=(char)cnt;
				System.out.println(chr);
			}
		}catch(IOException e) {
			System.out.println();
		}
		
	}
}