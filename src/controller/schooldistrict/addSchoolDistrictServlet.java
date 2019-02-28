package controller.schooldistrict;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SchoolDistrict;

/**
 * Servlet implementation class addSchoolDistrictServlet
 */
@WebServlet("/addSchoolDistrictServlet")
public class addSchoolDistrictServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addSchoolDistrictServlet() {
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

		SchoolDistrictDTO schoolDistrictDTO = new SchoolDistrictDTO();
		SchoolDistrict schoolDistrict = new SchoolDistrict();

		try {

			String districtName = request.getParameter("districtName");
			double rating = Double.parseDouble(request.getParameter("rating"));

			schoolDistrict.setDistrictName(districtName);
			schoolDistrict.setRating(rating);

			schoolDistrictDTO.addSchoolDistrict(schoolDistrict);

			getServletContext().getRequestDispatcher("/index.html").forward(request, response);

		} catch (NumberFormatException exception) {
			getServletContext().getRequestDispatcher("/addSchoolDistrict.jsp").forward(request, response);
		}

	}

}
