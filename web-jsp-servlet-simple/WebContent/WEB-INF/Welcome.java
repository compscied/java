import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Welcome extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		doPost(request, response);
	}

public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  out.write("<html><head><title>Integer Increment </title></head>\n");
  out.write("<body>\n");

  String name = request.getParameter("name");

  int v = 0;
  try { 
	v = Integer.parseInt(request.getParameter("intval"))+1; 
  }
  catch (Exception e) {
	v = 0; 
  }

  out.write("\n");
  out.write("<form method=\"post\" action=\"welcome\">\n");
  out.write("<input type=\"hidden\" name=\"name\" value=\"");
  out.print(name);
  out.write("\">\n");
  out.write("Now enter an integer: <input type=\"text\" name=\"intval\" value=\"");
  out.print(v);
  out.write("\"/>\n");
  out.write("<br/>\n");
  out.write("<input type=\"submit\" value=\"Submit\"/>\n");
  out.write("\n");
  out.write("</body>\n");
  out.write("</html>\n");
}

}
