package servlets;

import ORM.Produkt;
import database.dbProdukt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//import java.io.PrintWriter;
//import com.google.gson.Gson;

@WebServlet(name = "Produkty")
public class Produkty extends HttpServlet {

	private static final long serialVersionUID = 1L;
    public Produkty() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	dbProdukt produkt = new dbProdukt();
        List<Produkt> produkty = produkt.selectProdukty();

        request.getServletContext().setAttribute("produkty", produkty);
        request.getRequestDispatcher("/Produkty.jsp").forward(request, response);
	}
}