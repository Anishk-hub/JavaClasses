public class TemperatureCategory {
    public static void main(String[] args) {
        int temp = 22;
        if(temp >= 30){
            System.out.println("Hot");
        } else if (temp >= 20) {
            System.out.println("Warm");

        } else if (temp >= 10) {
            System.out.println("Cool");

        } else{
            System.out.println("Cold");
        }
    }
}
