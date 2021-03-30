public class Asistenti extends Mesimdhenesi{
    private String llojiUshtrimeve;
    public Asistenti(String e,int v,String ll){
        super(e,v,"Ushtrime");
        llojiUshtrimeve=ll;
    }
    public void setLlojiUshtrimeve(String ll){
        llojiUshtrimeve=ll;
    }
    public String getLlojiUshtrimeve(){
        return llojiUshtrimeve;
    }
    public boolean mentoron(){
        return false;
    }
    public String toString(){
        return "Asistenti: "+super.toString()+" "+llojiUshtrimeve;
    }
}
