public class Autosalloni {
    private String emri;
    private Automjeti[] a;
    private static int numriAutomjeteve;
    private int indexi;

    public Autosalloni(String emri) {
        this.emri = emri;
    }

    public class Minibusi extends Automjeti {
        public boolean eshteAutomatik() {
            return true;
        }

        private int nrDyrve;

        public Minibusi(String n, String p, int v, int nd) {
            super(n, p, v);
            nrDyrve = nd;
        }

        public String toString() {
            return "Minibusi: " + super.toString() + " " + nrDyrve;
        }
    }

    public static class Coupe extends Automjeti {
        private int nrUlseve;

        public Coupe(String n, String p, int v, int nu) {
            super(n, p, v);
            nrUlseve = nu;
        }
        public void setNrUlseve(int nr){
            nrUlseve=nr;
        }
        public int getNrUlseve(){
            return nrUlseve;
        }

        public boolean eshteAutomatik() {
            return false;
        }

        public String toString() {
            return "Coupe: " + super.toString() + " me " + nrUlseve + " ulse";
        }
    }

    static {
        numriAutomjeteve = 250;
    }

    {
        a = new Automjeti[250];
        a[indexi++] = new Autosalloni.Coupe("f45sdf35fd5f", "BMW", 2019, 2);
    }

    public boolean ekziston(Automjeti auto) {
        for (int i = 0; i < indexi; i++) {
            if (a[i].equals(auto)) {
                return true;
            }
        }
        return false;
    }

    public void shtoAutomjetin(Automjeti auto) {
        if (auto == null) {
            System.out.println("Objekti eshte null.");
            return;
        }
        if(ekziston(auto)){
            System.out.println("Automjeti ekziston.");
            return;
        }
        if(indexi>=a.length){
            System.out.println("Nuk ka vend ne varg.");
            return;
        }
        a[indexi++]=auto;
    }
    public Automjeti avgNumriUlseve(){
        double shuma=0;
        for(int i=0;i< indexi;i++){
          if(a[i] instanceof Coupe){
              Coupe c=(Coupe) a[i];
              shuma=shuma+((Coupe) a[i]).getNrUlseve();
          }
        }
        double mesatarja=shuma;
        Automjeti au=null;
        for(int i=0;i< indexi;i++){
            if(a[i] instanceof Coupe){
                Coupe c=(Coupe) a[i];
               if(((Coupe)a[i]).getNrUlseve()>shuma);
                       au=a[i];
            }
        }
        return au;
    }
    public Automjeti[] shtypAutomatik(boolean t){
        int count=0;
        for(int i=0;i<indexi;i++){
            if(a[i].eshteAutomatik()==t){
                count++;
            }
        }
        if(count==0){
            return null;
        }
        int temp=0;
        Automjeti[] au=new Automjeti[count];
        for(int i=0;i<indexi;i++){
            if(a[i].eshteAutomatik()==t){
                au[temp++]=a[i];
            }
        }
        return au;
    }
    public static void main(String[]bz){
        Autosalloni auto=new Autosalloni("Salloni ABC");
        Limuzina l1=new Limuzina("fd46swf854f","Bugatti",2021,"Dark Black");
        Limuzina l2=new Limuzina("j1g651jhjj5","Lamboghini",2020,"Blue");
        SUV s1=new SUV("fdhgskgj89","Toyota",2010,"nuk");
        SUV s2=new SUV("45sd6v54sc","Mitsubishi",2012,"");
        Coupe c1=new Coupe("f4g5d4fgdf","BMW",2021,4);
        Coupe c2=new Coupe("hfdsjdfhs6","Mercedes",2020,2);
        Autosalloni.Minibusi m1=auto.new Minibusi("65465gfgfg5","Mercedes",2005,5);
        Autosalloni.Minibusi m2=auto.new Minibusi("546fa4dfds7","Volkswagen",2021,3);
        auto.shtoAutomjetin(l1);
        auto.shtoAutomjetin(l2);
        auto.shtoAutomjetin(s1);
        auto.shtoAutomjetin(s2);
        auto.shtoAutomjetin(c1);
        auto.shtoAutomjetin(c2);
        auto.shtoAutomjetin(m1);
        auto.shtoAutomjetin(m2);
        System.out.println();
        auto.shtoAutomjetin(m1);
        System.out.println();
        System.out.println(auto.avgNumriUlseve());
        System.out.println();
        Automjeti[] q=auto.shtypAutomatik(false);
        for(int i=0;i<q.length;i++){
            System.out.println(q[i]);
        }
    }
}