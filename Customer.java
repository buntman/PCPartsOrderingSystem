package orderingSystem;

import java.util.Scanner;

public class Customer {
    Scanner scan = new Scanner(System.in);
    private String name;
    private String address;
    private String mobileNumber;
    private String gcashMobileNumber;
    private String bankId;
    private String pin;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setGcashMobileNumber(String gcashMobileNumber) {
        this.gcashMobileNumber = gcashMobileNumber;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getBankId() {
        return bankId;
    }

    public String getPin() {
        return pin;
    }

    public String getGcashMobileNumber() {
        return gcashMobileNumber;
    }

    public void enterDetails() {
        System.out.println("Enter Details");
        System.out.print("Enter Full Name: ");
        String name = scan.nextLine();
        setName(name);
        System.out.print("Enter Address: ");
        String address = scan.nextLine();
        setAddress(address);
        System.out.print("Enter Mobile Number: ");
        String mobileNumber = scan.nextLine();
        setMobileNumber(mobileNumber);
        while (getMobileNumber().length() != 11) {
            System.out.print("Enter Correct Mobile Number: ");
            mobileNumber = scan.nextLine();
            setMobileNumber(mobileNumber);
        }
    }

    public void customerDetails() {
        System.out.println("Customer Details");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Mobile Number: " + getMobileNumber());
        System.out.println("Delivery Time: 3-5 days");
        System.out.println();
    }
}
