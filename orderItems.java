package orderingSystem;

public class orderItems {
    private int cpu_price;
    private int gpu_price;
    private int storage_price;
    private int memory_price;
    private int psu_price;
    private int case_price;
    private String cpu;
    private String gpu;
    private String storage;
    private String memory;
    private String psu;
    private String pc_case;

    public orderItems(String cpu, String gpu, String storage, String memory, String psu, String pc_case, int cpu_price, int gpu_price, int storage_price, int memory_price, int psu_price,int case_price ) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.storage = storage;
        this.memory = memory;
        this.psu = psu;
        this.pc_case = pc_case;
        this.cpu_price = cpu_price;
        this.gpu_price = gpu_price;
        this.storage_price = storage_price;
        this.memory_price = memory_price;
        this.psu_price = psu_price;
        this.case_price = case_price;
    }


    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }


    public String getStorage() {
        return storage;
    }


    public String getMemory() {
        return memory;
    }


    public String getPsu() {
        return psu;
    }

    public String getPc_case() {
        return pc_case;
    }

    public int getCpu_price() {
        return cpu_price;
    }

    public int getGpu_price() {
        return gpu_price;
    }

    public int getStorage_price() {
        return storage_price;
    }

    public int getMemory_price() {
        return memory_price;
    }

    public int getPsu_price() {
        return psu_price;
    }

    public int getCase_price() {
        return case_price;
    }

    public int totalAmount() {
        return getCpu_price() + getGpu_price() + getStorage_price() + getMemory_price() + getPsu_price() + getCase_price();
    }
}
