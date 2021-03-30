import java.io.*;
public abstract class MjetiGarues extends MjetiLevizes implements  Garon{
    private int pozitaStartuse;
    private int distanca=0;
    private int gjatesiaPistes=100;
    public int getPozitaStartuse(){
        return pozitaStartuse;
    }
    public int getDistance(){
        return distanca;
    }
    public int getGjatesiaPistes(){
        return gjatesiaPistes;
    }
    public MjetiGarues(String p,int v,int vm,int po,int di,int gja)throws IOException{
        super(p,v,vm);
        pozitaStartuse=po;
        distanca=di;
        gjatesiaPistes=gja;
    }
    public void garo(){
        distanca+=10;
        System.out.println(toString());
    }
    public String toString(){
        return pozitaStartuse+": "+getClass().getSimpleName()+" "+super.toString()+" pershkroi "+distanca+" metra";
    }

}
