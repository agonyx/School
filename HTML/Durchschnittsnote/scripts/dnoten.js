function durchschnittsberechnung1() {
    let note1 = document.getElementById("note1").value;
    let note2 = document.getElementById("note2").value;
    let note3 = document.getElementById("note3").value;
    let note4 = document.getElementById("note4").value;
    return (note1 + note2 + note3 + note4) / 4;
}
function durchschnittsberechnung() {
    var out;
    var sout;
    for (let index = 0; index < document.querySelectorAll("input[type=number]").length; index++) {
        out++;
        sout += parseFloat(document.querySelector("input[type=number]").value
    }
    return sout / out;
}