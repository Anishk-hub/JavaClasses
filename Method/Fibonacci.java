package Method;

  class Fibonacci {


      // 1. No return, No parameters
     public void fib1() {
          int n = 5;   // kitne terms print karne hai
          int a = 0, b = 1;

          System.out.print("1. Fibonacci: ");
          for(int i = 1; i <= n; i++) {
              System.out.print(a + " ");
              int c = a + b;
              a = b;
              b = c;
          }
          System.out.println();
      }
      // 2. No return, With parameters
      void fib2(int n) {
          int a = 0, b = 1;

          System.out.print("2. Fibonacci: ");
          for(int i = 1; i <= n; i++) {
              System.out.print(a + " ");
              int c = a + b;
              a = b;
              b = c;
          }
          System.out.println();
      }
      // 3. With return, No parameters
      int fib3() {
          int n = 5;
          int a = 0, b = 1, last = 0;

          for(int i = 1; i <= n; i++) {
              last = a;
              int c = a + b;
              a = b;
              b = c;
          }

          return last;   // last term return
      }
      // 4. With return, With parameters
      int fib4(int n) {
          int a = 0, b = 1, last = 0;

          for(int i = 1; i <= n; i++) {
              last = a;
              int c = a + b;
              a = b;
              b = c;
          }

          return last;   // last term return
      }



  }
