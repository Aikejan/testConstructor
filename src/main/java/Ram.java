public class Ram {
    private int voiume;
    private  String manufacturer;

    public  Ram(){
    }
    public  Ram(int voiume,String manufacturer ){
        this.voiume = voiume;
        this.manufacturer = manufacturer;
    }

    public int getVoiume() {
        return voiume;
    }

    public void setVoiume(int voiume) {
        this.voiume = voiume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

