package Servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Inicio extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Página de inicio</title></head>");
        out.println("<body>");
        out.println("<h1>Bienvenido a mi página de inicio</h1>");
        out.println("<p>Este es un servlet de inicio en funcionamiento.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}