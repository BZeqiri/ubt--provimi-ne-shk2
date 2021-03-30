public class SUV  extends Automjeti implements Vozitet{
    public boolean eshteAutomatik(){
        return false;
    }
    public int numriShpejtesive(){
        return 5;
    }
    public boolean kaTempomat(){
        return true;
    }
    private String eshte4x4;
    public SUV(String n,String p,int v,String eshte){
        super(n,p,v);
        eshte4x4=eshte;
    }
    public String toString(){
        return "SUV: "+super.toString()+": "+eshte4x4+"4x4";
    }
}
