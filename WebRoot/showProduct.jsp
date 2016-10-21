<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    
    		<table border="1" cellpadding="1" cellspacing="0" style="border: 2px red solid;">
    			<caption><h3>我的购物车</h3></caption>
    			
    			<tr style="border: 1px blue solid;">
    			    <td>图片预览</td>
    			    <td>价格</td>   
    			    <td>名称</td>
    			    <td>类别</td> 
    			    <td colspan="4">操作</td> 
    			</tr>
    			<c:forEach items="${list }" var="pro">
    			<tr>
    			    <tr>
    			        <td>
    			            <img src="images/${pro.image}" height="120px" width="100px">
    			        </td>
    			        <td style="color: red; font-size: 35px">￥${pro.proPrice}</td>
    			        <td><a href="#" style="font-size: 20px">${pro.proName }</a></td>
    			        <td style="font-size: 30px">${pro.sort.sortName }</td>
    			        <td colspan="4"><a href="addBuy?id=${pro.proId }">加入购物车</a></td> 
    			    </tr>
    			</c:forEach>
    		</table>
    
    
  </body>
</html>
