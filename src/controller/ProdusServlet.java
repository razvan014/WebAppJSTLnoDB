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
 * Servlet implementation class ProdusServlet
 */
public class ProdusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// o sa faca afisarea produsului
		// primeste ca parametru pe request id-ul produsului
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		Produs produs = Service.getProdusDupaId(id);
		
		// punem produsul pe request ca atribut
		request.setAttribute("produs", produs);
		
		// dam forward
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/detalii.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
