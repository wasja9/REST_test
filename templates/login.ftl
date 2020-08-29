<html>
<head>
    <title>Person List</title>
</head>
<body>
<h3>Регистрация</h3>

<br><br>
<div>


<#if error??>
    <div class ="alert alert-danger" role="alert">логин или пароль введены неверно</div>
</#if>

    <form method="post" action = "/login">

        <label for="login">Логин
            <input class="input-field" type="text" id="login" name="login" >
        </label>

        <br><br><br>

        <label for="password">Пароль
            <input class="input-field" type="password" id="password" name="password" >
        </label>

        <label for="remember-me"></label>
        <input type="checkbox" id="remember-me" name="remember-me" >

        <input type="submit" value="Login" >



    </form>
</div>
</body>
</html>