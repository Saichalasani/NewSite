

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServ
 */ 
@WebServlet("/HomeServ")
public class HomeServ extends HttpServlet {
private static final long serialVersionUID = 1L;
//
//    /**
//     * Default constructor. 
//     */
//    public HomeServ() {
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
////		String cssLocation = request.getContextPath() + "/WebContent/css/Css.css";
////	    String cssTag = "<link rel='Css' type='text/css' href='" + cssLocation + "'>";
//		String name=request.getParameter("user");
//		out.print("<HTML>");
//		out.println("<HEAD>Hello "+name+ " Welcome to my new website</Head>");
//		out.print("<BODY background='../Yosmite.jpg' alt='image';>");
//		out.print("Hurrey...........");
//		out.print("</BODY>");
//		out.print("</HTML>");
//		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		out.close();
//	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		String name=request.getParameter("user");
		//System.out.println("name: " +name);
		PrintWriter write=response.getWriter();
		write.println("<HTML>");
		write.println("<head>");
		write.println("<title> Welcome </title>");
		write.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +  "/Css.css' />");
		write.println("</head>");
		write.println("<body id='bd'>");
		write.println("<h1>Hello "+name+" welcome</h1>");
		write.println("<div id='wrapper'>");
		write.println("<form action='' method='post' id='form1'");
		write.println("<table>");
		write.println("<tr><td><label>What's your favorate color:</label></td><td><select><option value='op'>Select Options</option>"+"<option value='red'>Red</option>"+"<option value='green'>Green</option>"+"<option value='white'>White</option>"+"<option value='black'>Black</option></select><br><br></td></tr>");
		write.println("<tr><td><label>What's your favorate Country:</label></td><td><select><option value='op'>Select Options</option>"+"<option value='USA'>United States</option>"+"<option value='INA'>India</option>"+"<option value='pak'>Pakistan</option></select><br><br></td></tr>");
		write.println("<tr><td><label>Do you like travaling:</label></td><td><select><option value='op'>Select Options</option>"+"<option value='yes'>Yes</option>"+"<option value='no'>No</option></select><br><br></td></tr>");
		write.println("<tr><td><label>What's your favorate Sport:</label></td><td><select><option value='op'>Select Options</option>"+"<option value='crick'>Cricket</option>"+"<option value='socc'>Soccer</option>"+"<option value='Badm'>Badminton</option>"+"<option value='chess'>Chess</option>"+"<option value='volly'>Volly Ball</option></select><br><br></td></tr>");
		write.println("<input type='button' value='Submit' onclick='myFunction()'>");
		write.println("</table>");
		write.println("</form>");
		write.println("</div>");
		write.println("<footer>");
		write.println("<p>Copyright &copy; 2017. All Rights Reserved.</p>");
		write.println("</footer>");
		write.println("</HTML>");
		write.close();
	}
}
