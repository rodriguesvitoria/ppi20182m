package agenda.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@WebServlet("/tchau")
public class NovaClasse extends HttpServlet{

		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			
			
			out.println("<html>");
	    	out.println("<body>");
	    	out.println("</body>");
	    	out.println("<h1>vitória</h1>");
	    	out.println("<p>ppi é legal!</p>");
	    	out.println("</html>");
		}

		}
		
		
	

