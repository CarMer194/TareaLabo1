package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String operator = request.getParameter("operation");
		int number1=Integer.parseInt(request.getParameter("usuario"));
		int number2=Integer.parseInt(request.getParameter("contraseña"));
		
		/*PrintWriter out= response.getWriter();
		
		if (operator.equals("sum")){
			int res=number1+number2;
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>"+"Resultado de "+number1+"+"+number2+"es: "+res+"</h3>");
			out.println("</body>");
			out.println("</html>");
		}else {
			int res=number1*number2;
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>"+"Resultado de "+number1+"+"+number2+"es: "+res+"</h3>");
			out.println("</body>");
			out.println("</html>");
		}*/
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String user=request.getParameter("usuario");
		String pass=request.getParameter("contraseña");
		PrintWriter out= response.getWriter();
				
		if(user.equals("Hola")) {
			if(pass.equals("1234")) {
				out.println("<html>");
				out.println("<body>");
				out.println("<h1>Acceso Correcto</h1>");
				out.println("</body>");
				out.println("</html>");
			}
		}else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Acceso Incorrecto</h1>");
			out.println("</body>");
			out.println("</html>");
		}
		
	}

}
