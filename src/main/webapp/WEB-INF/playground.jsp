<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Playground</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="../style/style.css" />
  <link rel="icon" href="../assets/EnglishFrenzy.png" type="image/png">
</head>
<body>
<div class="container">
    <!-- Navbar -->
    <!-- <div class="navbar">
      <div class="navbar__left__content">
        <img src="EnglishFrenzy.png" width="48" height="48" alt="logo" />
        <p class="navbar__title">English Frenzy</p>
        <div class="lateral__bar"></div>
      </div>

      <button class="navbar__btn">
        <svg xmlns="http://www.w3.org/2000/svg" class="navbar__btn__icon" width="32" height="32" viewBox="0 0 24 24"><path fill="currentColor" d="M5.47 12.53a.75.75 0 0 1 0-1.06l2-2a.75.75 0 0 1 1.06 1.06l-.72.72H15a.75.75 0 0 1 0 1.5H7.81l.72.72a.75.75 0 1 1-1.06 1.06z"/><path fill="currentColor" fill-rule="evenodd" d="M13.945 1.25h1.11c1.368 0 2.47 0 3.337.117c.9.12 1.658.38 2.26.981c.602.602.86 1.36.982 2.26c.116.867.116 1.97.116 3.337v8.11c0 1.367 0 2.47-.116 3.337c-.121.9-.38 1.658-.982 2.26c-.602.602-1.36.86-2.26.982c-.867.116-1.97.116-3.337.116h-1.11c-1.367 0-2.47 0-3.337-.116c-.9-.122-1.658-.38-2.26-.982c-.398-.4-.647-.868-.805-1.402c-.951-.001-1.744-.012-2.386-.098c-.764-.103-1.426-.325-1.955-.854c-.529-.529-.751-1.19-.854-1.955c-.098-.73-.098-1.656-.098-2.79V9.447c0-1.133 0-2.058.098-2.79c.103-.763.325-1.425.854-1.954c.529-.529 1.19-.751 1.955-.854c.642-.086 1.435-.097 2.386-.098c.158-.534.407-1.003.806-1.402c.601-.602 1.36-.86 2.26-.981c.866-.117 1.969-.117 3.336-.117M7.252 17.004c.004.645.014 1.225.05 1.745c-.834-.003-1.454-.018-1.945-.084c-.598-.08-.89-.224-1.094-.428c-.204-.203-.348-.496-.428-1.094c-.083-.619-.085-1.443-.085-2.643v-5c0-1.2.002-2.024.085-2.643c.08-.598.224-.89.428-1.094c.203-.204.496-.348 1.094-.428c.491-.066 1.111-.08 1.946-.084c-.037.52-.047 1.1-.051 1.745a.75.75 0 0 0 1.5.008c.006-1.093.034-1.868.142-2.457c.105-.566.272-.895.515-1.138c.277-.277.666-.457 1.4-.556c.755-.101 1.756-.103 3.191-.103h1c1.436 0 2.437.002 3.192.103c.734.099 1.122.28 1.4.556c.276.277.456.665.555 1.4c.102.754.103 1.756.103 3.191v8c0 1.435-.001 2.436-.103 3.192c-.099.734-.279 1.122-.556 1.399c-.277.277-.665.457-1.399.556c-.755.101-1.756.103-3.192.103h-1c-1.435 0-2.436-.002-3.192-.103c-.733-.099-1.122-.28-1.399-.556c-.243-.244-.41-.572-.515-1.138c-.108-.589-.136-1.364-.142-2.457a.75.75 0 1 0-1.5.008" clip-rule="evenodd"/></svg>
        <p class="navbar__btn__text">Quitter</p>
      </button>
    </div> -->

    <!-- Main -->
    <div class="playground">
        <!-- Completion -->
        <div class="completion">
            <div class="completion__left">
                <div class="completion__left__icon">
                    <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 24 24"><path fill="#ffffff" d="M17 15q-.425 0-.712-.288T16 14v-4q0-.425.288-.712T17 9h3q.425 0 .713.288T21 10v1h-1.5v-.5h-2v3h2V13H21v1q0 .425-.288.713T20 15zm-7.5 0V9h4q.425 0 .713.288T14.5 10v1q0 .425-.288.713T13.5 12q.425 0 .713.288T14.5 13v1q0 .425-.288.713T13.5 15zm1.5-3.75h2v-.75h-2zm0 2.25h2v-.75h-2zM3 15v-5q0-.425.288-.712T4 9h3q.425 0 .713.288T8 10v5H6.5v-1.5h-2V15zm1.5-3h2v-1.5h-2z"></path></svg>
                </div>
                <p class="completion__left__text">Vocabulaire</p>
            </div>
            <!-- Progress bar -->
            <div class="progress-bar">
                <!-- <p>Statut: <%=request.getAttribute("progression")%></p> -->
                <div class="progress-bar__fill" style="width: ${progression*2}px"></div>
            </div>
            <div class="completion__right">
                <div class="completion__right__icon">
                    <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 24 24"><path fill="currentColor" d="m9.55 18l-5.7-5.7l1.425-1.425L9.55 15.15l9.175-9.175L20.15 7.4z"></path></svg>
                </div>
                <div class="completion__right__text">Complétion</div>
            </div>
        </div>

        <!-- Text presentation -->
        <!-- <p class="playground__text">Trouvez le participe passé et prétérit du verbe suivant:</p> -->

        <!-- Card question -->
        <form method="post" class="form-card">
            <!-- Background image -->
            <div class="form-card__image">
                <p class="form-card__text">${currentVerbe.baseVerbale}</p>
            </div>
            <div class="form-card__content">
                <input type="hidden" name="baseVerbale" value="${currentVerbe.baseVerbale}">
                <div class="preterit">
                    <label class="label">Prétérit</label>
                    <input type="text" name="preterit" value="${preterit}" class="input" placeholder="Saisissez votre réponse" autofocus required>
                </div>
                <div class="past__participle">
                    <label class="label">Participe passé</label>
                    <input type="text" name="participePasse" value="${participePasse}" class="input" placeholder="Saisissez votre réponse" required>
                </div>

                <c:if test="${ not empty erreurs }">
                    <p class="erreur">${erreurs}</p>
                </c:if>

                <div class="form_accessories">
                    <!-- Translation -->
                    <div class="translation">
                        <div class="icon">
                            <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24"><defs><mask id="solarLightbulbBold0"><g fill="none" fill-rule="evenodd" clip-rule="evenodd"><path fill="#fff" d="M11.5 2C7.358 2 4 5.436 4 9.674c0 2.273.966 4.315 2.499 5.72c.51.467.889.814 1.157 1.066a14.896 14.896 0 0 1 .4.39a1.02 1.02 0 0 1 .033.036c.237.3.288.376.318.446c.03.07.053.16.112.54c.024.15.026.406.026 1.105v.03c0 .409 0 .762.026 1.051c.027.306.087.61.248.895c.18.319.438.583.75.767c.278.165.575.226.874.254c.283.026.628.026 1.028.026h.058c.4 0 .745 0 1.028-.026c.3-.028.595-.09.875-.254a2.07 2.07 0 0 0 .749-.767c.16-.285.22-.588.248-.895c.026-.29.026-.642.025-1.051v-.03c0-.699.003-.955.026-1.105c.06-.38.082-.47.113-.54c.03-.07.081-.147.318-.446l.003-.003l.005-.006l.025-.027a14.926 14.926 0 0 1 .4-.39c.268-.252.647-.599 1.157-1.067A7.736 7.736 0 0 0 19 9.674C19 5.436 15.642 2 11.5 2m1.57 17.932c.008-.076.012-.16.015-.258h-3.17c.003.097.007.182.014.258c.019.21.05.286.071.324a.69.69 0 0 0 .25.255c.037.022.111.054.316.073c.214.02.497.02.934.02c.437 0 .72 0 .934-.02c.205-.019.279-.05.316-.073a.69.69 0 0 0 .25-.255c.021-.038.052-.114.07-.324"></path><path fill="#000" d="M9.274 13.35a.75.75 0 0 1 1.025.274a1.25 1.25 0 0 0 2.166 0a.75.75 0 1 1 1.298.752a2.757 2.757 0 0 1-1.631 1.27V17a.75.75 0 0 1-1.5 0v-1.354A2.757 2.757 0 0 1 9 14.376a.75.75 0 0 1 .274-1.025"></path></g></mask></defs><path fill="currentColor" d="M0 0h24v24H0z" mask="url(#solarLightbulbBold0)"></path></svg>
                        </div>
                        <div class="text">Traduction: <span class="text__translation">${currentVerbe.traduction}</span></div>
                    </div>
                    <!-- Time -->
                    <div class="time">
                        <div class="icon">
                            <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24"><defs><mask id="solarClockCircleBold0"><g fill="none"><path fill="#fff" d="M22 12c0 5.523-4.477 10-10 10S2 17.523 2 12S6.477 2 12 2s10 4.477 10 10"></path><path fill="#000" fill-rule="evenodd" d="M12 7.25a.75.75 0 0 1 .75.75v3.69l2.28 2.28a.75.75 0 1 1-1.06 1.06l-2.5-2.5a.75.75 0 0 1-.22-.53V8a.75.75 0 0 1 .75-.75" clip-rule="evenodd"></path></g></mask></defs><path fill="currentColor" d="M0 0h24v24H0z" mask="url(#solarClockCircleBold0)"></path></svg>
                        </div>
                        <div class="text"><span id="time-label">01 : 00</span></div>
                        <script>
                            var time = 60;
                            var interval = setInterval(function() {
                                time--;
                                if(time < 0) {
                                    clearInterval(interval);
                                    document.getElementById("time-label").innerHTML = "00 : 00";
                                    window.location.href = "noanswer";
                                } else {
                                    var minutes = Math.floor(time / 60);
                                    var seconds = time % 60;
                                    document.getElementById("time-label").innerHTML = (minutes < 10 ? "0" + minutes : minutes) + " : " + (seconds < 10 ? "0" + seconds : seconds);
                                }
                            }, 1000);
                        </script>
                    </div>
                </div>
                <button type="submit" class="btn">Confirmer</button>
            </div>
        </form>
    </div>

    <!-- Buttons -->
    <div class="main__button">
        <div class="logo__button" id="logo__button">
            <img src="../assets/EnglishFrenzy.png" alt="logo">
        </div>
        <a href="index" class="button__home" id="button__home">
            <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" viewBox="0 0 24 24"><path fill="currentColor" fill-rule="evenodd" d="M2.52 7.823C2 8.77 2 9.915 2 12.203v1.522c0 3.9 0 5.851 1.172 7.063C4.343 22 6.229 22 10 22h4c3.771 0 5.657 0 6.828-1.212C22 19.576 22 17.626 22 13.725v-1.521c0-2.289 0-3.433-.52-4.381c-.518-.949-1.467-1.537-3.364-2.715l-2-1.241C14.111 2.622 13.108 2 12 2c-1.108 0-2.11.622-4.116 1.867l-2 1.241C3.987 6.286 3.038 6.874 2.519 7.823M11.25 18a.75.75 0 0 0 1.5 0v-3a.75.75 0 0 0-1.5 0z" clip-rule="evenodd"></path></svg>
        </a>
        <a href="confirmation" class="button__restart" id="button__restart">
            <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" viewBox="0 0 24 24"><path fill="currentColor" d="M18.258 3.508a.75.75 0 0 1 .463.693v4.243a.75.75 0 0 1-.75.75h-4.243a.75.75 0 0 1-.53-1.28L14.8 6.31a7.25 7.25 0 1 0 4.393 5.783a.75.75 0 0 1 1.488-.187A8.75 8.75 0 1 1 15.93 5.18l1.51-1.51a.75.75 0 0 1 .817-.162"></path></svg>
        </a>
        <a href="connexion" class="button__logout" id="button__logout">
            <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" viewBox="0 0 24 24"><path fill="currentColor" d="M5.47 12.53a.75.75 0 0 1 0-1.06l2-2a.75.75 0 0 1 1.06 1.06l-.72.72H15a.75.75 0 0 1 0 1.5H7.81l.72.72a.75.75 0 1 1-1.06 1.06z"></path><path fill="currentColor" fill-rule="evenodd" d="M13.945 1.25h1.11c1.368 0 2.47 0 3.337.117c.9.12 1.658.38 2.26.981c.602.602.86 1.36.982 2.26c.116.867.116 1.97.116 3.337v8.11c0 1.367 0 2.47-.116 3.337c-.121.9-.38 1.658-.982 2.26c-.602.602-1.36.86-2.26.982c-.867.116-1.97.116-3.337.116h-1.11c-1.367 0-2.47 0-3.337-.116c-.9-.122-1.658-.38-2.26-.982c-.398-.4-.647-.868-.805-1.402c-.951-.001-1.744-.012-2.386-.098c-.764-.103-1.426-.325-1.955-.854c-.529-.529-.751-1.19-.854-1.955c-.098-.73-.098-1.656-.098-2.79V9.447c0-1.133 0-2.058.098-2.79c.103-.763.325-1.425.854-1.954c.529-.529 1.19-.751 1.955-.854c.642-.086 1.435-.097 2.386-.098c.158-.534.407-1.003.806-1.402c.601-.602 1.36-.86 2.26-.981c.866-.117 1.969-.117 3.336-.117M7.252 17.004c.004.645.014 1.225.05 1.745c-.834-.003-1.454-.018-1.945-.084c-.598-.08-.89-.224-1.094-.428c-.204-.203-.348-.496-.428-1.094c-.083-.619-.085-1.443-.085-2.643v-5c0-1.2.002-2.024.085-2.643c.08-.598.224-.89.428-1.094c.203-.204.496-.348 1.094-.428c.491-.066 1.111-.08 1.946-.084c-.037.52-.047 1.1-.051 1.745a.75.75 0 0 0 1.5.008c.006-1.093.034-1.868.142-2.457c.105-.566.272-.895.515-1.138c.277-.277.666-.457 1.4-.556c.755-.101 1.756-.103 3.191-.103h1c1.436 0 2.437.002 3.192.103c.734.099 1.122.28 1.4.556c.276.277.456.665.555 1.4c.102.754.103 1.756.103 3.191v8c0 1.435-.001 2.436-.103 3.192c-.099.734-.279 1.122-.556 1.399c-.277.277-.665.457-1.399.556c-.755.101-1.756.103-3.192.103h-1c-1.435 0-2.436-.002-3.192-.103c-.733-.099-1.122-.28-1.399-.556c-.243-.244-.41-.572-.515-1.138c-.108-.589-.136-1.364-.142-2.457a.75.75 0 1 0-1.5.008" clip-rule="evenodd"></path></svg>
        </a>
    </div>
</div>

<script src="../script/script.js"></script>
</body>
</html>
