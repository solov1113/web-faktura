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
				<div class="page-heading"> <i class="glyphicon glyphicon-edit"></i> Dodaj produkt</div>
			</div>
				
<form class="form-horizontal" id="insertProdukt" action="insertProdukt" method="GET" enctype="multipart/form-data">

	<div class="modal-header"><h4 class="modal-title"><i class="fa fa-plus"></i> Wpisz dane</h4></div>
		<div class="modal-body" style="overflow:auto;">
			<div id="insertKlientMessagess"></div>

	        <div class="form-group">
	        	<label for="nazwaProduktu" class="col-sm-3 control-label">Nazwa produktu :</label>
				<div class="col-sm-8">
				<input type="text" class="form-control" id="nazwaProduktu" placeholder="wpisz nazwę produktu" name="nazwaProduktu" autocomplete="off" required>
				</div>
	        </div>

	        <div class="form-group">
	        	<label for="cenaNetto" class="col-sm-3 control-label">Cena netto:</label>
				<div class="col-sm-8">
				<input type="number" step="any" class="form-control" id="cenaNetto" placeholder="wpisz cenę netto" name="cenaNetto" autocomplete="off" required>
				</div>
	        </div>
	        
	        <div class="form-group">
	        	<label for="vat" class="col-sm-3 control-label">VAT :</label>
				<div class="col-sm-8">
				<select class="form-control" id="vat" name="vat" required>
					<option value="">Stawka VAT</option>
					<option value="23">23%</option>
					<option value="8">8%</option>
					<option value="0">0%</option>
				</select>
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