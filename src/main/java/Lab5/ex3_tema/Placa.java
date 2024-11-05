package Lab5.ex3_tema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Placa {
    private String descriere;
    private int lungime;
    private int latime;
    private Orientare orientare;
    private boolean[] canturi;
    @JsonProperty("nr_bucati")
    private int nr_bucati;

    /**
     * Constructor cu paramentrii pentru clasa Placa
     * @param descriere - descrierea placii(String cu valori precum usa, capac, laterală, raft mobil, raft fix, etc)
     * @param lungime - lungimea unei placi in mm
     * @param latime - latimea unei placi in mm
     * @param orientare - enumerare cu valorile posibile LUNGIME, LATIME, ORICARE
     * @param canturi - . Fiecare piesă de pal care face parte dintr-un
     * corp de mobilă, are 4 muchii. O anumită valoare booleană indică prezența sau
     * absența cantului pe muchia corespunzătoare.
     * @param nr_bucati - numar de bucati de placi
     */
    public Placa(String descriere, int lungime, int latime, String orientare, boolean[] canturi, int nr_bucati) {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.orientare = Orientare.valueOf(orientare);
        this.canturi = Arrays.copyOf(canturi,canturi.length);
        this.nr_bucati = nr_bucati;
    }

    /**
     * Constructor pentru clasa Placa fara parametrii
     */
    public Placa() {}

    /**
     * Getter pentru descrierea placii
     * @return descriere
     */
    public String getDescriere() {
        return descriere;
    }

    /**
     * Setter pentru descrierea placi
     * @param descriere
     */
    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    /**
     * Getter pentru lungimea placii
     * @return lungime
     */
    public int getLungime() {
        return lungime;
    }

    /**
     * Setter pentru lungimea placi
     * @param lungime
     */
    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    /**
     * Getter pentru latimea placii
     * @return latime
     */
    public int getLatime() {
        return latime;
    }

    /**
     * Setter pentru latimea placi
     * @param latime
     */
    public void setLatime(int latime) {
        this.latime = latime;
    }

    /**
     * Getter pentru orientarea placii
     * @return orientare
     */
    public Orientare getOrientare() {
        return orientare;
    }

    /**
     * Setter pentru orientarea placi
     * @param orientare
     */
    public void setOrientare(Orientare orientare) {
        this.orientare = orientare;
    }

    /**
     * Getter pentru valorile canturilor placii
     * @return vector de canturi
     */
    public boolean[] getCanturi() {
        return canturi;
    }

    /**
     * Setter pentru valoriel canturilor placii
     * @param canturi -vectorul de canturi
     */
    public void setCanturi(boolean[] canturi) {
        this.canturi = Arrays.copyOf(canturi, canturi.length);
    }

    /**
     * Getter pentru numar de bucati de placi
     * @return nr_bucati
     */
    public int getNrBucati() {
        return nr_bucati;
    }

    /**
     * Setter pentru numarul de bucati de placi
     * @param nr_bucati - numarul de bucati
     */
    public void setNrBucati(int nr_bucati) {
        this.nr_bucati = nr_bucati;
    }

    /**
     * Metoda pentru calcului ariei totale a unei placi
     * @return aria_placii
     */
    public int getArieTotala() {
        return lungime * latime * nr_bucati;
    }

    /**
     * Suprascrierea metodei toString()
     * @return string cu detaliile mobilierului
     */

    @Override
    public String toString() {
        return "Placa{" +
                "descriere='" + descriere + '\'' +
                ", lungime=" + lungime +
                " mm, latime=" + latime +
                " mm, orientare=" + orientare +
                ", canturi=" + Arrays.toString(canturi) +
                ", nr_bucati=" + nr_bucati +
                '}';
    }

}
