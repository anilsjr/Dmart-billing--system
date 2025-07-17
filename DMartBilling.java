import java.time.LocalDate;
import java.util.Scanner;

public class NewDMart {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";

        char carryBag, gen;
        String name, gift = "";
        int p1 = 10, p2 = 20, p3 = 30, p4 = 40, p5 = 50, p6 = 60, p7 = 70, p8 = 80, p9 = 90, p10 = 100;
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, q5 = 0, q6 = 0, q7 = 0, q8 = 0, q9 = 0, q10 = 0;
        int tp1, tp2, tp3, tp4, tp5, tp6, tp7, tp8, tp9, tp10;
        double aDis1, aDis2, aDis3, aDis4, aDis5, aDis6, aDis7, aDis8, aDis9, aDis10;

        int price = 0, quantity, AP = 0; // actual price,discounted price
        double DP = 0, discount = 0;

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("==============================================");
        System.out.println("              Welcome to new DMart            ");
        System.out.println("==============================================");
        System.out.print("Enter name : ");
        name = s.nextLine();
        System.out.print("Enter gender (M/F): ");

        do {
            gen = s.next().charAt(0);
            if (gen == 'M' || gen == 'm' || gen == 'f' || gen == 'F') {
                break;
            }
            System.out.println(RED + "Please enter M/m or F/f only: " + RESET);
        } while (gen != 'M' && gen != 'm' && gen != 'f' && gen != 'F');

        switch (gen) {
            case 'M':
            case 'm':
                gift = "Ladger Wallet";
                break;
            case 'F':
            case 'f':
                gift = "Cadeberry";
                break;
            default:
                break;
        }

        // taking items
        System.out.println("\nEnter quantity you have purchased for each item (1-50):");
        // item-1
        System.out.printf("%-10s", "Item-1:");
        do {
            quantity = s.nextInt();
            if (quantity >= 1 && quantity <= 50) {
                q1 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one and maximum 50 quantity. " + RESET);
            System.out.printf("\n%-10s", "Item-1:");
        } while (!(quantity >= 1 && quantity <= 50));
        tp1 = quantity * p1;
        discount = (quantity >= 5) ? 5 : 0;
        aDis1 = tp1 * (1 - discount / 100);

        // item-2
        System.out.printf("%-10s", "Item-2:");
        do {
            quantity = s.nextInt();
            if (quantity >= 1 && quantity <= 50) {
                q2 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one and maximum 50 quantity. " + RESET);
            System.out.printf("\n%-10s", "Item-2:");
        } while (!(quantity >= 1 && quantity <= 50));
        tp2 = quantity * p2;
        discount = (quantity >= 5) ? 5 : 0;
        aDis2 = tp2 * (1 - discount / 100);

        // item-3
        System.out.printf("%-10s", "Item-3:");
        do {
            quantity = s.nextInt();
            if (quantity >= 1 && quantity <= 50) {
                q3 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one and maximum 50 quantity. " + RESET);
            System.out.printf("\n%-10s", "Item-3:");
        } while (!(quantity >= 1 && quantity <= 50));
        tp3 = quantity * p3;
        discount = (quantity >= 5) ? 5 : 0;
        aDis3 = tp3 * (1 - discount / 100);

        // item-4
        System.out.printf("%-10s", "Item-4:");
        do {
            quantity = s.nextInt();
            if (quantity >= 1 && quantity <= 50) {
                q4 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one and maximum 50 quantity. " + RESET);
            System.out.printf("\n%-10s", "Item-4:");
        } while (!(quantity >= 1 && quantity <= 50));
        tp4 = quantity * p4;
        discount = (quantity >= 5) ? 5 : 0;
        aDis4 = tp4 * (1 - discount / 100);

        // item-5
        System.out.printf("%-10s", "Item-5:");
        do {
            quantity = s.nextInt();
            if (quantity >= 1 && quantity <= 50) {
                q5 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one and maximum 50 quantity. " + RESET);
            System.out.printf("\n%-10s", "Item-5:");
        } while (!(quantity >= 1 && quantity <= 50));
        tp5 = quantity * p5;
        discount = 10;
        aDis5 = tp5 * (1 - discount / 100);

        // item-6
        System.out.printf("%-10s", "Item-6:");
        do {
            quantity = s.nextInt();
            if (quantity >= 1 && quantity <= 50) {
                q6 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one and maximum 50 quantity. " + RESET);
            System.out.printf("\n%-10s", "Item-6:");
        } while (!(quantity >= 1 && quantity <= 50));
        tp6 = quantity * p6;
        discount = (quantity >= 5) ? 5 : 0;
        aDis6 = tp6 * (1 - discount / 100);

        // item-7
        System.out.printf("%-10s", "Item-7:");
        do {
            quantity = s.nextInt();
            if (quantity >= 1 && quantity <= 50) {
                q7 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one and maximum 50 quantity. " + RESET);
            System.out.printf("\n%-10s", "Item-7:");
        } while (!(quantity >= 1 && quantity <= 50));
        tp7 = quantity * p7;
        discount = (quantity >= 5) ? 5 : 0;
        aDis7 = tp7 * (1 - discount / 100);

        // item-8
        System.out.printf("%-10s", "Item-8:");
        do {
            quantity = s.nextInt();
            if (quantity >= 1 && quantity <= 50) {
                q8 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one and maximum 50 quantity. " + RESET);
            System.out.printf("\n%-10s", "Item-8:");
        } while (!(quantity >= 1 && quantity <= 50));
        tp8 = quantity * p8;
        discount = (quantity >= 5) ? 5 : 0;
        aDis8 = tp8 * (1 - discount / 100);

        // item-9
        System.out.printf("%-10s", "Item-9:");
        do {
            quantity = s.nextInt();
            if (quantity >= 1 && quantity <= 50) {
                q9 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one and maximum 50 quantity. " + RESET);
            System.out.printf("\n%-10s", "Item-9:");
        } while (!(quantity >= 1 && quantity <= 50));
        tp9 = quantity * p9;
        discount = (quantity >= 5) ? 5 : 0;
        aDis9 = tp9 * (1 - discount / 100);

        // item-10
        System.out.printf("%-10s", "Item-10:");
        do {
            quantity = s.nextInt();
            if (quantity >= 1 && quantity <= 50) {
                q10 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one and maximum 50 quantity. " + RESET);
            System.out.printf("\n%-10s", "Item-10:");
        } while (!(quantity >= 1 && quantity <= 50));
        tp10 = quantity * p10;
        discount = (quantity >= 5) ? 5 : 0;
        aDis10 = tp10 * (1 - discount / 100);

        System.out.println("------------------------------------------------------------");
        // carry bag
        System.out.print("Carry Bag (Y/N): ");
        do {
            carryBag = s.next().charAt(0);
            if (carryBag == 'Y' || carryBag == 'N' || carryBag == 'y' || carryBag == 'n') {
                break;
            }
            System.out.println(RED + "Please enter Y/y or N/n only: " + RESET);
        } while (carryBag != 'Y' && carryBag != 'N' && carryBag != 'y' && carryBag != 'n');

        System.out.println();

        // AP and DP
        AP = tp1 + tp2 + tp3 + tp4 + tp5 + tp6 + tp7 + tp8 + tp9 + tp10;
        DP = aDis1 + aDis2 + aDis3 + aDis4 + aDis5 + aDis6 + aDis7 + aDis8 + aDis9 + aDis10;

        // print bill
        System.out.println("============================================================");
        System.out.println("                      DMart Bill                            ");
        System.out.printf("Name: %-20s\tDate: %s\n", name, date);
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-8s %-8s %-8s %-10s %-15s\n", "Item", "Qty", "Price", "Total", "After-Discount");
        System.out.printf("%-8s %-8d %-8d %-10d %-15.2f\n", "Item-1", q1, p1, tp1, aDis1);
        System.out.printf("%-8s %-8d %-8d %-10d %-15.2f\n", "Item-2", q2, p2, tp2, aDis2);
        System.out.printf("%-8s %-8d %-8d %-10d %-15.2f\n", "Item-3", q3, p3, tp3, aDis3);
        System.out.printf("%-8s %-8d %-8d %-10d %-15.2f\n", "Item-4", q4, p4, tp4, aDis4);
        System.out.printf("%-8s %-8d %-8d %-10d %-15.2f\n", "Item-5", q5, p5, tp5, aDis5);
        System.out.printf("%-8s %-8d %-8d %-10d %-15.2f\n", "Item-6", q6, p6, tp6, aDis6);
        System.out.printf("%-8s %-8d %-8d %-10d %-15.2f\n", "Item-7", q7, p7, tp7, aDis7);
        System.out.printf("%-8s %-8d %-8d %-10d %-15.2f\n", "Item-8", q8, p8, tp8, aDis8);
        System.out.printf("%-8s %-8d %-8d %-10d %-15.2f\n", "Item-9", q9, p9, tp9, aDis9);
        System.out.printf("%-8s %-8d %-8d %-10d %-15.2f\n", "Item-10", q10, p10, tp10, aDis10);

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-25s %-10s %-15s\n", "", "A.P", "D.P");
        System.out.printf("%-25s %-10d %-15.2f\n", "", AP, DP);

        discount = 0;
        if (AP >= 10000) {
            discount = 15;
            DP = AP * (1 - discount / 100);
        } else if (AP >= 5000 && AP < 10000) {
            discount = 10;
            DP = AP * (1 - discount / 100);
        }

        if (discount > 0) {
            System.out.printf("After %d%% discount: \t%d\t%.2f\n", (int)discount, AP, DP);
            System.out.printf("%-25s %-10d %-15.2f\n", "", AP, DP);
        }
        System.out.println("------------------------------------------------------------");

        System.out.println(GREEN + "Gift : " + gift + "\t\t" + "0.0\t0.0" + RESET);

        switch (carryBag) {
            case 'Y':
            case 'y':
                price = 10;
                break;
            case 'N':
            case 'n':
                price = 0;
                break;
            default:
                break;
        }

        System.out.printf("Carry Bag:\t\t\t%d\t%d\n", price, price);
        System.out.printf("GST(10%%):\t\t\t%d\t%d\n", AP / 10, AP / 10);

        DP += AP / 10;
        AP += AP / 10;
        AP += price;
        DP += price;

        System.out.println("============================================================");
        System.out.printf("%-25s %-10d Rs. %-15.2f\n", "", AP, DP);
        System.out.println("------------------------------------------------------------");
        System.out.println("\t\tThank You for Visiting D-Mart");
        System.out.println("============================================================");

        System.out.println(GREEN + "Your bill generated successfully" + RESET);
        s.close();
    }
}
