package ORM;

public class Klient {

    private int idKlient;
    private String NazwaFirmy;
    private String NIP;
    private String Imie;
    private String Nazwisko;
    private String Adres;
    private String KodPocztowy;
    private String Miejscowosc;
    private String Telefon;
    private String Email;

    public int getIdKlient() {
        return idKlient;
    }
    public String getNazwaFirmy() {
        return NazwaFirmy;
    }
    public void setNazwaFirmy(String NazwaFirmy) {
        this.NazwaFirmy = NazwaFirmy;
    }
    public String getNIP() {
        return NIP;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    public String getImie() {
        return Imie;
    }
    public void setImie(String Imie) {
        this.Imie = Imie;
    }
    public String getNazwisko() {
        return Nazwisko;
    }
    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }
    public String getAdres() {
        return Adres;
    }
    public void setAdres(String Adres) {
        this.Adres = Adres;
    }
    public String getKodPocztowy() {
        return KodPocztowy;
    }
    public void setKodPocztowy(String KodPocztowy) {
        this.KodPocztowy = KodPocztowy;
    }
    public String getMiejscowosc() {
        return Miejscowosc;
    }
    public void setMiejscowosc(String Miejscowosc) {
        this.Miejscowosc = Miejscowosc;
    }
    public String getTelefon() {
        return Telefon;
    }
    public void setTelefon(String Telefon){
        this.Telefon = Telefon;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Klient(int idKlient, String NazwaFirmy, String NIP, String Imie, String Nazwisko, String Adres, String KodPocztowy, String Miejscowosc, String Telefon, String Email) {
        this.idKlient = idKlient;
        this.NazwaFirmy = NazwaFirmy;
        this.NIP = NIP;
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Adres = Adres;
        this.KodPocztowy = KodPocztowy;
        this.Miejscowosc = Miejscowosc;
        this.Telefon = Telefon;
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "idKlient=" + idKlient +
                ", NazwaFirmy='" + NazwaFirmy + '\'' +
                ", NIP='" + NIP + '\'' +
                ", Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", Adres='" + Adres + '\'' +
                ", KodPocztowy='" + KodPocztowy + '\'' +
                ", Miejscowosc='" + Miejscowosc + '\'' +
                ", Telefon='" + Telefon + '\'' +
                ", Email='" + Email + '\'' +
                '}';

//        return "<tr>"
//                + "<td>" + idKlient + "</td>"
//                + "<td>" + NazwaFirmy + "</td>"
//                + "<td>" + NIP + "</td>"
//                + "<td>" + Imie + "</td>"
//                + "<td>" + Nazwisko + "</td>"
//                + "<td>" + Adres + "</td>"
//                + "<td>" + KodPocztowy + "</td>"
//                + "<td>" + Miejscowosc + "</td>"
//                + "<td>" + Telefon + "</td>"
//                + "<td>" + Email + "</td>"
//                + "<td><form id=\"updateKlient\" action=\"updateKlient.jsp\" method=\"GET\">"
//                + "<input type=\"hidden\" name= \"id\" value=\"" + idKlient + "\">"
//                + "<input type=\"hidden\" name= \"nazwaFirmy\" value=\"" + NazwaFirmy + "\">"
//                + "<input type=\"hidden\" name= \"nip\" value=\"" + NIP + "\">"
//                + "<input type=\"hidden\" name= \"imie\" value=\"" + Imie + "\">"
//                + "<input type=\"hidden\" name= \"nazwisko\" value=\"" + Nazwisko + "\">"
//                + "<input type=\"hidden\" name= \"adres\" value=\"" + Adres + "\">"
//                + "<input type=\"hidden\" name= \"kodPocztowy\" value=\"" + KodPocztowy + "\">"
//                + "<input type=\"hidden\" name= \"miejscowosc\" value=\"" + Miejscowosc + "\">"
//                + "<input type=\"hidden\" name= \"telefon\" value=\"" + Telefon + "\">"
//                + "<input type=\"hidden\" name= \"email\" value=\"" + Email + "\">"
//                + "<button type=\"submit\" class=\"btn btn-default edytuj\"> <i class=\"glyphicon glyphicon-edit\"></i> Edytuj </button></form></td>"
//                + "<td><form id=\"deleteKlient\" action=\"deleteKlient\" method=\"GET\">"
//                + "<input type=\"hidden\" name= \"id\" value=\"" + idKlient + "\">"
//                + "<button type=\"submit\" class=\"btn btn-default usun\"> <i class=\"glyphicon glyphicon-trash\"></i> Usuń </button></form></td>"
//                + "</tr>";
    }
}