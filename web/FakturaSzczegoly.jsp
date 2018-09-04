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
                            <th style="width: 50%;">Klient</th>

                            <th style="width: 6%;"></th>
                            <th style="width: 6%;"></th>
                        </tr>
                        </thead>

                        <c:forEach var="fakturaSzczegoly" items="${fakturySzczegoly}">
                            <tr>
                                <td>${fakturaSzczegoly.idFakturaSzczegoly()}</td>
                                <td>${fakturaSzczegoly.idFkFaktura()}</td>
                                <td>${fakturaSzczegoly.idFkProdukt()}</td>

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