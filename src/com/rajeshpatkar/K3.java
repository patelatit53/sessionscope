package com.rajeshpatkar;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "K3", urlPatterns = {"/K3"})
public class K3 extends HttpServlet {

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
            out.println("<title>Servlet K3</title>");
            out.println("</head>");
            out.println("<body>");
            HttpSession ses = request.getSession();
            String str = (String) ses.getAttribute("msg");
            ses.removeAttribute("msg");
            out.println(
                 "<h1>Servlet K3 Removes 'msg' Attribute <br>"
                 + " with value "+ str
                 + "<br>in Session Scope</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}