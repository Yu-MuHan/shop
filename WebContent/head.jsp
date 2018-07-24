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
							<a href="${pageContext.request.contextPath}/UserServlet?method=login">登录</a>
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
	</body>
	<script type="text/javascript" src="http://cdn.bootcss.com/jquery/2.0.3/jquery.min.js">
	</script>
	<script type="text/javascript" src="js/bootstrap.min.js">
	</script>

</html>