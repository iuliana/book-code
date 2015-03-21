<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>
        <fmt:message key="home.title" />
    </title>
    <link type="text/css" rel="stylesheet" href="<c:url value="/styles/general.css" />"/>
</head>
<body>
<div id="page">
    <div class="banner">
        <img src='<c:url value="/images/banner.png"/>'/>
    </div>
    <div class="content">
        Please choose the way you want to view the person database:
        <ul>
            <li>
                <a href='<c:url value="/persons"/>'> WEB </a>
            </li>
            <li>
                <a href='<c:url value="/persons.xls"/>'> XLS </a>
            </li>
            <li>
                <a href='<c:url value="/persons.pdf"/>'> PDF </a>
            </li>
        </ul>
    </div>
</div>
</body>
</html>