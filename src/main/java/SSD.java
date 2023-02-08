public class SSD {
    private int memory;
    private   int discpartition;

    public  SSD(){
    }
    public SSD( int memory, int discpartition){
        this.memory = memory;
        this.discpartition = discpartition;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDiscpartition() {
        return discpartition;
    }

    public void setDiscpartition(int discpartition) {
        this.discpartition = discpartition;
    }
}
