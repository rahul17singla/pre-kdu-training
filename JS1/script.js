// const add = document.getElementById("add");
// const subtract = document.getElementById("subtract");

function add() {
    const counter = document.getElementById("counter");
    counter.innerText = parseInt(counter.innerText) + 1;
}
function subtract() {
    const counter = document.getElementById("counter");
    counter.innerText = parseInt(counter.innerText) - 1;
}
