import java.io.*;
public abstract class MjetiLevizes {
    private String prodhuesi;
    private int vitiProdhimit;
    private int volumiMotorit;
    public MjetiLevizes(String p,int v,int vm)throws IOException{
        if(v<2000){
            throw new IOException("Viti i prodhimit nuk mund te jete me i vogel se 2000.");
        }
        if(vm!=3.5){
            throw new IOException("Volumi i motorit duhet te jete 3.5");
        }
        prodhuesi=p;
        vitiProdhimit=v;
        volumiMotorit=vm;
    }
    public String getProdhuesi(){
        return prodhuesi;
    }
    public int getVitiProdhimit(){
        return vitiProdhimit;
    }
    public void getVolumiMotorit() {
        return volumiMotorit;
    }
    public String toString(){
        return prodhuesi+" "+volumiMotorit+"cc - "+vitiProdhimit;
    }
    public boolean Equals(Object obj){
        if(obj instanceof MjetiLevizes){
            MjetiLevizes m=(MjetiLevizes)obj;
            if(prodhuesi.equals(m.getProdhuesi()) && vitiProdhimit==m.getVitiProdhimit() && volumiMotorit==m.getVolumiMotorit())
                return true;
        }
        return false;
    }
}
