package servlets;

import ORM.Klient;
import database.dbKlient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//import java.io.PrintWriter;
//import com.google.gson.Gson;

@WebServlet(name = "Klienci")
public class Klienci extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Klienci() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	dbKlient klient = new dbKlient();
        List<Klient> klienci = klient.selectKlienci();

        request.getServletContext().setAttribute("klienci", klienci);

//        String dane = "";
//        for(Klient i: klienci) {
//        	dane += i;
//        }
//
//        request.setAttribute("dane", dane);

        request.getRequestDispatcher("/Klienci.jsp").forward(request, response);
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}