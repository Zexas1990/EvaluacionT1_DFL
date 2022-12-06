package datos;

public class Resultado {


    private String fase;
    private String fecha;
    private String primer;
    private int goles1;
    private String segundo;
    private int goles2;


    public Resultado(String fase, String fecha, String primer, int goles1, String segundo, int goles2) {
        this.fase = fase;
        this.fecha = fecha;
        this.primer = primer;
        this.goles1 = goles1;
        this.segundo = segundo;
        this.goles2 = goles2;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "fase='" + fase + '\'' +
                ", fecha='" + fecha + '\'' +
                ", primer='" + primer + '\'' +
                ", goles1=" + goles1 +
                ", segundo='" + segundo + '\'' +
                ", goles2=" + goles2 +
                '}';
    }

    public String getFase() {
        return fase;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPrimer() {
        return primer;
    }

    public int getGoles1() {
        return goles1;
    }

    public String getSegundo() {
        return segundo;
    }

    public int getGoles2() {
        return goles2;
    }
}
