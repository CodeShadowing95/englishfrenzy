
const mainButton = document.getElementById("logo__button");

mainButton.addEventListener("click", function() {

    if (!this.classList.contains("active")) {
        this.classList.toggle("active");
        document.getElementById("button__home").setAttribute("style", "transform: translateY(-5.5rem) translateX(0); opacity: 1;");
        document.getElementById("button__restart").setAttribute("style", "transform: translateY(0) translateX(5.5rem); opacity: 1;");
        document.getElementById("button__logout").setAttribute("style", "transform: translateY(0) translateX(-5.5rem); opacity: 1;");
    } else {
        this.classList.remove("active");
        document.getElementById("button__home").setAttribute("style", "transform: translateY(0) translateX(0); opacity: 0;");
        document.getElementById("button__restart").setAttribute("style", "transform: translateY(0) translateX(0); opacity: 0;");
        document.getElementById("button__logout").setAttribute("style", "transform: translateY(0) translateX(0); opacity: 0;");
    }
})