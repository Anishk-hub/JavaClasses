package Switch;

public class GradSystem {
    public static void main(String[] args) {
        char grade = 'B';

        switch(grade){
            case 'A':
                System.out.println("Rang -> 90 to 100 -> Excellent" );
                break;
            case 'B':
                System.out.println("Rang -> 80 to 89 -> Good" );
                break;
            case 'C':
                System.out.println("Rang -> 70 to 79 -> Average" );
                break;
            case 'D':
                System.out.println("Rang -> 60 to 69 -> Pass");
                break;
            case 'F':
                System.out.println("Rang -> 50 to 59 -> Fail");
                break;

            default:
                System.out.println("Invalid Input");

        }


    }
}
