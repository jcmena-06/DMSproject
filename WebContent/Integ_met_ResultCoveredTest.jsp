<html>
<head>
<meta http-equiv="Content-Type"
content="text/html; charset=UTF-8">
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

<%@ page import="pckIntegrationAndTestingPhase.Testing" %>
<%
// Extracci�n de los par�metros recibidos
Double dValor1 = Double.parseDouble(request.getParameter("val1CoveredTest"));
Double dValor2 = Double.parseDouble(request.getParameter("val2CoveredTest"));

//Double vel, tiempo;
Double dResultCoveredTest;
//Double n1, n2;


Testing oCoveredTest = new Testing();
//dResultSuccessTest=oSuccessTest.metInsertValuesTestPassed();
dResultCoveredTest=oCoveredTest.metInsertTestCovered(dValor1, dValor2);
%>

<h2> Covered Test </h2>
<br>
<br>
<label>El porcentaje de pruebas cubiertas es:</label>
<br>
<br>
 <%= dResultCoveredTest  %> % 
 
  </div>
 		
 		
 		<div id="derech" class="color1 col-xs-12 col-sm-6 col-md-4">
						
				 	</div>
 		
 
 	</div>
 
 </div>
 
 
</body>
</html>