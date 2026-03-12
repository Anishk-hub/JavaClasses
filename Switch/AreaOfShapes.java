package Switch;

public class AreaOfShapes {
    public static void main(String[] args) {
        int choice = 2;

        switch (choice){
            case 1:   // Square
                int side = 5;
                int areaSquare = side * side;
                System.out.println(" Area of square " + areaSquare);
                break;

            case 2:   // Circle
                int radius = 3;
                double areaCircle = 3.14 * radius * radius;
                System.out.println(" Area of circle " + areaCircle);
                break;

            case 3:  // Rectangle
                int length = 6;
                int width = 4;
                int areaRectangle = length * width;
                System.out.println("Area of Rectangle = " + areaRectangle);
                break;


            default:
                System.out.println("Invalid choice");

        }
    }
}
