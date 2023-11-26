package orderingSystem;


import java.util.Scanner;

public class Order {

    Scanner scan = new Scanner(System.in);
    Product product = new Product();
    Price price = new Price();
    Menu menu = new Menu();
    Customer customer = new Customer();
    Payment payment = new Payment();
    Receipt receipt = new Receipt();
    private int preBuiltChoice;
    private boolean hasOrder;
    private int user_choice;




        public void startProgram() {
            System.out.println("Welcome to Soltech - Crafting Excellence in High-End PCs");
            System.out.println("Get in touch with us:");
            System.out.println("Website: www.soltechpcs.com");
            System.out.println("Phone: 1-800-SOLTECH");
            System.out.println("Email: info@soltechpcs.com");
            System.out.println();
            while (true) {
                System.out.println("1. Order\n2. View Order\n3. Exit");
                System.out.print("Enter Choice: ");
                int userInput = scan.nextInt();
                if(userInput == 1) {
                    userOrder();
                } else if(userInput == 2) {
                    if(!hasOrder) {
                        System.out.println("You have no order!");
                    } else {
                        if(user_choice == 1) {
                            receipt.printReceipt();
                            customer.customerDetails();
                        } else {
                            receipt.preBuiltReceipt(preBuiltChoice);
                            customer.customerDetails();
                        }
                    }
                } else if(userInput == 3) {
                    break;
                }
            }
        }

        private void userOrder() {
        System.out.println("1. Build your own\n2. Pre-Built");
        System.out.print("Enter Choice: ");
        user_choice = scan.nextInt();
        System.out.println();

        if(user_choice == 1) {
            hasOrder = true;
            createOrder();
            menu.displayUserBuild();
            System.out.println("Are you satisfied with your chosen parts? Please enter '1' to proceed for Checkout or '2' to go back to the main menu.");
            int input = scan.nextInt();
            if(input == 1) {
                customer.enterDetails();
                payment.paymentOption();
                System.out.println("Press '1' to confirm payment or '2' to go back to the main menu.");
                int user_choice2 = scan.nextInt();
                if(user_choice2 == 1) {
                    receipt.printReceipt();
                } else {
                    hasOrder = false;
                }
            } else {
                hasOrder = false;
            }
        } else if(user_choice == 2) {
            hasOrder = true;
            menu.displayPreBuilt();
            System.out.print("Enter choice: ");
            preBuiltChoice = scan.nextInt();
            menu.displayChosenPreBuilt(preBuiltChoice);
            System.out.println("Are you satisfied with your chosen parts? Please enter '1' to proceed for Checkout or '2' to go back to the main menu.");
            int input = scan.nextInt();
            if(input == 1) {
                customer.enterDetails();
                payment.paymentOption();
                System.out.println("Press '1' to confirm payment or '2' to go back to the main menu.");
                int user_choice2 = scan.nextInt();
                if(user_choice2 == 1) {
                    receipt.preBuiltReceipt(preBuiltChoice);
                } else {
                    hasOrder = false;
                }
            } else {
                hasOrder = false;
            }
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


        menu.showMobo();
        System.out.print("Enter motherboard choice: ");
        int choice2 = scan.nextInt();
        while (choice2 > product.motherboard.length || choice2 <1) {
            System.out.println("Invalid Input! Choose from 1-3 only");
            menu.showMobo();
            System.out.print("Enter again: ");
            choice2 = scan.nextInt();
        }
        String mobo_choice = product.getMobo(choice2);
        int mobo_price = price.getMoboPrice(choice2);
        System.out.println();


        menu.showGpu();
        System.out.print("Enter gpu choice: ");
        int choice3 = scan.nextInt();
        while (choice3 > product.gpu.length || choice3 < 1) {
            System.out.println("Invalid Input! Choose from 1-5 only!");
            menu.showGpu();
            System.out.print("Enter again: ");
            choice3 = scan.nextInt();
        }
        String gpu_choice = product.getGpu(choice3);
        int gpu_price = price.getGpuPrice(choice3);
        System.out.println();


        menu.showStorage();
        System.out.print("Enter storage choice: ");
        int choice4 = scan.nextInt();
        while (choice4 > product.storage.length || choice4 < 1) {
            menu.showStorage();
            System.out.print("Enter again: ");
            choice4 = scan.nextInt();
        }
        String storage_choice = product.getStorage(choice4);
        int storage_price = price.getStoragePrice(choice4);
        System.out.println();


        menu.showMemory();
        System.out.print("Enter ram choice: ");
        int choice5 = scan.nextInt();
        while (choice5 > product.memory.length || choice5 < 1) {
            menu.showMemory();
            System.out.print("Enter again: ");
            choice5 = scan.nextInt();
        }
        String ram_choice = product.getMemory(choice5);
        int ram_price = price.getMemoryPrice(choice5);
        System.out.println();


        menu.showPsu();
        System.out.print("Enter psu choice: ");
        int choice6 = scan.nextInt();
        while (choice6 > product.psu.length || choice6 < 1) {
            menu.showPsu();
            System.out.print("Enter again: ");
            choice6 = scan.nextInt();
        }
        String psu_choice = product.getPsu(choice6);
        int psu_price = price.getPsuPrice(choice6);
        System.out.println();

        menu.showPcCase();
        System.out.print("Enter case choice: ");
        int choice7 = scan.nextInt();
        while (choice7 > product.pc_case.length || choice7 <1) {
            menu.showPcCase();
            System.out.print("Enter again: ");
            choice7 = scan.nextInt();
        }
        String case_choice = product.getPc_case(choice7);
        int case_price = price.getCasePrice(choice7);
        System.out.println();

        product.components = new String[]{cpu_choice, mobo_choice, gpu_choice, storage_choice, ram_choice, psu_choice, case_choice};
        price.componentsPrice = new int[]{cpu_price, mobo_price, gpu_price, storage_price, ram_price, psu_price, case_price};
        receipt.populateArray(product.components, price.componentsPrice);
    }




}
