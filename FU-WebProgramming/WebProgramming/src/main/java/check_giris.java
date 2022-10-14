import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/check_giris"})
public class check_giris extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String username=request.getParameter("username");
            String password=request.getParameter("password");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");

            
            
            if(username.equals("admin") && password.equals("123") && request.getParameter("yonetici")!=null)
            out.println("---- Yönetici olarak giriş yapıldı.");
            
            else if(username.equals("scholar") && password.equals("456") && request.getParameter("bursiyer")!=null)
            out.println("---- Bursiyer olarak giriş yapıldı.");
            
            else if(username.equals("user") && password.equals("789") && request.getParameter("kullanici")!=null)
            out.println("---- Kullanici olarak giriş yapıldı.");
            
            else
                response.sendRedirect("FinalSorusu_2.html");
            
            out.println("Kullanıcı Adı:"+username+"<br>");
            out.println("Parola"+password+"<br>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}
