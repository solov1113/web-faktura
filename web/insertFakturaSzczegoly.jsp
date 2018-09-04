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
                <li class="active">Dodaj fakturę</li>
            </ol>

            <div class="panel panel-default">

                <div class="panel-heading">
                    <div class="page-heading"> <i class="glyphicon glyphicon-edit"></i> Dodaj fakturę</div>
                </div>

                <form class="form-horizontal" id="insertFakturaSzczegoly" action="insertFakturaSzczegoly" method="GET" enctype="multipart/form-data">

                    <div class="modal-header"><h4 class="modal-title"><i class="fa fa-plus"></i> Wpisz dane</h4></div>
                    <div class="modal-body" style="overflow:auto;">
                        <div id="insertFakturaMessagess"></div>

                        <div class="form-group">
                            <label for="idFkFaktura" class="col-sm-3 control-label">idFkFaktura :</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="idFkFaktura" placeholder="wpisz datę" name="idFkFaktura" autocomplete="off" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="idFkProdukt" class="col-sm-3 control-label">idFkProdukt :</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="idFkProdukt" placeholder="wpisz datę" name="idFkProdukt" autocomplete="off" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="Sztuk" class="col-sm-3 control-label">Sztuk :</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="Sztuk" placeholder="wpisz datę" name="Sztuk" autocomplete="off" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="CenaJednostkowa" class="col-sm-3 control-label">CenaJednostkowa :</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="CenaJednostkowa" placeholder="wpisz datę" name="CenaJednostkowa" autocomplete="off" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="SumaNetto" class="col-sm-3 control-label">SumaNetto :</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="SumaNetto" placeholder="wpisz datę" name="SumaNetto" autocomplete="off" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="SumaBrutto" class="col-sm-3 control-label">SumaBrutto :</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="SumaBrutto" placeholder="wpisz datę" name="SumaBrutto" autocomplete="off" required>
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