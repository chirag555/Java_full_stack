import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DetailsProcessing")
public class DetailsProcessing extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DetailsProcessing() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().println(request.getParameter("name"));
		response.getWriter().println(request.getParameter("gender"));
		String[] languages = request.getParameterValues("language");
		if (languages != null) {
			for (int i = 0; i < languages.length; i++) {
				response.getWriter().print(languages[i] + " ");
			}
		} else {
			response.getWriter().print("Nothing Selected");
		}
		response.getWriter().println(request.getParameter("country"));

	}

}
