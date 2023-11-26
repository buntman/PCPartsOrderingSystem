package orderingSystem;

public class Receipt {
    Product product = new Product();
    Price price = new Price();

    String [] components;
    int [] componentsPrice;

    public void populateArray(String [] items, int [] amount) {
        components = items;
        componentsPrice = amount;
    }

    public void printReceipt() {
        System.out.println("Receipt:");
        System.out.println("----------------------------");
        for (int i = 0; i < components.length; i++) {
            System.out.printf("%-25s ₱%d%n", components[i], componentsPrice[i]);
        }
        System.out.println("----------------------------");
        System.out.printf("Total:          ₱%d", price.getTotalAmount(componentsPrice));
        System.out.println();
    }

    public void preBuiltReceipt(int preBuiltChoice) {
        if(preBuiltChoice == 1) {
            System.out.println("Receipt:");
            System.out.println("----------------------------");
            for (int i = 0; i < product.preBuilt.length; i++) {
                System.out.printf("%-25s ₱%d%n", product.preBuilt[i], price.preBuiltPrice[i]);
            }
            System.out.println("----------------------------");
            System.out.printf("Total:          ₱%d",price.preBuiltAmount(preBuiltChoice));
            System.out.println();
        } else {
            System.out.println("Receipt:");
            System.out.println("----------------------------");
            for (int i = 0; i < product.preBuilt1.length; i++) {
                System.out.printf("%-25s ₱%d%n", product.preBuilt1[i], price.preBuiltPrice1[i]);
            }
            System.out.println("----------------------------");
            System.out.printf("Total:          ₱%d",price.preBuiltAmount(preBuiltChoice));
            System.out.println();
        }
    }
}
