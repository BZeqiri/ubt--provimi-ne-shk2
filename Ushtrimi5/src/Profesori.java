public class Profesori extends Mesimdhenesi implements Angazhohet{
    private String thirrjaAkademike;
    public Profesori(String e,int v,String f,String t){
        super(e,v,f);
        thirrjaAkademike=t;
    }
    public void setThirrjaAkademike(String t){
        thirrjaAkademike=t;
    }
    public String getThirrjaAkademike(){
        return thirrjaAkademike;
    }
    public String getAngazhohet(){
        return "Ligjerata";
    }
    public boolean mentoron(){
        return true;
    }
    public String toString(){
        return "Profesori: "+super.toString()+", ka thirrje "+thirrjaAkademike;
    }
}
