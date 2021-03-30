public abstract class Automjeti {
    private String nrShasis; //readonly
    private String prodhuesi;
    private int vitiProdhimit;
    public Automjeti(String n,String p,int v){
        nrShasis=n;
        prodhuesi=p;
        vitiProdhimit=v;
    }
    public String getNrShasis(){
        return nrShasis;
    }
    public void setProdhuesi(String prodhuesi){
        this.prodhuesi=prodhuesi;
    }
    public String getProdhuesi(){
        return prodhuesi;
    }
    public void setVitiProdhimit(int vitiProdhimit){
        this.vitiProdhimit=vitiProdhimit;
    }
    public int getVitiProdhimit(){
        return vitiProdhimit;
    }

    public abstract boolean eshteAutomatik();

    public String toString(){
        return nrShasis+": "+prodhuesi+" - "+vitiProdhimit;
    }
    public boolean Equals(Object obj){
        if(obj instanceof Automjeti){
            Automjeti a=(Automjeti) obj;
            if(nrShasis.equals(a.getNrShasis()))
                return true;
        }
        return false;
    }
}
