<%@page import="model.Model"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<title>ACCUEIL</title>
</head>

<%
	Model m = (Model) request.getAttribute("hala");
%>

<body>



	<div class="card  mx-auto " style="width: 50rem;">
		<div class="card-header bg-primary ">Formulaire</div>
		<div class="card-body">
			<form action="ServletController" method="post">
				<div class="form-group">
					<label for="taux">Taux</label> <input type="text"
						class="form-control" id="taux" name="taux" value="<%=m.getTaux() %>"
						placeholder="Saisir taux">

				</div>
				<div class="form-group">
					<label for="duree">Duree</label> <input type="text"
						class="form-control" id="duree" name="duree" value ="<%= m.getDuree()%>"
						placeholder="Saisir duree">

				</div>
				<div class="form-group">
					<label for="montant">montant</label> <input type="text"
						class="form-control" id="montant" name="montant" value ="<%= m.getMontant()%>"
						placeholder="Saisir montant">

				</div>
				<button type="submit" class="btn btn-danger">Calculer</button>
			</form>    <p>  </p>
			
				<p> Mensualite = <%=m.getMensualite() %> </p>
		</div>
	</div>


</body>
</html>