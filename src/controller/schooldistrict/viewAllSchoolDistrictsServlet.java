package controller.schooldistrict;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewAllSchoolDistrictsServlet
 */
@WebServlet("/viewAllSchoolDistrictsServlet")
public class viewAllSchoolDistrictsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public viewAllSchoolDistrictsServlet() {
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

		request.setAttribute("allSchoolDistricts", schoolDistrictDTO.showAllSchoolDistricts());

		if (schoolDistrictDTO.showAllSchoolDistricts().isEmpty()) {
			request.setAttribute("allSchoolDistricts", " ");
		}

		getServletContext().getRequestDispatcher("/viewAllSchoolDistricts.jsp").forward(request, response);
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
