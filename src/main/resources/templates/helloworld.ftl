<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World!!</title>
</head>
<body>
	<center>Hello World!!!</center>
	<#if list??>
		<#list list as item>
			<center>${item.name}</center>
			<center>${item.age}</center>
			<center>${item.mobile}</center>
		</#list>
	</#if>
</body>
</html>