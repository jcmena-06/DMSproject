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

<%@ page import="pckAnalysisAndDesignPhase.SequencDiagram" %>

<%

String sFileXML = request.getParameter("val1NameFile");
String sFileXML2 = request.getParameter("val1NameFile");
String sFileXML3 = request.getParameter("val1NameFile");
Integer iTotalActor=0;
Integer iTotalLifeLine=0;
Integer iTotalMessage=0;

SequencDiagram obj=new SequencDiagram();

iTotalActor = obj.metNumActor(sFileXML);
iTotalLifeLine = obj.metNumLifeLine(sFileXML2);
iTotalMessage = obj.metNumMessage(sFileXML3);


//TestPlan oMideTexto = new TestPlan();

%>
<br>
<br>
<h2> Sequence Diagram Metric </h2>
<br>
<label>El nombre del archivo que ingresó es:</label>   <strong><%=sFileXML %> </strong>
<br>
<br>
<label> El total de Actores declarados es:</label>   <strong><%= iTotalActor %></strong>
<br>
<label> El total de Líneas de vida declaradas es:</label>   <strong><%= iTotalLifeLine %></strong>
<br>
<label> El total de Mensajes existentes es:</label>   <strong><%= iTotalMessage %></strong>
<br>
	</div>
 		<div id="derech" class="color1 col-xs-12 col-sm-6 col-md-2">
						
				 	</div>
 	</div>
 </div>
  
</body>
</html>