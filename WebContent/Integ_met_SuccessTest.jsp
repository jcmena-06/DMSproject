<html>
<head>
		<title> Successful Test </title>
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<link rel="stylesheet" href="css/estilos2.css">
		<!-- <link rel="stylesheet" href="css/estilo_divs.css">  -->
		
<script>
$(document).ready(function(){
    $("#SuccessTestResult").click(function(){
        $("#frameResult").load("Integ_met_ResultSuccessfulTest.jsp");
    });
});
</script>

<!-- <script>
$('.openBtn').on('click',function(){
    $('.modal-body').load('Integ_met_ResultSuccessfulTest.jsp',function(){
        $('#myModal').modal({show:true});
    });
});
</script>  -->

	</head>
	
<body>
	<div class="container main col-xs-12 col-sm-6 col-md-6">
	 <form id="SuccTest" action="Integ_met_ResultSuccessfulTest.jsp" method="post" >
  		<div class="form-group">
  			<h5>Métrica Successful Test</h5>
    		<label for="NumSuccessTest">Introduzca el número de pruebas exitósas</label>
   			 <input type="text" name="val1SuccessTest" class="form-control" id="val1SuccessTest" aria-describedby="successTest" placeholder="Enter number successtest">
  		</div>
  		<div class="form-group">
   			 <label for="NumSuccessTest2">Introduzca el número de pruebas ejecutadas</label>
   			 <input type="text" name="val2SuccessTest" class="form-control" id="val2SuccessTest" aria-describedby="successTest2" placeholder="Enter number successtest2">
  		</div>
  		<button type="submit" class="btn btn-success openBtn" data-toggle="modal" id="sendSusccesTest">Submit</button>
	 </form>
	 
 		</div>
 		
</body>
</html>