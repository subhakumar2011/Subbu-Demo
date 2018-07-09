package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;



/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	//This is for documentation
	private static final long serialVersionUID = 1L;
	static final  Logger log=Logger.getLogger(Hello.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		try {
			String s="hsdfew";
			if(s.isEmpty())
				out.println("String is empty");
			else
				out.println("String has data");
		log.info("Hello servlet started");
		log.debug("hello servlet debugginh");
		
		log.error("error message");
		out.println("Hello servlet");
		out.println(response.getLocale());
		out.println(response.getBufferSize());
		out.println(response.getClass().getName()+"\n\n");
		out.println(response.getHeaderNames());
		out.println(request.getServerPort());
		out.println(request.getMethod());
		out.println(request.getContextPath());
		out.println(request.getRequestedSessionId());
		out.println(request.getLocalAddr());
		Collection col=response.getHeaderNames();
		Iterator it=col.iterator();
		while(it.hasNext())
		{
			out.println(it.next());
			
		}
		out.println(response.getBufferSize());
		}
		catch(Exception e)
		{
			out.println(e.getMessage());
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
