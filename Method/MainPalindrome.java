package Method;

public class MainPalindrome {
    public static void main(String[] args) {
        Palindrome p1 = new Palindrome();

        // 1
        p1.check1();

        // 2
        p1.check2(1221);

        // 3
        boolean r3 = p1.check3();
        System.out.println("3. " + (r3 ? "Palindrome" : "Not Palindrome"));

        // 4
        boolean r4 = p1.check4(1234);
        System.out.println("4. " + (r4 ? "Palindrome" : "Not Palindrome"));
    }
}
