package Day15;

import java.util.Scanner;

public class Hangman {
   private String hiddenString;// 정답
   private StringBuffer outputString;// 화면출력
   private StringBuffer inputString;// 입력한 문자
   private int remainder;// 남은 문자 수
   private int failed;// 틀린횟수
   private Scanner sc;
   private String inputData;

   public Hangman() {
      hiddenString = " hello";// 정답 초기화

      /* 초기화 코드 추가 */
      outputString = new StringBuffer();
      inputString = new StringBuffer();
      remainder = hiddenString.length();
      failed = 0;
      sc = new Scanner(System.in);
      inputData = "";
   }

   public Hangman(String solution) {
      hiddenString = solution;// 정답 초기화

      /* 초기화 코드 추가 */
      outputString = new StringBuffer();
      inputString = new StringBuffer();
      remainder = hiddenString.length();
      failed = 0;
      sc = new Scanner(System.in);
      inputData = "";
      for (int i = 0; i < remainder; i++) {
         outputString.append("_");
      }
   }

   public void playGame() {
      System.out.println("행맨 게임을 시작합니다");
      show();
      do {
         do {
            setInputData();
         } while (checkChar(inputData));
         processGame();
         show();
      } while (failed < 6 && remainder > 0);
      System.out.println("행맨 게임을 종료합니다");
   }

   private void show() {
      System.out.println("틀린 획수:" + failed + "/6");
      System.out.println(outputString);
   }

   public void setInputData() {
      System.out.print("문자를 입력해 주세여:");
      this.inputData = sc.next().substring(0, 1);
   }

   private boolean checkChar(String inputData) {
      if (inputString.indexOf(inputData) == -1) {
         inputString.append(inputData);
         return false;
      }
      System.out.println("이미 입력한 문자입니다");
      return true;
   }

   private void processGame() {
      if (hiddenString.indexOf(inputData) == -1) {
         failed++;
      } else {
         int index = hiddenString.indexOf(inputData);
         do {
            outputString.setCharAt(index, inputData.charAt(0));
            remainder--;
            index = hiddenString.indexOf(inputData, index + 1);
         } while (index != -1);
      }
   }
}
