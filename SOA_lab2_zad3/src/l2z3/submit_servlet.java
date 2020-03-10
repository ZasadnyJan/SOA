package l2z3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;

@WebServlet(name = "submit_servlet")
public class submit_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String comment=request.getParameter("comment");

        FileWriter fw=new FileWriter("C:\\Users\\QCXM38\\Documents\\SOA\\SOA_lab2_zad3\\wpisy.txt", true);
        fw.write(name+";"+email+";"+comment+"\n");
        fw.close();

        RequestDispatcher rd=request.getRequestDispatcher("login_servlet");
        rd.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
