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

<%@ page import="pckAnalysisAndDesignPhase.UseCase" %>

<%

String sFileXML = request.getParameter("val1NameFile");
String sFileXML2 = request.getParameter("val1NameFile");
String sFileXML3 = request.getParameter("val1NameFile");
String sFileXML4 = request.getParameter("val1NameFile");
String sFileXML5 = request.getParameter("val1NameFile");
String sFileXML6 = request.getParameter("val1NameFile");
Double iTotalActor;
Double iTotalUseCase;
Double iTotalRelations;
Integer iTotalIncludes=0;
Integer iTotalExtends=0;
Integer iTotalRelAssociation=0;
Double dInteractionComplexity; //Métrica Actor Interaction Complexity
Double dOverallDesignComplexity; //Métrica Complejidad General del Diseño

UseCase obj=new UseCase();

iTotalActor = obj.measuringActor(sFileXML);
iTotalUseCase = obj.measuringUseCase(sFileXML2);
iTotalRelations = obj.measuringAssociation(sFileXML3);
iTotalIncludes = obj.measuringIncludes(sFileXML4);
iTotalExtends = obj.measuringExtends(sFileXML5);
iTotalRelAssociation = obj.measuringRelAssociation(sFileXML6);

dInteractionComplexity= 1-(iTotalActor/iTotalUseCase);
dOverallDesignComplexity = 1-((iTotalActor+iTotalUseCase)/iTotalRelations);

%>
<br>
<br>
<h2> Use Case Diagram Metric</h2>
<br>
<label>El nombre del archivo que ingresó es:</label>   <strong><%=sFileXML %> </strong>
<br>
<br>
<label> El total de Actores declarados es:</label>   <strong><%= iTotalActor %></strong>
<br>
<label> El total de Casos de Uso declarados es:</label>   <strong><%= iTotalUseCase %></strong>
<br>
<label> El total de Relaciones existentes es:</label>   <strong><%= iTotalRelations %></strong>
<br>
<label>El total de Relaciones tipo Include es:</label> <strong><%= iTotalIncludes %></strong>
<br>
<label>El total de Relaciones tipo Extend es:</label> <strong><%= iTotalExtends %></strong>
<br>
<label>El total de Relaciones tipo Asociación es:</label> <strong><%= iTotalRelAssociation %></strong>
<br>
<label>El resultado de la métrica de la Complejidad de la Interacción del Actor es:</label> <strong><%= dInteractionComplexity %></strong>
<label><i>Mientras más Casos de Uso hay por Actor, más alta es la complejidad de interacción</i></label>
<br>
<label>El resultado de la métrica Complejidad General del Diseño es:</label> <strong><%= dOverallDesignComplexity %></strong>
<label>
	<i>Un diseño en el cual cada entidad tiene pocas relaciones, puede ser considerado<br>
		menos complejo que el diseño de un sistema en el cual el número de relaciones<br>
		por entidad es alto.</i>
</label>
	</div>
 		<div id="derech" class="color1 col-xs-12 col-sm-6 col-md-2">
						
				 	</div>
 	</div>
 </div>
  
</body>
</html>