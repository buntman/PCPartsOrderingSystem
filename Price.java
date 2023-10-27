package orderingSystem;

public class Price {
    private int totalAmount;
    int [] cpu_prices = {12400, 25000, 30000, 15000, 21000};
    int [] gpu_prices = {16000, 25000, 30000, 21000, 45000};
    int [] storage_prices = {2000, 3000, 5000};
    int [] memory_prices = {2600, 4500, 8500};
    int [] psu_prices = {5000, 7000, 10000};
    int [] case_prices = {5000, 3500};


    public int getCpuPrice(int index) {
        totalAmount+=cpu_prices[index -1];
        return cpu_prices[index -1];
    }

    public int getGpuPrice(int index) {
        totalAmount+=cpu_prices[index -1];
        return gpu_prices[index -1];
    }

    public int getStoragePrice(int index) {
        totalAmount+=cpu_prices[index -1];
        return storage_prices[index -1];
    }

    public int getMemoryPrice(int index) {
        totalAmount+=cpu_prices[index -1];
        return memory_prices[index -1];
    }

    public int getPsuPrice(int index) {
        totalAmount+=cpu_prices[index -1];
        return psu_prices[index -1];
    }

    public int getCasePrice(int index) {
        totalAmount+=cpu_prices[index -1];
        return case_prices[index -1];
    }

    public int totalAmount() {
        return totalAmount;
    }

}
