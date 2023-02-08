public class Computer {
    private  String display;
    private String brand;
    private String color;
    private int SSD;
    private int RAM;
    private int videocard;
    private String usbport;
    private String keyoard;

    public Computer() {
    }

    public Computer(String display, String brand, String color, int SSD, int RAM, int videocard,
                    String usbport, String keyoard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.SSD = SSD;
        this.RAM = RAM;
        this.videocard = videocard;
        this.usbport = usbport;
        this.keyoard = keyoard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay( String display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getVideocard() {
        return videocard;
    }

    public void setVideocard( int videocard) {
        this.videocard = videocard;
    }

    public String getUsbport() {
        return usbport;
    }

    public void setUsbport(String usbport) {
        this.usbport = usbport;
    }

    public String getKeyoard() {
        return keyoard;
    }

    public void setKeyoard(String keyoard) {
        this.keyoard = keyoard;
    }
}