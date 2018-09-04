package servlets;

import database.dbFakturaSzczegoly;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//import java.io.PrintWriter;
//import ORM.Klient;
//import java.util.List;


@WebServlet(name = "insertFakturaSzczegoly")
public class insertFakturaSzczegoly extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public insertFakturaSzczegoly() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String idFkFaktura = request.getParameter("idFkFaktura");
        String idFkProdukt = request.getParameter("idFkProdukt");
        String Sztuk = request.getParameter("Sztuk");
        String CenaJednostkowa = request.getParameter("CenaJednostkowa");
        String SumaNetto = request.getParameter("SumaNetto");
        String SumaBrutto = request.getParameter("SumaBrutto");

        dbFakturaSzczegoly fakturaSzczegoly = new dbFakturaSzczegoly();
        fakturaSzczegoly.insertFakturaSzczegoly(idFkFaktura, idFkProdukt, Sztuk, CenaJednostkowa, SumaNetto, SumaBrutto);

        request.getRequestDispatcher("/insertFakturaSzczegolySuccess.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
