<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../style/style.css" />
    <link rel="icon" href="../assets/EnglishFrenzy.png" type="image/png">
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
    <title>Failure</title>
</head>
<body>
<div class="container__fluid">
    <div class="error__card">
        <div class="content">
            <h1>Oooops!!</h1>
            <div class="circle">
                <div class="circle__inner">
                    <img src="../assets/cross.png" alt="cross">
                </div>
            </div>
            <p>Mauvaise réponse.<br>Pour le verbe <span class="verbe">${currentVerbe.baseVerbale}</span>, le prétérit c'est <span class="verbe">${currentVerbe.preterit}</span> et le participe passé c'est <span class="verbe">${currentVerbe.participePasse}</span>.</p>
            <a href="confirmation" class="hover:bg-red-800 focus:ring-4 focus:outline-none focus:ring-red-300">Recommencer</a>
        </div>
    </div>
</div>

<script src="https://unpkg.com/tailwindcss@^2"></script>
<script src="../script/script.js"></script>
</body>
</html>
