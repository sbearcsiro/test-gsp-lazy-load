BookTagLib<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>

<p>${author.name}</p>

<book:books author="${author}"/>

<ol>
<g:each in="${author.books}" var="book">
    <li>${book.title}</li>
</g:each>
</ol>

</body>
</html>