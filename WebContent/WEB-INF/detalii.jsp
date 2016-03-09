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
			<div class="col-sm-9">
				<div class="thumbnail">
					<img src="${produs.calePoza}" alt="${produs.descriere}" class="img-uniform">
					<div class="caption">
						<h3>${produs.denumire}</h3>
						<p>${produs.descriere}</p>
						<p>
							<a href="modifica-produs?id=${produs.id}" class="btn btn-primary" role="button">Modifica produsul</a> 
							
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>