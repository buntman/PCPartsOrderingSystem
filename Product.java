package orderingSystem;

public class Product {
    String [] cpu = {"Intel Core i5-13400", "Intel Core i9-13900k","Ryzen 9 7950X3D", "Ryzen 7 7800X3D","Intel Core i9-14900k"};
    String [] motherboard = {"Mini ITX Board", "Micro ATX Board", "ATX Board"};

    String [] gpu = {"RTX 3060 ti", "RTX 4060 ti", "RX 7900 XTX", "RX 6800 XT", "RTX 4070"};

    String [] storage = {"512gb M.2 NVME SSD", "1TB M.2 NVME SSD", "2TB M.2 NVME SSD"};

    String [] memory = {"2x8gb RAM", "2x16gb RAM", "2x32gb RAM"};

    String [] psu = {"650W 80+ Gold", "750W 80+ Gold", "850W 80+ Gold"};

    String [] pc_case = {"Mini-ITX CASE","Micro-ATX CASE", "ATX CASE"};
    String [] preBuilt= {"Intel Core i5-13400","Micro ATX Board", "RTX 3060 ti","1TB M.2 NVME SSD","2x8gb RAM","650W 80+ Gold","Micro-ATX CASE"};

    String [] preBuilt1 = {"Intel Core i9-14900k", "ATX Board", "RTX 4070", "2TB M.2 NVME SSD", "2x32gb RAM", "850W 80 + Gold", "ATX CASE"};





    public String getCpu(int index) {
        return cpu[index -1];
    }
    public String getMobo(int index) {
        return motherboard[index -1];
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
