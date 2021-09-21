function durchschnittsberechnung() {
    var tem = 0;
    var alle = document.querySelectorAll("input[type=number]");
    if(alle.length === 4) {
    for (let index = 0; index < alle.length; index++) {
        var parsed = parseFloat(alle.item(index).value); 
        if(Number.isNaN(parsed)){
            document.getElementById("Durchschnitt").value = "FEHLER" ;
            throw "Fehler";
        } else {
            if(parsed <= 6 & parsed> 0) {
                tem =tem + parsed; 
            } else{
                document.getElementById("Durchschnitt").value = "FEHLER: Noten können nicht größer als 6 oder kleiner als 1 sein" ; 
                throw "Fehler";
            }
        }
    }
    var ergebnis = tem / alle.length;
        document.getElementById("Durchschnitt").value = ergebnis; 
    } else {
    document.getElementById("Durchschnitt").value = "FEHLER" ; 
    throw "Fehler";
}
}