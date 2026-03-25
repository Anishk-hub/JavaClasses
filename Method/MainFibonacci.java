package Method;

public class MainFibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        // 1
        f.fib1();

        //2
        f.fib2(8);

        //3
        int r3 =  f.fib3();
        System.out.println("3. Last term: " + r3);

        //4
        int r4 =  f.fib4(10);
        System.out.println("4. Last term: " + r4);

    }
}
