<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Page Inscription</title>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="../style/style.css" />
    <link rel="icon" href="../assets/EnglishFrenzy.png" type="image/png" />
    <link
      href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <div
      class="w-screen h-screen flex justify-center items-center bg-blue-50 relative"
    >
      <div class="absolute top-4 left-4">
        <button
          onclick="window.location.href='index'"
          type="button"
          class="px-3 py-2 text-sm text-gray-900 bg-white border border-gray-300 focus:outline-none hover:bg-gray-100 focus:ring-4 focus:ring-gray-100 font-medium rounded-lg"
        >
          ${"< Retour"}
        </button>
      </div>
      <div class="flex flex-col justify-center items-center">
        <!-- Image -->
        <div
          class="w-16 h-16 flex justify-center items-center mb-4 rounded-md overflow-hidden"
        >
          <img
            src="../assets/EnglishFrenzy.png"
            class="w-full h-full object-contain"
            alt="logo"
          />
        </div>

        <div
          class="max-w-md p-6 mx-auto flex flex-col justify-center items-center bg-white rounded-md"
        >
          <p class="text-xl font-bold leading-7 text-gray-900 mb-2">
            Inscription
          </p>
          <p class="text-sm text-gray-400/60 text-center">
            Vous êtes nouveau sur notre plateforme ? Inscrivez-vous
          </p>

          <form action="inscription" method="post" class="w-full mt-8">
            <div class="relative mb-4">
              <input
                type="text"
                name="nom"
                value="${nom}"
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5"
                placeholder="Nom(s)"
                required
              />
            </div>
            <div class="relative mb-4">
              <input
                type="text"
                name="prenom"
                value="${prenom}"
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5"
                placeholder="Prénom(s)"
                required
              />
            </div>
            <div class="relative mb-4">
              <input
                type="email"
                name="email"
                value="${email}"
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5"
                placeholder="Email"
                required
              />
            </div>
            <div class="relative mb-4">
              <input
                type="password"
                name="motDePasse"
                value=""
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5"
                placeholder="Mot de passe"
                required
              />
            </div>
            <div class="relative mb-4">
              <input
                type="password"
                name="confirmationPassword"
                value=""
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5"
                placeholder="Mot de passe"
                required
              />
            </div>
            <div class="relative mb-4">
              <select
                id="default"
                name="ville"
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5"
              >
                <c:forEach items="${villes}" var="ville">
                  <option><c:out value="${ville.nom}" /></option>
                </c:forEach>
              </select>
            </div>
            <div class="relative mb-8">
              <input
                type="text"
                name="niveau"
                value="Débutant"
                disabled="disabled"
                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full ps-10 p-2.5"
              />
            </div>
            <button
              type="submit"
              class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm w-full px-5 py-2.5 text-center"
            >
              S'inscrire
            </button>
            <c:if test="${ not empty erreurs }">
              <p class="erreur">${erreurs}</p>
            </c:if>
          </form>
        </div>
      </div>
    </div>

    <script src="https://unpkg.com/tailwindcss@^2"></script>
  </body>
</html>
