public class Building {
    private String address;
    private double size;

    public Building() {
        address = "";
        size = 0;
    }

    public Building(String address, double size) {
        this.address = address;
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String toString() {
        return "Address: " + address + ", Size: " + size;
    }
}