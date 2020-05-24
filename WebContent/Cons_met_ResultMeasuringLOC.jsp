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
		
			<div id="izq" class="color1 col-xs-12 col-sm-6 col-md-4">
						
				 	</div>
				 	
			<div id="cent" class="main col-xs-12 col-sm-6 col-md-4">

<%@ page import="pckConstructionPhase.MeasuringClass" %>
<%
// Extracción de los parámetros recibidos
String sProject1 = request.getParameter("val1project");
String sPackage1 = request.getParameter("val2package");
String sClass1 = request.getParameter("val3class");

//Double vel, tiempo;
Double dResultMeasuringLOC;
//Double n1, n2;


MeasuringClass oMetricLOC = new MeasuringClass();
//dResultSuccessTest=oSuccessTest.metInsertValuesTestPassed();
dResultMeasuringLOC=oMetricLOC.metricCountLines(sProject1, sPackage1, sClass1);
%>

<h2> LOC Metric </h2>
<br>
<br>
<label>Se ha elegido el proyecto: <strong><%=sProject1 %></strong></label>
<br>
<br>
<label>Dentro del proyecto eligió el paquete: <strong><%=sPackage1 %></strong></label>
<br>
<br>
<label>El total de líneas de código de la clase <strong><%=sClass1 %></strong> es:</label>
<br>
<br>
 <h3><%= dResultMeasuringLOC  %></h3>
 
 </div>
 		
 		
 		<div id="derech" class="color1 col-xs-12 col-sm-6 col-md-4">
						
				 	</div>
 		
 
 	</div>
 
 </div>
 
 
</body>
</html>