<%@include file="/commons/sessions.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Login"/>
<!DOCTYPE html>
<h2 hidden><%=fac.efetuarLogin(request)%></h2>

<script type="text/JavaScript">
   setTimeout("location.href = 'http://localhost:8084/Voos.com/index.jsp';",1000);
</script>

