public class USB {
    private String porttype;
    private  String idport;

    public USB(){
    }
    public USB(String porttype, String idport){
        this.porttype = porttype;
        this.idport = idport;
    }
    public void setPorttype(){
        this.porttype = porttype;
    }
    public  void setIdport(){
        this.idport = idport;
    }
    public  String getPorttype(){
        return porttype;
    }
    public String getIdport(){
        return idport;
    }
}
