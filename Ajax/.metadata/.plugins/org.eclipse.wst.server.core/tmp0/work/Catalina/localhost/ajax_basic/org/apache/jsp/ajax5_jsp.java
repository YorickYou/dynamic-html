/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2018-09-22 22:36:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class ajax5_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>省市联动</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var xmlHttp;\r\n");
      out.write("function createXMLHttpRequest() {\r\n");
      out.write("\tif(window.XMLHttpRequest){\r\n");
      out.write("\t\t//适用于DOM2浏览器\r\n");
      out.write("\t\txmlHttp = new XMLHttpRequest();\r\n");
      out.write("\t}else if (window.ActiveXObject) {\r\n");
      out.write("\t\ttry {\r\n");
      out.write("\t\t\txmlHttp = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("\t\t} catch (e) {\r\n");
      out.write("\t\t\t// 适用于IE5.5，以及IE更早版本\r\n");
      out.write("\t\t\ttry{\r\n");
      out.write("\t\t\t\txmlHttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t} catch (e){\r\n");
      out.write("                 alert(\"对不起您使用的浏览器版本暂不支持Ajax，请您更换浏览器重试，或升级浏览器！\");\r\n");
      out.write("                 throw e;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("//文档加载完成后,加载所有的省份信息\r\n");
      out.write("window.onload = function () {\r\n");
      out.write("\tcreateXMLHttpRequest();\r\n");
      out.write("\txmlHttp.open(\"GET\",\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\",true);\r\n");
      out.write("\txmlHttp.send(null);\r\n");
      out.write("\txmlHttp.onreadystatechange = province;\r\n");
      out.write("}\r\n");
      out.write("//本方法获取服务器响应的所有省份的名称\r\n");
      out.write("function province() {\r\n");
      out.write("\tif(xmlHttp.readyState == 4){\r\n");
      out.write("\t\tif(xmlHttp.status == 200){\r\n");
      out.write("\t\t\t// 把服务器响应的省份名称，使用逗号分割成字符串数组\r\n");
      out.write("\t\t\tvar provinceNameArray = xmlHttp.responseText.split(\",\");\r\n");
      out.write("\t\t\t// 遍历每个省份名称，使用每个省份名称创建<option>元素，添加到province的<select>中\r\n");
      out.write("\t\t\tfor (var i = 0; i < provinceNameArray.length; i++) {\r\n");
      out.write("\t\t\t\t//alert(\"-\"+provinceNameArray[i]+\"-\");\r\n");
      out.write("\t\t\t\taddProvinceOption(provinceNameArray[i]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t// 为province的<select>元素添加onchange事件监听\r\n");
      out.write("\t\t\tdocument.getElementById(\"province\").onchange = loadCities;\r\n");
      out.write("\t\t}else {\r\n");
      out.write("\t\t\twindow.alert(\"你请求的页面有异常,服务器不能正确处理!\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("//使用proName创建<option>元素添加到<select>元素中\r\n");
      out.write("function addProvinceOption(proName) {\r\n");
      out.write("\tvar option = document.createElement(\"option\");//创建option节点\r\n");
      out.write("\tvar text = document.createTextNode(proName);//使用省份名称创建文本节点\r\n");
      out.write("\toption.appendChild(text);//把省份名称的文本节点添加到<option>元素中\r\n");
      out.write("\toption.setAttribute(\"value\",proName);//使用省份名称来设置<option>元素的value属性\r\n");
      out.write("\tdocument.getElementById(\"province\").appendChild(option);//把<option>元素添加到<select>元素中　\r\n");
      out.write("}\r\n");
      out.write("//本函数在province的<select>元素发送变化时执行！\r\n");
      out.write("//本函数会使用当前选中的省份名称为参数，向服务器发送请求，获取当前省份下的所有城市！\r\n");
      out.write("function loadCities() {\r\n");
      out.write("\tvar proName = this.value;//获取<select>选择的省份名称\r\n");
      out.write("\tcreateXMLHttpRequest();\r\n");
      out.write("\txmlHttp.open(\"POST\", \"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\", true);\r\n");
      out.write("\txmlHttp.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\r\n");
      out.write("\talert(proName);\r\n");
      out.write("\talert(xmlHttp);\r\n");
      out.write("\txmlHttp.send(\"pname=\" + proName);//把下拉列表中选择的值发送给服务器！\r\n");
      out.write("\txmlHttp.onreadystatechange = cities;\r\n");
      out.write("}\r\n");
      out.write("//获取响应的所有城市\r\n");
      out.write("function cities() {\r\n");
      out.write("\tif(xmlHttp.readyState == 4){\r\n");
      out.write("\t\tif (xmlHttp.status == 200) {\r\n");
      out.write("\t\t\tvar doc = xmlHttp.responseXML;//获取服务器响应的xml文档\r\n");
      out.write("\t\t\t// 获取文档中所有city元素\r\n");
      out.write("\t\t\tvar cityElementList = doc.getElementsByTagName(\"city\");\r\n");
      out.write("\t\t\t// 获取html元素：city的<select>\r\n");
      out.write("\t\t\tvar citySelect = document.getElementById(\"city\");\r\n");
      out.write("\t\t\t// 删除city的<select>元素的所有子元素\r\n");
      out.write("\t\t\tremoveChildNodes(citySelect);\r\n");
      out.write("\t\t\t// 创建<option>元素，指定文本内容为“请选择”\r\n");
      out.write("\t\t\tvar qxzOption = document.createElement(\"option\");\r\n");
      out.write("\t\t\tvar textNode = document.createTextNode(\"==请选择==\");\r\n");
      out.write("\t\t\tqxzOption.appendChild(textNode);\r\n");
      out.write("\t\t\t// 把\"请选择\"这个<option>添加到<select>元素中\r\n");
      out.write("\t\t\tcitySelect.appendChild(qxzOption);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 循环遍历每个服务器端响应的每个<city>元素\r\n");
      out.write("\t\t\tfor (var i = 0; i < cityElementList.length; i++) {\r\n");
      out.write("\t\t\t\tvar cityEle = cityElementList[i];\r\n");
      out.write("\t\t\t\tvar cityName = null;\r\n");
      out.write("\t\t\t\t// 获取<city>元素的文本内容！处理浏览器差异！\r\n");
      out.write("\t\t\t\tif(window.addEventListener) {\r\n");
      out.write("\t\t\t\t\tcityName = cityEle.textContent;\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tcityName = cityEle.text;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t// 使用城市名称创建<option>，并添加到<select>元素中\r\n");
      out.write("\t\t\t\taddCityOption(cityName);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\twindow.alert(\"你请求的页面有异常,服务器不能正确处理!!\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("//删除city的<select>元素的所有子元素\r\n");
      out.write("function removeChildNodes(citySelect) {\r\n");
      out.write("\tvar nodes = citySelect.childNodes;//获取当前元素的所有子元素集合\r\n");
      out.write("\twhile (nodes.length > 0) {//遍历所有的子元素\r\n");
      out.write("\t\tcitySelect.removeChild(nodes[0]);//删除子元素\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("//本函数用来创建城市的<option>，并添加到<select>元素中\r\n");
      out.write("function addCityOption(cityName) {\r\n");
      out.write("\tvar citySelect = document.getElementById(\"city\");//获取id为city的<select>\r\n");
      out.write("\tvar cityOption = document.createElement(\"option\");//创建option元素\r\n");
      out.write("\tvar cityTextNode = document.createElement(cityName);//使用cityName创建文本节点\r\n");
      out.write("\tcityOption.appendChild(cityTextNode);\r\n");
      out.write("\tcityOption.setAttribute(\"value\",cityName);//设置option的属性\r\n");
      out.write("\tcitySelect.appendChild(cityOption);//将option节点添加到select节点\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("<h1>省市联动</h1>\r\n");
      out.write("<select name=\"province\" id=\"province\">\r\n");
      out.write("  <option>===请选择省===</option>\r\n");
      out.write("</select>\r\n");
      out.write("　　　\r\n");
      out.write("<select name=\"city\" id=\"city\">\r\n");
      out.write("  <option>===请选择市===</option>\r\n");
      out.write("</select>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
      // /ajax5.jsp(41,21) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/ProvinceServlet");
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
      // /ajax5.jsp(76,23) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/CityServlet");
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