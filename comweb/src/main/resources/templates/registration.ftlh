<!DOCTYPE html>
<html>
<head>
    <title>1371 Games</title>
</head>
<body>
<h1>1371 Games</h1>
<h4>Регистрация</h4>
<form action="/registration" method="post">
    Имя пользователя: <input type="text" name="name"><br><br>
    Электронная почта: <input type="email" name="email"><br><br>
    Пароль: <input type="password" name="password"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Зарегистрироваться"/>
</form>
<#if errorMassages??>
    <h2 style="color: red">{errorMessage}</h2>
</#if>
<a href="hello">Check!</a>
</body>
</html>