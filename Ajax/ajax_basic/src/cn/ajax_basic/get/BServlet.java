package cn.ajax_basic.get;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author Yorick
 * 2018年9月22日
 * theme:服务器响应text/xml
 */
public class BServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/xml;charset=utf-8");
		String xml = "<students>" + "<student number='Yorick'>" + 
					"<name>Yorick</name>" + "<age>18</age>" + 
					"<sex>male</sex>" +
					"</student>" +
					"</students>";
		System.out.println(req.getParameter("name"));
		resp.getWriter().print(xml);
	}
}
