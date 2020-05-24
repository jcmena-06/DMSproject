<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Primer Bootstrap</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
	<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
	<script src="js/jquery-3.3.1.min.js"></script>
	<link rel="stylesheet" href="css/estilos2.css">
	
<script>
$(document).ready(function(){
    $("#requerimientos").click(function(){
        $("#centro").load("RequirementsPhase.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#analisis").click(function(){
        $("#centro").load("AnalysisAndDesignPhase.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#construccion").click(function(){
        $("#centro").load("ConstructionPhase.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#integracion").click(function(){
        $("#centro").load("IntegrationAndTestingPhase.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#cierre").click(function(){
        $("#centro").load("ClosingPhase.jsp");
    });
});
</script>
	
</head>
<body>
	<header>
		<div class="container">
			<h1>DMS MoProSoft</h1>
		</div>
	</header>
	<div class="container-fluid">
			<section class="main row">
	</section>
	
		<div class="row">
					<div id="izquierdo" class=" main col-xs-12 col-sm-6 col-md-4">
						 <ul>
							<li style="list-style:none;"><h2>Fases DMS</h2></li>	
							<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="requerimientos"><i class="icono izquierda fas fa-list-ul"></i>Fase de Requerimientos</button></li>
							<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="analisis"><i class="icono izquierda fas fa-chart-pie"></i>Fase de Análisis y Diseño</button></li>
							<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="construccion"><i class="icono izquierda fas fa-code"></i>Fase de Construcción</button></li>
							<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="integracion"><i class="icono izquierda fas fa-code-branch"></i>Fase de Integración y Pruebas</button></li>
							<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="cierre"><i class="icono izquierda fab fa-codepen"></i>Fase de Cierre</button></li>
						</ul>
					</div>
				
					<div id="centro" class="main col-xs-12 col-sm-6 col-md-4">
						
				 	</div>
				 	<div id="derecha" class="main col-xs-12 col-sm-6 col-md-4">
						
				   </div>
		</div> 
		<div class="row">
				
				 
				<div id="final" class="main col-xs-12 col-sm-6 col-md-6">
					
				 </div>
				 
				 <div id="final2" class="main col-xs-12 col-sm-6 col-md-6">
					
				 </div>
		</div>
	
	</div>
		<!-- <footer>
			<div class="container">
				<h3>Footer</h3>
			</div>
		</footer>  -->
	
	
	<!-- <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>  -->
</body>

</html>