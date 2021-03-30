public class Profesori extends Mesimdhenesi{
    private String thirrjaAkademike;
    public Profesori(String e, int v, String tha){
        super(e,v,"Ligjerta");
        thirrjaAkademike=tha;
    }
    public void setThirrjaAkademike(String tha){
        thirrjaAkademike=tha;
    }
    public String getThirrjaAkademike(){
        return thirrjaAkademike;
    }
    public boolean mentoron(){
        return true;
    }
    public String toString() {
        return "Profesori: "+super.toString()+", ka thirrje akademike "+thirrjaAkademike;
    }

}
