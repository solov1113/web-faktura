<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="includes/head.jsp" %>  
<body>

<%@ include file="includes/nav.jsp" %>

<div class="container">
<div class="row">

	<div class="col-md-4">
		<div class="panel panel-info">
			<div class="panel-heading">
				<a href="Klienci" style="text-decoration:none;color:black;">
					Klienci
				</a>
			</div> <!--/panel-hdeaing-->
		</div> <!--/panel-->
	</div> <!--/col-md-4-->

	<div class="col-md-4">
		<div class="panel panel-warning">
			<div class="panel-heading">
				<a href="Produkty" style="text-decoration:none;color:black;">
					Produkty
				</a>
			</div> <!--/panel-hdeaing-->
		</div> <!--/panel-->
	</div> <!--/col-md-4-->
	
	<div class="col-md-4">
		<div class="panel panel-success">
			<div class="panel-heading">
				<a href="Faktury" style="text-decoration:none;color:black;">
					Zamówienia
				</a>
			</div> <!--/panel-hdeaing-->
		</div> <!--/panel-->
	</div> <!--/col-md-4-->

</div> <!--/row-->
</div> <!-- container -->

<%@ include file="includes/footer.jsp" %>	

</body>
</html>