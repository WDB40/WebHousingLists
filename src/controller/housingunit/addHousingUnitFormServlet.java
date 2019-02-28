package controller.housingunit;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.neighborhood.NeighborhoodDTO;
import model.Neighborhood;

/**
 * Servlet implementation class addHousingUnitFormServlet
 */
@WebServlet("/addHousingUnitFormServlet")
public class addHousingUnitFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addHousingUnitFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		NeighborhoodDTO neighborhoodDTO = new NeighborhoodDTO();
		
		List<Neighborhood> allNeighborhoods = neighborhoodDTO.showAllNeighborhoods();
		
		request.setAttribute("allNeighborhoods", allNeighborhoods);
		
		getServletContext().getRequestDispatcher("/addHousingUnit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
