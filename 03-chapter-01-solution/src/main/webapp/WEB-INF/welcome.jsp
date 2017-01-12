<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<title>Spring Sample Web Application</title>
<body>
<table>
    <tr>
        <td><img src="<c:url value='/images/banner.png'/>"/></td>
        <td> <h2>
            Welcome to the most simple page of Spring MVC!
        </h2>

            <h3>
                If you see this page, then your first Spring Web application is working as intended
                </br>
                and your XML configuration is correct.
                <br/>
                Congratulations!
            </h3></td>
    </tr>
    <tr><td colspan="2"><em><h4>SpringSource Certified Spring Web Application Developer Exam - Sample application</h4></em></td></tr>
</table>
</body>
</html>