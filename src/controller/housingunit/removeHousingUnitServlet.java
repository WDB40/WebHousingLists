package controller.housingunit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class removeHousingUnitServlet
 */
@WebServlet("/removeHousingUnitServlet")
public class removeHousingUnitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeHousingUnitServlet() {
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
		
		try {
			int housingUnitId = Integer.parseInt(request.getParameter("id"));
			housingUnitDTO.removeHousingUnit(housingUnitDTO.getHousingUnitById(housingUnitId));
			getServletContext().getRequestDispatcher("/viewAllHousingUnitsServlet").forward(request, response);
		} catch (NumberFormatException exception) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
	}

}
