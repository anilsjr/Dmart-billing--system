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
        System.out.println("----------------------------------------------");
        System.out.println("\t\tWelcome to new DMart");
        System.out.println("----------------------------------------------");
        System.out.print("Enter name : ");
        name = s.nextLine();
        System.out.print("Enter gender (M/F): ");

        do {
            gen = s.next().charAt(0);
            if (gen == 'M' || gen == 'm' || gen == 'f' || gen == 'F') {
                break;
            }
            System.out.println(RED + "please Enter M/m or F/f only :" + RESET);
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
        System.out.println("Enter quantity you have purchase of Items :- ");
        // item-1
        System.out.print("\nItem-1 : ");
        do {
            quantity = s.nextInt();

            if (quantity >= 1 && quantity <= 50) {
                q1 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one quantity and maximum 50 quantity " + RESET);
            System.out.print("\nItem-1 : ");
        } while (!(quantity >= 1 && quantity <= 50));

        // total price

        tp1 = quantity * p1;

        if (quantity >= 5) {
            discount = 5;
        } else {
            discount = 0;
        }
        aDis1 = tp1 * (1 - discount / 100);

        // item - 2
        System.out.print("\nItem-2 : ");
        do {
            quantity = s.nextInt();

            if (quantity >= 1 && quantity <= 50) {
                q2 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one quantity and maximum 50 quantity " + RESET);
            System.out.print("\nItem-2 : ");
        } while (!(quantity >= 1 && quantity <= 50));
        tp2 = quantity * p2;

        if (quantity >= 5) {
            discount = 5;
        } else {
            discount = 0;
        }

        aDis2 = tp2 * (1 - discount / 100);

        // item-3
        System.out.print("\nItem-3 : ");
        do {
            quantity = s.nextInt();

            if (quantity >= 1 && quantity <= 50) {
                q3 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one quantity and maximum 50 quantity " + RESET);
            System.out.print("\nItem-3 : ");
        } while (!(quantity >= 1 && quantity <= 50));

        tp3 = quantity * p3;

        if (quantity >= 5) {
            discount = 5;
        } else {
            discount = 0;
        }
        aDis3 = tp3 * (1 - discount / 100);

        // item-4
        System.out.print("\nItem-4 : ");
        do {
            quantity = s.nextInt();

            if (quantity >= 1 && quantity <= 50) {
                q4 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one quantity and maximum 50 quantity " + RESET);
            System.out.print("\nItem-4 : ");
        } while (!(quantity >= 1 && quantity <= 50));

        tp4 = quantity * p4;

        if (quantity >= 5) {
            discount = 5;
        } else {
            discount = 0;
        }
        aDis4 = tp4 * (1 - discount / 100);

        // item-5
        System.out.print("\nItem-5 : ");
        do {
            quantity = s.nextInt();

            if (quantity >= 1 && quantity <= 50) {
                q5 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one quantity and maximum 50 quantity " + RESET);
            System.out.print("\nItem-5 : ");
        } while (!(quantity >= 1 && quantity <= 50));

        // total price

        tp5 = quantity * p5;
        discount = 10;
        aDis5 = tp5 * (1 - discount / 100);

        // item-6
        System.out.print("\nItem-6 : ");
        do {
            quantity = s.nextInt();

            if (quantity >= 1 && quantity <= 50) {
                q6 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one quantity and maximum 50 quantity " + RESET);
            System.out.print("\nItem-6 : ");
        } while (!(quantity >= 1 && quantity <= 50));

        // total price

        tp6 = quantity * p6;

        if (quantity >= 5) {
            discount = 5;
        } else {
            discount = 0;
        }
        aDis6 = tp6 * (1 - discount / 100);

        // item-7
        System.out.print("\nItem-7 : ");
        do {
            quantity = s.nextInt();

            if (quantity >= 1 && quantity <= 50) {
                q7 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one quantity and maximum 50 quantity " + RESET);
            System.out.print("\nItem-7 : ");
        } while (!(quantity >= 1 && quantity <= 50));

        // total price

        tp7 = quantity * p7;

        if (quantity >= 5) {
            discount = 5;
        } else {
            discount = 0;
        }
        aDis7 = tp7 * (1 - discount / 100);

        // item-8
        System.out.print("\nItem-8 : ");
        do {
            quantity = s.nextInt();

            if (quantity >= 1 && quantity <= 50) {
                q8 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one quantity and maximum 50 quantity " + RESET);
            System.out.print("\nItem-8 : ");
        } while (!(quantity >= 1 && quantity <= 50));

        // total price

        tp8 = quantity * p8;

        if (quantity >= 5) {
            discount = 5;
        } else {
            discount = 0;
        }
        aDis8 = tp8 * (1 - discount / 100);

        // item-9
        System.out.print("\nItem9 : ");
        do {
            quantity = s.nextInt();

            if (quantity >= 1 && quantity <= 50) {
                q9 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one quantity and maximum 50 quantity " + RESET);
            System.out.print("\nItem-9 : ");
        } while (!(quantity >= 1 && quantity <= 50));

        // total price

        tp9 = quantity * p9;

        if (quantity >= 5) {
            discount = 5;
        } else {
            discount = 0;
        }
        aDis9 = tp9 * (1 - discount / 100);

        // item-10
        System.out.print("\nItem-10 : ");
        do {
            quantity = s.nextInt();

            if (quantity >= 1 && quantity <= 50) {
                q10 = quantity;
                break;
            }
            System.out.print(RED + "You can ONLY purchase minimum one quantity and maximum 50 quantity " + RESET);
            System.out.print("\nItem-10 : ");
        } while (!(quantity >= 1 && quantity <= 50));

        // total price

        tp10 = quantity * p10;

        if (quantity >= 5) {
            discount = 5;
        } else {
            discount = 0;
        }
        aDis10 = tp10 * (1 - discount / 100);

        System.out.println("_____________________________________________________________");
        // carry bag
        System.out.println("Carry Bag (Y/N) : ");
        do {
            carryBag = s.next().charAt(0);
            if (carryBag == 'Y' || carryBag == 'N' || carryBag == 'y' || carryBag == 'n') {
                break;
            }
            System.out.println(RED + "please Enter Y/y or N/n only :" + RESET);
        } while (carryBag != 'Y' && carryBag != 'N' && carryBag != 'y' && carryBag != 'n');

        System.out.println();

        // AP and DP
        AP = tp1 + tp2 + tp3 + tp4 + tp5 + tp6 + tp7 + tp8 + tp9 + tp10;
        DP = aDis1 + aDis2 + aDis3 + aDis4 + aDis5 + aDis6 + aDis7 + aDis8 + aDis9 + aDis10;

        // print bill
        System.out.println("_____________________________________________________________");
        System.out.println("\t\t\tDMart");
        System.out.println("Name : " + name + "\t\t\t\tDate : " + date);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Items Quantity Price Total After-Discount");

        System.out.println("Item-1 \t" + q1 + "\t" + p1 + "\t" + tp1 + "\t" + aDis1);
        System.out.println("Item-2 \t" + q2 + "\t" + p2 + "\t" + tp2 + "\t" + aDis2);
        System.out.println("Item-3 \t" + q3 + "\t" + p3 + "\t" + tp3 + "\t" + aDis3);
        System.err.println("Item-4 \t" + q4 + "\t" + p4 + "\t" + tp4 + "\t" + aDis4);
        System.out.println("Item-5 \t" + q5 + "\t" + p5 + "\t" + tp5 + "\t" + aDis5);
        System.out.println("Item-6 \t" + q6 + "\t" + p6 + "\t" + tp6 + "\t" + aDis6);
        System.out.println("Item-7 \t" + q7 + "\t" + p7 + "\t" + tp7 + "\t" + aDis7);
        System.out.println("Item-8 \t" + q8 + "\t" + p8 + "\t" + tp8 + "\t" + aDis8);
        System.out.println("Item-9 \t" + q9 + "\t" + p9 + "\t" + tp9 + "\t" + aDis9);
        System.out.println("Item-10 \t" + q10 + "\t" + p10 + "\t" + tp10 + "\t" + aDis10);

        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\t\tA.P\tD.P");
        System.out.println("\t\t\t" + AP + "\t" + DP);

        discount = 0;
        if (AP >= 10000) {
            discount = 15;
            DP = AP * (1 - discount / 100);
        } else if (AP >= 5000 && AP < 10000) {
            discount = 10;
            DP = AP * (1 - discount / 100);
        }

        if (discount > 0) {
            System.out.println("After " + discount + "% discount : " + AP + "\t\t" + DP);
            System.out.println("\t\t\t\t" + AP + "\t\t" + DP);
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println(GREEN + "Gift : " + gift + "\t 0.0 \t 0.0" + RESET);

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

        System.out.println("Carry Bag : \t\t" + price + "\t " + price);
        System.out.println("GST(10%)\t\t" + AP / 10 + "\t" + AP / 10);
        DP += AP / 10;
        AP += AP / 10;
        AP += price;
        DP += price;
        System.out.println("_____________________________________________________________");

        System.out.println("\t\t\t" + AP + "\t" + DP + " Rs");

        System.out.println("\t\tThank You");
        System.out.println("\t\t To Visit");
        System.out.println("\t\t D-Mart");
        System.out.println("_____________________________________________________________");

        System.out.println(GREEN + "Your bill generated succesfully" + RESET);
        s.close();

        // end...........
    }
}
