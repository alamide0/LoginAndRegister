<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Login logistics system!</title>
</head>
<body>

	<s:form action="login" method="post">
		<s:textfield name="name" label="Ãû×Ö" id="userName"/>
		<s:password name="pwd" label="ÃÜÂë" id="userPwd"/>
		<s:submit value="µÇÂ¼" align="left" label="µÇÂ¼"/>		
		<s:reset value="ÖØÖÃ" align="left" label="ÖØÖÃ"/>
	</s:form>
	
</body>
</html>