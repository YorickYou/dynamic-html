/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2018-09-24 20:24:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class json2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>xml和json的传输与解析</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("window.onload = function() {//文档加载完毕后执行\r\n");
      out.write("\tvar btn1 = document.getElementById(\"xml\");\r\n");
      out.write("\tvar btn2 = document.getElementById(\"json\");\r\n");
      out.write("\tbtn1.onclick = function() {//给按钮的点击事件注册监听\r\n");
      out.write("\t\tajax({\r\n");
      out.write("\t\t\turl:\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\",\r\n");
      out.write("\t\t\tparams:\"name=Yorick\",\r\n");
      out.write("\t\t\tmethod:\"POST\",\r\n");
      out.write("\t\t\ttype:\"xml\",\r\n");
      out.write("\t\t\tcallback:function(data){\r\n");
      out.write("\t\t\t\tvar ele = data.getElementsByTagName(\"student\")[0];\r\n");
      out.write("\t\t\t\tvar number = ele.getAttribute(\"number\");//获取元素名为number的属性值\r\n");
      out.write("\t\t\t\tvar name;\r\n");
      out.write("\t\t\t\tvar age;\r\n");
      out.write("\t\t\t\tvar sex;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 处理浏览器的差异\r\n");
      out.write("\t\t\t\tif(window.addEventListener) {\r\n");
      out.write("\t\t\t\t\tname = ele.getElementsByTagName(\"name\")[0].textContent;//其他浏览器\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tname = ele.getElementsByTagName(\"name\")[0].text;//IE支持\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(window.addEventListener) {\r\n");
      out.write("\t\t\t\t\tage = ele.getElementsByTagName(\"age\")[0].textContent;//其他浏览器\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tage = ele.getElementsByTagName(\"age\")[0].text;//IE支持\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(window.addEventListener) {\r\n");
      out.write("\t\t\t\t\tsex = ele.getElementsByTagName(\"sex\")[0].textContent;//其他浏览器\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tsex = ele.getElementsByTagName(\"sex\")[0].text;//IE支持\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar text = number + \", \" + name + \", \" + age + \", \" + sex;\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"h1\").innerHTML = text;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t};\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("<h1 id=\"h1\"></h1>\r\n");
      out.write("<button id=\"xml\">单击1</button>\r\n");
      out.write("<button id=\"json\">单击2</button>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /json2.jsp(18,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/ajax-lib/ajaxutils.js");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /json2.jsp(26,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/XMLServlet");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }
}