import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "srednia_servlet")
public class srednia_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("windows-1250");
        PrintWriter out=response.getWriter();
        int l1 = Integer.parseInt(request.getParameter("l1"));
        int l2 = Integer.parseInt(request.getParameter("l2"));
        int l3 = Integer.parseInt(request.getParameter("l3"));
        int l4 = Integer.parseInt(request.getParameter("l4"));
        int l5 = Integer.parseInt(request.getParameter("l5"));

        double sr=(double)(l1+l2+l3+l4+l5)/5;
        out.println("<html>");
        out.println("<head><title>Średnia</title></head>");
        out.println("<body>");
        out.println("<p>Średnia wynosi: "+sr+" </p>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
