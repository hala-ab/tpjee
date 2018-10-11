package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetierImplement;
import model.Model;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {

	public ServletController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Model model = new Model(); 
		request.setAttribute("hala", model);
		request.getRequestDispatcher("vue.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
		double taux = Double.parseDouble(request.getParameter("taux"));
		double duree = Double.parseDouble(request.getParameter("duree"));
		double montant = Double.parseDouble(request.getParameter("montant"));

		Model model = new Model();

		model.setTaux(taux);
		model.setDuree(duree);
		model.setMontant(montant);
		CreditMetierImplement metier = new CreditMetierImplement();
		double r = metier.CalculerMensualiteCredit(montant, duree, taux);
		model.setMensualite(r);

		request.setAttribute("hala", model);
		request.getRequestDispatcher("vue.jsp").forward(request, response);
	}

}
