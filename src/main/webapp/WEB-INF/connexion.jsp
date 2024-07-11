<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Page Connexion</title>
    <meta charset="UTF-8">
    <link href="../style/connexion.css" rel="stylesheet" type="text/css"/>
    <link rel="icon" href="../assets/EnglishFrenzy.png" type="image/png">
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<!-- Back button -->
<button class="absolute top-4 left-4 px-3 py-2 flex items-center gap-2 text-sm text-slate-700 font-semibold bg-white/80 cursor-pointer rounded-lg z-20" onclick="window.location.href = 'index'">
  <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24"><path fill="currentColor" fill-rule="evenodd" d="M10.53 5.47a.75.75 0 0 1 0 1.06l-4.72 4.72H20a.75.75 0 0 1 0 1.5H5.81l4.72 4.72a.75.75 0 1 1-1.06 1.06l-6-6a.75.75 0 0 1 0-1.06l6-6a.75.75 0 0 1 1.06 0" clip-rule="evenodd"></path></svg>
  Revenir à l'accueil
</button>
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

