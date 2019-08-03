package de.telran.computer;

public class Computer {

    public Computer(String vendor, String model, String processor) {
        this.vendor = vendor;
        this.model = model;
        this.processor = processor;
    }

    private String vendor;
    private String model;
    private String processor;
    private String discType;
    private int diskSizeGb;
    private int ramSizeMb;

    // Could be "SSD" or "HDD"
    public void setDiscType(String discType) {
        if (discType.equals("SSD") || discType.equals("HDD")) {
            this.discType = discType;
        }
    }

    public String getDiscType() {
        return this.discType;
    }



    public String toString() {
        return "Vendor: " + vendor + "\n" +
                "Model: " + model + "\n" +
                "Processor: " + processor + "\n" +
                "Disk type:" + discType;
    }


    public void printParameters() {
        System.out.println(toString());
    }
}
