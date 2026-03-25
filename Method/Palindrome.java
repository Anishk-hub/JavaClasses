package Method;

class Palindrome {
    // 1. No return, No parameters
    public void check1() {
        int num = 121;
        int temp = num, rev = 0;

        while (num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        if (temp == rev)
            System.out.println("1. Palindrome");
        else
            System.out.println("1. Not Palindrome");
    }

    // 2. No return, With parameters
    public void check2(int num) {
        int temp = num, rev = 0;

        while (num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        if (temp == rev)
            System.out.println("2. Palindrome");
        else
            System.out.println("2. Not Palindrome");
    }

    // 3. With return, No parameters
    public boolean check3() {
        int num = 123;
        int temp = num, rev = 0;

        while (num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        return temp == rev;
    }

    // 4. With return, With parameters
    public boolean check4(int num) {
        int temp = num, rev = 0;

        while (num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        return temp == rev;
    }
}
