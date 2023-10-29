package orderingSystem;

public class Customer {
    String name;
    String address;
    String mobileNumber;
    String gcashMobileNumber;
    int bankId;
    int pin;


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getBankId() {
        return bankId;
    }

    public int getPin() {
        return pin;
    }

    public String getGcashMobileNumber() {
        return gcashMobileNumber;
    }

    public void customerDetails() {
        System.out.println("Customer Details");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Enter mobile number: " + mobileNumber);
    }
}
