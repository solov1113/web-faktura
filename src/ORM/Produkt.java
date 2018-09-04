package ORM;

public class Produkt {
    private int idProdukt;
    private String NazwaProduktu;
    private float CenaNetto;
    private int Vat;
    private float CenaBrutto;

    public int getIdProdukt() {
        return idProdukt;
    }
    public void setIdProdukt(int idProdukt) {
        this.idProdukt = idProdukt;
    }
    public String getNazwaProduktu() {
        return NazwaProduktu;
    }
    public void setNazwaProduktu(String NazwaProduktu) {
        this.NazwaProduktu = NazwaProduktu;
    }
    public float getCenaNetto() {
        return CenaNetto;
    }
    public void setCenaNetto(float CenaNetto) {
        this.CenaNetto = CenaNetto;
    }
    public int getVAT() {
        return Vat;
    }
    public void setVat (int Vat) {
        this.Vat = Vat;
    }
    public float getCenaBrutto() {
        return CenaBrutto;
    }
    public void setCenaBrutto (float CenaBrutto) {
        this.CenaBrutto = CenaBrutto;
    }

    public Produkt(int idProdukt, String NazwaProduktu, float CenaNetto, int Vat, float CenaBrutto) {
        this.idProdukt = idProdukt;
        this.NazwaProduktu = NazwaProduktu;
        this.CenaNetto = CenaNetto;
        this.Vat = Vat;
        this.CenaBrutto = CenaBrutto;
    }

    @Override
    public String toString() {

        return "Produkt{" +
                "idProdukt=" + idProdukt +
                ", NazwaProduktu='" + NazwaProduktu + '\'' +
                ", CenaNetto='" + CenaNetto + '\'' +
                ", Vat='" + Vat + '\'' +
                ", CenaBrutto='" + CenaBrutto + '\'' +
                '}';

//        return "<tr>"
//                + "<td>" + idProdukt + "</td>"
//                + "<td>" + NazwaProduktu + "</td>"
//                + "<td>" + CenaNetto + "</td>"
//                + "<td>" + Vat + "</td>"
//                + "<td>" + CenaBrutto + "</td>"
//
//                + "<td><form id=\"updateProdukt\" action=\"updateProdukt.jsp\" method=\"GET\">"
//                + "<input type=\"hidden\" name= \"id\" value=\"" + idProdukt + "\">"
//                + "<input type=\"hidden\" name= \"nazwaProduktu\" value=\"" + NazwaProduktu + "\">"
//                + "<input type=\"hidden\" name= \"cenaNetto\" value=\"" + CenaNetto + "\">"
//                + "<button type=\"submit\" class=\"btn btn-default edytuj\"> <i class=\"glyphicon glyphicon-edit\"></i> Edytuj </button></form></td>"
//                + "<td><form id=\"deleteProdukt\" action=\"deleteProdukt\" method=\"GET\">"
//                + "<input type=\"hidden\" name= \"id\" value=\"" + idProdukt + "\">"
//                + "<button type=\"submit\" class=\"btn btn-default usun\"> <i class=\"glyphicon glyphicon-trash\"></i> Usuń </button></form></td>"
//                + "</tr>";
    }

}