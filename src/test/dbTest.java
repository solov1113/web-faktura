package test;

import ORM.Klient;
import ORM.Produkt;
import database.dbControl;
import database.dbFaktura;
import database.dbKlient;
import database.dbProdukt;

import java.util.List;

//import database.Faktura;

public class dbTest {

    public static void main(String[] args) {

        database.dbControl dbConnection = new dbControl();
        database.dbProdukt produkt = new dbProdukt();
        database.dbKlient klient = new dbKlient();
        dbFaktura zamowienie = new dbFaktura();

        // WSTAWIENIE KLIENTA == insertKlient(String NazwaFirmy, String NIP, String Imie, String Nazwisko, String Adres, String KodPocztowy, String Miejscowosc, String Telefon, String Email)
        //  klient.insertKlient("XXX", "123-123-12-12", "Jan", "Kowalski", "ul. Wroclawska", "12-121", "Wroclaw", "71 711 11 11", "test@test.pl");
        //  b.insertKlient("Nazwa Firmy 2", "123-123-12-11", "Janek", "Kowalski", "ul. Swidnicka", "12-122", "Swidnica", "71 711 22 22", "test2@test2.pl");

        // USUNIECIE KLIENTA == deleteKlient(int idKlient)
        //b.deleteKlient(1);

        // AKTUALIZACJA KLIENTA == updateKlient(int IdKlient, String NazwaFirmy, String NIP, String Imie, String Nazwisko, String Adres, String KodPocztowy, String Miejscowosc, String Telefon, String Email)
        //b.updateKlient(1, "Nowa Nazwa Firmy", "123-123-12-12", "Jan", "Kowalski", "ul. Wroclawska", "12-121", "Wroclaw", "71 711 11 11", "test@test.pl");


        // WSTAWIENIE PRODUKTU == insertProdukt(String NazwaProduktu, float CenaNetto, int Vat, float CenaBrutto)
        // ew. przy wstawianiu CenaBrutto = CenaNetto * Vat
//        produkt.insertProdukt("Produkt 1", 100, 23, 123);
//        produkt.insertProdukt("Produkt 2", 200, 23, 246);
//        produkt.insertProdukt("Produkt 3", 300, 23, 369);
//        produkt.insertProdukt("Produkt 4", 400, 23, 492);

        // USUNIECIE PRODUKTU == deleteProdukt(int idProdukt)
        //b.deleteProdukt(8);

        // AKTUALIZACJA PRODUKTU == updateProdukt(int idProdukt, String NazwaProduktu, float CenaNetto, int Vat, float CenaBrutto)
        //b.updateProdukt(2, "Produkt 2 nowy", 201, 24, 247);


        // WSTAWIENIE ZAMOWIENIA == insertFaktura(int NrZamowienia, int Ilosc, String DataZamowienia, int FkIdKlient, int FkIdProdukt)
//        zamowienie.insertFaktura(3, 40, "2016-12-25", 1, 3);
//        zamowienie.insertFaktura(3, 50, "2016-12-25", 1, 4);
//        zamowienie.insertFaktura(1, 10, "2016-12-15", 2, 2);
//
        // USUNIECIE ZAMOWIENIA == deleteZamowienie(int NrZamowienia)
        //b.deleteZamowienie(1);

        // AKTUALIZACJA ZAMOWIENIA == updateZamowienie(int NrZamowienia, int Ilosc, String DataZamowienia, int FkIdKlient, int FkIdProdukt)
        //b.updateZamowienie(2, 2, 11, "2016-12-16", 1, 2);



        List<Klient> klienci = klient.selectKlienci();
        List<Produkt> produkty = produkt.selectProdukty();
//        List<Faktura> zamowienia = zamowienie.selectZamowienia();

        System.out.println("Lista klientow:\n");
        for(Klient i: klienci)
            System.out.println(i);

        System.out.println("\nLista produktow:\n");
        for(Produkt j: produkty)
            System.out.println(j);

//        System.out.println("\nLista zamowien:\n");
//        for(Faktura k: zamowienia)
//            System.out.println(k);

        dbConnection.closeConnection();
    }
}