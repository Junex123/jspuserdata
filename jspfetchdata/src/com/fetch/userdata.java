package com.fetch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userdata
 */
@WebServlet("/register")
public class userdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userdata() {
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
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String name = request.getParameter("uname");
		String email = request.getParameter("uemail");
		String pass = request.getParameter("upass");
		String dob = request.getParameter("udob");
		String gender = request.getParameter("ugender");
		String country = request.getParameter("ucountry");
		String hob[] = request.getParameterValues("uhob");
		
		out.print("Name:: " + name + "<br/><br/>");
		out.print("Email_id:: " + email + "<br/><br/>");
		out.print("Password:: " + pass + "<br/><br/>");
		out.print("Date of birth:: " + dob + "<br/><br/>");
		out.print("Gender:: " + gender + "<br/><br/>");
		out.print("Country:: " + country + "<br/><br/>");
        if(hob!=null && hob.length!=0) {
        	for(int i=0;i<hob.length;i++) {
        		out.print("Hobbies:: " + hob[i] + "<br/><br/>");
        	}
        }
		
	}

}
