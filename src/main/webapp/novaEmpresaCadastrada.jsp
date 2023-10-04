<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
	<c:if test="${not empty empresa}">
		Empresa  ${empresa}  cadastrada com sucesso!
	</c:if>	
</body>
</html>