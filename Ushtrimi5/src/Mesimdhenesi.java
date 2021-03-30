public abstract class Mesimdhenesi{
    private String emri;
    private int vitiLindjes;
    private String fushaStudimit;
    public Mesimdhenesi(String e, int v, String f){
        emri=e;
        vitiLindjes=v;
        fushaStudimit=f;
    }
    public String getEmri(){
        return emri;
    }
    public void setVitiLindjes(int v){
        vitiLindjes=v;
    }
    public int getVitiLindjes(){
        return vitiLindjes;
    }
    public void setFushaStudimit(String f){
        fushaStudimit=f;
    }
    public String getFushaStudimit(){
        return fushaStudimit;
    }
    public String toString(){
        return emri+": "+vitiLindjes+" me fushe studimi "+fushaStudimit;
    }
    public boolean Equals(Object obj){
        if(obj instanceof Mesimdhenesi){
            Mesimdhenesi m=(Mesimdhenesi) obj;
            if(emri.equals(m.getEmri()) && vitiLindjes==m.getVitiLindjes())
                return true;
        }
        return false;
    }
}
