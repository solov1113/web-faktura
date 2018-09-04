<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="includes/head.jsp" %>  
<body>
<%@ include file="includes/nav.jsp" %>

<div class="container">
<div class="row">
	<div class="col-md-12">
		<ol class="breadcrumb">
		  <li><a href="Pulpit">Pulpit</a></li>	
		  <li><a href="Klienci">Klienci</a></li>		  
		  <li class="active">Aktualizuj klienta</li>
		</ol>

		<div class="panel panel-default">
		
			<div class="panel-heading">
				<div class="page-heading"> <i class="glyphicon glyphicon-edit"></i> Aktualizuj klienta</div>
			</div>
			
		

<form class="form-horizontal" id="updateKlient" action="updateKlient" method="GET" enctype="multipart/form-data">

	<div class="modal-header"><h4 class="modal-title"><i class="fa fa-plus"></i> Wpisz dane</h4></div>
		<div class="modal-body" style="overflow:auto;">
			<div id="insertKlientMessagess"></div>
			
			<input type="hidden" name="id" value="<%= request.getParameter("id")%>">

	        <div class="form-group">
	        	<label for="nazwaFirmy" class="col-sm-3 control-label">Nazwa firmy :</label>
				<div class="col-sm-8">
			
				<input type="text" class="form-control" id="nazwaFirmy" value="<%= request.getParameter("nazwaFirmy")%>" name="nazwaFirmy" autocomplete="off" required>
				</div>
	        </div>

	        <div class="form-group">
	        	<label for="nip" class="col-sm-3 control-label">NIP :</label>
				<div class="col-sm-8">
				<input type="text" class="form-control" id="nip" value="<%= request.getParameter("nip")%>" name="nip" autocomplete="off" required>
				</div>
	        </div>
	        
	        <div class="form-group">
	        	<label for="imie" class="col-sm-3 control-label">Imię :</label>
				<div class="col-sm-8">
				<input type="text" class="form-control" id="imie" value="<%= request.getParameter("imie")%>" name="imie" autocomplete="off" required>
				</div>
	        </div>
	        
	        <div class="form-group">
	        	<label for="nazwisko" class="col-sm-3 control-label">Nazwisko :</label>
				<div class="col-sm-8">
				<input type="text" class="form-control" id="nazwisko" value="<%= request.getParameter("nazwisko")%>" name="nazwisko" autocomplete="off" required>
				</div>
	        </div>
	        
	        <div class="form-group">
	        	<label for="adres" class="col-sm-3 control-label">Ulica / nr :</label>
				<div class="col-sm-8">
				<input type="text" class="form-control" id="adres" value="<%= request.getParameter("adres")%>" name="adres" autocomplete="off" required>
				</div>
	        </div>
	        
	        <div class="form-group">
	        	<label for="kodPocztowy" class="col-sm-3 control-label">Kod pocztowy :</label>
				<div class="col-sm-8">
				<input type="text" class="form-control" id="kodPocztowy" value="<%= request.getParameter("kodPocztowy")%>" name="kodPocztowy" autocomplete="off" required>
				</div>
	        </div>
	        
	        <div class="form-group">
	        	<label for="miejscowosc" class="col-sm-3 control-label">Miejscowość :</label>
				<div class="col-sm-8">
				<input type="text" class="form-control" id="miejscowosc" value="<%= request.getParameter("miejscowosc")%>" name="miejscowosc" autocomplete="off" required>
				</div>
	        </div>
	        
	        <div class="form-group">
	        	<label for="telefon" class="col-sm-3 control-label">Telefon :</label>
				<div class="col-sm-8">
				<input type="text" class="form-control" id="telefon" value="<%= request.getParameter("telefon")%>" name="telefon" autocomplete="off" required>
				</div>
	        </div>
	        
	        <div class="form-group">
	        	<label for="email" class="col-sm-3 control-label">Email :</label>
				<div class="col-sm-8">
				<input type="email" class="form-control" id="email" value="<%= request.getParameter("email")%>" name="email" autocomplete="off" required>
				</div>
	        </div>

			<div class="modal-footer">
	        <button type="submit" class="btn btn-primary"> <i class="glyphicon glyphicon-ok-sign"></i> Zapisz</button>
			</div>  
		
	      
	       </div> <!-- /modal-body -->    
     	</form> <!-- /.form -->	     

<!-- / insertKlient -->

	</div> <!-- /panel -->		
	</div> <!-- /col-md-12 -->
</div> <!-- /row -->
</div> <!-- /container -->

<%@ include file="includes/footer.jsp" %>	
</body>
</html>