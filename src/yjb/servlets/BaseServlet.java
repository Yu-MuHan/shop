package yjb.servlets;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class BaseServlet
 */
@WebServlet(
		description = "基本servlet", 
		urlPatterns = { 
				"/BaseServlet", 
				"/q"
		})
public class BaseServlet extends HttpServlet {
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("servlet 我进来了");
		
		//解决乱码
		request.setCharacterEncoding("utf-8");
		//获取方法名
		String method=request.getParameter("method");
		//判断是否合法
		if(method==null||method.equals("")||method.trim().equals("")) {
			method="execute";
		}
		//反射调用子类方法
		String address="404.jsp";
		try {
			Method m=this.getClass().getMethod(method, ServletRequest.class,ServletResponse.class);
			address=(String) m.invoke(this, request,response);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//跳转地址
		request.getRequestDispatcher(address).forward(request, response);
		
	}

}
