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

@WebServlet(name = "K2", urlPatterns = {"/K2"})
public class K2 extends HttpServlet {

    @Override
    public void service(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet K2</title>");
            out.println("</head>");
            out.println("<body>");
            HttpSession ses = request.getSession();
            String str = (String) ses.getAttribute("msg");
            out.println(
                 "<h1>Servlet K2 Reads value <br>"
                 + str
                 + "<br>of 'msg' attribute in Session Scope</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}