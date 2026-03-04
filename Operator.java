public class Operator {
    public static void main(String[] args) {

    int a = 14;
    int b = 10;

    // Modulus Operator
    System.out.println("Remainder: " + (a % b));

    // Increment
    a++;
    b++;
    System.out.println("After a++ : " + a);

    // Decrement
    b--;
    a--;
    System.out.println("After b-- : " + b);

    // Pre Increment
    System.out.println("Pre Increment: " + (++a));

    // Post Increment
    System.out.println("Post Increment: " + (a++));

    // Assignment operator
    a += 5;
    b -= 4;
    System.out.println("After a += 5 : " + a);
    // Modulus again
    System.out.println("a % 4 = " + (a % 4));

    int c = a + b;
    System.out.println("Sum of a and b : " + c);

    System.out.println("Final value of a : " + a);
}
}
