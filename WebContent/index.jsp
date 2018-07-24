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
		
		<%@ include file="head.jsp" %>
		
		
		
		<div id="index_body">
			<!--
            	作者：offline
            	时间：2018-07-17
            	描述：
            	=====================================================================轮播图================================================================
            -->
			<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div id="carouselMenu" class="carousel slide">               
                <div class="carousel-inner">
                    <div class="item active"><img src="img/1.png" alt=""/></div>
                    <div class="item"><img src="img/2.jpg" alt=""/></div>
                    <div class="item"><img src="img/3.jpg" alt=""/></div>
                    <div class="item"><img src="img/4.jpg" alt=""/></div>

                </div>
                <a class="carousel-control left" href="#carouselMenu" data-slide="prev">‹</a>
                <a class="carousel-control right" href="#carouselMenu" data-slide="next">›</a>
            </div>
        </div>
    </div>
</div>
<!--
	作者：offline
	时间：2018-07-17
	描述：
	=================================================================================轮播图==================================================================
	
-->

<!--
	作者：offline
	时间：2018-07-17
	描述：
	========================================================================热门商品=======================================================================
-->

<div id="" style="margin-left: 50px;">
	<table border="0px" cellspacing="0px" cellpadding="0px">
<tr>
	<td colspan="7"><h1>最新商品</h1></td>
</tr>
<tr>
	<td rowspan="2"><img src="products/hao/big01.jpg"/></td>
	<td colspan="3"><img src="products/hao/middle01.jpg"/></td>
	<td><img src="products/hao/small04.jpg"/></td>
	<td><img src="products/hao/small01.jpg"/></td>
	<td><img src="products/hao/small01.jpg"/></td>

	
</tr>
<tr>
	<td><img src="products/hao/small01.jpg"/></td>
	<td><img src="products/hao/small01.jpg"/></td>
	<td><img src="products/hao/small06.jpg"/></td>
	<td><img src="products/hao/small08.jpg"/></td>
	<td><img src="products/hao/small09.jpg"/></td>
	<td><img src="products/hao/small05.jpg"/></td>
</tr>
<tr>
	<td colspan="7"><img src="products/hao/ad.jpg"/></td>
</tr>
<tr></tr>
</table>

<table border="0px" cellspacing="0px" cellpadding="0px">
<tr>
	<td colspan="7"><h1>热门商品</h1></td>
</tr>
<tr>
	<td rowspan="2"><img src="products/hao/big01.jpg"/></td>
	<td colspan="3"><img src="products/hao/middle01.jpg"/></td>
	<td><img src="products/hao/small04.jpg"/></td>
	<td><img src="products/hao/small01.jpg"/></td>
	<td><img src="products/hao/small01.jpg"/></td>

	
</tr>
<tr>
	<td><img src="products/hao/small01.jpg"/></td>
	<td><img src="products/hao/small01.jpg"/></td>
	<td><img src="products/hao/small06.jpg"/></td>
	<td><img src="products/hao/small08.jpg"/></td>
	<td><img src="products/hao/small09.jpg"/></td>
	<td><img src="products/hao/small05.jpg"/></td>
</tr>
<tr>
	<td colspan="7"><img src="products/hao/ad.jpg"/></td>
</tr>
<tr></tr>
</table>
</div>



<!--
	作者：offline
	时间：2018-07-17
	描述：
	========================================================================热门商品========================================================================
-->
		</div>
		<%@ include file="tail.jsp" %>
	</body>
	<script type="text/javascript" src="http://cdn.bootcss.com/jquery/2.0.3/jquery.min.js">
	</script>
	<script type="text/javascript" src="js/bootstrap.min.js">
	</script>

</html>