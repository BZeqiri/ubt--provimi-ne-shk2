
import java.util.Random;

public class QeniGarues extends KafshaGaruese implements Garon{

    private int distanca = 0;

    public QeniGarues(int mosha, String emri, int pozitaStartuese) throws GaraException {
        super(mosha, emri, pozitaStartuese);
        if (mosha < 1) {
            throw new GaraException("Mosha duhet 1!");
        }
    }

    public void vrapo() {
        distanca += 10;
        System.out.println(toString());
    }

    public void run() {
        Random rnd = new Random();
        while (distanca < GJATESIA_E_PISTES) {
            try {
                Thread.sleep(rnd.nextInt(2000));
            } catch (InterruptedException ie) {
            }
            vrapo();
        }
    }

    public String toString(){
        return super.toString() + " vrapoi " + distanca + " metra";
    }

}

