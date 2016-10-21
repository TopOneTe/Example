<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    
    	<form action="login" method="post">
    		<table style="width: 300px; height: 150px; border: blue 3px double; margin-top: 100px" align="center">
    			<caption><h3>登陆界面</h3></caption>
    			<tr>
    			    <td colspan="2" align="center" style="color: red">${tips }</td>
    			</tr>
    			<tr>
    				<td width="80px" align="right">账号</td>
    				<td><input type="text" name="userName" id=""/></td>
    			</tr>
    			<tr>
    				<td align="right">密码</td>
    				<td><input type="password" name="UserPwd" id=""/></td>
    			</tr>
    			<tr>
    				<td colspan="2" align="center">
    					<input type="button" value="注册" onclick="javascript:window.location.href='regist.jsp'" />
    					<input type="submit" value="登陆""/>
    				</td>
    			</tr>
    		</table>
    	</form>
    
    
  </body>
</html>
