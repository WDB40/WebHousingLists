package controller.housingunit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.neighborhood.NeighborhoodDTO;
import model.HousingUnit;
import model.Neighborhood;

/**
 * Servlet implementation class addHousingUnitServlet
 */
@WebServlet("/addHousingUnitServlet")
public class addHousingUnitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addHousingUnitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HousingUnitDTO housingUnitDTO = new HousingUnitDTO();
		HousingUnit housingUnit = new HousingUnit();
		NeighborhoodDTO neighborhoodDTO = new NeighborhoodDTO();
		
		try {
			int streetNumber = Integer.parseInt(request.getParameter("streetNumber"));
			String streetName = request.getParameter("streetName");
			int unitNumber = Integer.parseInt(request.getParameter("unitNumber"));
			String city = request.getParameter("city");
			int zipcode = Integer.parseInt(request.getParameter("zipcode"));
			String state = request.getParameter("state");
			int tempNeighborhoodId = Integer.parseInt(request.getParameter("neighborhood"));
			Neighborhood neighborhood = neighborhoodDTO.getNeighborhoodById(tempNeighborhoodId);
			
			housingUnit.setStreetNumber(streetNumber);
			housingUnit.setStreetName(streetName);
			housingUnit.setUnitNumber(unitNumber);
			housingUnit.setCity(city);
			housingUnit.setZipcode(zipcode);
			housingUnit.setState(state);
			housingUnit.setNeighborhood(neighborhood);
			
			housingUnitDTO.addHousingUnit(housingUnit);
			
			getServletContext().getRequestDispatcher("/index.html").forward(request,response);
			
		} catch (NumberFormatException exception) {
			getServletContext().getRequestDispatcher("/addHousingUnit.jsp").forward(request, response);
		}
		
		
	}

}
