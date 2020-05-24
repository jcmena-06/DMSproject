<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"
content="text/html; charset=UTF-8">
<title>Pagina Destino JSP</title>
</head>
<body>
<%@ page import="pckAnalysisAndDesignPhase.AnalysisAndDesignDocument" %>
<%
// Extracción de los parámetros recibidos
String nombre = request.getParameter("nombre");
String sImprime;
String sImprime2="";

AnalysisAndDesignDocument oRead = new AnalysisAndDesignDocument();
sImprime = oRead.measuringContent(nombre);
//sImprime2 = oRead.measuringStrings();
%>

<h2> La medición del documento muestra lo siguiente: </h2>


<h3> Texto: </h3>
<%= sImprime2 %>;
  

</body>
</html>