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

<%@ page import="pckAnalysisAndDesignPhase.StateDiagram" %>

<%

String sFileXML = request.getParameter("val1NameFile");
String sFileXML2 = request.getParameter("val1NameFile");
String sFileXML3 = request.getParameter("val1NameFile");
String sFileXML4 = request.getParameter("val1NameFile");
String sFileXML5 = request.getParameter("val1NameFile");
String sFileXML6 = request.getParameter("val1NameFile");
String sFileXML7 = request.getParameter("val1NameFile");
Double iTotalElements;
Double iTotalStates;
Double iTotalTransitions;
Double iTotalJoins;
Double iTotalChoice;
Double iTotalInitial;
Double iTotalFinal;
Double dOverallDesignComplexity; //Métrica Complejidad General del Diseño

StateDiagram obj=new StateDiagram();

iTotalElements = obj.measuringStates(sFileXML);
iTotalStates = obj.measuringTotalState(sFileXML2);
iTotalTransitions = obj.measuringTotalTransition(sFileXML3);
iTotalJoins = obj.measuringTotalJoins(sFileXML4);
iTotalChoice = obj.measuringChoice(sFileXML5);
iTotalInitial = obj.measuringInitial(sFileXML6);
iTotalFinal = obj.measuringFinal(sFileXML7);
dOverallDesignComplexity = (1-(iTotalElements/iTotalTransitions));
//TestPlan oMideTexto = new TestPlan();

%>
<br>
<br>
<h2> State Diagram Metric </h2>
<br>
<label>El nombre del archivo que ingresó es:</label>   <strong><%=sFileXML %> </strong>
<br>
<br>
<label> El total de Elementos en el diagrama es:</label>   <strong><%= iTotalElements %></strong>
<br>
<label> El total de Estados en el diagrama es:</label>   <strong><%= iTotalStates %></strong>
<br>
<label> El total de Transiciones en el diagrama es:</label>   <strong><%= iTotalTransitions %></strong>
<br>
<label> El total de elementos Join en el diagrama es:</label>   <strong><%= iTotalJoins %></strong>
<br>
<label> El total de elementos Choice en el diagrama es:</label>   <strong><%= iTotalChoice %></strong>
<br>
<label> El total de elementos Iniciales en el diagrama es:</label>   <strong><%= iTotalInitial %></strong>
<br>
<label> El total de elementos Finales en el diagrama es:</label>   <strong><%= iTotalFinal %></strong>
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