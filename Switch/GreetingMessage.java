package Switch;

public class GreetingMessage {
    public static void main(String[] args) {
        int choice = 2;

        switch (choice){
            case 1:
                System.out.println("English --> Hello!!");
                break;
            case 2:
                System.out.println("Marathi --> Namaskar");
                break;
            case 3:
                System.out.println("Hindi --> Namaste");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
