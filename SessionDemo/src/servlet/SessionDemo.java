package servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public SessionDemo(){
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//	String action=request.getParameter("action");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action=request.getParameter("action");
			switch(action) {
			case "loginSubmit":authenticate(request,response);
				break;
				default:request.getRequestDispatcher("LoginJSP.jsp").forward(request, response);break;
			}
	}
	public void authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession(true);
			newSession.setMaxInactiveInterval(300);
			newSession.setAttribute("username",username);
			String encode=response.encodeURL(request.getContextPath());
			response.sendRedirect(encode+"/SessionDestroy?action=details");
			
		} else {
			response.sendRedirect(request.getContextPath()+"/SessionDestroy?action=login");
		}
	}
}
