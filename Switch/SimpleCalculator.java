package Switch;

public class SimpleCalculator {
    public static void main(String[] args) {
         int num1 = 10;
         int num2 = 5;
         int choice = 4;   // 1:Addition, 2:Subtraction, 3:Multiplication, 4:Division

         switch(choice){
             case 1 :
                 System.out.println("Addition = " + (num1 + num2));
                 break;
             case 2:
                 System.out.println("Subtraction = " + (num1 - num2));
                 break;
             case 3:
                 System.out.println("Multiplication = " + (num1 * num2));
                 break;
             case 4:
                 System.out.println("Division = " + (num1 / num2));
                 break;

             default:
                 System.out.println("Invalid choice");
         }
    }
}
