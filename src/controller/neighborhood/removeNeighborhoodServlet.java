package controller.neighborhood;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class removeNeighborhoodServlet
 */
@WebServlet("/removeNeighborhoodServlet")
public class removeNeighborhoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public removeNeighborhoodServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		NeighborhoodDTO neighborhoodDTO = new NeighborhoodDTO();

		try {
			int neighborhoodId = Integer.parseInt(request.getParameter("id"));
			neighborhoodDTO.removeNeighborhood(neighborhoodDTO.getNeighborhoodById(neighborhoodId));
			getServletContext().getRequestDispatcher("/viewAllNeighborhoodsServlet").forward(request, response);
		} catch (NumberFormatException exception) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}

	}

}
