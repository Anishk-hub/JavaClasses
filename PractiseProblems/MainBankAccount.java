package PractiseProblems;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.balance = 600.58;
        System.out.println("Account balance: " + b1.balance);

        if(b1.balance < 1000){
            System.out.println("Low balance");
        } else{
            System.out.println("Sufficient balance");
        }
    }
}
