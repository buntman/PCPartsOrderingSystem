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

    public String displayCpu() {
        for (int i = 0; i < cpu.length; i++) {
            System.out.println((i + 1) + "-" + cpu[i] + " " + "₱" + cpu_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return cpu[choice -1];
    }

    public String displayGpu() {
        for (int i = 0; i < gpu.length; i++) {
            System.out.println((i + 1) + "-" + gpu[i] + " " + "₱" + gpu_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return gpu[choice -1];
    }

    public String displayStorage() {
        for (int i = 0; i < storage.length; i++) {
            System.out.println((i + 1) + "-" + storage[i] + " " + "₱" + storage_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return storage[choice -1];
    }

    public String displayMemory() {
        for (int i = 0; i < memory.length; i++) {
            System.out.println((i + 1) + "-" + memory[i] + " " + "₱" + memory_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return memory[choice -1];
    }

    public String displayPsu() {
        for (int i = 0; i < psu.length; i++) {
            System.out.println((i + 1) + "-" + psu[i] + " " + "₱" + psu_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return psu[choice -1];
    }

    public String displayCase() {
        for (int i = 0; i < pc_case.length; i++) {
            System.out.println((i + 1) + "-" + pc_case[i] + " " + "₱" + case_prices[i]);
        }
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();
        return pc_case[choice -1];
    }


    public void createOrder() {
        System.out.println("                                                                                Welcome to SOLTECH! \n" +
                "                                                                       Home of the best customized PC builds");
        System.out.println("CPU");
        String cpu = displayCpu();
        System.out.println("GPU");
        String gpu = displayGpu();
        System.out.println("Storage");
        String storage = displayStorage();
        System.out.println("Ram");
        String memory = displayMemory();
        System.out.println("PSU");
        String psu = displayPsu();
        System.out.println("Case");
        String pc_case = displayCase();
        parts.add(new orderItems(cpu, gpu, storage, memory,psu, pc_case));
    }

    public void listOfOrder() {
        for (orderItems items: parts) {
            System.out.println("CPU: " + items.getCpu());
            System.out.println("GPU: " + items.getGpu());
            System.out.println("STORAGE: " + items.getStorage());
            System.out.println("RAM: " + items.getMemory());
            System.out.println("POWER SUPPLY: " + items.getPsu());
            System.out.println("CASE: " + items.getPc_case());
        }
    }

    public static void main(String[] args) {
        Menu x1 = new Menu();
        x1.createOrder();
        x1.listOfOrder();
    }



}
