package projetorestcomjakartaegradle.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/meuprimeiroservlet")
public class MeuPrimeiroServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("Metodo doGet do servlet rodou...");
		//super.doGet(req, resp); sempre retire isso daqui
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp); sempre retire isso daqui
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doDelete(req, resp); sempre retire isso daqui
	}

	
	
	
}

//
//Getting Information from Requests
//
//A request contains data passed between a client and the servlet. All requests implement the ServletRequest interface. This interface defines methods for accessing the following information:
//
//    Parameters, which are typically used to convey information between clients and servlets
//
//    Object-valued attributes, which are typically used to pass information between the web container and a servlet or between collaborating servlets
//
//    Information about the protocol used to communicate the request and about the client and server involved in the request
//
//    Information relevant to localization
//
//You can also retrieve an input stream from the request and manually parse the data. To read character data, use the BufferedReader object returned by the request’s getReader method. To read binary data, use the ServletInputStream returned by getInputStream.
//
//HTTP servlets are passed an HTTP request object, HttpServletRequest, which contains the request URL, HTTP headers, query string, and so on. An HTTP request URL contains the following parts:
//
//http://[host]:[port][request-path]?[query-string]
//
