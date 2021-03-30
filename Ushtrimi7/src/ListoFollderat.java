import java.io.*;

public class ListoFollderat {
    File f=null;






    public ListoFollderat(String fo)throws IOException{
        if(fo==null || fo.trim().isEmpty()){
            throw new IOException("Emri i follderi nuk duhet te jete i zbrazet");
        }

        f =new File(fo);
        if(!f.exists()){
            throw new IOException(fo+" nuk ekziston.");
        }

        if(!f.isDirectory()){
            throw new IOException(fo+" nuk eshte follder.");
        }
    }





    public void listo(String t,long kb)throws IOException{
        if(t==null || t.trim().isEmpty()){
            throw new IOException("Extension i ni file nuk mund tre jete i zbrazet.");
        }
        if(kb<1){
            throw new IOException("Vlera e kb duhet te jete pozitive.");
        }

        File[] fo=f.listFiles();

        FileWriter fw=new FileWriter("C:\\Users\\LED COM\\Desktop\\Test-Shk2\\Ushtrimi7\\Follder1\\KrejtQkaDinQituMeIQit.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Files me extension: \""+t+"\" me madhesi >= se "+kb+"KB ne folderin \""+f.getPath()+"\" jane:\n");
        bw.newLine();

        for(File m: fo){
            if(m.isFile() && m.getName().endsWith(t) && m.length() /1024 >= kb){
                bw.write(m.getName()+" - "+m.length() / 1024+"KB.");
                bw.newLine();
            }
        }
        bw.close();
}
public static void main(String[]bz){
        String ext="txt";
        long kb=2;
        String rruga="C:\\Users\\LED COM\\Desktop\\Test-Shk2\\Ushtrimi7\\Follder1";
    ListoFollderat lf=null;
    try{
        lf=new ListoFollderat(rruga);
        lf.listo(ext,kb);
    }
    catch(Exception e){
        e.printStackTrace();
    }

}
}
