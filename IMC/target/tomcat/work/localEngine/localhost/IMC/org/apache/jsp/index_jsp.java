package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Calculo IMC</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images\\icons\\Icons8-Windows-8-Science-Scale.ico\"/>\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\r\n");
      out.write("<!--===============================================================================================-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"bg-contact2\" style=\"background-image: url('images/maxresdefault.jpg');\">\r\n");
      out.write("\t\t<div class=\"container-contact2\">\r\n");
      out.write("\t\t\t<div class=\"wrap-contact2\">\r\n");
      out.write("\t\t\t\t<form class=\"contact2-form validate-form\" action=\"index.jsp\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<span class=\"contact2-form-title\">\r\n");
      out.write("\t\t\t\t\t\tCalculo de IMC\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input2 validate-input\" data-validate=\"Name is required\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"input2\" type=\"text\" name=\"peso\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input2\" data-placeholder=\"PESO\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input2 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"input2\" type=\"text\" name=\"altura\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input2\" data-placeholder=\"ALTURA\"></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");
 
                         
                String pesoStr = request.getParameter("peso");
                String alturaStr = request.getParameter("altura");
                String condicaoAtual = "Informe seus dados";
                if(pesoStr != null && !pesoStr.isEmpty() || alturaStr != null && !pesoStr.isEmpty()){
                    float altura = Float.parseFloat(alturaStr);
                    float peso = Float.parseFloat(pesoStr);
                    
                    float imc =  peso / (altura * altura);
                    if(imc < 18){
                        condicaoAtual = "Your weight is too low.";
                    }else if(imc >= 18 && imc < 25){
                        condicaoAtual = "You have normal weight.";
                    }else if(imc >= 25 && imc < 30){
                        condicaoAtual = "Your weight is too high.";
                    }else{
                        condicaoAtual = "You have obesity.";
                    }
                }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--<div class=\"wrap-input2 validate-input\" data-validate = \"Message is required\">\r\n");
      out.write("\t\t\t\t\t\t<textarea class=\"input2\" name=\"message\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input2\" data-placeholder=\"MESSAGE\"></span>\r\n");
      out.write("\t\t\t\t\t</div>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"container-contact2-form-btn\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap-contact2-form-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact2-form-bgbtn\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"contact2-form-btn\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\tCALCULAR\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\r\n");
      out.write("                    ");

                    out.println("Your IMC: " + imc);
                    out.println(condicaoAtual);
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--===============================================================================================\r\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================\r\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\r\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================\r\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\r\n");
      out.write("<!--===============================================================================================\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Global site tag (gtag.js) - Google Analytics \r\n");
      out.write("\t<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t  window.dataLayer = window.dataLayer || [];\r\n");
      out.write("\t  function gtag(){dataLayer.push(arguments);}\r\n");
      out.write("\t  gtag('js', new Date());\r\n");
      out.write("\r\n");
      out.write("\t  gtag('config', 'UA-23581568-13');\r\n");
      out.write("\t</script> -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
