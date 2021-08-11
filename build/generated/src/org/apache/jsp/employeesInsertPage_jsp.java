package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employeesInsertPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>TimeSheet - Employees</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"text-center mt-4 mb-4\">Cadastro de Funcionários</h1>\n");
      out.write("            <div class=\"row mt-5 mb-5\" id=\"no-principal\">\n");
      out.write("                <div class=\"col col-md-2\">&nbsp;</div>\n");
      out.write("                <div class=\"col col-md-8\">\n");
      out.write("                    <form action=\"\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"idUtente\">Id</label>\n");
      out.write("                            <input type=\"text\" name=\"idUtente\" id=\"idUtente\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.idEmployee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Digite o ID de Utente\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"utente\">Funcionário</label>\n");
      out.write("                            <input type=\"text\" name=\"utente\" id=\"utente\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.employeeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Digite o Nome do Funcionário\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"sap\">SAP</label>\n");
      out.write("                            <input type=\"text\" name=\"sap\" id=\"sap\" class=\"form-control\" value=\"\" placeholder=\"Digite o SAP\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"ws\">WS</label>\n");
      out.write("                            <input type=\"text\" name=\"ws\" id=\"ws\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e.ws}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Digite o WS\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"card\">Cartão</label>\n");
      out.write("                            <input type=\"text\" name=\"card\" id=\"card\" class=\"form-control\" value=\"\" placeholder=\"Digite o Nº do Cartão\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"card\">Cartão</label>\n");
      out.write("                            <select name=\"idCardState\" id=\"idCardState\" class=\"form-control\">\n");
      out.write("                                <option value=\"1\" selected>Cartão Activo</option>\n");
      out.write("                                <option value=\"2\">Cartão Desactivo</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"description\">Estado do Cartão</label>\n");
      out.write("                            <textarea name=\"description\" id=\"\" class=\"form-control\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary\" value=\"Gravar\">\n");
      out.write("                        <input type=\"reset\" class=\"btn btn-secondary\" value=\"Limpar\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
