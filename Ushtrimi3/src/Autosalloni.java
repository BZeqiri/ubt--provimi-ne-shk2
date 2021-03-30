public class Autosalloni {
    private String emri;
    private Automjeti[] a;
    private int llega;
    public Autosalloni(String e, int numri){
        emri=e;
        a=new Automjeti[numri];
    }
    public boolean ekziston(Automjeti auto){
        for(int i=0;i<llega;i++){
            if(a[i].equals(auto))
                return true;
        }
        return false;
    }
    public void shtoAutomjetin(Automjeti auto){
        if(auto==null){
            System.out.println("Objekti eshte null.");
            return;
        }
        if(ekziston(auto)){
            System.out.println("Automjeti ekziston.");
            return;
        }
        if(llega>=a.length){
            System.out.println("Nuk ka vend ne varg.");
            return;
        }
        a[llega++]=auto;
    }
    public Automjeti[] shtypSUVProdhuesi(String auto){
        int count=0;
        int temp=0;
        for(int i=0;i<llega;i++) {
            if (a[i] instanceof SUV) {
                SUV s = (SUV) a[i];
                if (s.getProdhuesi().equals(auto)) {
                    count++;
                }
            }
        }
        if(count==0){
            return null;
        }
        Automjeti[] suv=new Automjeti[count];
        for(int i=0;i<llega;i++){
            if(a[i] instanceof SUV){
                SUV s=(SUV)a[i];
                if(s.getProdhuesi().equals(auto)){
                    suv[temp++]=a[i];
                }
            }
        }
        return suv;
    }
    public Automjeti[] shtypLimuzinaViti(int viti){
        int count=0;
        int temp=0;
        for(int i=0;i<llega;i++){
            if(a[i] instanceof Limuzina){
                Limuzina l=(Limuzina)a[i];
                if(l.getVitiProdhimit()==viti){
                    count++;
                }
            }
        }
        if(count==0){
            return null;
        }
        Automjeti[] limuzina=new Automjeti[count];
        for(int i=0;i<llega;i++){
            if(a[i] instanceof Limuzina){
                Limuzina l=(Limuzina) a[i];
                if(l.getVitiProdhimit()==viti){
                    limuzina[temp++]=a[i];
                }
            }
        }
        return limuzina;
    }
    public Automjeti automatikuMeIRi(){
        Automjeti IRi=null;
        for(int i=0;i<llega;i++){
            if(a[i].eshteAutomatik()==true && IRi==null || a[i].getVitiProdhimit()> IRi.getVitiProdhimit()){
                IRi=a[i];
            }
        }
        return IRi;
    }
    public static void main (String[]bz){
        Autosalloni a=new Autosalloni("Salloni ABC",50);
        Limuzina l1=new Limuzina("webeer34rew","Bugatti",2021,"Black");
        Limuzina l2=new Limuzina("vfer543jhuu","BMW",2021,"Light Blue");
        Limuzina l3=new Limuzina("jhdkf3454nf","Bugatti",2020,"Dark Black");
        SUV s1=new SUV("ghh47fg5h7f","Ferrari",2020,"eshte4x4");
        SUV s2=new SUV("s4dfvs6d5fv","Meclaren",2021,"eshte4x4");
        SUV s3=new SUV("45dfs68f4ds","Ferrari",2019,"eshte4x4");
        a.shtoAutomjetin(l1);
        a.shtoAutomjetin(l2);
        a.shtoAutomjetin(l3);
        a.shtoAutomjetin(s1);
        a.shtoAutomjetin(s2);
        a.shtoAutomjetin(s3);
        System.out.println("Automjeti: \""+l3+"\" a ekziston:");
        a.shtoAutomjetin(l3);
        System.out.println();
        System.out.println("Automjetet SUV qe prodhohen nga Ferrari jane: ");
        Automjeti[] fr=a.shtypSUVProdhuesi("Ferrari");
        for(int i=0;i<fr.length;i++){
            System.out.println(fr[i]);
        }
        System.out.println();
        System.out.println("Limuzinat e vitit 2021 jane:");
        Automjeti[] viti=a.shtypLimuzinaViti(2021);
        for(int i=0;i<viti.length;i++){
            System.out.println(viti[i]);
        }
        System.out.println();
        System.out.println("Automjeti automatik me i ri eshte:");
        System.out.println(a.automatikuMeIRi());
    }
}
