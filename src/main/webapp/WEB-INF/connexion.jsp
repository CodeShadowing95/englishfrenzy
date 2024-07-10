<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Page Connexion</title>
    <meta charset="UTF-8">
    <link href="../style/connexion.css" rel="stylesheet" type="text/css"/>
    <link rel="icon" href="../assets/EnglishFrenzy.png" type="image/png">
</head>
<body>
<div class="container__fluid">
    <div class="login__card">
        <img src="../assets/EnglishFrenzy.png" alt="logo" width="78" height="78">
        <h1>Connectez-vous pour continuer</h1>
        <form action="connexion" method="post">
            <div class="form__group">
                <input type="email" name="email" value="${email}" id="email" class="input" placeholder="Adresse email" required />
            </div>
            <div class="form__group">
                <input type="password" name="password" value="" id="pass1" class="input" placeholder="Mot de passe" required />
            </div>
            <button type="submit" class="btn">Se connecter</button>
            <c:if test="${erreurs}">
                <p class="error">${erreurs}</p>
            </c:if>
        </form>
        <a href="inscription">Pas encore inscrit ?</a>
    </div>
</div>
</body>
</html>

