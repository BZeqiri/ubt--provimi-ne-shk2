import java.io.*;

public class ListoKiloBajtet {

    File folder = null;





    public ListoKiloBajtet(String fld) throws IOException {
        if (fld == null || fld.trim().isEmpty()) {
            throw new IOException("Emri i folder-it nuk mund te jete i zbrazet!");
        }

        folder = new File(fld);
        if (!folder.exists()) {
            throw new FileNotFoundException("\"" + fld + "\" nuk ekziton!");
        }

        if (!folder.isDirectory()) {
            throw new FileNotFoundException("\"" + fld + "\" nuk eshte folder!");
        }
    }





    public void listoKB(String ext, long kb) throws IOException {
        if (ext == null || ext.trim().isEmpty()) {
            throw new IOException("Extension i nje file-i nuk mund te jete i zbrazet!");
        }
        if (kb < 1) {
            throw new IOException("Vlera e kilobajteve te nje file-i duhet te jete pozitive!");
        }

        File[] fajlat = folder.listFiles();

        FileWriter fw = new FileWriter("printHere.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("File-a me extension \"" + ext + "\", me madhesi >= " + kb + " KB ne folderin " + folder.getPath() + ":");
        bw.newLine();

        for (File f : fajlat) {
            if (f.isFile() && f.getName().endsWith(ext) && f.length() / 1024 >= kb) {
                bw.write(f.getName() + " - " + f.length() / 1024 + " KB.");
                bw.newLine();
            }
        }
        bw.close();
    }





    public static void main(String[] args) {
        String ext = ".txt";
        long kb = 2;
        String folder = "C:\\Users\\LED COM\\Desktop\\Test-Shk2\\Ushtrimi7";
        ListoKiloBajtet lKB = null;
        try {

            lKB = new ListoKiloBajtet(folder);
            lKB.listoKB(ext, kb);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
}