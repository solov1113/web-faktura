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
		  <li class="active">Faktury</li>
		</ol>

		<div class="panel panel-default">
		
			<div class="panel-heading">
				<div class="page-heading"> <i class="glyphicon glyphicon-edit"></i> Zarządzanie Fakturami</div>
			</div>
			
			
<div class="table-responsive table-striped">
<table class="table table-responsive table-striped">
    <thead>
      <tr>
      	<th style="width: 10%;">ID Faktury</th>
      	<th style="width: 20%;">Data Faktury</th>
        <th style="width: 20%;">Klient</th>
        <th style="width: 20%;">Produkt</th>
        <th style="width: 20%;">Sztuk</th>

        <th style="width: 6%;"></th>
        <th style="width: 6%;"></th>
      </tr>
    </thead>

    <c:forEach var="faktura" items="${faktury}">
        <tr>
            <td>${faktura.getIdFaktura()}</td>
            <td>${faktura.getDataFaktury()}</td>
            <td>${faktura.getFkIdKlient()}</td>
            <td>${faktura.getFkIdProdukt()}</td>
            <td>${faktura.getSztuk()}</td>
            <td>${faktura.getSumaNetto()}</td>
            <td>${faktura.getSumaBrutto()}</td>

            <td><form id="FakturaSzczegoly" action="FakturaSzczegoly.jsp" method="GET">
                <input type="hidden" name= "id" value="${faktura.getIdFaktura()}">
                <button type="submit" class="btn btn-default edytuj"> <i class="glyphicon glyphicon-edit"></i> Drukuj </button></form></td>

            <td><form id="deleteFaktura" action="deleteFaktura" method="GET">
                <input type="hidden" name= "id" value="${faktura.getIdFaktura()}">
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