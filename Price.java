package orderingSystem;

public class Price {
    private int totalAmount;
    int [] cpu_prices = {12400, 25000, 30000, 15000, 21000};
    int [] board_prices = {4000, 5700, 9000};
    int [] gpu_prices = {16000, 25000, 30000, 21000, 45000};
    int [] storage_prices = {2000, 3000, 5000};
    int [] memory_prices = {2600, 4500, 8500};
    int [] psu_prices = {5000, 7000, 10000};
    int [] case_prices = {2000, 3500, 5000};
    int [] preBuiltPrice = {12400, 5700, 16000, 3000, 2600,5000,3500};
    int [] preBuiltPrice1 = {21000, 9000, 45000, 5000, 8500, 10000, 5000};



    public int getCpuPrice(int index) {
        totalAmount+=cpu_prices[index -1];
        return cpu_prices[index -1];
    }

    public int getMoboPrice(int index) {
        totalAmount+= board_prices[index -1];
        return board_prices[index -1];
    }

    public int getGpuPrice(int index) {
        totalAmount+=gpu_prices[index -1];
        return gpu_prices[index -1];
    }

    public int getStoragePrice(int index) {
        totalAmount+=storage_prices[index -1];
        return storage_prices[index -1];
    }

    public int getMemoryPrice(int index) {
        totalAmount+=memory_prices[index -1];
        return memory_prices[index -1];
    }

    public int getPsuPrice(int index) {
        totalAmount+=psu_prices[index -1];
        return psu_prices[index -1];
    }

    public int getCasePrice(int index) {
        totalAmount+=case_prices[index -1];
        return case_prices[index -1];
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int preBuiltAmount(int preBuiltChoice) {
        int sum = 0;
        if(preBuiltChoice == 1) {
            for (int i = 0; i < preBuiltPrice.length; i++) {
                sum += preBuiltPrice[i];
            }
        } else {
            for (int i = 0; i < preBuiltPrice1.length; i++) {
                sum += preBuiltPrice1[i];
            }
        }
        return sum;
    }

}
