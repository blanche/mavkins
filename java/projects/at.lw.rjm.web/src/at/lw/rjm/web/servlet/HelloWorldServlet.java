package at.lw.rjm.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import at.lw.rjm.base.HelloWorldBase;


@WebServlet("/")
public class HelloWorldServlet extends HttpServlet  {

	HelloWorldBase base = new HelloWorldBase();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		printHeader(out);
		out.println("<body>");
		out.println("<h1>Hello World!</h1>");

		out.println("I am " + base.getComputerName());

		out.println("</body>");
		out.println("</html>");
	}

	private void printHeader(PrintWriter out) {
		out.println("<head>");
		out.println("<title>Hello World!</title>");
		out.println("</head>");
	}
}
