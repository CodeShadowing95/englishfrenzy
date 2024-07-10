<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../style/style.css" />
    <link rel="icon" href="../assets/EnglishFrenzy.png" type="image/png">
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
                <p>Temps écoulé.<br> Vous n'avez pas répondu à temps à la question.</p>
                <a href="confirmation" class="hover:bg-red-800 focus:ring-4 focus:outline-none focus:ring-red-300">Recommencer</a>
            </div>
        </div>
    </div>

</body>
</html>
