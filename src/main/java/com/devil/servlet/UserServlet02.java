package com.devil.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName：UserServlet
 *
 * @author: Devil
 * @Date: 2024/8/29
 * @Description:
 * @version: 1.0
 */
@WebServlet(name = "userServelt02",urlPatterns = "/userServlet01")
public class UserServlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求参数
        String username = req.getParameter("username");
        System.out.println(username);

        if("admin".equals(username)){
            resp.getWriter().print("YES");
        }else {
            resp.getWriter().print("NO");
        }
    }
}
