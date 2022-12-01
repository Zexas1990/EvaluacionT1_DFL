package datos;

public class Resultado {

    private String nombre;
    private String fase;
    private String primer;
    private String segundo;
    private int goles1;
    private int goles2;


    public Resultado(String nombre, String fase, String primer, String segundo, int goles1, int goles2) {
        this.nombre = nombre;
        this.fase = fase;
        this.primer = primer;
        this.segundo = segundo;
        this.goles1 = goles1;
        this.goles2 = goles2;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "nombre='" + nombre + '\'' +
                ", fase='" + fase + '\'' +
                ", primer='" + primer + '\'' +
                ", segundo='" + segundo + '\'' +
                ", goles1=" + goles1 +
                ", goles2=" + goles2 +
                '}';
    }
}
