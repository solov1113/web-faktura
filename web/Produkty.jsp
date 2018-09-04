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
		  <li class="active">Produkty</li>
		</ol>

		<div class="panel panel-default">
		
			<div class="panel-heading">
				<div class="page-heading"> <i class="glyphicon glyphicon-edit"></i> Zarządzanie Produktami</div>
			</div>
			
			
<div class="table-responsive table-striped">
<table class="table table-responsive table-striped">
    <thead>
      <tr>
      	<th style="width: 2%;">ID</th>
      	<th style="width: 12%;">Nazwa produktu</th>
      	<th style="width: 10%;">Netto</th>
        <th style="width: 6%;">VAT</th>
        <th style="width: 8%;">Brutto</th>

        <th style="width: 6%;"></th>
        <th style="width: 6%;"></th>
      </tr>
    </thead>

    <c:forEach var="produkt" items="${produkty}">
        <tr>
            <td>${produkt.getIdProdukt()}</td>
            <td>${produkt.getNazwaProduktu()}</td>
            <td>${produkt.getCenaNetto()}</td>
            <td>${produkt.getVAT()}</td>
            <td>${produkt.getCenaBrutto()}</td>

            <td><form id="updateProdukt" action="updateProdukt.jsp" method="GET">
                <input type="hidden" name= "id" value="${produkt.getIdProdukt()}">
                <input type="hidden" name= "nazwaProduktu" value="${produkt.getNazwaProduktu()}">
                <input type="hidden" name= "cenaNetto" value="${produkt.getCenaNetto()}">
                <input type="hidden" name= "vat" value="${produkt.getVAT()}">
                <button type="submit" class="btn btn-default edytuj"> <i class="glyphicon glyphicon-edit"></i> Edytuj </button></form></td>

            <td><form id="deleteProdukt" action="deleteProdukt" method="GET">
                <input type="hidden" name= "id" value="${produkt.getIdProdukt()}">
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