public class Profesori extends Mesimdhenesi {
    private String thirrjaAkademike;
    public Profesori(String e,int v,String a,String th){
        super(e,v,"Ligjerata");
        thirrjaAkademike=th;
    }
    public void setThirrjaAkademike(String t){
        thirrjaAkademike=t;
    }
    public String getThirrjaAkademike(){
        return thirrjaAkademike;
    }
    public String toString(){
        return "Profesori: "+super.toString()+", ka thirrje akademike "+thirrjaAkademike;
    }

}
