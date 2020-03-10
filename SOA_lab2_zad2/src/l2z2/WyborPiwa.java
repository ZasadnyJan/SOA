package l2z2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "WyborPiwa")
public class WyborPiwa extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EkspertPiwny ekspert=new EkspertPiwny(request.getParameter("kolory"));
        request.setAttribute("marka", ekspert.decyzja());

        request.getRequestDispatcher("/WEB-INF/wynik.jsp").forward(request, response);
    }
}
