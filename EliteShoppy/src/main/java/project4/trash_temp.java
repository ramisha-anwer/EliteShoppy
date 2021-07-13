package project4;

import java.io.FileWriter;



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.FileReader;


	public class trash_temp extends HttpServlet {
	    public  void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	  
	    PrintWriter out= res.getWriter();
	   String line;
	   String search= req.getParameter("search");
       
	   if(search.equals("men c") || search.equals("men cl") || search.equals("men clo")|| search.equals("men clot")|| search.equals("men cloth")|| search.equals("men clothi")|| search.equals("men clothin")|| search.equals("men clothing")) {
		   out.print("clothes ");
	   }
	   else if(search.equals("men b") || search.equals("men ba") || search.equals("men bag")|| search.equals("men bags")) {
		   out.print("bag ");
	   }
	   else if(search.equals("men f") || search.equals("men fo") || search.equals("men foo")|| search.equals("men foot")|| search.equals("men footw")|| search.equals("men footwe")|| search.equals("men footwea")|| search.equals("men footwear")) {
		   out.print("foot ");
	   }
	   else if(search.equals("men w") || search.equals("men wa") || search.equals("men wat")|| search.equals("men watc")|| search.equals("men watch")|| search.equals("men watche")|| search.equals("men watches")) {
		   out.print("watch ");
	   }
	   else if(search.equals("women c") || search.equals("women cl") || search.equals("women clo")|| search.equals("women clot")|| search.equals("women cloth")|| search.equals("women clothi")|| search.equals("women clothin")|| search.equals("women clothing")) {
		   out.print("clothes ");
	   }
	   else if(search.equals("women b") || search.equals("women ba") || search.equals("women bag")|| search.equals("women bags")) {
		   out.print("bag ");
	   }
	   else if(search.equals("women f") || search.equals("women fo") || search.equals("women foo")|| search.equals("women foot")|| search.equals("women footw")|| search.equals("women footwe")|| search.equals("women footwea")|| search.equals("women footwear")) {
		   out.print("foot ");
	   }
	   else if(search.equals("women w") || search.equals("women wa") || search.equals("women wat")|| search.equals("women watc")|| search.equals("women watch")|| search.equals("women watche")|| search.equals("women watches")) {
		   out.print("watch ");
	   }
	   else {
		   out.print(" none");
	   }
}}
        