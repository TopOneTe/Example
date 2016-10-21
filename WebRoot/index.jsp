<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="themes/base/jquery-ui.css">
	<link rel="stylesheet" type="text/css" href="themes/base/jquery.ui.all.css">
	<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="js/jquery-ui.js"></script>
	<style type="text/css">
		table{ border: #a0b0c0 1px solid; width: 1100px; height: 700px}
		.menustyle{width: 200px; height: 100px}
	</style>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#menu").accordion();
		});
	</script>
  </head>
  
  <body>
    <table align="center" cellspacing="0" cellpadding="0">
    	<tr height="100px">
    		<td colspan="2" align="center" style="border:none;background-color: lightblue">
    			<label style="color: blue; font-size: 35px; font-family: 黑体">超市商品管理</label>
    			<label style="color: gray；font-size: 25px; font-family: 黑体">后台系统</label>
    		</td>
    	</tr>
    	<tr>
    		<td width="280px">
    			<div id="menu" style="width: 280px; height: 550px;border:#abc 1px solid; border-left: none">
    				<h3>商品管理</h3>
    				<div class="menustyle" >
    					<a style="background-color: pink" onmouseover="javascript:this.style.backgroundColor='green'"onmouseout="javascript:this.style.backgroundColor='pink'" href="getSort" target="content">
    					添加商品信息
    					</a><br />
    					<a style="background-color: pink" onmouseover="javascript:this.style.backgroundColor='green'"onmouseout="javascript:this.style.backgroundColor='pink'" href="showProduct" target="content">
    					查询商品信息
    					</a><br />
    				</div>
    				<h3>商品类别管理</h3>
    				<div class="menustyle">
    					<a style="background-color: pink" onmouseover="javascript:this.style.backgroundColor='green'"onmouseout="javascript:this.style.backgroundColor='pink'" href="addProductsort.jsp" target="content">
    					添加商品类别
    					</a><br />
    					<a style="background-color: pink" onmouseover="javascript:this.style.backgroundColor='green'"onmouseout="javascript:this.style.backgroundColor='pink'" href="" target="content">
    					查询商品类别信息
    					</a><br />
    				</div>
    				<h3>用户管理</h3>
    				<div class="menustyle">
    					<a style="background-color: pink" onmouseover="javascript:this.style.backgroundColor='green'"onmouseout="javascript:this.style.backgroundColor='pink'" href="" target="content">
    					修改用信息
    					</a><br />
    					<a style="background-color: pink" onmouseover="javascript:this.style.backgroundColor='green'"onmouseout="javascript:this.style.backgroundColor='pink'" href="" target="content">
    					退出系统
    					</a><br />
    				</div>
    			</div>
    		
    		</td>
    		<td >
    			<iframe style="width: 820px ; height: 550px; border: none"  name="content"></iframe>
    		</td>
    	</tr>
    	<tr height="50px">
    		<td colspan="2" ></td>
    	</tr>
    </table>
  </body>
</html>
