package ex3_tema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mobilier {
    private String nume;
    private List<Placa> placi;

    /**
     * Constructor pt clasa Mobilier cu parametrii
     * @param nume -numele mobilierului
     * @param placi - lista de placi ce compune mobilierul
     */
    public Mobilier(String nume, List<Placa> placi) {
        this.nume = nume;
        this.placi = placi;
    }

    /**
     * Constructor pt clasa Mobilier fara parametrii
     */
    public Mobilier() {}

    /**
     * Getter pentru numele mobilierului
     * @return nume mobilier
     */
    public String getNume() { return nume; }

    /**
     * Getter pentru lista placilor ce compune un mobilier
     * @return lista de placi
     */
    public List<Placa> getPlaci() { return placi; }

    /**
     * Setter pentru numele mobilierului
     * @param nume nume mobilier
     */
    public void setNume(String nume) { this.nume = nume; }
    /**
     * Setter pentru palcile mobilierului
     * @param placi placi mobilier
     */
    public void setPlaci(List<Placa> placi) { this.placi = placi; }

    /**
     * Suprascrierea metodei toString()
     * @return string cu detaliile mobilierului
     */
    @Override
    public String toString() {
        return "Mobilier{" +
                "nume='" + nume + '\'' +
                ", placi=" + placi +
                '}';
    }
}
