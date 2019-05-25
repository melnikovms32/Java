import by.gsu.mslab.Byn;
import by.gsu.mslab.Purchase;
import by.gsu.mslab.PurchasesFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("src/in.txt"));
            final int PURCHASES_NUMBER = 6;
            Purchase[] purchases = new Purchase[PURCHASES_NUMBER];
            Purchase max = new Purchase("", new Byn(0), 0);
            boolean flag = true;
            for (int i = 0; i < purchases.length; i++) {
                purchases[i] = PurchasesFactory.getPurchaseFromFactory(scanner);
                System.out.println(purchases[i]);
                if (purchases[i].getCost().compareTo(max.getCost()) > 0) {
                    max = purchases[i];
                }

                if (flag) {
                    flag = purchases[i].equals(purchases[0]);
                }
            }

            System.out.println("\nPurchase max " + max + "\n");
            if (flag) {
                System.out.println("All purchases are equal");
            } else {
                System.out.println("Purchases are not equal");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Input file is not found");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
