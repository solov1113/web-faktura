package database;
import ORM.FakturaSzczegoly;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class dbFakturaSzczegoly extends dbControl {

    // wstawienie faktury do bazy
    public boolean insertFakturaSzczegoly(String idFkFaktura, String idFkProdukt, String Sztuk,
                                          String CenaJednostkowa, String SumaNetto, String SumaBrutto) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "INSERT INTO FakturySzczegoly VALUES (NULL, ?, ?, ?, ?, ?, ?);");
            prepStmt.setString(1, idFkFaktura);
            prepStmt.setString(2, idFkProdukt);
            prepStmt.setString(3, Sztuk);
            prepStmt.setString(4, CenaJednostkowa);
            prepStmt.setString(5, SumaNetto);
            prepStmt.setString(6, SumaBrutto);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawienu szczegółów faktury");
            return false;
        }
        return true;
    }

    // usuniecie faktury o numerze idFakturaSzczegoly
    public boolean deleteFakturaSzczegoly(String idFakturaSzczegoly) {
        String deleteFakturaSzczegoly = "DELETE FROM FakturySzczegoly WHERE idFakturaSzczegoly = "+idFakturaSzczegoly+";)";
        try {
            stat.execute(deleteFakturaSzczegoly);
        } catch (SQLException e) {
            System.err.println("Blad usuniecia faktury szczegóły");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // edycja faktury szczegóły
    public boolean updateFakturaSzczegoly(int idFakturaSzczegoly, String idFkFaktura, String idFkProdukt, String Sztuk,
                                          String CenaJednostkowa, String SumaNetto, String SumaBrutto) {
        String updateFakturaSzczegoly = "UPDATE FakturySzczegoly SET "
                + "idFkFaktura='"+idFkFaktura+"', "
                + "idFkProdukt='"+idFkProdukt+"', "
                + "Sztuk='"+Sztuk+"', "
                + "CenaJednostkowa='"+CenaJednostkowa+"', "
                + "SumaNetto='"+SumaNetto+"', "
                + "SumaBrutto='"+SumaBrutto+"', "
                + " WHERE idFakturaSzczegoly = "+idFakturaSzczegoly+");";
        try {
            stat.execute(updateFakturaSzczegoly);
        } catch (SQLException e) {
            System.err.println("Blad aktualizacji faktury szczegóły");
            e.printStackTrace();

            return false;
        }
        return true;
    }


    // pokaz faktury szczegóły
    public List<FakturaSzczegoly> selectFakturySzczegoly(String idFkFaktura) {
        List<FakturaSzczegoly> fakturySzczegoly = new LinkedList<FakturaSzczegoly>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM FakturySzczegoly WHERE idFakturaSzczegoly = "+idFkFaktura+");");

            int id;
//            int idFakturaSzczegoly;
            String idFkProdukt;
            String Sztuk;
            String CenaJednostkowa;
            String SumaNetto;
            String SumaBrutto;

            while(result.next()) {
                id = result.getInt("idFakturaSzczegoly");
                idFkFaktura = result.getString("idFkFaktura");
                idFkProdukt = result.getString("idFkProdukt");
                Sztuk = result.getString("Sztuk");
                CenaJednostkowa = result.getString("CenaJednostkowa");
                SumaNetto = result.getString("SumaNetto");
                SumaBrutto = result.getString("SumaBrutto");

                fakturySzczegoly.add(new FakturaSzczegoly(id, idFkFaktura, idFkProdukt, Sztuk, CenaJednostkowa, SumaNetto, SumaBrutto));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return fakturySzczegoly;
    }

}