<%
	//scriptlet
String nomeEmpresa = (String)req.getAttribute("empresa");
System.out.println("nomeEmpresa");
%>


<html>
<body>
		Empresa  <%= nomeEmpresa %>  cadastrada com sucesso!
</body>
</html>