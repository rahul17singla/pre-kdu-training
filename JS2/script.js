var firstNum = document.getElementById("firstNumber");
var secondNum = document.getElementById("secondNumber");

var addBtn = document.getElementById("addBtn");
var subtractBtn = document.getElementById("subtractBtn");
var multiplyBtn = document.getElementById("multiplyBtn");
var divideBtn = document.getElementById("divideBtn");
var clearBtn = document.getElementById("clearBtn");

function add(num1, num2) {
    return num1 + num2;
}
function subtract(num1, num2) {
    return num1 - num2;
}
function multiply(num1, num2) {
    return num1 * num2;
}
function divide(num1, num2) {
    return num1 / num2;
}
function displayResult(result) {
    result = result.toFixed(2);
    document.getElementById("result").innerHTML = result;
}
function check() {
    if (
        isNaN(parseFloat(firstNum.value)) ||
        isNaN(parseFloat(secondNum.value))
    ) {
        alert("Please enter a number");
        return true;
    }
    return false;
}

addBtn.addEventListener("click", function () {
    if (check()) {
        return;
    }
    var result = add(parseFloat(firstNum.value), parseFloat(secondNum.value));
    displayResult(result);
    console.log(result);
});
subtractBtn.addEventListener("click", function () {
    if (check()) {
        return;
    }
    var result = subtract(
        parseFloat(firstNum.value),
        parseFloat(secondNum.value)
    );
    displayResult(result);
    console.log(result);
});
multiplyBtn.addEventListener("click", function () {
    if (check()) {
        return;
    }
    var result = multiply(
        parseFloat(firstNum.value),
        parseFloat(secondNum.value)
    );
    displayResult(result);
    console.log(result);
});
divideBtn.addEventListener("click", function () {
    if (check()) {
        return;
    }
    if (parseFloat(secondNum.value) == 0) {
        alert("You can't divide by 0");
        return;
    }
    var result = divide(
        parseFloat(firstNum.value),
        parseFloat(secondNum.value)
    );
    displayResult(result);
    console.log(result);
});
clearBtn.addEventListener("click", function () {
    firstNum.value = "";
    secondNum.value = "";
    document.getElementById("result").innerHTML = "";
});
