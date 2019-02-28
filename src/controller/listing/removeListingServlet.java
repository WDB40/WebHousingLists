package controller.listing;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class removeListingServlet
 */
@WebServlet("/removeListingServlet")
public class removeListingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeListingServlet() {
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
		
		ListingDTO listingDTO = new ListingDTO();
		
		try {
			int listingId = Integer.parseInt(request.getParameter("id"));
			listingDTO.removeListing(listingDTO.getListingById(listingId));
			getServletContext().getRequestDispatcher("/viewAllListingsServlet").forward(request, response);
		} catch (NumberFormatException exception) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
		
	}

}
