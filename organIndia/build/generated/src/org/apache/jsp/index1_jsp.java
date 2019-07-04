package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" class=\"no-js\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<title>Login Page</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"TextInputEffects/css/normalize.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"TextInputEffects/fonts/font-awesome-4.2.0/css/font-awesome.min.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"TextInputEffects/css/demo.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"TextInputEffects/css/set1.css\" />\r\n");
      out.write("\t\t<script src=\"TextInputEffects/countries.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("            \r\n");
      out.write("        <form  action=\"DonorInfo\" onsubmit=\"check();\" method=\"post\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section class=\"content bgcolor-1\">\r\n");
      out.write("\t\t\t\t<h2 class=\"nomargin-bottom\" style=\"color: black\">Name</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--haruki\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--haruki\" type=\"text\" id=\"input-1\" name =\"pfirstname\" placeholder=\"First Name\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--haruki\" for=\"input-1\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--haruki\"></span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<!-- <span class=\"input input--haruki\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--haruki\" type=\"text\" id=\"input-2\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--haruki\" for=\"input-2\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--haruki\">Middle Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span> -->\r\n");
      out.write("\t\t\t\t<span class=\"input input--haruki\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--haruki\" type=\"text\" id=\"input-3\" name=\"plastname\" placeholder=\"Last Name\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--haruki\" for=\"input-3\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--haruki\"></span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<span class=\"\">\r\n");
      out.write("\t\t\t\t\t<h2 class=\"nomargin-bottom\" style=\"color: black\">Which organ you want to donate</h2>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"organSelected\" value=\"Eye\" style=\"margin: 10px\">Eye\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"organSelected\" value=\"Heart\" style=\"margin: 10px\">Heart\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"organSelected\" value=\"liver\" style=\"margin: 10px\">Liver\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"organSelected\" value=\"kidney\" style=\"margin: 10px\">Kidney\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"organSelected\" value=\"lungs\" style=\"margin: 10px\">Lungs\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"organSelected\" value=\"full\" style=\"margin: 10px\">Full Body\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content\" style=\"background-color: #f3cdf3;color: #fff\">\r\n");
      out.write("\t\t\t\t<h2 style=\"color: #000\">Address</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--hoshi\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--hoshi\" type=\"text\" id=\"input-4\" style=\"color: \t#4700ff\" name=\"paddress\" placeholder=\"Address\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--hoshi input__label--hoshi-color-1\" for=\"input-4\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--hoshi\"></span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--hoshi\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--hoshi\" type=\"text\" id=\"input-5\" style=\"color: \t#4700ff\" name=\"pcity\" placeholder=\"City\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--hoshi input__label--hoshi-color-2\" for=\"input-5\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--hoshi\"></span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--hoshi\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--hoshi\" type=\"text\" id=\"input-6\" style=\"color: \t#4700ff\" name=\"pdistrict\" placeholder=\"District\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--hoshi input__label--hoshi-color-3\" for=\"input-6\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--hoshi\"></span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--hoshi\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--hoshi\" type=\"text\" id=\"input-7\" style=\"color: \t#4700ff\" name=\"ppincode\" placeholder=\"Pincode\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--hoshi input__label--hoshi-color-3\" for=\"input-6\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--hoshi\"></span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--hoshi\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--hoshi\" type=\"text\" id=\"input-8\" style=\"color: \t#4700ff\" name=\"pstate\" placeholder=\"State\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--hoshi input__label--hoshi-color-3\" for=\"input-6\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--hoshi\"></span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--hoshi\">\r\n");
      out.write("\t\t\t\t\t<!-- <input class=\"input__field input__field--hoshi\" type=\"text\" id=\"input-8\" style=\"color: \t#4700ff\" name=\"pcountry\" placeholder=\"Country\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--hoshi input__label--hoshi-color-3\" for=\"input-6\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--hoshi\"></span>\r\n");
      out.write("\t\t\t\t\t</label> -->\r\n");
      out.write("\t\t\t\t\t <select id=\"country2\" name =\"pcountry\"></select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content bgcolor-7\">\r\n");
      out.write("\t\t\t\t<h2>Extras</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--jiro\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--jiro\" type=\"text\" id=\"input-10\" name=\"page\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--jiro\" for=\"input-10\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--jiro\">Age</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--jiro\" style=\"text-align: left;font-size: 25px;\">\r\n");
      out.write("\t\t\t\t\t<!-- <input class=\"input__field input__field--jiro\" type=\"text\" id=\"input-11\" /> -->\r\n");
      out.write("\t\t\t\t\t<!-- <label class=\"input__label input__label--jiro\" for=\"input-11\"> -->\r\n");
      out.write("\t\t\t\t\t\t<label style=\"text-align: center;font-weight: bold;\" >Gender</label>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"pgender\" value=\"Male\" checked=\"true\" style=\"margin: 5px \"> Male\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"pgender\" value=\"Female\" style=\"margin:5px\">Female\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"pgender\" value=\"transgender\" style=\"margin: 5px;\">Transgender\r\n");
      out.write("\t\t\t\t\t<!-- </label> -->\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--jiro\">\r\n");
      out.write("\t\t\t\t\t<!-- <input class=\"input__field input__field--jiro\" type=\"text\" id=\"input-12\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--jiro\" for=\"input-12\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--jiro\">Blood Group</span>\r\n");
      out.write("\t\t\t\t\t</label> -->\r\n");
      out.write("\t\t\t\t\t<label style=\"font-weight: bold;\">Blood Group</label>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("                                        <select name=\"pbloodgroup\">\r\n");
      out.write("\t\t\t\t\t\t<option>A+</option>\r\n");
      out.write("\t\t\t\t\t\t<option>A-</option>\r\n");
      out.write("\t\t\t\t\t\t<option>B+</option>\r\n");
      out.write("\t\t\t\t\t\t<option>B-</option>\r\n");
      out.write("\t\t\t\t\t\t<option>O+</option>\r\n");
      out.write("\t\t\t\t\t\t<option>O-</option>\r\n");
      out.write("\t\t\t\t\t\t<option>AB+</option>\r\n");
      out.write("\t\t\t\t\t\t<option>AB-</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content\">\r\n");
      out.write("\t\t\t\t<h2>Contact Details</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--minoru\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--minoru\" type=\"text\" id=\"input-13\" name=\"pemail\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--minoru\" for=\"input-13\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--minoru\">email</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--minoru\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--minoru\" type=\"text\" id=\"input-14\" name=\"pmobile\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--minoru\" for=\"input-14\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--minoru\">Contact Number</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("<!--\t\t\t\t<span class=\"input input--minoru\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--minoru\" type=\"text\" id=\"input-15\"  />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--minoru\" for=\"input-15\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--minoru\">Alternative Number</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>-->\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content bgcolor-5\">\r\n");
      out.write("\t\t\t\t<h2>Emergency Contact Person Details</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--minoru\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--yoko\" type=\"text\" id=\"input-16\" name=\"ename\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--yoko\" for=\"input-16\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--yoko\">Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--minoru\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--yoko\" type=\"text\" id=\"input-17\" name=\"emobile\"/>\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--yoko\" for=\"input-17\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--yoko\">Contact Number</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--minoru\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--yoko\" type=\"text\" id=\"input-18\" name=\"relation\"/>\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--yoko\" for=\"input-18\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--yoko\">Relationhip</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--minoru\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--yoko\" type=\"text\" id=\"input-18\" name=\"ecity\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--yoko\" for=\"input-18\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--yoko\">City</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--minoru\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--yoko\" type=\"text\" id=\"input-18\" name=\"estate\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--yoko\" for=\"input-18\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--yoko\">State</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--minoru\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--yoko\" type=\"text\" id=\"input-18\" name=\"eemail\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--yoko\" for=\"input-18\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--yoko\">email</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"submit\" name=\"Submit\" style=\"color: Red;background-color: #000;\">\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- <section class=\"content\">\r\n");
      out.write("\t\t\t\t<h2>Information</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--hideo\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--hideo\" type=\"text\" id=\"input-41\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--hideo\" for=\"input-41\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-fw fa-user icon icon--hideo\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--hideo\">Language</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--hideo\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--hideo\" type=\"text\" id=\"input-42\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--hideo\" for=\"input-42\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-fw fa-envelope icon icon--hideo\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--hideo\">DOB</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--hideo\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--hideo\" type=\"text\" id=\"input-43\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--hideo\" for=\"input-43\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-fw fa-lock icon icon--hideo\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--hideo\">Password</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section> -->\r\n");
      out.write("\t\t\t<!-- <section class=\"content bgcolor-3\">\r\n");
      out.write("\t\t\t\t<h2>Kyo</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--kyo\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--kyo\" type=\"text\" id=\"input-19\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--kyo\" for=\"input-19\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--kyo\">What's your email?</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content bgcolor-4\">\r\n");
      out.write("\t\t\t\t<h2>Akira</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--akira\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--akira\" type=\"text\" id=\"input-22\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--akira\" for=\"input-22\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--akira\">First Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--akira\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--akira\" type=\"text\" id=\"input-23\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--akira\" for=\"input-23\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--akira\">Last Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--akira\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--akira\" type=\"text\" id=\"input-24\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--akira\" for=\"input-24\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--akira\">Maiden Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content\">\r\n");
      out.write("\t\t\t\t<h2>Ichiro</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--ichiro\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--ichiro\" type=\"text\" id=\"input-25\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--ichiro\" for=\"input-25\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--ichiro\">Bird's Color</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--ichiro\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--ichiro\" type=\"text\" id=\"input-26\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--ichiro\" for=\"input-26\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--ichiro\">Wing Span</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--ichiro\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--ichiro\" type=\"text\" id=\"input-27\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--ichiro\" for=\"input-27\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--ichiro\">Beak Length</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content bgcolor-6\">\r\n");
      out.write("\t\t\t\t<h2>Juro</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--juro\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--juro\" type=\"text\" id=\"input-28\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--juro\" for=\"input-28\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--juro\">First Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--juro\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--juro\" type=\"text\" id=\"input-29\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--juro\" for=\"input-29\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--juro\">Last Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--juro\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--juro\" type=\"text\" id=\"input-30\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--juro\" for=\"input-30\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--juro\">Maiden Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content bgcolor-4\">\r\n");
      out.write("\t\t\t\t<h2>Madoka</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--madoka\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--madoka\" type=\"text\" id=\"input-31\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--madoka\" for=\"input-31\">\r\n");
      out.write("\t\t\t\t\t\t<svg class=\"graphic graphic--madoka\" width=\"100%\" height=\"100%\" viewBox=\"0 0 404 77\" preserveAspectRatio=\"none\">\r\n");
      out.write("\t\t\t\t\t\t\t<path d=\"m0,0l404,0l0,77l-404,0l0,-77z\"/>\r\n");
      out.write("\t\t\t\t\t\t</svg>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--madoka\">Frequency</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--madoka\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--madoka\" type=\"text\" id=\"input-32\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--madoka\" for=\"input-32\">\r\n");
      out.write("\t\t\t\t\t\t<svg class=\"graphic graphic--madoka\" width=\"100%\" height=\"100%\" viewBox=\"0 0 404 77\" preserveAspectRatio=\"none\">\r\n");
      out.write("\t\t\t\t\t\t\t<path d=\"m0,0l404,0l0,77l-404,0l0,-77z\"/>\r\n");
      out.write("\t\t\t\t\t\t</svg>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--madoka\">Weight</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--madoka\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--madoka\" type=\"text\" id=\"input-33\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--madoka\" for=\"input-33\">\r\n");
      out.write("\t\t\t\t\t\t<svg class=\"graphic graphic--madoka\" width=\"100%\" height=\"100%\" viewBox=\"0 0 404 77\" preserveAspectRatio=\"none\">\r\n");
      out.write("\t\t\t\t\t\t\t<path d=\"m0,0l404,0l0,77l-404,0l0,-77z\"/>\r\n");
      out.write("\t\t\t\t\t\t</svg>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--madoka\">Strength</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content\">\r\n");
      out.write("\t\t\t\t<h2>Kaede</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--kaede\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--kaede\" type=\"text\" id=\"input-35\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--kaede\" for=\"input-35\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--kaede\">First Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--kaede\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--kaede\" type=\"text\" id=\"input-36\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--kaede\" for=\"input-36\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--kaede\">Last Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--kaede\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--kaede\" type=\"text\" id=\"input-37\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--kaede\" for=\"input-37\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--kaede\">Website</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<section class=\"content bgcolor-8\">\r\n");
      out.write("\t\t\t\t<h2>Isao</h2>\r\n");
      out.write("\t\t\t\t<span class=\"input input--isao\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--isao\" type=\"text\" id=\"input-38\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--isao\" for=\"input-38\" data-content=\"First Name\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--isao\">First Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--isao\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--isao\" type=\"text\" id=\"input-39\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--isao\" for=\"input-39\" data-content=\"Middle Name\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--isao\">Middle Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<span class=\"input input--isao\">\r\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--isao\" type=\"text\" id=\"input-40\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--isao\" for=\"input-40\" data-content=\"Last Name\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--isao\">Last Name</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</section> -->\r\n");
      out.write("\t\t\t<!-- Related demos -->\r\n");
      out.write("\t\t\t<!-- <section class=\"content content--related\">\r\n");
      out.write("\t\t\t\t<p>If you enjoyed this demo you might also like:</p>\r\n");
      out.write("\t\t\t\t<a class=\"media-item\" href=\"http://tympanus.net/Development/MinimalForm/\">\r\n");
      out.write("\t\t\t\t\t<img class=\"media-item__img\" src=\"img/related/MinimalForm.png\" />\r\n");
      out.write("\t\t\t\t\t<h3 class=\"media-item__title\">Minimal Form Interface</h3>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<a class=\"media-item\" href=\"http://tympanus.net/Development/SelectInspiration/\">\r\n");
      out.write("\t\t\t\t\t<img class=\"media-item__img\" src=\"img/related/SelectInspiration.png\" />\r\n");
      out.write("\t\t\t\t\t<h3 class=\"media-item__title\">Custom Select Elements</h3>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</section> -->\r\n");
      out.write("\t\t<!-- </div> --><!-- /container -->\r\n");
      out.write("\t\t<!-- <script src=\"js/classie.js\"></script>\r\n");
      out.write("\t\t<script> -->\r\n");
      out.write("\t\t\t<!-- (function() {\r\n");
      out.write("\t\t\t\t// trim polyfill : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim\r\n");
      out.write("\t\t\t\tif (!String.prototype.trim) {\r\n");
      out.write("\t\t\t\t\t(function() {\r\n");
      out.write("\t\t\t\t\t\t// Make sure we trim BOM and NBSP\r\n");
      out.write("\t\t\t\t\t\tvar rtrim = /^[\\s\\uFEFF\\xA0]+|[\\s\\uFEFF\\xA0]+$/g;\r\n");
      out.write("\t\t\t\t\t\tString.prototype.trim = function() {\r\n");
      out.write("\t\t\t\t\t\t\treturn this.replace(rtrim, '');\r\n");
      out.write("\t\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\t})();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t[].slice.call( document.querySelectorAll( 'input.input__field' ) ).forEach( function( inputEl ) {\r\n");
      out.write("\t\t\t\t\t// in case the input is already filled..\r\n");
      out.write("\t\t\t\t\tif( inputEl.value.trim() !== '' ) {\r\n");
      out.write("\t\t\t\t\t\tclassie.add( inputEl.parentNode, 'input--filled' );\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t// events:\r\n");
      out.write("\t\t\t\t\tinputEl.addEventListener( 'focus', onInputFocus );\r\n");
      out.write("\t\t\t\t\tinputEl.addEventListener( 'blur', onInputBlur );\r\n");
      out.write("\t\t\t\t} );\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tfunction onInputFocus( ev ) {\r\n");
      out.write("\t\t\t\t\tclassie.add( ev.target.parentNode, 'input--filled' );\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tfunction onInputBlur( ev ) {\r\n");
      out.write("\t\t\t\t\tif( ev.target.value.trim() === '' ) {\r\n");
      out.write("\t\t\t\t\t\tclassie.remove( ev.target.parentNode, 'input--filled' );\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})();\r\n");
      out.write("\t\t</script> -->\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tpopulateCountries(\"country2\");\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
