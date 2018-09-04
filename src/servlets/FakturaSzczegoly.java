package servlets;

import database.dbFakturaSzczegoly;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FakturaSzczegoly")
public class FakturaSzczegoly extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public FakturaSzczegoly() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");

        dbFakturaSzczegoly fakturaSzczegoly = new dbFakturaSzczegoly();
        List<ORM.FakturaSzczegoly> fakturySzczegoly = fakturaSzczegoly.selectFakturySzczegoly(id);

        request.getServletContext().setAttribute("fakturySzczegoly", fakturySzczegoly);
        request.getRequestDispatcher("/FakturaSzczegoly.jsp").forward(request, response);
    }
}