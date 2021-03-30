public abstract class Automjeti {
    private String nrShasis;
    private String prodhuesi;
    private int vitiProdhimit;
    public Automjeti(String n,String p,int v){
        nrShasis=n;
        vitiProdhimit=v;
        prodhuesi=p;
    }
    public String getNrShasis() {
        return nrShasis;
    }
    public void setProdhuesi(String pr){
        prodhuesi=pr;
    }
    public String getProdhuesi(){
        return prodhuesi;
    }
    public void setVitiProdhimit(int vp){
        vitiProdhimit=vp;
    }
    public int getVitiProdhimit(){
        return vitiProdhimit;
    }
    public abstract boolean eshteAutomatik();
    public String toString(){
        return nrShasis+": "+prodhuesi+" - "+vitiProdhimit;
    }
    public boolean Equlas(Object obj){
        if(obj instanceof Automjeti){
            Automjeti a=(Automjeti) obj;
            if(nrShasis==a.getNrShasis())
                return true;
        }
        return false;
    }
}
