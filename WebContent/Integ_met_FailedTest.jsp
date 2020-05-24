<html>
<head>
		<title> Failed Test </title>
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<link rel="stylesheet" href="css/estilos2.css">
		<!-- <link rel="stylesheet" href="css/estilo_divs.css">  -->
		
		<script>
$(document).ready(function(){
    $("#FailedTestResult").click(function(){
        $("#final").load("Integ_met_ResultFailedTest.jsp");
    });
});
</script>

	</head>
	
<body>
	<div class="container main col-xs-12 col-sm-6 col-md-6">

<form action="Integ_met_ResultFailedTest.jsp" method="post" >
  <div class="form-group">
  	<h5>Métrica Failed Test</h5>
    <label for="NumFailedTest">Introduzca el número de pruebas fallidas</label>
    <input type="text" name="val1FailedTest" class="form-control" id="exampleFailedTest" aria-describedby="successTest" placeholder="Enter number failedtest">
  </div>
  <div class="form-group">
    <label for="NumFailedTest2">Introduzca el número de pruebas ejecutadas</label>
    <input type="text" name="val2FailedTest" class="form-control" id="exampleFailedTest2" aria-describedby="successTest2" placeholder="Enter number failedtest2">
  </div>
  <button type="submit" class="btn btn-success" data-toggle="modal" data-target="Integ_met_ResultFailedTest.jsp">Submit</button>
</form>


	</div>
</body>
</html>