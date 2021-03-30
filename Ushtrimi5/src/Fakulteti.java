public class Fakulteti {
    private String drejtimi;
    private Mesimdhenesi[] m;
    private int indexi;
    public Fakulteti(String d,int nrMesimdhenesve){
        drejtimi=d;
        m=new Mesimdhenesi[nrMesimdhenesve];
    }
    public boolean ekziston(Mesimdhenesi me){
        for(int i=0;i<indexi;i++){
            if(m[i].equals(me))
                return true;
        }
        return false;
    }
    public void shtoMesimdhenesin(Mesimdhenesi me){
        if(me==null){
            System.out.println("Objekti eshte null.");
            return;
        }
        if(ekziston(me)){
            System.out.println("Mesmidhenesi ekziston.");
            return;
        }
        if(indexi>=m.length){
            System.out.println("Nuk ka vend ne varg.");
            return;
        }
        m[indexi++]=me;
    }
    public Mesimdhenesi[] shtypFushaStudimit(String f){
        int count=0;
        int temp=0;
        for(int i=0;i<indexi;i++){
            if(m[i].getFushaStudimit().equals(f)){
                count++;
            }
        }
        if(count==0){
            return null;
        }
        Mesimdhenesi[] b=new Mesimdhenesi[count];
        for(int i=0;i<indexi;i++){
            if(m[i].getFushaStudimit().equals(f)){
                b[temp++]=m[i];
            }
        }
        return b;
    }
    public Mesimdhenesi[] ktheAngazhimin(String a){
        int count=0;
        int temp=0;
        for(int i=0;i<indexi;i++) {
            if (m[i] instanceof Angazhohet) {
                Angazhohet an = (Angazhohet) m[i];
                if (((Angazhohet) m[i]).getAngazhohet().equals(a)) {
                    count++;
                }
            }
        }
            if(count==0){
                return null;
            }
            Mesimdhenesi[] mesim=new Mesimdhenesi[count];
            for(int i=0;i<indexi;i++){
                if(((Angazhohet)m[i]).getAngazhohet().equals(a)){
                    mesim[temp++]=m[i];
                }
            }
        return mesim;
    }
    public static void main(String []bz){
        Fakulteti f=new Fakulteti("Shkenca Kompjuterike",20);
        Profesori p1=new Profesori("Besart",2000,"Developer","i rregullt");
        Profesori p2=new Profesori("Ariana",2003,"Developer","i rregullt");
        Profesori p3=new Profesori("Jeton",2001,"Web","i asociuar");
        Asistenti a1=new Asistenti("Tringa",2001,"Developer","Neumerike");
        Asistenti a2=new Asistenti("Lume",1987,"Databaz","Laboratorike");
        Asistenti a3=new Asistenti("Festim",2000,"Matematik","Numerike");
        f.shtoMesimdhenesin(p1);
        f.shtoMesimdhenesin(p2);
        f.shtoMesimdhenesin(p3);
        f.shtoMesimdhenesin(a1);
        f.shtoMesimdhenesin(a2);
        f.shtoMesimdhenesin(a3);
        System.out.println();
        f.shtoMesimdhenesin(p1);
        System.out.println();
        Mesimdhenesi[] mesim=f.shtypFushaStudimit("Developer");
        for(Mesimdhenesi llega: mesim){
            System.out.println(llega);
        }
        System.out.println();
        Mesimdhenesi[] mesim1=f.ktheAngazhimin("Ligjerata");
        for(Mesimdhenesi mesimdhenesi: mesim1){
            System.out.println(mesimdhenesi);
        }
    }
}
