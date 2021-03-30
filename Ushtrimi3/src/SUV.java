public class SUV extends Automjeti{
    public boolean eshteAutomatik(){
        return false;
    }
    private String eshte4x4;
    public SUV(String n,String p, int v,String x){
        super(n,p,v);
        eshte4x4=x;
    }
    public void setEshte4x4(String x){
        eshte4x4=x;
    }
    public String getEshte4x4(){
        return eshte4x4;
    }
    public String eshte4x4(){
        return "nuk";
    }
    public String toString(){
        return "SUV: "+super.toString()+eshte4x4()+""+eshte4x4;
    }
}
