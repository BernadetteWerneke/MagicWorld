
// Helden-Team
val zauberin: Zauberin = Zauberin("Maleficent", 500)
val hexe: Hexe = Hexe("Hexe des Westens", 500)
val hausdrache: Hausdrache = Hausdrache("Ursula", 500)

var alleHelden:MutableList<Helden> = mutableListOf(zauberin, hexe, hausdrache)

//Gegner-Team
val helfer:Helfer = Helfer ("Lestrange", 500)
val entgegner:Entgegner = Entgegner("Snape", 1000)

var alleGegner:MutableList<Gegner> = mutableListOf(helfer, entgegner)

var spielen = true
var eineRundeAussetzen = false

fun main() {
val arena:Arena = Arena(zauberin, hexe, hausdrache, entgegner)

    //Vorstellung der Teams
    arena.vorstellung()

    //Spielrunde
    while (spielen){

        if(zauberin.heilPK <=0 && hexe.heilPK <=0 && hausdrache.heilPK <=0){
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
        arena.heldWaehlen()
        arena.zauberAuswaehlen()


    }
}