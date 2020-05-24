<html>
<head>
		<title> Measuring LOC </title>
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<link rel="stylesheet" href="css/estilos2.css">
		<!-- <link rel="stylesheet" href="css/estilo_divs.css">  -->
		
<script>
$(document).ready(function(){
    $("#MeasuringLOC").click(function(){
        $("#inferior").load("Cons_met_ResultMeasuringLOC.jsp");
    });
});
</script>

	</head>
	
<body>
   <div class="container main col-xs-12 col-sm-6 col-md-6">
 	<form id="metLOC" action="Cons_met_ResultMeasuringLOC.jsp" method="post" >
  		<div class="form-group">
  			<h5>Métrica Measuring LOC</h5>
    		<label for="NumCoveredReq">Ingrese el nombre del proyecto</label>
   			 <input type="text" name="val1project" class="form-control" id="val1project" aria-describedby="val1project" placeholder="Enter project name">
  		</div>
  		<div class="form-group">
   			 <label for="NumCoveredReq2">Ingrese el nombre del paquete</label>
   			 <input type="text" name="val2package" class="form-control" id="val2package" aria-describedby="val2package" placeholder="Enter package name">
  		</div>
  		<div class="form-group">
   			 <label for="NumCoveredReq2">Ingrese el nombre de la clase</label>
   			 <input type="text" name="val3class" class="form-control" id="val3class" aria-describedby="val3class" placeholder="Enter class name">
  		</div>
  		<button type="submit" class="btn btn-success openBtn" data-toggle="modal" id="sendMeasuringLOC">Submit</button>
	 </form>
 	</div>
 	

</body>
</html>