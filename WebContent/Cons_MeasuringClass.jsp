<html>
<head>
	<title>Measuring Class</title>
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<link rel="stylesheet" href="css/estilos2.css">
		<!-- <link rel="stylesheet" href="css/estilo_divs.css">  -->

<script>
$(document).ready(function(){
    $("#measuringLOC").click(function(){
        $("#final").load("Cons_met_MeasuringLOC.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#measuringMethods").click(function(){
        $("#final").load("Cons_met_MeasuringMethods.jsp");
    });
});
</script>
</head>

<body>
	<div class="container main col-xs-12 col-sm-6 col-md-8">
	<ul>
		<li style="list-style:none;"><h3>M�tricas para medir la Clase</h3></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="measuringLOC">Measuring LOC</button></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="measuringMethods">Measuring methods</button></li>
	
	</ul>
	</div>

</body>
</html>