package controller.listing;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.housingunit.HousingUnitDTO;
import model.HousingUnit;

/**
 * Servlet implementation class addListingFormServlet
 */
@WebServlet("/addListingFormServlet")
public class addListingFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addListingFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HousingUnitDTO housingUnitDTO = new HousingUnitDTO();
		
		List<HousingUnit> allHousingUnits = housingUnitDTO.showAllHousingUnits();
		
		request.setAttribute("allHousingUnits", allHousingUnits);
		
		getServletContext().getRequestDispatcher("/addListing.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
