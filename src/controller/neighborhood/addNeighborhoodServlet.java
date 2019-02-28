package controller.neighborhood;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Neighborhood;

/**
 * Servlet implementation class addNeighborhoodServlet
 */
@WebServlet("/addNeighborhoodServlet")
public class addNeighborhoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addNeighborhoodServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		NeighborhoodDTO neighborhoodDTO = new NeighborhoodDTO();
		Neighborhood neighborhood = new Neighborhood();

		try {

			String neighborhoodName = request.getParameter("neighborhoodName");
			int schoolDistrictId = Integer.parseInt(request.getParameter("SchoolDistrictID"));

			neighborhood.setNeighborhoodName(neighborhoodName);
			neighborhood.setSchoolDistrictId(schoolDistrictId);

			neighborhoodDTO.addNeighborhood(neighborhood);

			getServletContext().getRequestDispatcher("/index.html").forward(request, response);

		} catch (NumberFormatException exception) {
			getServletContext().getRequestDispatcher("/addNeighborhood.jsp").forward(request, response);
		}
	}

}
