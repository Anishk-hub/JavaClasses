package Switch;

public class NumberRange {
    public static void main(String[] args) {
        int num = 100;

        switch (num / 10){
            case 1:
            case 2:
            case 3:
                System.out.println( num + " Low");
                break;

            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println(num + " Medium");
                break;

            case 8:
            case 9:
            case 10:
                System.out.println( num + " High");
                break;

            default:
                System.out.println( num + " Invalid number");
        }

    }
}
