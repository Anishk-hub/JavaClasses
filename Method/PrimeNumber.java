package Method;

 class PrimeNumber {
     // 1. No return, No parameters
     // 1. No return, No parameters
     public void check1() {
         int n = 10;
         int count = 0;

         for(int i = 1; i <= n; i++){
             if(n % i == 0){
                 count++;
             }
         }

         if(count == 2)
             System.out.println(n + " is Prime");
         else
             System.out.println(n + " is Not Prime");
     }

     // 2. No return, With parameters
     public void check2(int n) {
         int count = 0;

         for(int i = 1; i <= n; i++){
             if(n % i == 0){
                 count++;
             }
         }

         if(count == 2)
             System.out.println(n + " is Prime");
         else
             System.out.println(n + " is Not Prime");
     }
     // 3. With return, No parameters
     public String check3() {
         int n = 15;
         int count = 0;

         for(int i = 1; i <= n; i++){
             if(n % i == 0){
                 count++;
             }
         }

         if(count == 2)
             return n + " is Prime";
         else
             return n + " is Not Prime";
     }
     // 4. With return, With parameters
     public String check4(int n) {
         int count = 0;

         for(int i = 1; i <= n; i++){
             if(n % i == 0){
                 count++;
             }
         }

         if(count == 2)
             return n + " is Prime";
         else
             return n + " is Not Prime";
     }
 }
