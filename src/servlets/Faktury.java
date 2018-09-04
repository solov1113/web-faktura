package servlets;

import ORM.Faktura;
import ORM.Klient;
import ORM.Produkt;
import database.dbFaktura;
import database.dbKlient;
import database.dbProdukt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Faktury")
public class Faktury extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public Faktury() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        dbFaktura faktura = new dbFaktura();
        List<Faktura> faktury = faktura.selectFaktury();

        dbKlient klient = new dbKlient();
        List<Klient> klienci = klient.selectKlienci();

        dbProdukt produkt = new dbProdukt();
        List<Produkt> produkty = produkt.selectProdukty();

        request.getServletContext().setAttribute("faktury", faktury);
        request.getServletContext().setAttribute("klienci", klienci);
        request.getServletContext().setAttribute("produkty", produkty);
        request.getRequestDispatcher("/Faktury.jsp").forward(request, response);
    }
}