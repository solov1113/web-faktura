package database;

import ORM.Produkt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class dbProdukt extends dbControl {

    // wstawienie produktu do bazy
    public boolean insertProdukt(String NazwaProduktu, float CenaNetto, int Vat, float CenaBrutto) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "INSERT INTO Produkty VALUES (NULL, ?, ?, ?, ?);");
            prepStmt.setString(1, NazwaProduktu);
            prepStmt.setFloat(2, CenaNetto);
            prepStmt.setInt(3, Vat);
            prepStmt.setFloat(4, CenaBrutto);
            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu produktu do bazy");
            return false;
        }
        return true;
    }

    // usuniecie produktu o nr idProdukt z bazy
    public boolean deleteProdukt(String idProdukt)  {
        String deleteProdukt = "DELETE FROM Produkty WHERE idProdukt = "+idProdukt+";)";
        try {
            stat.execute(deleteProdukt);
        } catch (SQLException e) {
            System.err.println("Blad usuniecia produktu");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // edytuj produkt w bazie
    public boolean updateProdukt(int idProdukt, String NazwaProduktu, float CenaNetto, int Vat, float CenaBrutto) {
        String updateProdukt = "UPDATE Produkty SET "
                + "NazwaProduktu='"+NazwaProduktu+"', "
                + "CenaNetto='"+CenaNetto+"', "
                + "Vat='"+Vat+"', "
                + "CenaBrutto='"+CenaBrutto+"'"
                + " WHERE idProdukt = "+idProdukt+";)";
        try {
            stat.execute(updateProdukt);
        } catch (SQLException e) {
            System.err.println("Blad edycji produktu");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // pokaz produkty
    public List<Produkt> selectProdukty() {
        List<Produkt> produkty = new LinkedList<Produkt>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM Produkty");
            int id, Vat;
            float CenaNetto, CenaBrutto;
            String NazwaProduktu;

            while(result.next()) {
                id = result.getInt("idProdukt");
                NazwaProduktu = result.getString("NazwaProduktu");
                CenaNetto = result.getFloat("CenaNetto");
                Vat = result.getInt("Vat");
                CenaBrutto = result.getFloat("CenaBrutto");

                produkty.add(new Produkt(id, NazwaProduktu, CenaNetto, Vat, CenaBrutto));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return produkty;
    }

}