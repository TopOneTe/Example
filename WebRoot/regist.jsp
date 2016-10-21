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
    
    	<form action="regist" method="post">
    		<table style="width: 350px; height: 250px; border: blue 3px double; margin-top: 100px" align="center">
    			<caption><h3>注册界面</h3></caption>
    			<tr>
    				<td align="right">用户名</td>
    				<td><input type="text" name="user.userName" id=""/></td>
    			</tr>
    			<tr>
    				<td align="right">密码</td>
    				<td><input type="password" name="user.userPwd" id=""/></td>
    			</tr>
    			<tr>
    				<td align="right">确认密码</td>
    				<td><input type="password" name="" id=""/></td>
    			</tr>
    			<tr>
    				<td align="right">真实姓名</td>
    				<td><input type="text" name="user.realName" id=""/></td>
    			</tr>
    			<tr>
    				<td align="right">性别</td>
    				<td><input type="radio" name="user.userSex" value="man" />男人
    				    <input type="radio" name="user.userSex" value="woman" />女人
    				</td>
    			</tr>
    			<tr>
    				<select></select>
    			</tr>
    			
    			<tr>
    				<td colspan="2" align="center">
    					<input type="button" value="返回登陆" onclick="javascript:window.location.href='login.jsp'"/>
    					<input type="submit" value="提交注册"/>
    				</td>
    			</tr>
    		</table>
    	</form>
    
    
  </body>
</html>
