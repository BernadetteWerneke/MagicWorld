
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
val arena:Arena = Arena(zauberin, hexe, hausdrache, entgegner)

    //Vorstellung der Teams
    arena.vorstellung()

    //Spielrunden
    while (spielen ){

        //Abbruchbedingungen, wann Spiel zu Ende ist
        if(alleHelden.isEmpty() && !eineRundeAussetzen){
            println("Alle Zauberinnen haben verloren. Sie kämpften verzweifelt,\n" +
                    "aber sie konnten nichts ausrichten. Snape und Lestrange \n" +
                    "triumphierten und übernahmen die Welt. Spielende!")
            spielen =false
            break
        }
        if (entgegner.heilPK <=0){
            println("Der Bösewicht ist besiegt. Und so endet die Geschichte von den \n" +
                    "drei Zauberinnen und dem düsteren Schurken. Und sie lebten \n" +
                    "glücklich und zufrieden bis an ihr Lebensende.")
            spielen = false
            break
        }

        //User wählt Zauberin aus
        arena.heldWaehlen()

        //User sucht Zauber aus
        arena.zauberAuswaehlen()
    }
}