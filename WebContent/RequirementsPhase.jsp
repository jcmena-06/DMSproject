<html>
<head>
<title>Requirements Phase</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<link rel="stylesheet" href="css/estilos2.css">
<!-- <link rel="stylesheet" href="css/estilo_divs.css">  -->
<script>
$(document).ready(function(){
    $("#testplan").click(function(){
        $("#derecha").load("Req_TestPlan.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#testplan").click(function(){
        $("#derecha").load("Req_TestPlan.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#usermanual").click(function(){
        $("#derecha").load("Req_UserManual.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#documentsrs").click(function(){
        $("#derecha").load("Req_DocumentSRS.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#docrequirements").click(function(){
        $("#derecha").load("Req_Requirements.jsp");
    });
});
</script>

</head>

<body>
<div class="container main col-xs-12 col-sm-6 col-md-8">
	<ul>
		<li style="list-style:none;"><h5>Métricas en fase de Requerimientos</h5></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="testplan">Test Plan</button></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="usermanual">User Manual</button></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="documentsrs">Document SRS</button></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="docrequirements">Requirements</button></li>
	</ul>
</div>	



</body>
</html>