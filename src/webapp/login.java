package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("doPost-version:");
        out.print("login: " + request.getParameter("login") + "password: " + request.getParameter("password"));

        request.setAttribute("user", request.getParameter("login"));
        request.setAttribute("password", request.getParameter("password"));

        request.getRequestDispatcher("/welcome.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("doGet-version:");
        out.print("login: " + request.getParameter("login") + "password: " + request.getParameter("password"));

    }
}
