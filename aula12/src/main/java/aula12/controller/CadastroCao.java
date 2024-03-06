package aula12.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import aula12.model.Animal;
import aula12.model.Cao;
import aula12.repositorio.RepositorioCao;

public class CadastroCao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastroCao() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nomeCao");
		String raca = request.getParameter("racaCao");
		String sexo = request.getParameter("sexoCao");
		Animal cao = new Cao(nome,sexo,raca);
		
		try {
			cao.validar();
			
			RepositorioCao rep = new RepositorioCao();
			rep.incluir((Cao)cao);
			
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/sucesso.jsp");
			rd.forward(request, response);
			
		}catch(Exception e) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/cadastro_cao.jsp");
			rd.forward(request, response);
		}
	}

}
