package iset.controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import iset.modele.*;
/**
 * Servlet implementation class AjoutServlet
 */
public class AjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AjoutServlet() {
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
		
		PrintWriter out = rs.getWriter();
		out.println ("<h3> Bonjour Mr "+ r.getParameter("nom")+"   "+r.getParameter("prenom")+"</h3>");
	
			
			String nom=r.getParameter("nom");
			String Prénom=r.getParameter("Prénom");
			String sex=r.getParameter("sex");
			String code=r.getParameter("code");
			Personne p=new Personne(nom,Prénom,sex,code);
			
			HttpSession session=r.getSession();	
			ArrayList<Personne> pre;
			pre = (ArrayList<Personne>)(session.getAttribute("Personne"));
			if(pre == null) {
				pre = new ArrayList<Personne>();
				pre.add(p);
			} else {
				pre.add(p);
			}
			 
					
			session.setAttribute("Personne", pre);

			 rs.sendRedirect("./Affichage.jsp");
		}

	
	}

