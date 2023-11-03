package orderingSystem;

import java.util.Scanner;

public class Payment {
    Scanner scan = new Scanner(System.in);
    Customer customer = new Customer();

    public void paymentOption() {
        System.out.println("Choose payment option\n1. Gcash\n2. Bank");
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        scan.nextLine();
        if(choice == 1) {
            System.out.print("Enter Gcash Number: ");
            String gcashMobileNumber = scan.nextLine();
            customer.setGcashMobileNumber(gcashMobileNumber);
            while (customer.getGcashMobileNumber().length() != 11) {
                System.out.print("Enter Correct Gcash Number: ");
                gcashMobileNumber = scan.nextLine();
                customer.setGcashMobileNumber(gcashMobileNumber);
            }
            System.out.print("Enter pin: ");
            String pin = scan.nextLine();
            customer.setPin(pin);
            while (customer.getPin().length() !=4) {
                System.out.print("Enter Correct Pin: ");
                pin = scan.nextLine();
                customer.setPin(pin);
            }
        } else if(choice == 2) {
            System.out.print("Enter bank id: ");
            String bankId = scan.nextLine();
            customer.setBankId(bankId);
            while (customer.getBankId().length() != 8) {
                System.out.println("Bank ID must be at least 8 digits!");
                System.out.print("Enter bank id: ");
                bankId = scan.nextLine();
                customer.setBankId(bankId);
            }
            System.out.print("Enter pin: ");
            String pin = scan.nextLine();
            customer.setPin(pin);
            while (customer.getPin().length() !=4) {
                System.out.print("Enter Correct Pin: ");
                pin = scan.nextLine();
                customer.setPin(pin);
            }
        }
    }
}
