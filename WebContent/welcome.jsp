<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Your Entries</title>
	</head>
	<body>
		<h3>You have submitted these values:</h3>
		
		Data:
		<ul>
			<li> Submitted String: <s:property value="dataStructure.get(0).getStringElement()"/></li>
			<li> External int: <s:property value="dataStructure.get(0).getIntElement()"/></li>
		</ul>
		
		Inner int values:
		<ul>
			<li> 1st: <s:property value="dataStructure.get(0).getB1().getA1().getFirstInt()"/></li>
			<li> 2nd: <s:property value="dataStructure.get(0).getB1().getA1().getSecondInt()"/></li>
			<li> 3rd: <s:property value="dataStructure.get(0).getB1().getA2().getFirstInt()"/></li>
			<li> 4th: <s:property value="dataStructure.get(0).getB1().getA2().getSecondInt()"/></li>
			<li> 5th: <s:property value="dataStructure.get(0).getB2().getA1().getFirstInt()"/></li>
			<li> 6th: <s:property value="dataStructure.get(0).getB2().getA1().getSecondInt()"/></li>
			<li> 7th: <s:property value="dataStructure.get(0).getB2().getA2().getFirstInt()"/></li>
			<li> 8th: <s:property value="dataStructure.get(0).getB2().getA2().getSecondInt()"/></li>
		</ul>
		
		go <a href="index.jsp">back</a> and submit another entry
	</body>
</html>