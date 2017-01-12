<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value='/styles/general.css'/>">
</head>
<title>Spring Sample Web Application</title>
<body>
<table>
    <tr>
        <td><img src="<c:url value='/images/banner.png'/>"/></td>
        <td>${salute}</td>
    </tr>
    <tr><td colspan="2"><em><h4>SpringSource Certified Spring Web Application Developer Exam - Sample application</h4></em></td></tr>
</table>
</body>
</html>