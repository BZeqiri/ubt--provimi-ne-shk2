
import java.util.Enumeration;
import java.util.Vector;

public class Hipodromi {

    private String emri;
    private Vector<KafshaGaruese> kafshet;

    public Hipodromi(String e) throws GaraException {
        if (e == null || e.trim().equals("")) {
            throw new GaraException("Emri nuk mund te jete i zbrazet!");
        }
        emri = e;
        kafshet = new Vector<KafshaGaruese>();
    }

    public void shtoKafshen(KafshaGaruese kg) throws GaraException {
        if (kg == null) {
            throw new GaraException("Instanca e painicializuar!");
        }
        if (kafshet.contains(kg)) {
            throw new GaraException("Kafsha ekziston!");
        }
        kafshet.add(kg);
    }

    public void shtypKafshet() {
        for (KafshaGaruese kg : kafshet) {
            System.out.println(kg);
        }
    }

    public void filloGaren() throws GaraException {
        if (kafshet.isEmpty()) {
            throw new GaraException("Nuk ka asnje mjet garuese!");
        }
        Enumeration<KafshaGaruese> en = kafshet.elements();
        while (en.hasMoreElements()) {
            KafshaGaruese kg = en.nextElement();
            if (kg instanceof KaliGarues) {
                kg.setPriority(Thread.MAX_PRIORITY);
            }
            kg.start();
        }
    }

    public static void main(String[] args) {
        int pozita = 1;
        try {
            Hipodromi h = new Hipodromi("TEST");
            h.shtoKafshen(new QeniGarues(1, "Emri1", pozita++));
            h.shtoKafshen(new QeniGarues(2, "Emri2", pozita++));
            h.shtoKafshen(new KaliGarues(2, "Emri3", pozita++));
            h.shtoKafshen(new KaliGarues(3, "Emri4", pozita++));
            System.out.println("Te gjitha kafshet: ");
            h.shtypKafshet();
            System.out.println();
            h.filloGaren();
        } catch (GaraException ge) {
            ge.printStackTrace();
        }
    }
}

