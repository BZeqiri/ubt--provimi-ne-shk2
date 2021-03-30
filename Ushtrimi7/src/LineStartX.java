import java.io.*;
public class LineStartX {
    String lexon;
    String shkruan;
    FileReader fr=null;
    BufferedReader br=null;
    FileWriter fw=null;
    public LineStartX(String in,String out)throws IOException{
        if(in==null || in.trim().isEmpty()){
            throw new IOException("nuk duhet te jete e zbrazet.");
        }
        if(out==null || in.trim().isEmpty()){
            throw new IOException("nuk duhet te jete e zbrazet.");
        }
        lexon=in;
        shkruan=out;
        fr=new FileReader(lexon);
        br=new BufferedReader(fr);
        fw=new FileWriter(shkruan);
    }
    public String evenXLine() throws IOException{
        String texti=null;
        String rreshti=null;
        while((texti=br.readLine())!=null){
            if(rreshti==null || texti.length()%2==0 && texti.startsWith("x") && texti.length()>=rreshti.length()){
                rreshti=texti;
            }
        }
        return rreshti;
    }
    public void write()throws IOException{
        fw.write("Rreshti me i gjate me gjatesi cift qe fillon me x eshte rreshti: "+evenXLine());
        fw.flush();
    }
    public void mbyllResurset() {
        try {
            if (br != null) {
                br.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]bz){
        LineStartX x=null;
        try{
            x=new LineStartX("in.txt","out.txt");
            x.write();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(x!=null){
                x.mbyllResurset();
            }
        }
    }
}
