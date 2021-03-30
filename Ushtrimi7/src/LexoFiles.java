import java.io.*;
public class LexoFiles {
    File file=null;
    public LexoFiles(String lexo)throws IOException{
        if (lexo == null || lexo.trim().isEmpty()) {
            throw new IOException("Emri i follderit nuk mund te jete i zbrazet.");
        }
        file=new File(lexo);
        if(!file.exists()){
            throw new IOException(lexo+" nuk ekziston.");
        }
        if(!file.isDirectory()){
            throw new IOException(lexo+" nuk eshte follder.");
        }
    }
    public void meLexu(String lexo,long kb)throws IOException{
        if(lexo==null || lexo.trim().isEmpty()){
            throw new IOException("Extention i file-it nuk mund te jete i zbrazet.");
        }
        if(kb < 1){
            throw new IOException("KB nuk mund te jene me vlere negative.");
        }
        File[] f=file.listFiles();
                FileWriter fw=new FileWriter("C:\\Users\\LED COM\\Desktop\\Test-Shk2\\Ushtrimi7\\Follderi3\\KALLXOMkallxom.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Fajllat me extension \""+lexo+"\" qe kane >= se \""+kb+"\" dhe qe ndodhen ne follderin \""+file.getPath()+"\" jane:\n");
        bw.newLine();
        for(File varg:f){
            if(varg.isFile() && varg.getName().endsWith(lexo) && varg.length() /1024 >=kb){
                bw.write("File: "+varg.getName()+" - "+varg.length() / 1024+"KB");
                bw.newLine();
            }
        }
        bw.close();
    }
    public static void main(String[]bz){
        String extension="txt";
        long kb=2;
        String rruga="C:\\Users\\LED COM\\Desktop\\Test-Shk2\\Ushtrimi7\\Follderi3";
        LexoFiles lf=null;
        try{
            lf=new LexoFiles(rruga);
            lf.meLexu(extension,kb);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
