<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Struts2 Injection Form</title>
	</head>
	<body>

	<h2>Welcome to the injection form!</h2>
	<h3>Insert a new entry:</h3>
	
	<s:actionerror />
	
	<s:form action="dataStructure.action" method="post">
		<s:textfield name="formString" key="label.formString" size="50"/>
		<s:textfield name="formInt" key="label.formInt" size="5"/>
		
		<s:textfield name="formA" key="label.formA" size="5"/>
		<s:textfield name="formB" key="label.formB" size="5"/>
		<s:textfield name="formC" key="label.formC" size="5"/>
		<s:textfield name="formD" key="label.formD" size="5"/>
		<s:textfield name="formE" key="label.formE" size="5"/>
		<s:textfield name="formF" key="label.formF" size="5"/>
		<s:textfield name="formG" key="label.formG" size="5"/>
		<s:textfield name="formH" key="label.formH" size="5"/>		
		
		<s:submit method="execute" key="label.addElement" align="center"/>
		
	</s:form>
	
	</body>
</html>