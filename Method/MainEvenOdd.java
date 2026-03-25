package Method;

public class MainEvenOdd {
    public static void main(String[] args) {

        EvenOdd e1 = new EvenOdd();

        // 1. No return, No parameters
        e1.check1();

        // 2. No return, With parameters
        e1.check2(20);

        // 3. With return, No parameters
        String res3 = e1.check3();
        System.out.println(res3);

        // 4. With return, With parameters
        String res4 = e1.check4(10);
        System.out.println(res4);
    }
}
