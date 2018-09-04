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
                <li><a href="Faktury">Faktury</a></li>
                <li class="active">Dodaj zamówinie</li>
            </ol>

            <div class="panel panel-default">

                <div class="panel-heading">
                    <div class="page-heading"> <i class="glyphicon glyphicon-edit"></i> Dodaj fakturę</div>
                </div>

                <form class="form-horizontal" id="insertFaktura" action="insertFaktura" method="GET" enctype="multipart/form-data">

                    <div class="modal-header"><h4 class="modal-title"><i class="fa fa-plus"></i> Wpisz dane</h4></div>
                    <div class="modal-body" style="overflow:auto;">
                        <div id="insertFakturaMessagess"></div>

                        <div class="form-group">
                            <label for="dataFaktury" class="col-sm-3 control-label">Data Faktury :</label>
                            <div class="col-sm-8">
                                <input type="date" class="form-control" id="dataFaktury" placeholder="wpisz datę" name="dataFaktury" autocomplete="off" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label">Nazwa klienta:</label>
                            <div class="col-sm-8">

                                <select name="fkIdKlient" form="insertFaktura" class="form-control" >

                                    <c:forEach var="klient" items="${klienci}">
                                        <tr>
                                            <option value="${klient.getNazwaFirmy()}">${klient.getNazwaFirmy()}</option>
                                        </tr>
                                    </c:forEach>
                                </select>

                                <%--<input type="number" step="any" class="form-control" id="fkIdKlient" placeholder="wpisz id klienta" name="fkIdKlient" autocomplete="off" required>--%>
                            </div>
                        </div>


                        <div class="form-group">
                            <label class="col-sm-3 control-label">Produkt:</label>
                            <div class="col-sm-8">

                                <select name="FkIdProdukt" form="insertFaktura" class="form-control" >

                                    <c:forEach var="produkt" items="${produkty}">
                                        <tr>
                                            <option value="${produkt.getNazwaProduktu()}">${produkt.getNazwaProduktu()}</option>
                                        </tr>

                                    </c:forEach>
                                </select>

                            </div>
                        </div>

                        <div class="form-group">
                            <label for="Sztuk" class="col-sm-3 control-label">Sztuk :</label>
                            <div class="col-sm-8">
                                <input type="number" step="any"  class="form-control" id="Sztuk" placeholder="wpisz liczbę sztuk" name="Sztuk" autocomplete="off" required>
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