package orderingSystem;

import java.util.Arrays;


public class Menu {
    Product product = new Product();
    Price price = new Price();

    public void showCpu() {
        String [] combined = new String[product.cpu.length];
        for (int i = 0; i < product.cpu.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.cpu[i], String.valueOf("₱" + price.cpu_prices[i])});
        }
        System.out.println("CPU");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showGpu() {
        String [] combined = new String[product.gpu.length];
        for (int i = 0; i < product.gpu.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.gpu[i], String.valueOf("₱" + price.gpu_prices[i])});
        }
        System.out.println("GPU");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showStorage() {
        String [] combined = new String[product.storage.length];
        for (int i = 0; i < product.storage.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.storage[i], String.valueOf("₱" + price.storage_prices[i])});
        }
        System.out.println("STORAGE");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showMemory() {
        String [] combined = new String[product.memory.length];
        for (int i = 0; i < product.memory.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.memory[i], String.valueOf("₱" + price.memory_prices[i])});
        }
        System.out.println("MEMORY");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showPsu() {
        String [] combined = new String[product.psu.length];
        for (int i = 0; i < product.psu.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.psu[i], String.valueOf("₱" + price.psu_prices[i])});
        }
        System.out.println("PSU");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showPcCase() {
        String [] combined = new String[product.pc_case.length];
        for (int i = 0; i < product.pc_case.length; i++) {
            combined[i] = Arrays.toString(new String[]{product.pc_case[i], String.valueOf("₱" + price.case_prices[i])});
        }
        System.out.println("CASE");
        for (int i = 0; i < combined.length; i++) {
            System.out.println(i + 1 + combined[i] + " ");
        }
    }

    public void showPrebuilt() {
        System.out.println("Pre-Built PC");
        String [] preBuiltCpu;
        preBuiltCpu = new String[]{Arrays.toString(new String[]{product.cpu[4], String.valueOf("₱" +price.cpu_prices[4])})};
        for (int i = 0; i < preBuiltCpu.length; i++) {
            System.out.println("CPU" + preBuiltCpu[i] + " ");
        }
        String [] preBuiltGpu;
        preBuiltGpu = new String[]{Arrays.toString(new String[]{product.gpu[4], String.valueOf("₱" +price.gpu_prices[4])})};
        for (int i = 0; i < preBuiltGpu.length; i++) {
            System.out.println("GPU" + preBuiltGpu[i] + " ");
        }
        String [] preBuiltStorage;
        preBuiltStorage= new String[]{Arrays.toString(new String[]{product.storage[2], String.valueOf("₱" +price.storage_prices[2])})};
        for (int i = 0; i < preBuiltStorage.length; i++) {
            System.out.println("STORAGE" + preBuiltStorage[i] + " ");
        }
        String [] preBuiltMemory;
        preBuiltMemory = new String[]{Arrays.toString(new String[]{product.memory[2], String.valueOf("₱" +price.memory_prices[2])})};
        for (int i = 0; i < preBuiltMemory.length; i++) {
            System.out.println("MEMORY" + preBuiltMemory[i] + " ");
        }
        String [] preBuiltPsu;
        preBuiltPsu = new String[]{Arrays.toString(new String[]{product.psu[2], String.valueOf("₱" +price.psu_prices[2])})};
        for (int i = 0; i < preBuiltPsu.length; i++) {
            System.out.println("PSU" + preBuiltPsu[i] + " ");
        }
        String [] preBuiltCase;
        preBuiltCase = new String[]{Arrays.toString(new String[]{product.pc_case[2], String.valueOf("₱" +price.case_prices[2])})};
        for (int i = 0; i < preBuiltCase.length; i++) {
            System.out.println("CASE" + preBuiltCase[i] + " ");
        }
    }

}
