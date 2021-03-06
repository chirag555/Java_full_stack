import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("page");
		if (name.equalsIgnoreCase("login")) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
		} else if (name.equalsIgnoreCase("signup")) {
			getServletContext().getRequestDispatcher("/SignUp.jsp").forward(request, response);
		} else if (name.equalsIgnoreCase("about")) {
			getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
		} else {
			getServletContext().getRequestDispatcher("/ErrorFile.jsp").forward(request, response);

		}
	}

}
