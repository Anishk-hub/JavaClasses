package Method;

public class MainReverseClass {
    public static void main(String[] args) {
        ReverseNum obj = new ReverseNum();
        // 1
        obj.reverse1();

        // 2
        obj.reverse2(5678);

        // 3
        int r3 = obj.reverse3();
        System.out.println("3. Reverse: " + r3);

        // 4
        int r4 = obj.reverse4(9876);
        System.out.println("4. Reverse: " + r4);
    }
    }

