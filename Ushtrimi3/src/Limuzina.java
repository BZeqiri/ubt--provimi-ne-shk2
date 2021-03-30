public class Limuzina extends Automjeti{
    public boolean eshteAutomatik(){
        return true;
    }
    private String ngjyra;
    public void setNgjyra(String ngjyra){
        this.ngjyra=ngjyra;
    }
    public String getNgjyra(){
        return ngjyra;
    }
    public Limuzina(String n,String p,int v,String ngj){
        super(n,p,v);
        ngjyra=ngj;
    }
    public String toString(){
        return "Limuzina: "+super.toString()+": "+ngjyra;
    }

}
