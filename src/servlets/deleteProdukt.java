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

@WebServlet(name = "deleteProdukt")
public class deleteProdukt extends HttpServlet {

	private static final long serialVersionUID = 1L;
    public deleteProdukt() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
        
        dbProdukt produkt = new dbProdukt();
		produkt.deleteProdukt(id);
     
        request.getRequestDispatcher("/deleteProdukt.jsp").forward(request, response); 	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
