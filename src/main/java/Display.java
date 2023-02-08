public class Display {
    private  int diogonal;
    private  String manufacturer;
    private  int matrixtype;

    public  Display(){
    }
    public Display( int  diogonal, String manufacturer, int matrixtype){
            this.diogonal = diogonal;
            this.manufacturer = manufacturer;
            this.matrixtype = matrixtype;
    }

    public double getDiogonal() {
        return diogonal;
    }

    public void setDiogonal( int diogonal) {
        this.diogonal = diogonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMatrixtype() {
        return matrixtype;
    }

    public void setMatrixtype(int matrixtype) {
        this.matrixtype = matrixtype;
    }
}
