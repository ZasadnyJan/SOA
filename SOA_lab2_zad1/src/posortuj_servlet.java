import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

@WebServlet(name = "posortuj_servlet")
public class posortuj_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("windows-1250");
        PrintWriter out=response.getWriter();

        Enumeration names=request.getParameterNames();

        ArrayList<Double> numbers=new ArrayList<>();

        boolean non_number=false;

        while(names.hasMoreElements() && non_number==false){
            String this_name=(String) names.nextElement();

            String this_number=request.getParameter(this_name);

            if (this_number.matches("-?\\d+(\\.\\d+)?")){
                numbers.add(Double.parseDouble(this_number));
            }
            else {
                non_number=true;
            }
        }
        out.println("<html>");
        out.println("<head><title>Posortuj</title></head>");
        out.println("<body>");

        if(non_number==true){
            out.println("<p>Co najmniej jeden z podanych argumentów nie jest liczbą!</p>");

        }
        else{
            Collections.sort(numbers);
            out.println("<p>Posortowane liczby: ");
            for(int i=0;i<numbers.size();i++){
                out.print(numbers.get(i)+", ");
            }
            out.print(" </p>");

        }
        out.println("</body>");
        out.println("</html>");
        out.close();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
