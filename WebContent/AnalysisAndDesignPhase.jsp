<html>
<head>
<title>Analysis And Design Phase</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<link rel="stylesheet" href="css/estilos2.css">
    <!-- <link rel="stylesheet" href="css/estilo_divs.css">  -->

<script>
$(document).ready(function(){
    $("#analysisdocument").click(function(){
        $("#derecha").load("Des_AnalysisAndDesignDoc.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#casosuso").click(function(){
        $("#derecha").load("Des_UseCase.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#classdiagram").click(function(){
        $("#derecha").load("Des_ClassDiagram.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#sequencediagram").click(function(){
        $("#derecha").load("Des_SequenceDiagram.jsp");
    });
});
</script>

<script>
$(document).ready(function(){
    $("#statediagram").click(function(){
        $("#derecha").load("Des_StateDiagram.jsp");
    });
});
</script>
</head>

<body>
	<div class="container main col-xs-12 col-sm-6 col-md-8">
	<ul>
		<li style="list-style:none;"><h5>Métricas en fase Análisis y Diseño</h5></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="analysisdocument">Analysis and Design<br> Document</button></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="casosuso">Use Case</button></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="classdiagram">Class Diagram</button></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="sequencediagram">Sequence Diagram</button></li>
		<li style="list-style:none;"><button type="button" class="btn btn-primary btn-block" id="statediagram">State Diagram</button></li>
	</ul>
	</div>

</body>
</html>