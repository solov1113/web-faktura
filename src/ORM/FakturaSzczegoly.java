package ORM;

public class FakturaSzczegoly {
    private int idFakturaSzczegoly;
    private String idFkFaktura;
    private String idFkProdukt;
    private String Sztuk;
    private String CenaJednostkowa;
    private String SumaNetto;
    private String SumaBrutto;

    public int getIdFakturaSzczegoly() {
        return idFakturaSzczegoly;
    }
    public void getIdFakturaSzczegoly(int idFakturaSzczegoly) {
        this.idFakturaSzczegoly = idFakturaSzczegoly;
    }
    public String getIdFkFaktura() {
        return idFkFaktura;
    }
    public void setIdFkFaktura(String idFkFaktura) {
        this.idFkFaktura = idFkFaktura;
    }
    public String getIdFkProdukt() {
        return idFkProdukt;
    }
    public void setIdFkProdukt(String idFkProdukt) {
        this.idFkProdukt = idFkProdukt;
    }
    public String getSztuk() {
        return Sztuk;
    }
    public void setSztuk(String Sztuk) {
        this.Sztuk = Sztuk;
    }
    public String getCenaJednostkowa() {
        return CenaJednostkowa;
    }
    public void setCenaJednostkowa(String CenaJednostkowa) {
        this.CenaJednostkowa = CenaJednostkowa;
    }
    public String getSumaNetto() {
        return SumaNetto;
    }
    public void setSumaNetto(String SumaNetto) {
        this.SumaNetto = SumaNetto;
    }
    public String getSumaBrutto() {
        return SumaBrutto;
    }
    public void setSumaBrutto(String SumaBrutto) {
        this.SumaBrutto = SumaBrutto;
    }

    public FakturaSzczegoly(int idFakturaSzczegoly, String idFkFaktura, String idFkProdukt, String Sztuk,
            String CenaJednostkowa, String SumaNetto, String SumaBrutto) {
        this.idFakturaSzczegoly = idFakturaSzczegoly;
        this.idFkFaktura = idFkFaktura;
        this.idFkProdukt = idFkProdukt;
        this.Sztuk = Sztuk;
        this.CenaJednostkowa = CenaJednostkowa;
        this.SumaNetto = SumaNetto;
        this.SumaBrutto = SumaBrutto;
    }

    public String toString() {
        return "FakturaSzczegoly{" +
                "idFakturaSzczegoly=" + idFakturaSzczegoly +
                ", idFkFaktura='" + idFkFaktura + '\'' +
                ", idFkProdukt='" + idFkProdukt + '\'' +
                ", Sztuk='" + Sztuk + '\'' +
                ", CenaJednostkowa='" + CenaJednostkowa + '\'' +
                ", SumaNetto='" + SumaNetto + '\'' +
                ", SumaBrutto='" + SumaBrutto + '\'' +
                '}';

    }
}