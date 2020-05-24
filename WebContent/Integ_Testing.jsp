<html>
<head>
<title>Testing</title>
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<link rel="stylesheet" href="css/estilos2.css">
		<!-- <link rel="stylesheet" href="css/estilo_divs.css">  -->

<script>
$(document).ready(function(){
    $("#met_successfultest").click(function(){
        $("#final").load("Integ_met_SuccessTest.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#met_failedtest").click(function(){
        $("#final").load("Integ_met_FailedTest.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#met_lockedtest").click(function(){
        $("#final").load("Integ_met_LockedTest.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#met_coveredtestReq").click(function(){
        $("#final").load("Integ_met_CoveredRequirements.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#met_coveredtest").click(function(){
        $("#final").load("Integ_met_CoveredTest.jsp");
    });
});
</script>


</head>
<body>
	<div class="container main col-xs-12 col-sm-6 col-md-8">
	<ul>
	<li style="list-style:none;"><h5>Méricas disponibles en Producto Testing</h5></li>
	<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="met_successfultest">Successful Test</button></li>
	<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="met_failedtest">Failed Test</button></li>
	<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="met_lockedtest">Locked Test</button></li>
	<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="met_coveredtestReq">Covered Requirements</button></li>
	<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="met_coveredtest">Covered Test</button></li>
	</ul>
	</div>
</body>

</html>