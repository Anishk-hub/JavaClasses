package Method;

 class EvenOdd {

     // 1. No return, No parameters
     public void check1() {
         for (int i = 1; i <= 50; i++) {
             if (i % 2 == 0) {
                 System.out.println(i + " Even");
             } else {
                 System.out.println(i + " Odd");
             }
         }
     }

     // 2. No return, With parameters
     public void check2(int n) {
         for (int i = 1; i <= n; i++) {
             if (i % 2 == 0) {
                 System.out.println(i + " Even");
             } else {
                 System.out.println(i + " Odd");
             }
         }
     }

     // 3. With return, No parameters
     public String check3() {
         String result = "";
         for (int i = 1; i <= 50; i++) {
             if (i % 2 == 0) {
                 result += i + " Even\n";
             } else {
                 result += i + " Odd\n";
             }
         }
         return result;
     }

     // 4. With return, With parameters
     public String check4(int n) {
         String result = "";
         for (int i = 1; i <= n; i++) {
             if (i % 2 == 0) {
                 result += i + " Even\n";
             } else {
                 result += i + " Odd\n";
             }
         }
         return result;
     }
 }
