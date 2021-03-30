public class Asistenti extends Mesimdhenesi implements Angazhohet{
    private String llojiUshtrimeve;
    public Asistenti(String e,int v,String f,String l){
        super(e,v,f);
        llojiUshtrimeve=l;
    }
    public void setLlojiUshtrimeve(String l){
        llojiUshtrimeve=l;
    }
    public String getLlojiUshtrimeve() {
        return llojiUshtrimeve;
    }
    public String getAngazhohet(){
        return "Ushtrime";
    }
    public boolean mentoron(){
        return false;
    }
    public String toString(){
        return "Asistenti: "+super.toString()+" "+llojiUshtrimeve;
    }

}
