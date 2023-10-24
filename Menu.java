package orderingSystem;

public class Menu {
    String [] cpu = {"Intel Core i5-13400", "Intel Core i9-13900k","Intel Core i9-14900k", "Ryzen 7 7800X3D", "Ryzen 9 7950X3D"};
    int [] cpu_prices = {12400, 25000, 30000, 15000, 21000};
    String [] gpu = {"RTX 3060 ti", "RTX 4060 ti", "RTX 4070", "RX 6800 XT", "RX 7900 XTX"};
    int [] gpu_prices = {16000, 25000, 30000, 21000, 45000};
    String [] storage = {"512gb NVME SSD", "1TB NVME SSD", "2TB NVME SSD"};
    int [] storage_prices = {2000, 3000, 5000};
    String [] memory = {"2x8gb RAM", "2x16gb RAM", "2x32gb RAM"};
    int [] memory_prices = {2600, 4500, 8500};

    String [] psu = {"650W 80+ Gold", "750W 80+ Gold", "850W 80+ Gold"};
    int [] psu_prices = {5000, 7000, 10000};

    String [] pc_case = {"ATX", "Micro-ATX"};
    int [] case_prices = {2500, 4000};

    public void displayCpu() {
        for (int i = 0; i < cpu.length; i++) {
            System.out.println((i + 1) + "-" + cpu[i] + " " + "₱" + cpu_prices[i]);
        }
    }

    public void displayGpu() {
        for (int i = 0; i < gpu.length; i++) {
            System.out.println((i + 1) + "-" + gpu[i] + " " + "₱" + gpu_prices[i]);
        }
    }

    public void displayStorage() {
        for (int i = 0; i < storage.length; i++) {
            System.out.println((i + 1) + "-" + storage[i] + " " + "₱" + storage_prices[i]);
        }
    }

    public void displayMemory() {
        for (int i = 0; i < memory.length; i++) {
            System.out.println((i + 1) + "-" + memory[i] + " " + "₱" + memory_prices[i]);
        }
    }

    public void displayPsu() {
        for (int i = 0; i < psu.length; i++) {
            System.out.println((i + 1) + "-" + psu[i] + " " + "₱" + psu_prices[i]);
        }
    }

    public void displayCase() {
        for (int i = 0; i < pc_case.length; i++) {
            System.out.println((i + 1) + "-" + pc_case[i] + " " + "₱" + case_prices[i]);
        }
    }


}
