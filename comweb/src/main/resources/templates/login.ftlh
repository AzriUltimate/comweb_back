<!DOCTYPE html>
<html>
<head>
    <title>1371 Games</title>
</head>
<body>
<h1>1371 Games</h1>
<h4>Авторизация</h4>
<form action="/login" method="post">
    Электронная почта : <input type="email" name="username"/> <br><br>
    Пароль: <input type="password" name="password"/> <br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Вход"/>
</form>
<a href="registration">Зарегистрироваться</a>
<a href="hello">Check!</a>
</body>
</html>