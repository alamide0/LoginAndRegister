<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Login logistics system!</title>
</head>
<body>

	<s:form action="login" method="post">
		<s:textfield name="name" label="����" id="userName"/>
		<s:password name="pwd" label="����" id="userPwd"/>
		<s:submit value="��¼" align="left" label="��¼"/>		
		<s:reset value="����" align="left" label="����"/>
	</s:form>
	
</body>
</html>