package Switch;

public class UpperLowerCase {
    public static void main(String[] args) {
        char ch = 'M';
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Upper case");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
            
        } else {
            System.out.println("Not an alphabet ");
        }
    }
}
