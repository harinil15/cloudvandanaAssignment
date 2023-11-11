function clearDisplay() {
    document.getElementById("result").value = "0";
}

function appendNumber(number) {
    var resultField = document.getElementById("result");
    var currentResult = resultField.value;

    // If the current result is '0', replace it with the new number
    if (currentResult === '0') {
        resultField.value = number.toString();
    } else {
        // Otherwise, append the number to the current result
        resultField.value += number.toString();
    }
}

function appendOperator(operator) {
    var resultField = document.getElementById("result");
    var currentResult = resultField.value;

    // Check if the last character in the current result is an operator
    if ('+-*/'.indexOf(currentResult.charAt(currentResult.length - 1)) === -1) {
        // If not, append the operator to the current result
        resultField.value += operator;
    }
}

function appendDot() {
    var resultField = document.getElementById("result");
    var currentResult = resultField.value;

    // Check if the current result already contains a dot
    if (currentResult.indexOf('.') === -1) {
        // If not, append a dot
        resultField.value += '.';
    }
}

function calculate() {
    var resultField = document.getElementById("result");
    var currentResult = resultField.value;

    // Use a simple eval-like approach for calculation
    try {
        var result = eval(currentResult);
        resultField.value = result.toString();
    } catch (error) {
        // Handle errors, for example, if the expression is invalid
        resultField.value = 'Error';
    }
}
