import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/WebProgramming/FinalSorusu6_VIEW"})
public class FinalSorusu6_VIEW extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[]values=request.getParameterValues("dersler");

        try(PrintWriter out=response.getWriter()){
            out.println("<!DOCTYPE Html>");
            out.println("<html>");
                out.println("<head>");
                out.println("</head>");
                
                out.println("<body>");

                if(values.length>3)
                    out.println("<h3>FAZLA DERS SECTINIZ!</h3>");
                else
                    out.println("<h3>Ders ekleme islemi basariyla gerceklestirilmistir.</h3>");
                
                
                
                out.println("</body>");
            out.println("</html>");
            
        }
        
    }


}
