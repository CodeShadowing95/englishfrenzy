<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>English Frenzy | Home</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="../style/style.css" />
  <link rel="icon" href="../assets/EnglishFrenzy.png" type="image/png">
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<div class="w-screen h-screen">
  <!-- img container -->
  <div class="w-full h-full">
    <img src="../assets/banner.jpg" alt="banner" class="w-full h-full object-cover">
  </div>

  <!-- main container -->
  <div class="absolute inset-0">
    <div class="w-full h-full flex justify-center items-center p-8">
      <div class="w-full sm:w-1/2">
        <img src="../assets/EnglishFrenzy.png" alt="logo" class="w-20 sm:w-32">
        <div class="mt-24">
          <p class="text-4xl sm:text-xl font-bold text-slate-700">Modern Enterprise Software Engineering</p>
          <h1 class="text-5xl sm:text-6xl font-extrabold my-4 uppercase tracking-wider text-slate-700">English Frenzy</h1>
          <p class="text-lg sm:text-xl mb-10 max-w-xl text-slate-700">Testez vos connaissances en Anglais en déterminant les participes passés et prétérits des verbes irréguliers.</p>

          <div class="flex items-center gap-4">
            <a href="connexion" class="bg-white text-black rounded-full px-8 py-3 hover:shadow-lg transition duration-300">Connexion</a>
            <a href="inscription" class="border-2 border-slate-700 text-slate-700 rounded-full px-8 py-3 hover:bg-slate-700 hover:text-white transition duration-300">Inscription</a>
          </div>
        </div>
      </div>
      <div class="w-0 sm:w-1/2 flex justify-center">
        <img src="../assets/app.png" alt="app" class="w-[500px] sm:w-[600px]">
      </div>
    </div>
  </div>
</div>
</body>
</html>