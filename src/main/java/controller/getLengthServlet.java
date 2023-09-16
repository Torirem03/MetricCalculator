package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LengthConverter;

/**
 * Servlet implementation class getLengthServlet
 */
@WebServlet("/getLengthServlet")
public class getLengthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getLengthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userLength = request.getParameter("userLength");
		
		LengthConverter userResults = new LengthConverter(Double.parseDouble(userLength));
		
		request.setAttribute("userLengthResults", userResults);
		getServletContext().getRequestDispatcher("/lengthResults.jsp").forward(request, response);
	}

}
