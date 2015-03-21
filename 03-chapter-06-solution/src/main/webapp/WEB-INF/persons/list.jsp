<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>
        Sample page for content negotiation example
    </title>
    <link type="text/css" rel="stylesheet" href="<c:url value="/styles/general.css" />"/>
</head>
<body>
<div id="page">
    <div class="banner">
        <img src='<c:url value="/images/banner.png"/>'/>
    </div>

    <div class="content">
        <a href='<c:url value="/home"/>'> Back </a>
        <h2>
            <fmt:message key="persons.list.title"/>
        </h2>

        <div class="persons">
            <table>
                <thead>
                <tr>
                    <td>
                        <fmt:message key="label.Person.count"/>
                    </td>
                    <td>
                        <fmt:message key="label.Person.firstname"/>
                    </td>
                    <td>
                        <fmt:message key="label.Person.lastname"/>
                    </td>
                    <td>
                        <fmt:message key="label.Person.dob"/>
                    </td>
                </tr>
                </thead>
                <c:forEach var="person" items="${persons}" varStatus="loop">
                    <tr>
                        <td>
                                ${loop.index +1}
                        </td>
                        <td>
                                ${person.firstName}
                        </td>
                        <td>
                                ${person.lastName}
                        </td>
                        <td>
                            <fmt:formatDate value="${person.dateOfBirth}"/>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
</body>
</html>