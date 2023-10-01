package gerenciadorservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("cadastrando nova empresa");
		String nomeEmpresa = req.getParameter("nome");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Empresa " + nomeEmpresa + " cadastrada com sucesso");
		out.println("</body>");
		out.println("</html>");
	}

}
