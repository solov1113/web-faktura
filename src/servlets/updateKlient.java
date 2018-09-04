package servlets;

import database.dbKlient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//import java.io.PrintWriter;
//import ORM.Klient;
//import java.util.List;

@WebServlet(name = "updateKlient")
public class updateKlient extends HttpServlet {

	private static final long serialVersionUID = 1L;
    public updateKlient() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String id = request.getParameter("id");
		String nazwaFirmy = request.getParameter("nazwaFirmy");
        String nip = request.getParameter("nip");
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String adres = request.getParameter("adres");
        String kodPocztowy = request.getParameter("kodPocztowy");
        String miejscowosc = request.getParameter("miejscowosc");
        String telefon = request.getParameter("telefon");
        String email = request.getParameter("email");
        
        int idInt = Integer.parseInt(id);
  
        dbKlient klient = new dbKlient();
		klient.updateKlient(idInt, nazwaFirmy, nip, imie, nazwisko, adres, kodPocztowy, miejscowosc, telefon, email);
     
        request.getRequestDispatcher("/updateKlientSuccess.jsp").forward(request, response); 	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
