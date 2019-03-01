package controller.neighborhood;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.schooldistrict.SchoolDistrictDTO;
import model.SchoolDistrict;

/**
 * Servlet implementation class addNeighborhoodFormServlet
 */
@WebServlet("/addNeighborhoodFormServlet")
public class addNeighborhoodFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addNeighborhoodFormServlet() {
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

		SchoolDistrictDTO schoolDistrictDTO = new SchoolDistrictDTO();
		List<SchoolDistrict> allSchoolDistricts = schoolDistrictDTO.showAllSchoolDistricts();
		request.setAttribute("allSchoolDistricts", allSchoolDistricts);
		getServletContext().getRequestDispatcher("/addNeighborhood.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
