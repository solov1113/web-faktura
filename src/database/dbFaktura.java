package database;

import ORM.Faktura;
import database.dbControl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class dbFaktura extends dbControl {

    // wstawienie faktury do bazy
    public boolean insertFaktura(String DataFaktury, String FkIdKlient, String FkIdProdukt, String Sztuk, String SumaNetto, String SumaBrutto) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "INSERT INTO Faktury VALUES (NULL, ?, ?, ?, ?, ?, ?);");
            prepStmt.setString(1, DataFaktury);
            prepStmt.setString(2, FkIdKlient);
            prepStmt.setString(3, FkIdProdukt);
            prepStmt.setString(4, Sztuk);
            prepStmt.setString(5, SumaNetto);
            prepStmt.setString(6, SumaBrutto);
            prepStmt.execute();        } catch (SQLException e) {
            System.err.println("Blad przy wstawienu faktury");
            return false;
        }
        return true;
    }

    // usuniecie faktury o numerze idFaktura
    public boolean deleteFaktura(String idFaktura) {
        String deleteFaktura = "DELETE FROM Faktury WHERE idFaktura = "+idFaktura+";)";
        try {
            stat.execute(deleteFaktura);
        } catch (SQLException e) {
            System.err.println("Blad usuniecia faktury");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // edycja faktury
    public boolean updateFaktura(int idFaktura,String DataFaktury, String FkIdKlient, String FkIdProdukt, String Sztuk, String SumaNetto, String SumaBrutto) {
        String updateFaktura = "UPDATE Faktury SET "
                + "DataFaktury='"+DataFaktury+"', "
                + "FkIdKlient="+FkIdKlient+", "
                + "FkIdProdukt="+FkIdProdukt+", "
                + "Sztuk="+Sztuk+", "
                + "SumaNetto="+SumaNetto+", "
                + "SumaBrutto="+SumaBrutto+", "
                + " WHERE idFaktura = "+idFaktura+");";
        try {
            stat.execute(updateFaktura);
        } catch (SQLException e) {
            System.err.println("Blad aktualizacji faktury");
            e.printStackTrace();

            return false;
        }
        return true;
    }

    // pokaz faktury
    public List<Faktura> selectFaktury() {
        List<Faktura> faktury = new LinkedList<Faktura>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM Faktury");

            int id;
            String DataFaktury;
            String FkIdKlient;
            String FkIdProdukt;
            String Sztuk;
            String SumaNetto;
            String SumaBrutto;

            while(result.next()) {
                id = result.getInt("idFaktura");
                DataFaktury = result.getString("DataFaktury");
                FkIdKlient = result.getString("FkIdKlient");
                FkIdProdukt = result.getString("FkIdProdukt");
                Sztuk = result.getString("Sztuk");
                SumaNetto = result.getString("SumaNetto");
                SumaBrutto = result.getString("SumaBrutto");

                faktury.add(new Faktura(id, DataFaktury, FkIdKlient, FkIdProdukt, Sztuk, SumaNetto, SumaBrutto));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return faktury;
    }

}