public class Fakulteti {
    private String drejtimi;
    private Mesimdhenesi[] m;
    private int indexi;
    public Fakulteti(String d,int numriMesimdhenesve){
        drejtimi=d;
        m=new Mesimdhenesi[numriMesimdhenesve];
    }
    public boolean Ekziston(Mesimdhenesi me){
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
        if(Ekziston(me)){
            System.out.println("Mesimdhenesi ekziston.");
            return;
        }
        if(indexi>=m.length){
            System.out.println("Nuk ka vend ne varg.");
            return;
        }
        m[indexi++]=me;
    }
    public Profesori profesoriMeIRI(){
        if(indexi == 0){
            System.out.println("Nuk ka elemente ne varg");
            return null;
        }
        Profesori iRi = null;
		for(int i = 0; i < indexi; i++){
            if(m[i] instanceof Profesori){
                Profesori p = (Profesori) m[i];
                if(iRi == null
                        || p.getVitiLindjes() > iRi.getVitiLindjes()){
                    iRi = p;
                }
            }
        }
        return iRi;
    }
    public Asistenti[] shtypLojinEUshtrimeve(String ushtrimet){
        int count=0;
        int count1=0;
        for(int i =0;i<indexi;i++){
            if(m[i] instanceof Asistenti){
               Asistenti a=(Asistenti) m[i];
               if(a.getLlojiUShtrimeve().equals(ushtrimet)){
                   count++;
               }
            }
        }
        if(count==0)
            return null;
        Asistenti[] asistent=new Asistenti[count];
        for(int i=0;i<indexi;i++){
            if(m[i] instanceof Asistenti){
                Asistenti a=(Asistenti)m[i];
                if(a.getLlojiUShtrimeve().equals(ushtrimet))
                    asistent[count1++]=a;
            }
        }
        return asistent;
    }
    public static void main (String[]bz){
        Fakulteti f=new Fakulteti("Shkenca Kompjuterike",15);
        Profesori p1=new Profesori("Besart",2000,"Profesor","I rregullt");
        Profesori p2=new Profesori("Ariana",2003,"Profesor","I asociuar");
        Asistenti a1=new Asistenti("Lume",1988,"Asistente","Laboratorike");
        Asistenti a2=new Asistenti("Tringa",2001,"Asistente","Numerike");
        Asistenti a3=new Asistenti("Jeton",2001,"Asistent","Numerike");
        f.shtoMesimdhenesin(p1);
        f.shtoMesimdhenesin(p2);
        f.shtoMesimdhenesin(a1);
        f.shtoMesimdhenesin(a2);
        f.shtoMesimdhenesin(a3);
        System.out.println("=====================================");
        f.shtoMesimdhenesin(a3);
        System.out.println("=====================================");
        System.out.println( f.profesoriMeIRI());
        System.out.println("=====================================");
        Mesimdhenesi[] lloji=f.shtypLojinEUshtrimeve("Numerike");
        for(int i=0;i<lloji.length;i++){
            System.out.println(lloji[i]);
        }
    }
}
