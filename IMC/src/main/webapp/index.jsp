<!DOCTYPE html>
<html lang="en">
<head>
	<title>Calculo IMC</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images\icons\Icons8-Windows-8-Science-Scale.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>

	<div class="bg-contact2" style="background-image: url('images/maxresdefault.jpg');">
		<div class="container-contact2">
			<div class="wrap-contact2">
				<form class="contact2-form validate-form" action="index.jsp" method="POST">
					<span class="contact2-form-title">
						Calculo de IMC
					</span>

					<div class="wrap-input2 validate-input" data-validate="Name is required">
						<input class="input2" type="text" name="peso">
						<span class="focus-input2" data-placeholder="PESO"></span>
					</div>

					<div class="wrap-input2 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input2" type="text" name="altura">
						<span class="focus-input2" data-placeholder="ALTURA"></span>
					</div>
					<%@page language="java"%>
				<% 
                         
                String pesoStr = request.getParameter("peso");
                String alturaStr = request.getParameter("altura");
                String condicaoAtual = "Informe seus dados";
                if(pesoStr != null && !pesoStr.isEmpty() || alturaStr != null && !pesoStr.isEmpty()){
                    float altura = Float.parseFloat(alturaStr);
                    float peso = Float.parseFloat(pesoStr);
                    
                    float imc =  peso / (altura * altura);
                    if(imc < 18){
                        condicaoAtual = "Your weight is too low.";
                    }else if(imc >= 18 && imc < 25){
                        condicaoAtual = "You have normal weight.";
                    }else if(imc >= 25 && imc < 30){
                        condicaoAtual = "Your weight is too high.";
                    }else{
                        condicaoAtual = "You have obesity.";
                    }
                }
                %>

					<!--<div class="wrap-input2 validate-input" data-validate = "Message is required">
						<textarea class="input2" name="message"></textarea>
						<span class="focus-input2" data-placeholder="MESSAGE"></span>
					</div>-->

					<div class="container-contact2-form-btn">
						<div class="wrap-contact2-form-btn">
							<div class="contact2-form-bgbtn"></div>
							<button class="contact2-form-btn" type="submit">
								CALCULAR
							</button>
						</div>
					</div>
					<div class="card">

                    <%
                    out.println("Your IMC: " + imc);
                    out.println(condicaoAtual);
                    %>

                </div>
				</form>
			</div>
		</div>
	</div>




<!--===============================================================================================
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================
	<script src="js/main.js"></script>

	<!-- Global site tag (gtag.js) - Google Analytics 
	<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
	<script>
	  window.dataLayer = window.dataLayer || [];
	  function gtag(){dataLayer.push(arguments);}
	  gtag('js', new Date());

	  gtag('config', 'UA-23581568-13');
	</script> -->

</body>
</html>
