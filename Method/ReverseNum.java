package Method;

class ReverseNum {

    // 1. No return, No parameters

   public void reverse1() {
        int num = 1234;
        int rev = 0;

        while(num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        System.out.println("1. Reverse: " + rev);
    }

    // 2. No return, With parameters
   public void reverse2(int num) {
        int rev = 0;

        while(num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        System.out.println("2. Reverse: " + rev);
    }
    // 3. With return, No parameters
   public int reverse3() {
        int num = 1234;
        int rev = 0;

        while(num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        return rev;
    }
    // 4. With return, With parameters
    int reverse4(int num) {
        int rev = 0;

        while(num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        return rev;
    }

}
