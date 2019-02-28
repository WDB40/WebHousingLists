package controller.housingunit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.neighborhood.NeighborhoodDTO;

/**
 * Servlet implementation class housingUnitActionServlet
 */
@WebServlet("/housingUnitActionServlet")
public class housingUnitActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public housingUnitActionServlet() {
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
		String action = request.getParameter("action");
		
		if(action.equals("Add")) {
			getServletContext().getRequestDispatcher("/addHousingUnitFormServlet").forward(request, response);
		} else if(action.equals("Remove")) {
			getServletContext().getRequestDispatcher("/removeHousingUnitServlet").forward(request, response);
		} else if(action.equals("Update")) {
			
			try {
				NeighborhoodDTO neighborhoodDTO = new NeighborhoodDTO();
				request.setAttribute("allNeighborhoods", neighborhoodDTO.showAllNeighborhoods());
				
				if(neighborhoodDTO.showAllNeighborhoods().isEmpty()) {
					request.setAttribute("allNeighborhoods", " ");
				}
				
				int housingUnitId = Integer.parseInt(request.getParameter("id"));
				request.setAttribute("housingUnit", housingUnitDTO.getHousingUnitById(housingUnitId));
				
				getServletContext().getRequestDispatcher("/updateHousingUnit.jsp").forward(request, response);
				
			} catch (NumberFormatException exception) {
				getServletContext().getRequestDispatcher("/index.html").forward(request, response);
			}
		}
	}

}
