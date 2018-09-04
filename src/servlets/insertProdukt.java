package servlets;

import database.dbProdukt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//import java.io.PrintWriter;
//import ORM.Klient;
//import java.util.List;

/**
 * Servlet implementation class insertKlient
 */
@WebServlet(name = "insertProdukt")
public class insertProdukt extends HttpServlet {

	private static final long serialVersionUID = 1L;
    public insertProdukt() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nazwaProduktu = request.getParameter("nazwaProduktu");
        String cenaNetto = request.getParameter("cenaNetto");
        String vat = request.getParameter("vat");
       
        float cenaNettoFloat = Float.parseFloat(cenaNetto);
        int vatInt = Integer.parseInt(vat);
        float cenaBrutto = cenaNettoFloat + (cenaNettoFloat*vatInt)/100;
        float cenaBruttoFloat = (float) Math.round(cenaBrutto*100)/100;
        
        dbProdukt produkt = new dbProdukt();
		produkt.insertProdukt(nazwaProduktu, cenaNettoFloat, vatInt, cenaBruttoFloat);
     
        request.getRequestDispatcher("/insertProduktSuccess.jsp").forward(request, response); 	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
