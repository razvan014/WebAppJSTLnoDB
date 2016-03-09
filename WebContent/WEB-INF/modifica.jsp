<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="/Electronic_JSTL/css/style.css">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-sm-8">
				<h1>Modifica produsul</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-8">
				<form role="form" action="modifica-produs" method="post">
					<div class="form-group">
						<label for="denumire">Denumire :</label> <input type="text"
							class="form-control" name="denumire" value="${produs.denumire}">
					</div>
					<div class="form-group">
						<label for="pret">Pret:</label> <input type="text"
							class="form-control" name="pret" value="${produs.pret}">
					</div>
					<div class="form-group">
						<label for="descriere">Descriere:</label> <input type="textarea"
							class="form-control" name="descriere" value="${produs.descriere}">
					</div>
					<div class="form-group">
						<label for="id"></label> <input type="hidden"
							class="form-control" name="id" value="${produs.id}">
					</div>
					<button type="submit" class="btn btn-default">Modifica produsul</button>
				</form>
			</div>
			<div class="col-sm-4">
				<p>${mesaj}</p>
				<a href="home">Inapoi</a>
			</div>
		</div>
	</div>



</body>
</html>