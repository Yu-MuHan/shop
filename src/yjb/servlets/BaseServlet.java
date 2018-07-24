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
		description = "����servlet", 
		urlPatterns = { 
				"/BaseServlet", 
				"/q"
		})
public class BaseServlet extends HttpServlet {
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("servlet �ҽ�����");
		
		//�������
		request.setCharacterEncoding("utf-8");
		//��ȡ������
		String method=request.getParameter("method");
		//�ж��Ƿ�Ϸ�
		if(method==null||method.equals("")||method.trim().equals("")) {
			method="execute";
		}
		//����������෽��
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
		//��ת��ַ
		request.getRequestDispatcher(address).forward(request, response);
		
	}

}
