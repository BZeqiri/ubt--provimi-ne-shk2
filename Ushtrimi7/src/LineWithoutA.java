
import java.io.*;

public class LineWithoutA {
    String shk2;
    String sshk2;
    FileReader fr=null;
    BufferedReader br=null;
    FileWriter fw=null;
    public LineWithoutA(String txt,String out)throws IOException{
        if(txt==null || txt.trim().isEmpty()){
            throw new IOException("txt nuk duhet te jete i zbrazet.");
        }
        if(out==null || txt.trim().isEmpty()){
            throw new IOException("out nuk duhet te jete i zbrazet.");
        }
        shk2=txt;
        sshk2=out;
        fr=new FileReader(shk2);
        br=new BufferedReader(fr);
        fw=new FileWriter(sshk2);
    }

    public String longestNonALine(String text) throws IOException {
        String line=null;
        String texti=null;
        while ((line = br.readLine())!= null) {
            if(!line.contains(text)) {
                if (texti == null || line.length() >= texti.length()) {
                    texti = line;
                }
            }
         }
        return texti;
    }
    public void shkruaj(String texti) throws IOException{
        if(texti==null||texti.trim().isEmpty()){
            throw new IOException("Text nuk duhet te jete i zbrazet.");
        }
        fw.write("Rreshti i fundit me i gjate qe nuk permban shkronjen \""+texti+"\" eshte: \n"+longestNonALine(texti));
        fw.flush();
    }
    public void mbyllResurset(){
        try{
            if(br!=null){
                br.close();
            }
            if(fw!=null){
                fw.close();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        LineWithoutA a=null;
        try{
            a= new LineWithoutA("in.txt","out.txt");
            a.shkruaj("a");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(a!=null){
                a.mbyllResurset();
            }
        }
    }
}