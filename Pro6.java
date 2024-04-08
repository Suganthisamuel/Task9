
import java.util.Scanner;

public class Pro6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the month number: ");
        int month = scanner.nextInt();
        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();
        System.out.print("Enter the number of days stayed: ");
        int numDays = scanner.nextInt();

        
        double tariff;
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                
                tariff = roomRent * numDays * 1.20;
                break;
            default:
                tariff = roomRent * numDays;
        }

        
        System.out.printf("Hotel tariff: %.2f\n", tariff);

        scanner.close();
    }
}

    