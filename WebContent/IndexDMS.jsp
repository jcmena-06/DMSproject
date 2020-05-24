<html>
<head>

<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0,
	maximum-scale=1.0, minimum-scale=1.0">
	
<title>Proyecto DMS</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="css/estilo_divs.css">

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

<div id="contenedor">

	<div id="izquierda">
		<ul>
			<li style="list-style:none;"><h2>Fases DMS</h2></li>	
			<li style="list-style:none;"><button class="selected" id="requerimientos"><i class="icono izquierda fas fa-list-ul"></i>Fase de Requerimientos</button></li>
			
			<li style="list-style:none;"><button class="selected" id="analisis"><i class="icono izquierda fas fa-chart-pie"></i>Fase de Análisis y Diseño</button></li>
			
			<li style="list-style:none;"><button class="selected" id="construccion"><i class="icono izquierda fas fa-code"></i>Fase de Construcción</button></li>
			
			<li style="list-style:none;"><button class="selected" id="integracion"><i class="icono izquierda fas fa-code-branch"></i>Fase de Integración y Pruebas</button></li>
			
			<li style="list-style:none;"><button class="selected" id="cierre"><i class="icono izquierda fab fa-codepen"></i>Fase de Cierre</button></li>
		</ul>
	</div>
	
	<div id="centro">
	<h1></h1>
	</div>
	
	<div id="derecha">
	<h1></h1>
	</div>
	
	<div id="final">
	<h1></h1>
	</div>
	
	<div id="inferior">
			<h1></h1>
		</div>

</div>

</body>
</html>