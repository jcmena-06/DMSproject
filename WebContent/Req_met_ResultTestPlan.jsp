<%@page import="java.util.ArrayList"%>
<html>
<head>
<title>Pagina Destino JSP</title>
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<link rel="stylesheet" href="css/estilos2.css">
</head>
<body>
	<div class="container">
		<div class="row">
		
			<div id="izq" class="color1 col-xs-12 col-sm-6 col-md-2">
						
				 	</div>
				 	
			<div id="cent" class="main col-xs-12 col-sm-6 col-md-8">

<%@ page import="pckRequirementsPhase.TestPlan" %>

<%

String sFileTestPlan = request.getParameter("val1NameFile");
//String sFileName="";

// Extracción de los parámetros recibidos
TestPlan ob=new TestPlan();
ArrayList<String> listavalores = ob.measuringStrings();
//sFileName = ob.measuringContent(sFileTestPlan);

//TestPlan oMideTexto = new TestPlan();

%>
<br>
<br>
<h2> Metric Measuring Test Plan Document </h2>
<br>
<br>
<label> El nombre del archivo es:</label> <%= sFileTestPlan %>
<br>
<% 
out.println("<label>La cadena <strong>"+listavalores.get(0)+"</strong> </label>");
out.println("<label>se encuentra en la línea <strong>"+listavalores.get(1)+"</strong> </label>");
out.println("<br>");
out.println("<label>La cadena <strong>"+listavalores.get(2)+"</strong> </label>");
out.println("<label>se encuentra en la línea <strong>"+listavalores.get(3)+"</strong> </label>");
out.println("<br>");
out.println("<label>La cadena <strong>"+listavalores.get(4)+"</strong> </label>");
out.println("<label>se encuentra en la línea <strong>"+listavalores.get(5)+"</strong> </label>");

%>

<br>
<br>
<br>
<br>
	</div>
 		<div id="derech" class="color1 col-xs-12 col-sm-6 col-md-2">
						
				 	</div>
 	</div>
 </div>
  
</body>
</html>