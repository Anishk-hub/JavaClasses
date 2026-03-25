package Method;

public class MainPrime {
    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();

        // 1
        p.check1();

        // 2
        p.check2(7);

        // 3
        System.out.println(p.check3());

        // 4
        System.out.println(p.check4(9));
    }
}
