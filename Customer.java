package orderingSystem;

public class Customer {
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

    public void customerDetails() {
        System.out.println();
        System.out.println("Customer Details");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Mobile Number: " + getMobileNumber());
        System.out.println("Delivery Time: 3-5 days");
        System.out.println();
    }
}
