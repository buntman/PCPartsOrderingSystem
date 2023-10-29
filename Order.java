package orderingSystem;

import java.util.Scanner;

public class Order {

    Scanner scan = new Scanner(System.in);
    Product product = new Product();
    Price price = new Price();
    Menu menu = new Menu();
    Customer customer = new Customer();
    String components [];
    int components_price [];

    public void createOrder() {
        System.out.println("Welcome to Soltech!\nHome of the best customized PCs");
        menu.showCpu();
        System.out.print("Enter cpu choice: ");
        int choice1 = scan.nextInt();
        String cpu_choice = product.getCpu(choice1);
        int cpu_price = price.getCpuPrice(choice1);

        menu.showGpu();
        System.out.print("Enter gpu choice: ");
        int choice2 = scan.nextInt();
        String gpu_choice = product.getGpu(choice2);
        int gpu_price = price.getGpuPrice(choice2);

        menu.showStorage();
        System.out.print("Enter storage choice: ");
        int choice3 = scan.nextInt();
        String storage_choice = product.getStorage(choice3);
        int storage_price = price.getStoragePrice(choice3);

        menu.showMemory();
        System.out.print("Enter ram choice: ");
        int choice4 = scan.nextInt();
        String ram_choice = product.getMemory(choice4);
        int ram_price = price.getMemoryPrice(choice4);

        menu.showPsu();
        System.out.print("Enter psu choice: ");
        int choice5 = scan.nextInt();
        String psu_choice = product.getPsu(choice5);
        int psu_price = price.getPsuPrice(choice5);

        menu.showPcCase();
        System.out.print("Enter case choice: ");
        int choice6 = scan.nextInt();
        String case_choice = product.getPc_case(choice6);
        int case_price = price.getCasePrice(choice6);

        components = new String[]{cpu_choice, gpu_choice, storage_choice, ram_choice, psu_choice, case_choice};
        components_price = new int[]{cpu_price, gpu_price, storage_price, ram_price, psu_price, case_price};
    }

    public void printReceipt() {
        for (int i = 0; i < components.length; i++) {
            System.out.println(components[i] +" "+ "₱" +components_price[i]);
        }
        System.out.println("Total Amount: " +" "+ "₱" +price.totalAmount());
    }




    public void payment() {
        System.out.println("Choose payment option\n1. Gcash\n2. Bank");
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        scan.nextLine();
        if(choice == 1) {
            System.out.print("Enter Mobile Number: ");
            customer.gcashMobileNumber = scan.nextLine();
            System.out.print("Enter pin: ");
            customer.pin = scan.nextInt();
        } else if(choice == 2) {
            System.out.print("Enter bank id: ");
            customer.bankId = scan.nextInt();
            System.out.println("Enter pin: ");
            customer.pin = scan.nextInt();
        }
    }

    public void enterDetails() {
        System.out.println("Customer Details");
        scan.nextLine();
        System.out.print("Enter Full Name: ");
        customer.name = scan.nextLine();
        System.out.print("Enter Address: ");
        customer.address = scan.nextLine();
        System.out.print("Enter Mobile Number: ");
        customer.mobileNumber = scan.nextLine();
    }


    public static void main(String[] args) {
        Order x1 = new Order();
        x1.createOrder();
        x1.enterDetails();
        x1.payment();
        x1.printReceipt();
    }
}
