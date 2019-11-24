package monocontrol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Verification2
 */
public class Verification2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Verification2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest r, HttpServletResponse rs) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(r, rs);
		
		PrintWriter out=rs.getWriter();
		String login=r.getParameter("login");
		if (login.equals("admin"))
				{
				out.println ("<b> Bonjour Mr "+ r.getParameter("nom")+r.getParameter("prenom")+"vous êtes bien l'administrateur</b>");}
		else {
			
			out.print("ce n'est pas l'administrateur");
		}
		
		out.println ("<b> Bonjour Mr "+ r.getParameter("nom")+r.getParameter("prenom")+"vous êtes bien l'administrateur</b>");
		
	}

}
