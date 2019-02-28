package controller.listing;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.housingunit.HousingUnitDTO;
import model.Listing;

/**
 * Servlet implementation class addListingServlet
 */
@WebServlet("/addListingServlet")
public class addListingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addListingServlet() {
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
		ListingDTO listingDTO = new ListingDTO();
		
		Listing listing = new Listing();
		
		try {
			int housingUnitId = Integer.parseInt(request.getParameter("housingUnit"));
			double price = Double.parseDouble(request.getParameter("price"));
			LocalDate listDate = LocalDate.parse(request.getParameter("listDate"));
			
			listing.setHousingUnit(housingUnitDTO.getHousingUnitById(housingUnitId));
			listing.setPrice(price);
			listing.setListDate(listDate);
			
			listingDTO.addListing(listing);
			
			getServletContext().getRequestDispatcher("/viewAllListingsServlet").forward(request, response);
			
		} catch (NumberFormatException exception) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		} catch (DateTimeParseException exception) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
	}

}
