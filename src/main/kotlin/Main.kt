
// Helden-Team einzeln
val zauberin: Zauberin = Zauberin("Maleficent", 500)
val hexe: Hexe = Hexe("Hexe des Westens", 500)
val hausdrache: Hausdrache = Hausdrache("Ursula", 500)
//gesamtes Heldenteam
var alleHelden:MutableList<Helden> = mutableListOf(zauberin, hexe, hausdrache)

//Gegner-Team einzeln
val helfer:Helfer = Helfer ("Lestrange", 500)
val entgegner:Entgegner = Entgegner("Snape", 1000)
//gesamtes Gegnerteam
var alleGegner:MutableList<Gegner> = mutableListOf(helfer, entgegner)

var spielen = true

//Vitamintrank aus Beutel trinken
var eineRundeAussetzen = false                                  //dann fällt eine Zauberin zufällig aus
var heldSetztWiederEin: MutableList<Helden> = mutableListOf()   //für Zwischenspeicherung des verkleinerten Heldenteams temporär


fun main() {
    //Arena, wo alles stattfindet
    val arena = Arena(zauberin, hexe, hausdrache, entgegner)

    //Vorspann: Einführung in die Geschichte und Vorstellung der Teams
    Geschichte.vorstellung()

    //Spielrunden
    while (spielen ){
        //Abbruchbedingungen, wann Spiel auf natürliche Weise zu Ende ist
        checkWeitereRunde()
        if (!spielen) {break}
        //User wählt Heldin aus
        arena.heldinWaehlen()
        //User sucht Zauber aus
        arena.zauberAuswaehlen()
    }
}

fun checkWeitereRunde(): Boolean {
    //Falls es noch Heldinnen gibt, wird weitergespielt
    if(alleHelden.isEmpty() && !eineRundeAussetzen){
        Geschichte.HeldenTod()           //Ende der Geschichte, wenn Heldinnen gestorben sind
        spielen = false
    }
    return spielen
}
