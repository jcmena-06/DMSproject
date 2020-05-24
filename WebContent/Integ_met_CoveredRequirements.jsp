<html>
<head>
		<title> Covered Requirements Test </title>
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<link rel="stylesheet" href="css/estilos2.css">
		<!-- <link rel="stylesheet" href="css/estilo_divs.css">  -->
		
		<script>
$(document).ready(function(){
    $("#CoveredReqTestResult").click(function(){
        $("#final").load("Integ_met_ResultCoveredRequirements.jsp");
    });
});
</script>

	</head>
	
<body>
	<div class="container main col-xs-12 col-sm-6 col-md-6">
	
<form id="SuccTest" action="Integ_met_ResultCoveredRequirements.jsp" method="post" >
  		<div class="form-group">
  			<h5>Métrica Covered Requirements</h5>
    		<label for="NumCoveredReq">Introduzca el número de requerimientos cubiertos</label>
   			 <input type="text" name="val1CoveredReq" class="form-control" id="val1CoveredReq" aria-describedby="coveredReq" placeholder="Enter number coveredReq">
  		</div>
  		<div class="form-group">
   			 <label for="NumCoveredReq2">Introduzca el número de requerimientos especificados</label>
   			 <input type="text" name="val2CoveredReq" class="form-control" id="val2CoveredReq" aria-describedby="coveredReq2" placeholder="Enter number coveredReq2">
  		</div>
  		<button type="submit" class="btn btn-success openBtn" data-toggle="modal" id="sendCoveredReq">Submit</button>
	 </form>





</div>

</body>
</html>