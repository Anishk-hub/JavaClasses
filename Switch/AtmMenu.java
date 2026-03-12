package Switch;

public class AtmMenu {
    public static void main(String[] args) {
        int select = 3;
         switch (select){
             case 1:
                 System.out.println("Check Balance");
                 break;
             case 2:
                 System.out.println("Withdraw Money");
                 break;
             case 3:
                 System.out.println(" Deposit Money");
                 break;
             case 4:
                 System.out.println(" Exit");

             default:
                 System.out.println("Select  Right number");
         }
    }
}
