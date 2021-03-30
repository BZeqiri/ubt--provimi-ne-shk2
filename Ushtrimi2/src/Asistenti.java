public class Asistenti extends Mesimdhenesi {
    private String llojiUShtrimeve;
    public Asistenti(String e,int v,String a,String ll){
        super(e,v,"Ushtrime");
        llojiUShtrimeve=ll;
    }
    public void setLlojiUShtrimeve(String l){
        llojiUShtrimeve=l;
    }
    public String getLlojiUShtrimeve(){
        return llojiUShtrimeve;
    }
    public String toString(){
        return "Asistenti: "+super.toString()+" "+llojiUShtrimeve;
    }

}
