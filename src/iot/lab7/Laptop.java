package iot.lab7;

public class Laptop {
    static private int count;
    private String manufacturerName;
    private String modelName;
    private double cpuSpeedInHHz;
    private int ramAmountInGB;
    private int priceInDollars;
    private double screenSizeInInches;
    private boolean hasBluetooth;
    private boolean hasCamera;
    protected boolean hasLightedKeyboard;
    protected double batteryCapacityInAhm;


    private void setValues(String manufacturerName, String modelName, double cpuSpeedInHHz, int ramAmountInGB,
                  int priceInDollars, double screenSizeInInches, boolean hasBluetooth, boolean hasCamera,
                  boolean hasLightedKeyboard, double batteryCapacityInAhm) {
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.cpuSpeedInHHz = cpuSpeedInHHz;
        this.ramAmountInGB = ramAmountInGB;
        this.priceInDollars = priceInDollars;
        this.screenSizeInInches = screenSizeInInches;
        this.hasBluetooth = hasBluetooth;
        this.hasCamera = hasCamera;
        this.hasLightedKeyboard = hasLightedKeyboard;
        this.batteryCapacityInAhm = batteryCapacityInAhm;
    }

    public void resetValues(String manufacturerName, String modelName, double cpuSpeedInHHz, int ramAmountInGB,
                       int priceInDollars, double screenSizeInInches, boolean hasBluetooth, boolean hasCamera,
                       boolean hasLightedKeyboard, double batteryCapacityInAhm){
        setValues(manufacturerName, modelName, cpuSpeedInHHz, ramAmountInGB,
                priceInDollars, screenSizeInInches, hasBluetooth, hasCamera,
                hasLightedKeyboard, batteryCapacityInAhm);
    }

    public Laptop(String manufacturerName, String modelName, double cpuSpeedInHHz, int ramAmountInGB,
                  int priceInDollars, double screenSizeInInches, boolean hasBluetooth, boolean hasCamera,
                  boolean hasLightedKeyboard, double batteryCapacityInAhm) {
        setValues(manufacturerName, modelName, cpuSpeedInHHz, ramAmountInGB,
                  priceInDollars, screenSizeInInches, hasBluetooth, hasCamera,
                  hasLightedKeyboard, batteryCapacityInAhm);
        count++;
    }

    public Laptop(String manufacturerName, String modelName, double cpuSpeedInHHz, int ramAmountInGB) {
        this(manufacturerName, modelName, cpuSpeedInHHz, ramAmountInGB,
            0, 0, false,
            false, false, 0);
    }

    public Laptop(){
        this("", "", 0, 0);
    }


    @Override
    public String toString(){
        return "\nLaptop{" +
                "\nmanufacturerName=" + manufacturerName +
                ",\nmodelName=" + modelName +
                ",\ncpuSpeed=" + cpuSpeedInHHz + " HHz"+
                ",\nramAmount=" + ramAmountInGB + " GBs"+
                ",\nprice=" + priceInDollars + "$"+
                ",\nscreenSize=" + screenSizeInInches + "\""+
                ",\nhasBluetooth=" + hasBluetooth +
                ",\nhasCamera=" + hasCamera +
                ", \nhasLightedKeyboard="+ hasLightedKeyboard +
                ",\nbatterySize=" + batteryCapacityInAhm + " Amh";
    }

    public static void printStaticCount(){
        System.out.println(Laptop.count);
    }

    public void printCount(){
        System.out.println(Laptop.count);
    }


    public static int getCount() {
        return count;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getCpuSpeedInHHz() {
        return cpuSpeedInHHz;
    }

    public void setCpuSpeedInHHz(double cpuSpeedInHHz) {
        this.cpuSpeedInHHz = cpuSpeedInHHz;
    }

    public int getRamAmountInGB() {
        return ramAmountInGB;
    }

    public void setRamAmountInGB(int ramAmountInGB) {
        this.ramAmountInGB = ramAmountInGB;
    }

    public int getPriceInDollars() {
        return priceInDollars;
    }

    public void setPriceInDollars(int priceInDollars) {
        this.priceInDollars = priceInDollars;
    }

    public double getScreenSizeInInches() {
        return screenSizeInInches;
    }

    public void setScreenSizeInInches(double screenSizeInInches) {
        this.screenSizeInInches = screenSizeInInches;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public boolean isHasLightedKeyboard() {
        return hasLightedKeyboard;
    }

    public void setHasLightedKeyboard(boolean hasLightedKeyboard) {
        this.hasLightedKeyboard = hasLightedKeyboard;
    }

    public double getBatteryCapacityInAhm() {
        return batteryCapacityInAhm;
    }

    public void setBatteryCapacityInAhm(double batteryCapacityInAhm) {
        this.batteryCapacityInAhm = batteryCapacityInAhm;
    }
}
