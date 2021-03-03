<html>
<head>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
/*function alieni()
{$("#bottone1").click(function()
		{
			jQuery.getJSON("webapi/aliens", function(alien)
					{
						console.log(alien[0].name);
						console.log(alien[0].points);
					})
		});
		
	}*/
	function alieni()
	{	jQuery.getJSON("webapi/aliens", function(alien)
						{	console.log(alien[0].name);
							console.log(alien[0].points);
							$("#field1").val(alien[0].name);
							$("#field2").val(alien[0].points);
						})
		
	}
			

</script>
</head>
<body>
    <h2>Jersey RESTful Web Application!</h2>
    <p><a href="webapi/myresource">Jersey resource</a>
    <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
    for more information on Jersey!
    </p>
    
     <p>Clicca per ottenere gli  <a href="webapi/aliens">alieni</a>.</p>
     <button id="bottone1" value="clicca per gli alieni" onclick="alieni()"></button> <!-- onclick="alieni()"-->
     
     Nome: <input id="field1" type="text"/>
     Punti: <input id="field2" type="text"/>
</body>
</html>
