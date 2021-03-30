import java.io.*;
public class Autosalloni {
    private String emri;
    private Automjeti[] auto;
    private int indexi;
    public Autosalloni(String e,int nr){
        emri=e;
        auto=new Automjeti[nr];
    }
    public boolean ekziston(Automjeti a){
        for(int i=0;i<indexi;i++){
            if(auto[i].equals(a)){
                return true;
            }
        }
        return false;
    }
    public void shtoAutomjetin(Automjeti a)throws AutomjetiException{
        if(a==null){
            throw new AutomjetiException("Objekti eshte null.");
        }
        if(ekziston(a)){
            throw new AutomjetiException("Automjeti ekziston.");
        }
        if(indexi>=auto.length){
            throw new AutomjetiException("Nuk ka vend ne varg.");
        }
        auto[indexi++]=a;
    }
    public Automjeti[] shtypShpejtesiaProdhuesi(int nr, String p)throws IOException{
        int count=0;
        int temp=0;
        for(int i=0;i<indexi;i++){
            if(((Vozitet)auto[i]).numriShpejtesive()==nr && auto[i].getProdhuesi().equals(p)){
                count++;
            }
                }


        if(count==0){
            throw new IOException("Nuk ka vetura me kto parametra.");
        }
        Automjeti[] au=new Automjeti[count];
        for(int i=0;i<indexi;i++){
            if(((Vozitet)auto[i]).numriShpejtesive()==nr && auto[i].getProdhuesi().equals(p)){
                au[temp++]=auto[i];
            }
        }
        return au;
    }
    public Automjeti tempomatiMeIRi(){
        Automjeti au=null;
        for(int i=0;i<indexi;i++){
            if(((Vozitet)auto[i]).kaTempomat()==true){
                if(au==null || auto[i].getVitiProdhimit()>=au.getVitiProdhimit()){
                    au=auto[i];
                }
            }
        }
        return au;
    }
    public static void main (String[]bz) {
        Autosalloni a = new Autosalloni("Salloni ABC", 50);
        Limuzina l1 = new Limuzina("def54s6df4sadf", "Bugatti", 20201, "Dark Black");
        Limuzina l2 = new Limuzina("8564df54sd53f4", "Bugatti", 2020, "Dark Blue");
        Limuzina l3 = new Limuzina("56asdffdccc53d", "Lamorghini", 2021, "Red");
        SUV s1 = new SUV("54fsd6f45df7fd", "Volkwagen", 2010, "nuk eshte");
        SUV s2 = new SUV("576851csdc65cx", "Ford", 2014, "eshte");
        SUV s3 = new SUV("sdcsdd5c4s8dsf", "Mercedes", 2019, "eshte");
        System.out.println();
        try {
            a.shtoAutomjetin(l1);
            a.shtoAutomjetin(l2);
            a.shtoAutomjetin(l3);
            a.shtoAutomjetin(s1);
            a.shtoAutomjetin(s2);
            a.shtoAutomjetin(s3);a.shtoAutomjetin(s1);
        } catch (AutomjetiException c) {
            System.out.println(c);
        }
        System.out.println();
        try {
            Automjeti[] varg = a.shtypShpejtesiaProdhuesi(6, "Bugatti");
            for (Automjeti bu : varg) {
                System.out.println(bu);
            }
        } catch (IOException j) {
            System.out.println(j);
        }
        System.out.println();
        System.out.println(a.tempomatiMeIRi());
    }
}
