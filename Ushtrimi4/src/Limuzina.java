public class Limuzina extends Automjeti{
    private String ngjyra;
    public Limuzina(String n,String p,int v,String ngj){
        super(n,p,v);
        ngjyra=ngj;
    }
    public boolean eshteAutomatik(){
        return true;
    }
    public void setNgjyra(String n){
        ngjyra=n;
    }
    public String getNgjyra(){
        return ngjyra;
    }
    public String toString(){
        return "Limuzina: "+super.toString()+": "+ngjyra;
    }
}
