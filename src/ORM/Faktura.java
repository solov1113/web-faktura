package ORM;

public class Faktura {
    private int idFaktura;
    private String DataFaktury;
    private String FkIdKlient;
    private String FkIdProdukt;
    private String Sztuk;
    private String SumaNetto;
    private String SumaBrutto;

    public int getIdFaktura() {
        return idFaktura;
    }
    public void setIdFaktura(int idFaktura) {
        this.idFaktura = idFaktura;
    }
    public String getDataFaktury() {
        return DataFaktury;
    }
    public void setDataFaktury(String DataFaktury) {
        this.DataFaktury = DataFaktury;
    }
    public String getFkIdKlient() {
        return FkIdKlient;
    }
    public void setFkIdKlient(String FkIdKlient) {
        this.FkIdKlient = FkIdKlient;
    }

    public String getFkIdProdukt() {
        return FkIdProdukt;
    }
    public void setFkIdProdukt(String FkIdProdukt) {
        this.FkIdProdukt = FkIdProdukt;
    }

    public String getSztuk() {
        return Sztuk;
    }
    public void setSztuk(String Sztuk) {
        this.Sztuk = Sztuk;
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

    public Faktura(int idFaktura, String DataFaktury, String FkIdKlient, String FkIdProdukt, String Sztuk, String SumaNetto, String SumaBrutto) {
        this.idFaktura = idFaktura;
        this.DataFaktury = DataFaktury;
        this.FkIdKlient = FkIdKlient;
        this.FkIdProdukt = FkIdProdukt;
        this.Sztuk = Sztuk;
        this.SumaNetto = SumaNetto;
        this.SumaBrutto = SumaBrutto;
    }

    public String toString() {

        return "Faktura{" +
                "idFaktura=" + idFaktura +
                ", DataFaktury='" + DataFaktury + '\'' +
                ", FkIdKlient='" + FkIdKlient + '\'' +
                ", FkIdProdukt='" + FkIdProdukt + '\'' +
                ", Sztuk='" + Sztuk + '\'' +
                ", SumaNetto='" + SumaNetto + '\'' +
                ", SumaBrutto='" + SumaBrutto + '\'' +
                '}';

//        return "<tr>"
//                + "<td>" + idFaktura + "</td>"
//                + "<td>" + DataFaktury + "</td>"
//                + "<td>" + FkIdKlient + "</td>"
//
//                + "<td><form id=\"updateFaktura\" action=\"updateFaktura.jsp\" method=\"GET\">"
//                + "<input type=\"hidden\" name= \"id\" value=\"" + idFaktura + "\">"
//                + "<button type=\"submit\" class=\"btn btn-default edytuj\"> <i class=\"glyphicon glyphicon-edit\"></i> Edytuj </button></form></td>"
//                + "<td><form id=\"deleteFaktura\" action=\"deleteFaktura\" method=\"GET\">"
//                + "<input type=\"hidden\" name= \"id\" value=\"" + idFaktura + "\">"
//                + "<button type=\"submit\" class=\"btn btn-default usun\"> <i class=\"glyphicon glyphicon-trash\"></i> Usuń </button></form></td>"
//                + "</tr>";

    }
}