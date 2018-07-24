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
		<div id="index_head">
			<div id="th1">
				<div id="thh">
					<h3>蓝桥商城</h3>
				</div>
				<div id="index_head_ul">
					<ul>
						<li>
							<a href="">登录</a>
						</li>
						<li>
							<a href="">注册</a>
						</li>
						<li>
							<a href="">购物车</a>
						</li>
					</ul>
				</div>
			</div>
			<div id="th2">
				<nav class="navbar navbar-default" role="navigation">
					<div class="container-fluid">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#example-navbar-collapse">
            <span class="sr-only">切换导航</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
							<a class="navbar-brand" href="#">首页</a>
						</div>
						<div class="collapse navbar-collapse" id="example-navbar-collapse">
							<ul class="nav navbar-nav">
								<li class="">
									<a href="#">手机数码</a>
								</li>
								<li class="">
									<a href="#">电脑办公</a>
								</li>
								<li class="">
									<a href="#">电脑办公</a>
								</li>
								<li class="">
									<a href="#">电脑办公</a>
								</li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</div>
		<div id="register_body">
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
		<div id="tail">
			<img src="image/footer.jpg" />
			<div id="foot">
				<ul>
					<li>
						<a href="">关于我们</a>
					</li>
					<li>
						<a href="">联系我们</a>
					</li>
					<li>
						<a href="">招贤纳士</a>
					</li>
					<li>
						<a href="">法律声明</a>
					</li>
				</ul>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="http://cdn.bootcss.com/jquery/2.0.3/jquery.min.js">
	</script>
	<script type="text/javascript" src="js/bootstrap.min.js">
	</script>

</html>