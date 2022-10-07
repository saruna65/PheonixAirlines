

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:if test="something"><script type="text/javascript">foon()</script></c:if>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
              response.sendRedirect("LoginPageStaff.html");
        %>
    </body>
</html>
