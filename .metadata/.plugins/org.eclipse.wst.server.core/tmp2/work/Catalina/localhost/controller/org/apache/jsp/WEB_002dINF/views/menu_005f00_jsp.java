/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-08-26 10:13:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class menu_005f00_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.1.1.RELEASE.jar", Long.valueOf(1565743903985L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1565675528161L));
    _jspx_dependants.put("jar:file:/C:/workspace/workspace-sts-3.9.9.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/ProjectRemembrance/WEB-INF/lib/spring-webmvc-4.1.1.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1412094440000L));
    _jspx_dependants.put("jar:file:/C:/workspace/workspace-sts-3.9.9.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/ProjectRemembrance/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Breadcrumbs-->\r\n");
      out.write("\t\t\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"breadcrumb-item\"><a href=\"#\">Dashboard</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"breadcrumb-item active\">Overview</li>\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Icon Cards-->\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-3 col-sm-6 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card text-white bg-primary o-hidden h-100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-fw fa-comments\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"mr-5\">26 New Messages!</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"card-footer text-white clearfix small z-1\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"float-left\">View Details</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"float-right\"> <i class=\"fas fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-3 col-sm-6 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card text-white bg-warning o-hidden h-100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-fw fa-list\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"mr-5\">11 New Tasks!</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"card-footer text-white clearfix small z-1\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"float-left\">View Details</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"float-right\"> <i class=\"fas fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-3 col-sm-6 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card text-white bg-success o-hidden h-100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-fw fa-shopping-cart\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"mr-5\">123 New Orders!</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"card-footer text-white clearfix small z-1\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"float-left\">View Details</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"float-right\"> <i class=\"fas fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-3 col-sm-6 mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card text-white bg-danger o-hidden h-100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fas fa-fw fa-life-ring\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"mr-5\">13 New Tickets!</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"card-footer text-white clearfix small z-1\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"float-left\">View Details</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"float-right\"> <i class=\"fas fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Area Chart Example-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-chart-area\"></i> Achievement Chart\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<canvas id=\"myAreaChart\" width=\"100%\" height=\"30\"></canvas>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-footer small text-muted\">\r\n");
      out.write("\t\t\t\t\t\t\tUpdated at\r\n");
      out.write("\t\t\t\t\t\t\t");
Date now = new Date();
 			SimpleDateFormat sf = new SimpleDateFormat("yy년 MM월 dd일 E a hh:mm:ss"); 
 			String today = sf.format(now);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( today );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- DataTables Example -->\r\n");
      out.write("\t\t\t\t\t<div class=\"card mb-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fas fa-table\"></i> User Ranking\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"table-responsive\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>아이디</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>이름</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>나이</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>등급</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>가입일자</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>좌우명</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>YOON MO</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>구윤모</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>27</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>A</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019/08/26</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>YONG HYEON</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>박용현</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>28</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>A</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019/08/26</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>HANSOL</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>이한솔</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>32</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>A</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2019/08/26</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-footer small text-muted\">\r\n");
      out.write("\t\t\t\t\t\t\tUpdated at\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( today );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>");
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
}
