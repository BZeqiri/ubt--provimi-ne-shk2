public class Fakulteti {
    private String drejtimi;
    private Mesimdhenesi[] m;
    private int indexi;
    private static int nrMesimdhenesve;

    public Fakulteti(String d) {
        drejtimi = d;
    }

    public class Tutori extends Mesimdhenesi {
        private int vitiStudimeve;

        public boolean mentoron() {
            return false;
        }

        public Tutori(String e, int v, String a, int vs) {
            super(e, v, "Tutorime");
            vitiStudimeve = vs;
        }

        public String toString() {
            return "Tutori i vitit " + vitiStudimeve + super.toString();
        }
    }

    public static class Vizituesi extends Mesimdhenesi {
        private int numriOreve;

        public boolean mentoron() {
            return true;
        }

        public Vizituesi(String e, int v, String a, int numriOreve) {
            super(a, v, a);
            this.numriOreve = numriOreve;
        }

        public String toString() {
            return "Mesimdhenesi vizitues " + super.toString() + " me " + numriOreve + " ore";
        }
    }

    static {
        nrMesimdhenesve = 25;
    }

    {
        m = new Mesimdhenesi[nrMesimdhenesve];
        m[indexi++] = new Fakulteti.Vizituesi("Ariana", 2003, "Ligjerues", 10);
    }

    public boolean ekziston(Mesimdhenesi me) {
        for (int i = 0; i < indexi; i++) {
            if (m[i].equals(me))
                return true;
        }
        return false;
    }

    public void shtoMesimdhenesin(Mesimdhenesi me) {
        if (me == null) {
            System.out.println("Objekti eshte null.");
            return;
        }
        if(ekziston(me)) {
            System.out.println("Mesimdhenesi ekziston.");
            return;
        }
        if (indexi >= m.length) {
            System.out.println("Nuk ka vend ne varg.");
            return;
        }
        m[indexi++] = me;
    }

    public Mesimdhenesi[] shtypSipasEmrit(String me) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < indexi; i++) {
            if (m[i].getEmri().endsWith(me))
                count++;
        }
        if(count==0)
            return null;
        Mesimdhenesi[] mesim=new Mesimdhenesi[count];
        for(int i=0;i<indexi;i++){
            if(m[i].getEmri().endsWith(me))
                mesim[temp++]=m[i];
        }
        return mesim;
    }
    public Mesimdhenesi avgVitiLindjes(){
        double shuma=0;
        for(int i=0;i<indexi;i++){
            shuma=shuma=m[i].getVitiLindjes();
        }
        double mesatarja=shuma;
        Mesimdhenesi me=null;
        for(int i=0;i<indexi;i++){
            if(m[i].getVitiLindjes()>mesatarja){
                me=m[i];
            }
        }
        return me;
    }
    public static void main(String[]bz){
        Fakulteti f=new Fakulteti("Shkenca Konphuterike");
        Fakulteti.Vizituesi vizituesi=new Fakulteti.Vizituesi("Llegenda",1999,"Vizitues",20);
        Profesori p1=new Profesori("Besarti",2000,"i rregullt");
        Profesori p2=new Profesori("Ariana",2002,"i rregullt");
        Profesori p3=new Profesori("Lume",1988,"i rregullt");
        Asistenti a1=new Asistenti("Tringa",2001,"Numerike");
        Asistenti a2=new Asistenti("Erza",2001,"Laboratorike");
        Asistenti a3=new Asistenti("Jeton",1999,"Numerike");
        Vizituesi v=new Vizituesi("Erza",2001,"i asociuar",5);
        Fakulteti.Tutori t=f.new Tutori("Lirim",1987,"Numerike",1);
        f.shtoMesimdhenesin(p1);
        f.shtoMesimdhenesin(p2);
        f.shtoMesimdhenesin(p3);
        f.shtoMesimdhenesin(a3);
        f.shtoMesimdhenesin(a1);
        f.shtoMesimdhenesin(a2);
        f.shtoMesimdhenesin(vizituesi);
        f.shtoMesimdhenesin(p1);
        f.shtoMesimdhenesin(v);
        f.shtoMesimdhenesin(t);
        System.out.println(vizituesi);
        Mesimdhenesi[] me=f.shtypSipasEmrit("a");
        for(int i=0;i<me.length;i++){
            System.out.println(me[i]);
        }
        System.out.println("");
        System.out.println(f.avgVitiLindjes());
   }
}
