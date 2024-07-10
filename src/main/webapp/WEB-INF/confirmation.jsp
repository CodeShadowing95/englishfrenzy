<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Consignes de jeu</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="../style/style.css" rel="stylesheet" type="text/css"/>
    <link rel="icon" href="../assets/EnglishFrenzy.png" type="image/png">
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>

<div class="w-screen h-screen flex justify-center items-center bg-blue-50 relative">
    <div class="flex flex-col justify-center items-center">
        <div class="max-w-md p-6 mx-auto flex flex-col justify-center items-center bg-white rounded-md">
            <p class="text-xl font-bold leading-7 text-gray-900 mb-4">Instructions de jeu</p>
            <ul class="flex flex-col gap-4">
                <li class="text-sm text-gray-600">- Vous disposerez de <span class="font-bold">1 minute</span> pour donner le prétérit et le participe passé d'un verbe irrégulier choisi au hasard</li>
                <li class="text-sm text-gray-600">- Tant que vos réponses sont justes, il vous sera demandé de donner le prétérit et le participe passé d'un autre verbe irrégulier, sinon vous serez redirigé vers la page de fin affichant que vous avez perdu. Il vous sera également proposé de faire une nouvelle partie.</li>
                <li class="text-sm text-gray-600">- Si vous transmettez vos réponses au-delà d'une minute, vous aurez aussi perdu la partie et serez redirigé vers la page de fin qui vous proposera de refaire une partie.</li>
                <li class="text-sm text-gray-600">- Si vous trouvez toutes les bonnes réponses dans le temps imparti, vous serez redirigé vers la page de fin vous indiquant que vous avez gagné et vous proposant de refaire une nouvelle partie.</li>
            </ul>

            <div class="w-full mt-8">
                <button type="button" onclick="window.location.href='playground'" class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm w-full px-5 py-2.5 text-center">J'ai compris!</button>
            </div>
        </div>
    </div>
</div>

<script src="https://unpkg.com/tailwindcss@^2"></script>
</body>
</html>
