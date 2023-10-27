package orderingSystem;

public class Product {
    String [] cpu = {"Intel Core i5-13400", "Intel Core i9-13900k","Intel Core i9-14900k", "Ryzen 7 7800X3D", "Ryzen 9 7950X3D"};

    String [] gpu = {"RTX 3060 ti", "RTX 4060 ti", "RTX 4070", "RX 6800 XT", "RX 7900 XTX"};

    String [] storage = {"512gb NVME SSD", "1TB NVME SSD", "2TB NVME SSD"};

    String [] memory = {"2x8gb RAM", "2x16gb RAM", "2x32gb RAM"};

    String [] psu = {"650W 80+ Gold", "750W 80+ Gold", "850W 80+ Gold"};

    String [] pc_case = {"ATX", "Micro-ATX"};




    public String getCpu(int index) {
        return cpu[index -1];
    }

    public String getGpu(int index) {
        return gpu[index -1];
    }


    public String getStorage(int index) {
        return storage[index - 1];
    }


    public String getMemory(int index) {
        return memory[index - 1];
    }


    public String getPsu(int index) {
        return psu[index -1];
    }

    public String getPc_case(int index) {
        return pc_case[index - 1];
    }


}
