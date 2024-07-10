<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>English Master | Home</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="../style/style.css" />
  <link rel="icon" href="../assets/EnglishFrenzy.png" type="image/png">
  <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
</head>
<body>

<div class="w-screen h-screen flex justify-center items-center bg-gray-50">
  <div class="flex flex-col justify-center items-center">
    <!-- Image -->
    <div class="w-24 h-24 flex justify-center items-center mb-4 rounded-md overflow-hidden">
      <img src="../assets/EnglishFrenzy.png" class="w-full h-full object-contain" alt="logo">
    </div>

    <!-- Welcome -->
    <p class="text-lg font-bold mb-2">Bienvenue sur English Frenzy</p>

    <!-- Presentation -->
    <p class="text-base font-light mb-8">Inscrivez-vous ou Connectez-vous à votre compte pour continuer.</p>

    <!-- Buttons -->
    <div class="flex justify-center items-center gap-2">
      <button type="button" onclick="window.location.href='connexion'" class="focus:outline-none bg-blue-500 text-white hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 border transition-all">Connexion</button>
      <button type="button" onclick="window.location.href='inscription'" class="focus:outline-none bg-green-500 text-white hover:bg-green-800 focus:ring-4 focus:ring-green-300 font-medium rounded-lg text-sm px-5 py-2.5 border transition-all">Inscription</button>
    </div>
  </div>
</div>

<script src="https://unpkg.com/tailwindcss@^2"></script>
</body>
</html>