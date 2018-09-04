package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbControl {

    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:faktura.db";

    public Connection conn;
    public Statement stat;

    public dbControl() {
        try {
            Class.forName(dbControl.DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Brak sterownika JDBC");
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem z otwarciem polaczenia");
            e.printStackTrace();
        }

        createTables();
    }

    // Tworzenie tabel
    private boolean createTables()  {
        String createProdukty = "CREATE TABLE IF NOT EXISTS "
                + "Produkty ("
                + "idProdukt INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NazwaProduktu varchar(255), "
                + "CenaNetto real(16),"
                + "Vat int,"
                + "CenaBrutto real(16))";
        String createKlienci = "CREATE TABLE IF NOT EXISTS "
                + "Klienci ("
                + "idKlient INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NazwaFirmy varchar(255), "
                + "NIP varchar(255),"
                + "Imie varchar(255),"
                + "Nazwisko varchar(255),"
                + "Adres varchar(255),"
                + "KodPocztowy varchar(255),"
                + "Miejscowosc varchar(255),"
                + "Telefon varchar(255),"
                + "Email varchar(255))";
        String createFaktury = "CREATE TABLE IF NOT EXISTS "
                + "Faktury ("
                + "idFaktura INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "DataFaktury varchar(255), "
                + "FkIdKlient varchar(255), "
                + "FkIdProdukt varchar(255), "
                + "Sztuk varchar(255), "
                + "SumaNetto varchar(255), "
                + "SumaBrutto varchar(255))"
                ;
//        String createFaktury = "DROP TABLE Faktury ";

//        String createFakturySzczegoly = "CREATE TABLE IF NOT EXISTS "
//                + "FakturySzczegoly ("
//                + "idFakturaSzczegoly INTEGER PRIMARY KEY AUTOINCREMENT, "
//                + "idFkFaktura varchar(255), "
//                + "idFkProdukt varchar(255), "
//                + "Sztuk varchar(255), "
//                + "CenaJednostkowa varchar(255), "
//                + "SumaNetto varchar(255), "
//                + "SumaBrutto varchar(255)"
////                + "FOREIGN KEY(FkIdKlient) REFERENCES Klienci(idKlient))"
//                ;
        try {
            stat.execute(createKlienci);
            stat.execute(createProdukty);
            stat.execute(createFaktury);
//            stat.execute(createFakturySzczegoly);
        } catch (SQLException e) {
            System.err.println("Blad przy tworzeniu tabeli");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Problem z zamknieciem polaczenia");
            e.printStackTrace();
        }
    }
}