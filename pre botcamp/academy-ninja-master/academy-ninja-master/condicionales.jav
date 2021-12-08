if (condición) {
    // lo que se ejecutará si la condición es true
}
else if (2° condición) {        // podemos tener 0 o más de estas condiciones
    // lo que se ejecutará si la segunda condición es true
}
else {                           // podemos tener 0 o 1 de estas instrucciones
    // lo que se ejecutará si ninguna de las condiciones anteriores se cumplen.
Ejemplos:


    var x = 25;
if (x > 50) {
    console.log("mayor que 50");
}
else {
    console.log("menor que 50");
}
// Como x no es mayor que 50, la segunda instrucción de console.log, "menor que 50", es la única que se ejecuta.
