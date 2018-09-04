<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="includes/head.jsp" %>  
<body>

<%@ include file="includes/nav.jsp" %>

<div class="container">
<div class="row">
	<div class="col-md-12">
		<ol class="breadcrumb">
		  <li><a href="Pulpit">Pulpit</a></li>	
		  <li><a href="Produkty">Produkty</a></li>		  
		  <li class="active">Dodaj produkt</li>
		</ol>

		<div class="panel panel-default">
		
			<div class="panel-heading">
				<div class="page-heading"> <i class="glyphicon glyphicon-edit"></i> Dodaj Produkt</div>
			</div>
			
			
<br>		
<div style="text-align: center;">
<h3 class="bg-success">Produkt został dodany do bazy!</h3>
<p><a href="Produkty">Pokaż Produkty</a></p>
</div>
<br><br>



	</div> <!-- /panel -->		
	</div> <!-- /col-md-12 -->
</div> <!-- /row -->
</div> <!-- /container -->

<%@ include file="includes/footer.jsp" %>	
</body>
</html>