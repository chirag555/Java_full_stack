package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SessionDestroy
 */
@WebServlet("/SessionDestroy")
public class SessionDestroy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionDestroy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String action=request.getParameter("action");
	switch(action) {
	case "destroy":request.getSession().invalidate();
					request.getRequestDispatcher("LoginJSP.jsp").forward(request, response);
					break;
	case "login":request.getRequestDispatcher("LoginJSP.jsp").forward(request, response);break;
	case "details":request.getRequestDispatcher("Details.jsp").forward(request, response);break;
	default:response.sendRedirect("www.google.com");break;
	}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
