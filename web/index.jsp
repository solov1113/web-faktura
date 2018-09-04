<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="includes/head.jsp" %>
<body>
<div class="container">
  <div class="row vertical">
    <div class="col-md-5 col-md-offset-4">
      <div class="panel panel-info">
        <div class="panel-heading">
          <h3 class="panel-title">Logowanie</h3>
        </div>

        <div class="panel-body">
          <div class="messages"> </div>

          <!-- <form class="form-horizontal" action="Pulpit" method="post" id="loginForm"> -->
          <fieldset>
            <div class="form-group">
              <label for="username" class="col-sm-3 control-label">Username: </label>
              <div class="col-sm-9">
                <input type="text" class="form-control" id="username" name="username" placeholder="Username" autocomplete="off" />
              </div>
            </div>
            <div class="form-group">
              <label for="password" class="col-sm-3 control-label">Password: </label>
              <div class="col-sm-9">
                <input type="password" class="form-control" id="password" name="password" placeholder="Password" autocomplete="off" />
              </div>
            </div>
            <div class="form-group">
              <div class="col-sm-offset-3 col-sm-9">
                <!-- <button type="submit" class="btn btn-default"> <i class="glyphicon glyphicon-log-in"></i> Zaloguj</button> -->
                <a href="Pulpit"><button class="btn btn-default"> <i class="glyphicon glyphicon-log-in"></i> Zaloguj</button></a>
              </div>
            </div>
          </fieldset>
          <!-- </form>  -->
        </div>
        <!-- panel-body -->
      </div>
      <!-- /panel -->
    </div>
    <!-- /col-md-4 -->
  </div>
  <!-- /row -->
</div>
<!-- container -->
</body>
</html>
