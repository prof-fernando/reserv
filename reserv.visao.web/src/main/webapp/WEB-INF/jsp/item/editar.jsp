<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
     prefix="c" %>
<html>
<head>
</head>
<body>

<c:if test="${gravado}">
	<h1> Item gravado com sucesso!</h1>
</c:if>

<form action="gravar" method="post" >
<input type="hidden" name="item.ID" value="${entidade.ID}" >
Descricao: <input type="text" name="item.descricao"
           value="${entidade.descricao }" >
           

<input type="submit" value="Gravar" >

 </form>

</body>
</html>