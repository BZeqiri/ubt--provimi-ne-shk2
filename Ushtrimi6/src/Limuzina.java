public class Limuzina extends Automjeti implements Vozitet{
    public boolean eshteAutomatik(){
        return true;
    }
    public int numriShpejtesive(){
        return 6;
    }
    public boolean kaTempomat(){
        return false;
    }
    private String ngjyra;
    public Limuzina(String n,String p,int v,String ngj){
        super(n,p,v);
        ngjyra=ngj;
    }
    public String toString(){
        return "Limuzina: "+super.toString()+": "+ngjyra;
    }
}
