package ejemplos.servlet.curso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>Formulario con Servlets</title></head>");
		out.println("<body>");
		out.println("<form action='myServlet2' method='post'>");
		out.println("<h1>Actividad formulario mediante servlets</h1>");
		out.println("<label for='nombre'>Nombre:</label>");
		out.println("<input type='text' id='nombre' name='nombre' required='true'/>");
		out.println("<input type='submit' value='Enviar'/>");
		out.println("<br/><br/>");
		out.println("<p1>Haciendo click en Enviar, aceptas que la información proporcionada se gestione en el siguiente servlet</p1>");
		out.println("</form>");
		out.println("</body></html>");

		RequestDispatcher dispatcher = request.getRequestDispatcher("formulario_servlet.jsp");
		dispatcher.forward(request, response);
	}
}