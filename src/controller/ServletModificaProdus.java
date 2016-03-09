package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produs;
import model.Service;

/**
 * Servlet implementation class ServletModificaProdus
 */
public class ServletModificaProdus extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		Produs produs = Service.getProdusDupaId(id);
		request.setAttribute("produs", produs);
		
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/modifica.jsp");
		disp.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idString = request.getParameter("id");
		String denumire = request.getParameter("denumire");
		String pretString = request.getParameter("pret");
		String descriere = request.getParameter("descriere");
		
		double pret = 0.0;
		int id = Integer.parseInt(idString);
		try {
			pret = Double.parseDouble(pretString.trim());
		} catch (NumberFormatException e) {
			
			//ii dam mesaj si facem forward
			request.setAttribute("mesaj", "Pretul nu are formatul corect");
			RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/modifica.jsp");
			disp.forward(request, response);
			e.printStackTrace();
		}
		
		// facem actualizarea
		Produs produs = Service.getProdusDupaId(id);
		produs.setDenumire(denumire);
		produs.setPret(pret);
		produs.setDescriere(descriere);
	
		//ii dam mesaj ca s-a actualizat produsul si facem forward
		request.setAttribute("mesaj", "Produsul a fost actualizat");
		//request.setAttribute("", arg1);
		RequestDispatcher disp = request.getRequestDispatcher("/WEB-INF/modifica.jsp");
		disp.forward(request, response);
	}

}
