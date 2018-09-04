package servlets;

import database.dbKlient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "insertKlient")
public class insertKlient extends HttpServlet {

	private static final long serialVersionUID = 1L;
    public insertKlient() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nazwaFirmy = request.getParameter("nazwaFirmy");
        String nip = request.getParameter("nip");
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String adres = request.getParameter("adres");
        String kodPocztowy = request.getParameter("kodPocztowy");
        String miejscowosc = request.getParameter("miejscowosc");
        String telefon = request.getParameter("telefon");
        String email = request.getParameter("email");
        
        dbKlient klient = new dbKlient();
		klient.insertKlient(nazwaFirmy, nip, imie, nazwisko, adres, kodPocztowy, miejscowosc, telefon, email);
     
        request.getRequestDispatcher("/insertKlientSuccess.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
