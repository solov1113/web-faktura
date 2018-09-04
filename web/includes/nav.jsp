<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<nav class="navbar navbar-default navbar-static-top">
	<div class="container">
	
    	<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" 
				data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
      	</button>
        </div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">      
			<ul class="nav navbar-nav navbar-right">        
				<li id="navPulpit"><a href="Pulpit"><i class="glyphicon glyphicon-home"></i>  Pulpit</a></li>          
				
				<li class="dropdown" id="navKlienci">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <i class="glyphicon glyphicon-user"></i> Klienci <span class="caret"></span></a>
					<ul class="dropdown-menu">                   
					<li id="topPokazKlientow"><a href="Klienci"> <i class="glyphicon glyphicon-edit"></i> Pokaż klientów</a></li>
					<li id="topInsertKlient"><a href="insertKlient.jsp"> <i class="glyphicon glyphicon-plus"></i> Dodaj klienta</a></li>              
					</ul>
				</li>
				 	  
				<li class="dropdown" id="navProdukty">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <i class="glyphicon glyphicon-th-list"></i> Produkty <span class="caret"></span></a>
					<ul class="dropdown-menu">                   
					<li id="topPokazProdukty"><a href="Produkty"> <i class="glyphicon glyphicon-edit"></i> Pokaż produkty</a></li>
					<li id="topInsertProdukt"><a href="insertProdukt.jsp"> <i class="glyphicon glyphicon-plus"></i> Dodaj produkt</a></li>              
					</ul>
				</li>

				
				<li class="dropdown" id="navFaktury">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <i class="glyphicon glyphicon-check"></i> Zamówienia <span class="caret"></span></a>
					<ul class="dropdown-menu">            
					<li id="topPokazFaktury"><a href="Faktury"> <i class="glyphicon glyphicon-edit"></i> Pokaż Zamówienia</a></li>
					<li id="topInsertFaktura"><a href="insertFaktura.jsp"> <i class="glyphicon glyphicon-plus"></i> Dodaj zamówienie</a></li>
					</ul>
				</li> 
				
				<li class="dropdown" id="navUstawienia">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <i class="glyphicon glyphicon-user"></i> <span class="caret"></span></a>
					<ul class="dropdown-menu">            
		            <li id="topNavSetting"><a href="#"> <i class="glyphicon glyphicon-wrench"></i> Ustawienia</a></li>            
		            <li id="topNavLogout"><a href="#"> <i class="glyphicon glyphicon-log-out"></i> Wyloguj</a></li>            
		          	</ul>
				</li>             
			</ul>
		</div>
	</div>
</nav>