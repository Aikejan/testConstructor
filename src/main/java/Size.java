public class Size {
    private double thikness;
    private int length;
    private int width ;
    private int weight ;


    public Size(){
    }
    public Size(double thikness,int length, int width, int weight){
        this.thikness = thikness;
        this.length = length;
        this.weight = weight;
        this.width = width;
    }

    public double getThikness() {
        return thikness;
    }

    public void setThikness(double thikness) {
        this.thikness = thikness;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
