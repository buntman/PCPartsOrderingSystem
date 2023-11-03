package orderingSystem;

public class Customer {
    String name;
    String address;
    String mobileNumber;
    String gcashMobileNumber;
    String bankId;
    String pin;


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

    public void customerDetails() {
        System.out.println();
        System.out.println("Customer Details");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Delivery Time: 3-5 days");
        System.out.println();
    }
}
