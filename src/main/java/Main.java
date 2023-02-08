public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("Retina 13,3","Apple M1", "Silver", 8,8,16, "Array","Magik");

        System.out.println( "Display:"+computer.getDisplay()+"\nBrand:"+computer.getBrand()+"\nColor:"+
                computer.getColor()+"\nSSD:"+computer.getRAM()+"\nVideocard:"+computer.getVideocard()+
                "\nUSBport:"+computer.getUsbport()+"\nKeyoard:"+computer.getKeyoard());
        System.out.println("**************************************************************");
         Display display = new Display(13," USD",3080 );
        System.out.println("Dioganal:"+display.getDiogonal()+"\nManufacturer:"+display.getManufacturer()+
                "\nMaxritype:"+display.getMatrixtype());
        System.out.println("***************************************************************");

        SSD ssd = new SSD(8,3);
        System.out.println("Memory" + " " +ssd.getMemory()+"\nDicratition"+" "+ssd.getDiscpartition());
        System.out.println("***************************************************************");

        Ram ram = new Ram( 8," USD compani Apple");
        System.out.println("Volume:"+" "+ram.getVoiume()+" "+"\nManufacturer:"+" "+ram.getManufacturer());

        System.out.println("**********************************************************");

        USB usb = new USB("Thunderbolt/USB","fACE ID");

        System.out.println("Porttype:"+ " "+usb.getPorttype()+" "+"\nidport"+usb.getIdport());

        Size size = new Size(1.56,31,23,2);
        System.out.println("thikness:"+size.getThikness()+" "+"\nLengthis:"+size.getLength()+
                "\nWidth:"+size.getWidth()+"\nWeight:"+size.getWeight());




//        City city = new City("Osh",700000L,69.0,"Kyrgyz","Kelechec");
//        System.out.println(city.getName()+ " "+city.getPopulation()+" "+city.getAree()+" "+city.getLanguage()
//        +" "+city.getMajorOfCity());


    }
}
