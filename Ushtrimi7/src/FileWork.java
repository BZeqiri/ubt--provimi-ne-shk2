import java.io.*;
public class FileWork {
    File file=null;
    public FileWork(String emriFollderit)throws IOException{
        if(emriFollderit==null || emriFollderit.trim().isEmpty()){
            throw new IOException("Emri i folderit nuk mund te jete i zbrazet.");
        }
        file=new File(emriFollderit);
        if(!file.exists()){
            throw new IOException(emriFollderit+" nuk ekziston.");
        }
        if(!file.isDirectory()){
            throw new IOException(emriFollderit+" nuk eshte follder.");
        }
    }
    public void lexoFiles(String extension,long kb)throws IOException{
        if(extension==null || extension.trim().isEmpty()){
            throw new IOException("Exctention i file nuk mund te jete i zbrazet.");
        }
        if(kb<1){
            throw new IOException("KB nuk mund te jete me vlere negative.");
        }
        File[] f=file.listFiles();
        FileWriter fw=new FileWriter("C:\\Users\\LED COM\\Desktop\\Test-Shk2\\Ushtrimi7\\Follderi2\\KALLXOMkallxom.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Files me extension \""+extension+"\", me me shume se "+kb+"KB ne follderin \""+file.getPath()+"\" jane:\n");
        bw.newLine();

        for(File folder: f){
            if(folder.isFile() && folder.length() /1024 >=kb && folder.getName().endsWith(extension)){
                bw.write("File: "+folder.getName()+" - "+folder.length()/1024 +"KB.");
                bw.newLine();
            }
        }
        bw.close();
    }
    public static void main(String[]bz){
        String ext="txt";
        long kb=2;
        String path="C:\\Users\\LED COM\\Desktop\\Test-Shk2\\Ushtrimi7\\Follderi2";
        FileWork fw=null;
        try{
            fw=new FileWork(path);
            fw.lexoFiles(ext,kb);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
