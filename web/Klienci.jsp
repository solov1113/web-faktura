<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<%@ include file="includes/head.jsp" %>  
<body>

<%@ include file="includes/nav.jsp" %>

<div class="container">
<div class="row">
	<div class="col-md-12">
		<ol class="breadcrumb">
		  <li><a href="Pulpit">Pulpit</a></li>		  
		  <li class="active">Klienci</li>
		</ol>

		<div class="panel panel-default">
		
			<div class="panel-heading">
				<div class="page-heading"> <i class="glyphicon glyphicon-edit"></i> Zarządzanie Klientami</div>
			</div>
			
			
<div class="table-responsive table-striped">
<table class="table table-responsive table-striped">
    <thead>
      <tr>
      	<th style="width: 2%;">ID</th>
      	<th style="width: 12%;">Nazwa firmy</th>
      	<th style="width: 10%;">NIP</th>
        <th style="width: 6%;">Imię</th>
        <th style="width: 8%;">Nazwisko</th>
        <th style="width: 10%;">Ulica / nr</th>
        <th style="width: 6%;">Kod</th>
        <th style="width: 8%;">Miasto</th>
        <th style="width: 10%;">Telefon</th>
        <th style="width: 12%;">Email</th>
        <th style="width: 6%;"></th>
        <th style="width: 6%;"></th>
      </tr>
    </thead>

    <%--<tbody>${dane}</tbody>--%>

    <c:forEach var="klient" items="${klienci}">
    <tr>
        <td>${klient.getIdKlient()}</td>
        <td>${klient.getNazwaFirmy()}</td>
        <td>${klient.getNIP()}</td>
        <td>${klient.getImie()}</td>
        <td>${klient.getNazwisko()}</td>
        <td>${klient.getAdres()}</td>
        <td>${klient.getKodPocztowy()}</td>
        <td>${klient.getMiejscowosc()}</td>
        <td>${klient.getTelefon()}</td>
        <td>${klient.getEmail()}</td>

        <td><form id="updateKlient" action="updateKlient.jsp" method="GET">
        <input type="hidden" name= "id" value="${klient.getIdKlient()}">
        <input type="hidden" name= "nazwaFirmy" value="${klient.getNazwaFirmy()}">
        <input type="hidden" name= "nip" value="${klient.getNIP()}">
        <input type="hidden" name= "imie" value="${klient.getImie()}">
        <input type="hidden" name= "nazwisko" value="${klient.getNazwisko()}">
        <input type="hidden" name= "adres" value="${klient.getAdres()}">
        <input type="hidden" name= "kodPocztowy" value="${klient.getKodPocztowy()}">
        <input type="hidden" name= "miejscowosc" value="${klient.getMiejscowosc()}">
        <input type="hidden" name= "telefon" value="${klient.getTelefon()}">
        <input type="hidden" name= "email" value="${klient.getEmail()}">
        <button type="submit" class="btn btn-default edytuj"> <i class="glyphicon glyphicon-edit"></i> Edytuj </button></form></td>
        <td><form id="deleteKlient" action="deleteKlient" method="GET">
        <input type="hidden" name= "id" value="${klient.getIdKlient()}">
        <button type="submit" class="btn btn-default usun"> <i class="glyphicon glyphicon-trash"></i> Usuń </button></form></td>

    </tr>
</c:forEach>


</table>
</div>


		</div> <!-- /panel -->		
	</div> <!-- /col-md-12 -->
</div> <!-- /row -->

</div> <!-- container -->

<%@ include file="includes/footer.jsp" %>	
</body>
</html>