

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EX3 
 */
public class EX3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EX3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double moeda = Double.parseDouble(request.getParameter("moeda"));
		Double cambio = Double.parseDouble(request.getParameter("cambio"));
		Double conversao = moeda / cambio;
		PrintWriter saida = response.getWriter();
		saida.println("<html lang =\"pt-br\">"
				+ "<meta charset=\"UTF-8\">"
				+ "<body>"
				+ "<h1>Este é o valor da conversão " + conversao + " </h1>"
						+ "</body>"
						+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
