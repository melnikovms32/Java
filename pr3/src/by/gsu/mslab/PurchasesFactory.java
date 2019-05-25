package by.gsu.mslab;

import java.util.Scanner;

public class PurchasesFactory {
    private static enum PurchaseKind {
        GENERAL_PURCHASE {
            Purchase getPurchase(Scanner scanner) {
                return new Purchase(scanner);
            }
        },

        PRICE_DISCOUNT_PURCHASE {
            Purchase getPurchase(Scanner scanner) {
                return new PriceDiscountPurchase(scanner);
            }
        },
        PERCENT_DISCOUNT_PURCHASE {
            Purchase getPurchase(Scanner scanner) {
                return new PercentDiscountPurchase(scanner);
            }
        };

        abstract Purchase getPurchase(Scanner scanner);
    }

    public static Purchase getPurchaseFromFactory(Scanner scanner) {
        String id = scanner.next();
        return PurchaseKind.valueOf(id).getPurchase(scanner);
    }
}
