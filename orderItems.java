package orderingSystem;

public class orderItems {
    private String cpu;
    private String gpu;
    private String storage;
    private String memory;
    private String psu;
    private String pc_case;

    public orderItems(String cpu, String gpu, String storage, String memory, String psu, String pc_case) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.storage = storage;
        this.memory = memory;
        this.psu = psu;
        this.pc_case = pc_case;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPsu() {
        return psu;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public String getPc_case() {
        return pc_case;
    }

    public void setPc_case(String pc_case) {
        this.pc_case = pc_case;
    }
}
