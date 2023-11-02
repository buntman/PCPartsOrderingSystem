package orderingSystem;

import java.util.Arrays;


public class Menu {
    Product product = new Product();
    Price price = new Price();

    public void showCpu() {
        String [] combined = new String[product.cpu.length];
        for (int i = 0; i < product.cpu.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.cpu[i], "₱" + price.cpu_prices[i]});
        }
        System.out.println("CPU");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }
    public void showMobo() {
        String [] combined = new String[product.motherboard.length];
        for (int i = 0; i < product.motherboard.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.motherboard[i], "₱" + price.board_prices[i]});
        }
        System.out.println("MOTHERBOARD");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showGpu() {
        String [] combined = new String[product.gpu.length];
        for (int i = 0; i < product.gpu.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.gpu[i], "₱" + price.gpu_prices[i]});
        }
        System.out.println("GPU");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showStorage() {
        String [] combined = new String[product.storage.length];
        for (int i = 0; i < product.storage.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.storage[i], "₱" + price.storage_prices[i]});
        }
        System.out.println("STORAGE");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showMemory() {
        String [] combined = new String[product.memory.length];
        for (int i = 0; i < product.memory.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.memory[i], "₱" + price.memory_prices[i]});
        }
        System.out.println("MEMORY");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showPsu() {
        String [] combined = new String[product.psu.length];
        for (int i = 0; i < product.psu.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.psu[i], "₱" + price.psu_prices[i]});
        }
        System.out.println("PSU");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showPcCase() {
        String [] combined = new String[product.pc_case.length];
        for (int i = 0; i < product.pc_case.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.pc_case[i], "₱" + price.case_prices[i]});
        }
        System.out.println("CASE");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }
}
