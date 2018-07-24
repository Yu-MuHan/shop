<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<title></title>
	</head>

	<body>
		<%@include file="head.jsp" %>
		<div id="login_body">
			<div id="body">
				<div id="login_pan">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">
            登录
        </h3>
						</div>
						<div class="panel-body">
							<form class="form-horizontal" role="form">
								<div class="form-group">
									<label for="firstname" class="col-sm-3 control-label">用户名</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="firstname" placeholder="">
									</div>
								</div>
								<div class="form-group">
									<label for="lastname" class="col-sm-3 control-label">密码</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="lastname" placeholder="密码">
									</div>
								</div>
								<div class="form-group">
									<label for="lastname" class="col-sm-3 control-label">验证码</label>
									<div class="col-sm-4">
										<input type="text" class="form-control" id="lastname" placeholder="">
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-offset-2 col-sm-10">
										<div class="checkbox">
											<label>
          <input type="checkbox">请记住我
        </label>
										</div>
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-offset-2 col-sm-10">
										<button type="submit" class="btn btn-default">登录</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>

		</div>
		<%@include file="tail.jsp" %>
	</body>
	<script type="text/javascript" src="http://cdn.bootcss.com/jquery/2.0.3/jquery.min.js">
	</script>
	<script type="text/javascript" src="js/bootstrap.min.js">
	</script>

</html>