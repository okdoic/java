package tekitou;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class tekitou
 */
@WebServlet("/tekitou")
public class tekitou extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public tekitou() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setHeader("content-type;","yrxt/xml ;charset=UTF-8");
		response.setHeader("content-disponsition","attachment;filename=a.xml");
		PrintWriter out = response.getWriter();
		out.println("<?xml version='1.0' ?>"
				+ "<book>"
				+"<author>平坂読</author>"
				+"<title>僕は友達が多い</title>"
				+"<date>2015/8/26</date>"
				+"</book>");
		//out.println("...");
		//out.println("</html>");
		//.append("Served at: ").append(request.getContextPath());
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
