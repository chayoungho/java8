package Day23;

import java.io.File;

public class FileDirOutput {
	static String dir;
	public static void main(String[] args) {
//		if(args.length !=1) {
//			System.out.println("main()매개변수를 입력하세요");
//			System.exit(1);
//		}
			
		
		
			dir="c:/java";	//경로는 /로 구분(리눅스) \로 구분(윈도우)
							//윈도우도 /로 구분 가능합니다.
							//윈도우에서 \는 특수문자 입력이므로 \\처럼 두개를 입력해야 하나로 인식합니다.
			File myFile=new File(dir);
			String[] first=myFile.list();
			System.out.println("검색 디렉토리:"+dir);
			System.out.println("--------------");
			for(int i=0;i<first.length;i++) {
				File cfile=new File(dir+"/"+first[i]);
				if(cfile.isDirectory()) {
					
					System.out.println("디렉토리:"+first[i]);
				}else {
					System.out.println("파일"+first[i]);
				}
			}
	}
}
