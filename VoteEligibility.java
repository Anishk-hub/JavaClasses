public class VoteEligibility {
    public static void main(String[] args) {
        int age = 27;
        if( age >= 18){
            System.out.println(" Eligible to vote");

            if (age >= 25){
                System.out.println(" Can contest election");
            } else{
                System.out.println(" Can not contest election");
            }
        } else{
            System.out.println(" Not Eligible to vote");
        }
    }
}
