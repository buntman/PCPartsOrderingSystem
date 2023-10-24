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
}
