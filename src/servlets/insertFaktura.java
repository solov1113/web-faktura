package servlets;

import ORM.Klient;
import database.dbFaktura;
import database.dbKlient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//import java.io.PrintWriter;
//import ORM.Klient;
//import java.util.List;

/**
 * Servlet implementation class insertKlient
 */
@WebServlet(name = "insertFaktura")
public class insertFaktura extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public insertFaktura() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        dbKlient klient = new dbKlient();
        List<Klient> klienci = klient.selectKlienci();

        String DataFaktury = request.getParameter("dataFaktury");
        String FkIdKlient = request.getParameter("fkIdKlient");
        String FkIdProdukt = request.getParameter("FkIdProdukt");
        String Sztuk = request.getParameter("Sztuk");
        String SumaNetto = request.getParameter("CenaNetto");
        String SumaBrutto = request.getParameter("CenaBrutto");

//
//        String SumaNetto = CenaNetto * Sztuk;
//        String SumaBrutto = request.getParameter("SumaBrutto");


        dbFaktura faktura = new dbFaktura();
        faktura.insertFaktura(DataFaktury, FkIdKlient, FkIdProdukt, Sztuk, SumaNetto, SumaBrutto);

        request.getServletContext().setAttribute("klienci", klienci);
        request.getRequestDispatcher("/insertFakturaSuccess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
