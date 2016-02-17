<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty testAttr}">
empty
</c:if>
<h2>${testAttr}</h2>