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

<%@ page import="pckAnalysisAndDesignPhase.ClassDiagram" %>

<%

String sFileXML = request.getParameter("val1NameFile");
String sFileXML2 = request.getParameter("val1NameFile");
String sFileXML3 = request.getParameter("val1NameFile");
String sFileXML4 = request.getParameter("val1NameFile");
String sFileXML5 = request.getParameter("val1NameFile");
String sFileXML6 = request.getParameter("val1NameFile");
String sFileXML7 = request.getParameter("val1NameFile");
String sFileXML8= request.getParameter("val1NameFile");
String sFileXML9 = request.getParameter("val1NameFile");
String sFileXML10 = request.getParameter("val1NameFile");
String sFileXML11 = request.getParameter("val1NameFile");

Double iTotalClases;
Double iTotalRelAggregation;
Double iTotalRelDependency;
Double iTotalRelAssociation;
Double iTotalRelGeneralization;
Double iTotalRelComposition;
Double iTotalPackages;
Double iTotalClass;
Double iTotalAbstractClass;
Double dOverallDesignComplexity;
Double dTotalAttributes;
Double dTotalMethods;

ClassDiagram obj=new ClassDiagram();

//iTotalClases = obj.measuringClass(sFileXML);
iTotalRelAggregation = obj.measuringRelAggregation(sFileXML2);
iTotalRelDependency = obj.measurinRelDependency(sFileXML3);
iTotalRelAssociation = obj.measuringRelAssociation(sFileXML4);
iTotalRelGeneralization = obj.measuringRelGeneralization(sFileXML5);
iTotalRelComposition = obj.measuringRelComposition(sFileXML6);
iTotalPackages = obj.measuringTotalPackage(sFileXML7);
iTotalClass = obj.measuringTotalClasses(sFileXML8);
iTotalAbstractClass = obj.measuringAbstractClass(sFileXML9);
dOverallDesignComplexity = (1-((iTotalClass+iTotalPackages)/(iTotalRelAggregation+iTotalRelDependency+iTotalRelAssociation+iTotalRelGeneralization)));
dTotalAttributes = obj.measuringAttributes(sFileXML10);
dTotalMethods = obj.measuringMethods(sFileXML11);
%>
<br>
<br>
<h2> Class Diagram Metric </h2>
<br>
<label>El nombre del archivo que ingresó es:</label>   <strong><%=sFileXML2 %> </strong>
<br>
<label> El total de las clases es:</label>   <strong><%= iTotalClass %></strong>
<br>
<label> El total de las clases Abstractas es:</label>   <strong><%= iTotalAbstractClass %></strong>
<br>
<label>El total de Atributos declarados es:</label> <strong><%= dTotalAttributes%></strong>
<br>
<label>El total de Métodos declarados es:</label> <strong><%= dTotalMethods%></strong>
<br>
<label> El total de las relaciones del tipo Agregación es:</label>   <strong><%= iTotalRelAggregation %></strong>
<br>
<label> El total de las relaciones del tipo Dependencia es:</label>   <strong><%= iTotalRelDependency %></strong>
<br>
<label> El total de las relaciones del tipo Asociación es:</label>   <strong><%= iTotalRelAssociation %></strong>
<br>
<label> El total de las relaciones del tipo Generalización es:</label>   <strong><%= iTotalRelGeneralization %></strong>
<br>
<label> El total de las relaciones del tipo Composición es:</label>   <strong><%= iTotalRelComposition %></strong>
<br>
<label> El total de Paquetes definidos es:</label>   <strong><%= iTotalPackages %></strong>
<br>
<label>El total de Atributos declarados es:</label>

<br>
<label>El resultado de la métrica Complejidad General del Diseño es:</label> <strong><%= dOverallDesignComplexity %></strong>
<br>
<label>
	<i>Un diseño en el cual cada entidad tiene pocas relaciones, puede ser considerado<br>
		menos complejo que el diseño de un sistema en el cual el número de relaciones<br>
		por entidad es alto.</i>
</label>
<br>
	</div>
 		<div id="derech" class="color1 col-xs-12 col-sm-6 col-md-2">
						
				 	</div>
 	</div>
 </div>
  
</body>
</html>