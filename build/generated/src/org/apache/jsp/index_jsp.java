package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<title>Hi-Tech Digi welcome Page</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("  \t<script src=\"http://code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("  \t<script src=\"http://code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("\t\t<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/css/animate.css\" rel=\"stylesheet\"/>\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/css/waypoints.css\" rel=\"stylesheet\"/>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.waypoints.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\tflag=0;\n");
      out.write("\t$(\"#ser\").click(function(){\n");
      out.write("\tif(flag==0)\n");
      out.write("\t{\n");
      out.write("\t$(\"#ser\").animate({height:'50px',width:'50px'},100);\n");
      out.write("\t$(\"#c1\").animate({top:'50%',left:'43%'},200);\n");
      out.write("\t$(\"#c1\").animate({height:'70px',width:'70px'},200);\n");
      out.write("\t$(\"#c1 img\").delay(500).fadeIn(100);\n");
      out.write("\n");
      out.write("\t$(\"#c2\").animate({top:'40%',left:'50%'},200);\n");
      out.write("\t$(\"#c2\").animate({height:'70px',width:'70px'},200);\n");
      out.write("\t$(\"#c2 img\").delay(500).fadeIn(100);\n");
      out.write("\n");
      out.write("\t$(\"#c3\").animate({top:'50%',left:'57%'},200);\n");
      out.write("\t$(\"#c3\").animate({height:'70px',width:'70px'},200);\n");
      out.write("\t$(\"#c3 img\").delay(500).fadeIn(100);\n");
      out.write("  $(\"#ser\").css(\"background-image\",\"url('");
      out.print(request.getContextPath());
      out.write("/img/lulu-cancel.png')\");\n");
      out.write("\t$(\"#ser\").css(\"background-size\",\"60% 60%\");\n");
      out.write("\t$(\"#ser\").css(\"background-position\",\"center\");\n");
      out.write("\t$(\"#ser\").css(\"background-repeat\",\"no-repeat\");\n");
      out.write("\tflag=1;\n");
      out.write("\t}\n");
      out.write("\telse {\n");
      out.write("\t\t$(\"#ser\").animate({height:'55px',width:'55px'},100);\n");
      out.write("\t\t$(\"#c1\").animate({height:'5px',width:'5px'},100);\n");
      out.write("\t\t$(\"#c1\").animate({top:'80%',left:'49%'},200);\n");
      out.write("\t\t$(\"#c1 img\").css(\"display\",\"none\");\n");
      out.write("\t\t$(\"#c2\").animate({height:'5px',width:'5px'},100);\n");
      out.write("\t\t$(\"#c2\").animate({top:'80%',left:'50%'},200);\n");
      out.write("\t\t$(\"#c2 img\").css(\"display\",\"none\");\n");
      out.write("\t\t$(\"#c3\").animate({height:'5px',width:'5px'},100);\n");
      out.write("\t\t$(\"#c3\").animate({top:'80%',left:'51%'},200);\n");
      out.write("\t\t$(\"#c3 img\").css(\"display\",\"none\");\n");
      out.write("\t\t$(\"#ser\").css(\"background-image\",\"none\");\n");
      out.write("\t\tflag=0;\n");
      out.write("\t}\n");
      out.write("\t});\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("\t<script  src=\"https://code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/waypoints.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.2.1.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t$(window).scroll(function(){\n");
      out.write("\t\tif($(this).scrollTop()>140){\n");
      out.write("\t\t\t$('.navigation').addClass(\"sticky\")\n");
      out.write("\t\t}\n");
      out.write("\t\telse {\n");
      out.write("\t\t\t$('.navigation').removeClass(\"sticky\")\n");
      out.write("\t\t}\n");
      out.write("\t})\n");
      out.write("\t</script>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t\t\t\t\t\t\t$(\"#link1\").click(function(){\n");
      out.write("\t\t\t\t\t\t\t\t\t $path=$(\"#video_container\").offset().top;\n");
      out.write("\t\t\t\t\t\t\t\t\t $('body').animate({scrollTop:$path},1000);\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t$(\"#link2\").click(function(){\n");
      out.write("\t\t\t\t\t\t\t\t\t $path=$(\"#about\").offset().top;\n");
      out.write("\t\t\t\t\t\t\t\t\t $('body').animate({scrollTop:$path},1000);\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t$(\"#link3\").click(function(){\n");
      out.write("\t\t\t\t\t\t\t\t\t $path=$(\"#service\").offset().top;\n");
      out.write("\t\t\t\t\t\t\t\t\t $('body').animate({scrollTop:$path},1000);\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t$(\"#link4\").click(function(){\n");
      out.write("\t\t\t\t\t\t\t\t\t $path=$(\"#contact\").offset().top;\n");
      out.write("\t\t\t\t\t\t\t\t\t $('body').animate({scrollTop:$path},1000);\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t });\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"wholecontainer\">\n");
      out.write("<section id=\"welcome\">\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li>h</li>\n");
      out.write("\t\t<li>i</li>\n");
      out.write("\t\t<li>-</li>\n");
      out.write("\t\t<li>t</li>\n");
      out.write("\t\t<li>e</li>\n");
      out.write("\t\t<li>c</li>\n");
      out.write("\t\t<li>h</li>\n");
      out.write("\t\t<li></li>\n");
      out.write("\t\t<li>d</li>\n");
      out.write("\t\t<li>i</li>\n");
      out.write("\t\t<li>g</li>\n");
      out.write("\t\t<li>i</li>\n");
      out.write("\t</ul>\n");
      out.write("</section>\n");
      out.write("<nav class=\"navigation\">\n");
      out.write("\t<div id=\"main\">\n");
      out.write("\t\t\t<div id=\"box\">\n");
      out.write("\t\t\t\t\t<div id=\"side1\">WE</div>\n");
      out.write("\t        <div id=\"side2\">DESIGN</div>\n");
      out.write("\t\t\t\t\t<div id=\"side3\">CREATE</div>\n");
      out.write("\t\t\t\t\t<div id=\"side4\">INNOVATE</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\t<div id=\"right\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"#video_container\" id=\"link1\">home</a></li>\n");
      out.write("\t\t\t<li><a href=\"#about\" id=\"link2\">about</a></li>\n");
      out.write("\t\t\t<li><a href=\"#service\" id=\"link3\">services</a></li>\n");
      out.write("\t\t\t<li><a href=\"gallery.jsp\">gallery</a></li>\n");
      out.write("\t\t\t<li><a href=\"tutorial.jsp\">tutorial</a></li>\n");
      out.write("\t\t\t<li><a href=\"cart.jsp\">cart</a></li>\n");
      out.write("\t\t\t<li><a href=\"#contact\" id=\"link4\">contact</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("<section id=\"video_container\">\n");
      out.write("   <a id=\"user\" href=\"logout\">");
      out.print(session.getAttribute("userlog"));
      out.write("?</a></button\n");
      out.write("    <video preload=\"auto\" autoplay=\"autoplay\" loop src=\"");
      out.print(request.getContextPath());
      out.write("/img/After Effect - Simple Motion Graphic (1).mp4\" type=\"video/mp4\" muted></video>\n");
      out.write("<div class=\"boxdp\">\n");
      out.write("<h1>dp</h1>\n");
      out.write("<p>printing solutions.</p>\n");
      out.write("</div>\n");
      out.write("<div class=\"singin\">\n");
      out.write("\t<a href=\"singinup.jsp\"><SPAN>SIGN UP</span></a>\n");
      out.write("\t</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section id=\"about\">\n");
      out.write("<div class=\"cupclass\">\n");
      out.write(" <div class=\"cup\"></div>\n");
      out.write("</div>\n");
      out.write("<div class=\"asd\">\n");
      out.write("\t<div class=\"boxabout\">\n");
      out.write("\t\t<span></span>\n");
      out.write("\t\t<h3 style=\"text-align: center; margin: 20px;\">ABOUT US</h3>\n");
      out.write("<p>\n");
      out.write("Indented paragraphs demonstrated in the US Constitution\n");
      out.write("In ancient manuscripts, another means to divide sentences into paragraphs was a line break (newline) followed by an initial at the beginning of the next paragraph. An initial is an oversized capital letter, sometimes outdented beyond the margin of the text. This style can be seen, for example, in the original Old English manuscript of Beowulf. Outdenting is still used in English typography, though not commonly.[4] Modern English typography usually indicates a new paragraph by indenting the first line. This style can be seen in the (handwritten) United States Constitution from 1787. For additional ornamentation, a hedera leaf or other symbol can be added to the inter-paragraph whitespace, or put in the indentation space.<br/><br/><br/><br/><br/>\n");
      out.write("Indented paragraphs demonstrated in the US Constitution\n");
      out.write("In ancient manuscripts, another means to divide sentences into paragraphs was a line break (newline) followed by an initial at the beginning of the next paragraph. An initial is an oversized capital letter, sometimes outdented beyond the margin of the text. This style can be seen, for example, in the original Old English manuscript of Beowulf. Outdenting is still used in English typography, though not commonly.[4] Modern English typography usually indicates a new paragraph by indenting the first line. This style can be seen in the (handwritten) United States Constitution from 1787. For additional ornamentation, a hedera leaf or other symbol can be added to the inter-paragraph whitespace, or put in the indentation space.</p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("<section id=\"service\">\n");
      out.write("\t<h2 style=\"margin: 580px; text-align: center; color: #ffca0c; padding: 10px; letter-spacing: 3px; border: 3px solid #fff; border-radius: 59px;  position:relative; top: 10%;\">SERVICE WE OFFER</h2>\n");
      out.write("\t<div id=\"ser\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div id=\"c1\">\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/img/8-2-photoshop-logo-png-hd.png\">\n");
      out.write("</div>\n");
      out.write("<div id=\"c2\">\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/img/indesign-logo-exploding.png\">\n");
      out.write("</div>\n");
      out.write("<div id=\"c3\">\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/img/aedribbble2.png\">\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("<section id=\"contact\">\n");
      out.write("\t<div class=\"conleft\">\n");
      out.write("\t<div id=\"colorLayer\"></div>\n");
      out.write("\t\t\t <div id=\"map\">\n");
      out.write("\t\t\t\t\t <div id=\"locator\">\n");
      out.write("\t\t\t\t\t\t\t <img src=\"");
      out.print(request.getContextPath());
      out.write("/img/locator.png\" height=\"80px\" width=\"50px\"/>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t <div class=\"conright\">\n");
      out.write("\t\t\t <h3>CONTACT US</H3>\n");
      out.write("\t\t\t <div class=\"cont\">\n");
      out.write("\t\t\t\t <div class=\"shape\">\n");
      out.write("\t\t\t\t\t <p>9/3 pillayar koil street, west mambalam, chennai 600-024.<br/><br/><span id=\"ssc\">mobile no.</span> 9840648524<br/><br/><span id=\"ssn\">email:</span> sriramgraphicssk@gmail.com</p>\n");
      out.write("\t\t\t\t </div>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t </div>\n");
      out.write("</section>\n");
      out.write("<section id=\"contactkk\">\n");
      out.write("\t<section class=\"pers\">\n");
      out.write("\t<div class=\"cardbox\">\n");
      out.write("\t\t<div class=\"card facebook\">\n");
      out.write("\t\t\t<div class=\"card_front\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t<div class=\"card_back\">Facebook</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cardbox\">\n");
      out.write("\t\t<div class=\"card twitter\">\n");
      out.write("\t\t\t<div class=\"card_front\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t<div class=\"card_back\">Twitter</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cardbox\">\n");
      out.write("\t\t<div class=\"card googleplus\">\n");
      out.write("\t\t\t<div class=\"card_front\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t<div class=\"card_back\">Google++</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</section>\n");
      out.write("</section>\n");
      out.write("<footer>\n");
      out.write("\t<p>© 2017 KPMS CINEMAS online ticket booking site.</p>\n");
      out.write("\t<footer>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
