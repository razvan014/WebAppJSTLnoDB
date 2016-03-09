<%@page import="java.util.List"%>
<%@page import="model.Produs"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- Ca sa functioneze JSTL-ul trebuie importat acest taglib 
si trebuie pus jar-ul de jstl pe proiect (de pe maven).
Ceea ce inseamna ce browserele nu stiu jstl-->
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Il punem in lib si il adaugam pe build path -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" 
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="/Electronic_JSTL/css/style.css">
<title>Magazinul nostru caldut</title>
</head>
<body>
	<div class="header">
		<ul class="nav nav-pills">
			<li><a href="index.html">Home</a></li>
			<li class="active"><a href="#">Produse</a></li>
		</ul>
	</div> 
	<div class="jumbotron jumbo">
		<h1> Magazinul nostru caldut    </h1>
	</div>
	
	<div class="container">
		<div class="row row-space">
			<div class="col-sm-6">
				<h1>Produsele noastre</h1>
			</div>
		</div>
		<div class="row row-space">
			<div class="col-sm-9">
				<ul class="media-list">
	
	
	<!-- if in JSTL -->	
	<!-- request.getAttribute("electronice") se prescurteaza ${electronice} -->
	<!-- NU SE PUNE SPATIU INTRE ACOLADA SI GHILIMELE SI DOLAR -->
	
	<!-- Daca parametrul pentru test in if este null nu il baga in seama -->
	<c:if test="${electronice.size() != 0}">
	
		<!-- acesta este un for normal in JSTL -->
		<c:forEach items="${electronice}" var="produs">
			
			<li class="media">
				<div class="media-left">
					<a href="#">
					<!-- Este apelat getter-ul in expression tag si nu variabila -->
        			<img class="media-object img-uniform" src="${produs.calePoza}" 
        				alt="Generic placeholder image">
      				</a>
      			</div>
				<div class="media-body">
      				<h4 class="media-heading">${produs.denumire}</h4>
      				<p>${produs.descriere}</p>
      			</div>
			</li>	
		</c:forEach>
	</c:if>
				</ul>
			</div>
		</div>
	</div>


</body>
</html>