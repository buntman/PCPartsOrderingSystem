package orderingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
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
    int [] case_prices = {5000, 3500};
    List<orderItems> parts = new ArrayList<>();

    public int displayCpu() {
        for (int i = 0; i < cpu.length; i++) {
            System.out.println((i + 1) + "-" + cpu[i] + " " + "₱" + cpu_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return choice -1;
    }

    public int displayGpu() {
        for (int i = 0; i < gpu.length; i++) {
            System.out.println((i + 1) + "-" + gpu[i] + " " + "₱" + gpu_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return choice -1;
    }

    public int displayStorage() {
        for (int i = 0; i < storage.length; i++) {
            System.out.println((i + 1) + "-" + storage[i] + " " + "₱" + storage_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return  choice -1;
    }

    public int displayMemory() {
        for (int i = 0; i < memory.length; i++) {
            System.out.println((i + 1) + "-" + memory[i] + " " + "₱" + memory_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return choice -1;
    }

    public int displayPsu() {
        for (int i = 0; i < psu.length; i++) {
            System.out.println((i + 1) + "-" + psu[i] + " " + "₱" + psu_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return choice -1;
    }

    public int displayCase() {
        for (int i = 0; i < pc_case.length; i++) {
            System.out.println((i + 1) + "-" + pc_case[i] + " " + "₱" + case_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return choice -1;
    }


    public void createOrder() {
        System.out.println("                                                                                Welcome to SOLTECH! \n" +
                "                                                                       Home of the best customized PC builds");
        System.out.println("CPU");
        int cpu_index = displayCpu();
        String cpu_choice = cpu[cpu_index];
        int cpu_price = cpu_prices[cpu_index];
        System.out.println("GPU");
        int gpu_index = displayGpu();
        String gpu_choice = gpu[gpu_index];
        int gpu_price = gpu_prices[gpu_index];
        System.out.println("Storage");
        int storage_index = displayStorage();
        String storage_choice = storage[storage_index];
        int storage_price = storage_prices[storage_index];
        System.out.println("Ram");
        int memory_index = displayMemory();
        String memory_choice = memory[memory_index];
        int memory_price = memory_prices[memory_index];
        System.out.println("PSU");
        int psu_index = displayPsu();
        String psu_choice = psu[psu_index];
        int psu_price = psu_prices[psu_index];
        System.out.println("Case");
        int case_index = displayCase();
        String case_choice = pc_case[case_index];
        int case_price = case_prices[case_index];

        parts.add(new orderItems(cpu_choice, gpu_choice, storage_choice, memory_choice,psu_choice, case_choice, cpu_price, gpu_price, storage_price, memory_price, psu_price, case_price));
    }

    public void listOfOrder() {
        for (orderItems items: parts) {
            System.out.println("CPU: " + items.getCpu() + " "+ "₱" + items.getCpu_price());
            System.out.println("GPU: " + items.getGpu() + " "+ "₱" + items.getGpu_price());
            System.out.println("STORAGE: " + items.getStorage() +" "+ "₱" + items.getStorage_price());
            System.out.println("RAM: " + items.getMemory() +" "+ "₱" + items.getMemory_price());
            System.out.println("POWER SUPPLY: " + items.getPsu() +" "+ "₱" + items.getPsu_price());
            System.out.println("CASE: " + items.getPc_case() +" "+ "₱" + items.getCase_price());
            System.out.println("Total Amount: " + "₱" +items.totalAmount());
        }
    }

}
