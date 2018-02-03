package com.rajeshpatkar;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "K1", urlPatterns = {"/K1"})
public class K1 extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, 
                        HttpServletResponse response)
                        throws ServletException, 
                        IOException 
    {
        response.setContentType(
                  "text/html;charset=UTF-8"
        );
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet K1</title>"); 
            out.println("</head>");
            out.println("<body>");
            String str = request.getParameter("msg");
            HttpSession ses = request.getSession();
            out.println(
               "<h1> Servlet K1 recieved session with Id"
               + ses.getId()
            );
            ses.setAttribute("msg",str);
            out.println(
                  "<h1>Servlet K1 Recieved -->"+ 
                  str+
                  "</h1>"
            );
            String msgvalue = 
                      (String)ses.getAttribute("msg");
            out.println(
               "<h1>msg attribute in Session has value ->"
               + msgvalue
                +"</h1>"
            );
            out.println("</body>");
            out.println("</html>");
        }
    }

}