package orderingSystem;

import java.util.Arrays;


public class Menu {
    Product product = new Product();
    Price price = new Price();

    public void showCpu() {
        String [] combined = new String[5];
        for (int i = 0; i < product.cpu.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.cpu[i], String.valueOf("₱" + price.cpu_prices[i])});
        }

        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showGpu() {
        String [] combined = new String[5];
        for (int i = 0; i < product.gpu.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.gpu[i], String.valueOf("₱" + price.gpu_prices[i])});
        }

        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showStorage() {
        String [] combined = new String[3];
        for (int i = 0; i < product.storage.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.storage[i], String.valueOf("₱" + price.storage_prices[i])});
        }

        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showMemory() {
        String [] combined = new String[3];
        for (int i = 0; i < product.memory.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.memory[i], String.valueOf("₱" + price.memory_prices[i])});
        }

        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showPsu() {
        String [] combined = new String[3];
        for (int i = 0; i < product.psu.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.psu[i], String.valueOf("₱" + price.psu_prices[i])});
        }

        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showPcCase() {
        String [] combined = new String[2];
        for (int i = 0; i < product.pc_case.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.pc_case[i], String.valueOf("₱" + price.case_prices[i])});
        }

        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

}
