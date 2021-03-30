public abstract class Mesimdhenesi {
    private String emri;
    private int vitiLindjes;
    private String angazhimi;

    public Mesimdhenesi(String e, int v, String a) {
        emri = e;
        vitiLindjes = v;
        angazhimi = a;
    }

    public String getEmri() {
        return emri;
    }

    public void setVitiLindjes(int v) {
        vitiLindjes = v;
    }

    public int getVitiLindjes() {
        return vitiLindjes;
    }

    public void setAngazhimi(String a) {
        angazhimi = a;
    }

    public String getAngazhimi() {
        return angazhimi;
    }

    public abstract boolean mentoron();

    public String toString(){
        return emri+": "+vitiLindjes+" angazhohet ne "+angazhimi;
    }
    public boolean Equals(Object obj){
        if(obj instanceof Mesimdhenesi){
            Mesimdhenesi m=(Mesimdhenesi) obj;
            if(emri.equals(m.getEmri()) && vitiLindjes==m.getVitiLindjes())
                return true;
        }
        return false;
    }
}
