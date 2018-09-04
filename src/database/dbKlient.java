package database;

import ORM.Klient;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class dbKlient extends dbControl {

    // wstawienie klienta do bazy
    public boolean insertKlient(String NazwaFirmy, String NIP, String Imie, String Nazwisko,
                                String Adres, String KodPocztowy, String Miejscowosc, String Telefon, String Email) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "INSERT INTO Klienci VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            prepStmt.setString(1, NazwaFirmy);
            prepStmt.setString(2, NIP);
            prepStmt.setString(3, Imie);
            prepStmt.setString(4, Nazwisko);
            prepStmt.setString(5, Adres);
            prepStmt.setString(6, KodPocztowy);
            prepStmt.setString(7, Miejscowosc);
            prepStmt.setString(8, Telefon);
            prepStmt.setString(9, Email);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu klienta do bazy");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // usuniecie klienta o nr idKlient z bazy
    public boolean deleteKlient(String id)  {
        String deleteKlient = "DELETE FROM Klienci WHERE idKlient = "+id+";)";
        try {
            stat.execute(deleteKlient);
        } catch (SQLException e) {
            System.err.println("Blad usuniecia klienta z bazy");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // edytuj klienta o nr idKlient
    public boolean updateKlient(int idKlient, String NazwaFirmy, String NIP, String Imie, String Nazwisko,
                                String Adres, String KodPocztowy, String Miejscowosc, String Telefon, String Email) {
        String updateKlient = "UPDATE Klienci SET "
                + "NazwaFirmy='"+NazwaFirmy+"', "
                + "NIP='"+NIP+"', "
                + "Imie='"+Imie+"', "
                + "Nazwisko='"+Nazwisko+"', "
                + "Adres='"+Adres+"', "
                + "KodPocztowy='"+KodPocztowy+"', "
                + "Miejscowosc='"+Miejscowosc+"', "
                + "Telefon='"+Telefon+"', "
                + "Email='"+Email+"'"
                + " WHERE idKlient = "+idKlient+";)";
        try {
            stat.execute(updateKlient);
        } catch (SQLException e) {
            System.err.println("Blad edycji klienta");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // pokaz klientow
    public List<Klient> selectKlienci() {
        List<Klient> klienci = new LinkedList<Klient>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM Klienci");
            int id;
            String NazwaFirmy, NIP, Imie, Nazwisko, Adres, KodPocztowy, Miejscowosc, Telefon, Email;

            while(result.next()) {
                id = result.getInt("idKlient");
                NazwaFirmy = result.getString("NazwaFirmy");
                NIP = result.getString("NIP");
                Imie = result.getString("Imie");
                Nazwisko = result.getString("Nazwisko");
                Adres = result.getString("Adres");
                KodPocztowy = result.getString("KodPocztowy");
                Miejscowosc = result.getString("Miejscowosc");
                Telefon = result.getString("Telefon");
                Email = result.getString("Email");

                klienci.add(new Klient(id, NazwaFirmy, NIP, Imie, Nazwisko, Adres, KodPocztowy, Miejscowosc, Telefon, Email));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return klienci;
    }

}