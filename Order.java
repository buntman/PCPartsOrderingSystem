package orderingSystem;

import java.util.Scanner;

public class Order {

    Scanner scan = new Scanner(System.in);
    Product product = new Product();
    Price price = new Price();
    Menu menu = new Menu();
    Customer customer = new Customer();
    String components [];
    int componentsPrice [];
    String preBuiltComponents [];
    int preBuiltPrice [];



    public void userMenu() {
        System.out.println("Welcome to Soltech - Crafting Excellence in High-End PCs");
        System.out.println("Get in touch with us:");
        System.out.println("Website: www.soltechpcs.com");
        System.out.println("Phone: 1-800-SOLTECH");
        System.out.println("Email: info@soltechpcs.com");
        System.out.println();
        System.out.println("1. Build your own\n2. Pre-Built");
        System.out.print("Enter Choice: ");
        int user_choice = scan.nextInt();
        System.out.println();

        if(user_choice == 1) {
            createOrder();
            enterDetails();
            payment();
            printReceipt();
        } else if(user_choice == 2) {
            menu.showPrebuilt();
            orderPreBuilt();
            System.out.println();
            enterDetails();
            payment();
            printPreBuiltReceipt();
        }
    }


    private void createOrder() {
        menu.showCpu();
        System.out.print("Enter cpu choice: ");
        int choice1 = scan.nextInt();
        while (choice1 > product.cpu.length || choice1 < 1) {
            System.out.println("Invalid Input! Choose from 1-5 only!");
            menu.showCpu();
            System.out.print("Enter again: ");
            choice1 = scan.nextInt();
        }
        String cpu_choice = product.getCpu(choice1);
        int cpu_price = price.getCpuPrice(choice1);
        System.out.println();


        menu.showGpu();
        System.out.print("Enter gpu choice: ");
        int choice2 = scan.nextInt();
        while (choice2 > product.gpu.length || choice2 < 1) {
            System.out.println("Invalid Input! Choose from 1-5 only!");
            menu.showGpu();
            System.out.print("Enter again: ");
            choice2 = scan.nextInt();
        }
        String gpu_choice = product.getGpu(choice2);
        int gpu_price = price.getGpuPrice(choice2);
        System.out.println();


        menu.showStorage();
        System.out.print("Enter storage choice: ");
        int choice3 = scan.nextInt();
        while (choice3 > product.storage.length || choice3 < 1) {
            menu.showStorage();
            System.out.print("Enter again: ");
            choice3 = scan.nextInt();
        }
        String storage_choice = product.getStorage(choice3);
        int storage_price = price.getStoragePrice(choice3);
        System.out.println();


        menu.showMemory();
        System.out.print("Enter ram choice: ");
        int choice4 = scan.nextInt();
        while (choice4 > product.memory.length || choice4 < 1) {
            menu.showMemory();
            System.out.print("Enter again: ");
            choice4 = scan.nextInt();
        }
        String ram_choice = product.getMemory(choice4);
        int ram_price = price.getMemoryPrice(choice4);
        System.out.println();


        menu.showPsu();
        System.out.print("Enter psu choice: ");
        int choice5 = scan.nextInt();
        while (choice5 > product.psu.length || choice5 < 1) {
            menu.showPsu();
            System.out.print("Enter again: ");
            choice5 = scan.nextInt();
        }
        String psu_choice = product.getPsu(choice5);
        int psu_price = price.getPsuPrice(choice5);
        System.out.println();

        menu.showPcCase();
        System.out.print("Enter case choice: ");
        int choice6 = scan.nextInt();
        while (choice6 > product.pc_case.length || choice6 <1) {
            menu.showPcCase();
            System.out.print("Enter again: ");
            choice6 = scan.nextInt();
        }
        String case_choice = product.getPc_case(choice6);
        int case_price = price.getCasePrice(choice6);

        components = new String[]{cpu_choice, gpu_choice, storage_choice, ram_choice, psu_choice, case_choice};
        componentsPrice = new int[]{cpu_price, gpu_price, storage_price, ram_price, psu_price, case_price};
    }


    private void orderPreBuilt() {
        String preBuiltCpu = product.getCpu(product.cpu.length);
        int cpuPrice = price.getCpuPrice(price.cpu_prices.length);
        String preBuiltGpu = product.getGpu(product.gpu.length);
        int gpuPrice = price.getGpuPrice(price.gpu_prices.length);
        String preBuiltStorage = product.getStorage(product.storage.length);
        int storagePrice = price.getStoragePrice(price.storage_prices.length);
        String preBuiltMemory = product.getMemory(product.memory.length);
        int memoryPrice = price.getMemoryPrice(price.memory_prices.length);
        String preBuiltPsu = product.getPsu(product.psu.length);
        int psuPrice = price.getPsuPrice(price.psu_prices.length);
        String preBuiltCase = product.getPc_case(product.pc_case.length);
        int casePrice = price.getCasePrice(price.case_prices.length);

        preBuiltComponents = new String[]{preBuiltCpu, preBuiltGpu, preBuiltStorage, preBuiltMemory, preBuiltPsu, preBuiltCase};
        preBuiltPrice = new int[] {cpuPrice, gpuPrice, storagePrice, memoryPrice, psuPrice, casePrice};

    }
    private void printReceipt() {
        System.out.println("Receipt:");
        System.out.println("----------------------------");
        for (int i = 0; i < components.length; i++) {
            System.out.printf("%-25s ₱%d%n", components[i], componentsPrice[i]);
        }
        System.out.println("----------------------------");
        System.out.printf("Total:          ₱%d",price.totalAmount());
    }

    private void printPreBuiltReceipt() {
        System.out.println("Receipt:");
        System.out.println("----------------------------");
        for (int i = 0; i < preBuiltComponents.length; i++) {
            System.out.printf("%-25s ₱%d%n", preBuiltComponents[i], preBuiltPrice[i]);
        }
        System.out.println("----------------------------");
        System.out.printf("Total:          ₱%d",price.totalAmount());
    }

    private void payment() {
        System.out.println("Choose payment option\n1. Gcash\n2. Bank"); //needs to validate non digit character
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        scan.nextLine();
        if(choice == 1) {
            System.out.print("Enter Mobile Number: ");
            customer.gcashMobileNumber = scan.nextLine();
            while (customer.gcashMobileNumber.length() != 11) {
                System.out.print("Enter Correct Mobile Number: ");
                customer.gcashMobileNumber = scan.nextLine();
            }
            System.out.print("Enter pin: ");
            customer.pin = scan.nextLine();
            while (customer.pin.length() !=4) {
                System.out.print("Enter Correct Pin: ");
                customer.pin = scan.nextLine();
            }
        } else if(choice == 2) {
            System.out.print("Enter bank id: ");
            customer.bankId = scan.nextLine();
            while (customer.bankId.length() != 8) {
                System.out.print("Enter bank id: ");
                customer.bankId = scan.nextLine();
            }
            System.out.print("Enter pin: ");
            customer.pin = scan.nextLine();
            while (customer.pin.length() != 4) {
                System.out.print("Enter pin: ");
                customer.pin = scan.nextLine();
            }
        }
    }

    private void enterDetails() {
        System.out.println("Customer Details");
        scan.nextLine();
        System.out.print("Enter Full Name: ");
        customer.name = scan.nextLine();
        System.out.print("Enter Address: ");
        customer.address = scan.nextLine();
        System.out.print("Enter Mobile Number: ");
        customer.mobileNumber = scan.nextLine();
        while (customer.mobileNumber.length() != 11) {
            System.out.print("Enter Correct Mobile Number: ");
            customer.mobileNumber = scan.nextLine();
        }
    }

}
