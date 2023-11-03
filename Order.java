package orderingSystem;


import java.util.Scanner;

public class Order {

    Scanner scan = new Scanner(System.in);
    Product product = new Product();
    Price price = new Price();
    Menu menu = new Menu();
    Customer customer = new Customer();
    String [] components;
    int [] componentsPrice;
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
                            printReceipt();
                            customer.customerDetails();
                        } else {
                            preBuiltReceipt(preBuiltChoice);
                            customer.customerDetails();
                        }
                    }
                } else if(userInput == 3) {
                    break;
                }
            }
        }

        public void userOrder() {
        System.out.println("1. Build your own\n2. Pre-Built");
        System.out.print("Enter Choice: ");
        user_choice = scan.nextInt();
        System.out.println();

        if(user_choice == 1) {
            hasOrder = true;
            createOrder();
            displayUserBuild();
            System.out.println("Are you satisfied with your chosen parts? Please enter '1' to proceed for Checkout or '2' to go back to the main menu.");
            int input = scan.nextInt();
            if(input == 1) {
                enterDetails();
                payment();
                System.out.println("Press '1' to confirm payment or '2' to go back to the main menu.");
                int user_choice2 = scan.nextInt();
                if(user_choice2 == 1) {
                    printReceipt();
                } else {
                    hasOrder = false;
                }
            } else {
                hasOrder = false;
            }
        } else if(user_choice == 2) {
            hasOrder = true;
            displayPreBuilt();
            System.out.print("Enter choice: ");
            preBuiltChoice = scan.nextInt();
            displayChosenPreBuilt(preBuiltChoice);
            System.out.println("Are you satisfied with your chosen parts? Please enter '1' to proceed for Checkout or '2' to go back to the main menu.");
            int input = scan.nextInt();
            if(input == 1) {
                enterDetails();
                payment();
                System.out.println("Press '1' to confirm payment or '2' to go back to the main menu.");
                int user_choice2 = scan.nextInt();
                if(user_choice2 == 1) {
                    preBuiltReceipt(preBuiltChoice);
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

        components = new String[]{cpu_choice, mobo_choice, gpu_choice, storage_choice, ram_choice, psu_choice, case_choice};
        componentsPrice = new int[]{cpu_price, mobo_price, gpu_price, storage_price, ram_price, psu_price, case_price};
    }


    private void displayPreBuilt() {
        System.out.println("Pre-Built 1");
        for (int i = 0; i < product.preBuilt.length; i++) {
            System.out.printf("%-25s ₱%d%n", product.preBuilt[i], price.preBuiltPrice[i]);
        }
        System.out.println();
        System.out.println("Pre-Built 2");
        for (int i = 0; i < product.preBuilt1.length; i++) {
            System.out.printf("%-25s ₱%d%n", product.preBuilt1[i], price.preBuiltPrice1[i]);
        }
        System.out.println();
    }
    private void printReceipt() {
        System.out.println("Receipt:");
        System.out.println("----------------------------");
        for (int i = 0; i < components.length; i++) {
            System.out.printf("%-25s ₱%d%n", components[i], componentsPrice[i]);
        }
        System.out.println("----------------------------");
        System.out.printf("Total:          ₱%d", price.getTotalAmount());
        System.out.println();
    }

    private void preBuiltReceipt(int preBuiltChoice) {
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

    private void payment() {
        System.out.println("Choose payment option\n1. Gcash\n2. Bank"); //needs to validate non digit character
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        scan.nextLine();
        if(choice == 1) {
            System.out.print("Enter Gcash Number: ");
            customer.gcashMobileNumber = scan.nextLine();
            while (customer.gcashMobileNumber.length() != 11) {
                System.out.print("Enter Correct Gcash Number: ");
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
                System.out.println("Bank ID must be at least 8 digits!");
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

    public void displayUserBuild() {
        System.out.println("Chosen Parts:");
        for (int i = 0; i < components.length; i++) {
            System.out.printf("%-25s ₱%d%n", components[i], componentsPrice[i]);
        }
    }

    public void displayChosenPreBuilt(int choice) {
        if(choice == 1) {
            System.out.println("Pre-Built 1");
            for (int i = 0; i < product.preBuilt.length; i++) {
                System.out.printf("%-25s ₱%d%n", product.preBuilt[i], price.preBuiltPrice[i]);
            }
            System.out.println();
        } else {
            System.out.println("Pre-Built 2");
            for (int i = 0; i < product.preBuilt1.length; i++) {
                System.out.printf("%-25s ₱%d%n", product.preBuilt1[i], price.preBuiltPrice1[i]);
            }
            System.out.println();
        }
    }

}
