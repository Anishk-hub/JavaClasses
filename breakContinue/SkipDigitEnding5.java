package breakContinue;

public class SkipDigitEnding5 {
    public static void main(String[] args) {
      for(int i = 1; i <= 100; i++){
          if( i % 10 == 5){
              continue;
          }
          System.out.println(i);
      }
    }
}
