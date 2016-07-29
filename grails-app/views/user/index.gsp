<%@ page import="com.springSecurity.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'user.label', default: 'User')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
User
<g:link controller="logout">logout</g:link>
Welcom ${user.username}
</body>
</html>
