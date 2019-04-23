<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/commons/common-taglibs.jsp"%>
<!DOCTYPE html>
<html>
<body>
	<c:forEach items="${page.result}" var="item">
		${item.name}<br/>
	</c:forEach>
</body>
</html>