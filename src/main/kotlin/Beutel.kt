import java.awt.List
import java.lang.Exception

class Beutel {

    //Beutelinhalt festlegen
    var beutelInhalt: MutableList<String> = mutableListOf("Heiltrank1", "Heiltrank2", "Heiltrank3", "1xVitamine")

    var iHeiltrank = 1
    var vitamine = true
    var heiltrankGenutzt = false

    //Beutel wird genutzt
    fun beutelNutzen(Held: Helden, alleHelden: MutableList<Helden>) {

        //User-Eingabe
        var inputBeutelInhalt = 0

        //Beutel wird nur angeboten, wenn noch etwas drin ist
        if (beutelInhalt.isNotEmpty()) {


            println("${Held.name} ist sehr schwach und holt den magischen Beutel hervor.")
            println("Inhalt: ${this.beutelInhalt}")                     //full: "Heiltrank1", "Heiltrank2", "Heiltrank3", "1xVitamine"

            for (i in beutelInhalt.indices) {                           //listet Beutelinhalt auf mit Nummerierung
                println(" $i ${beutelInhalt[i]} nutzen")
            }
            println("Wähle aus dem Beutel eines der Dinge:")

            //USerEingabe der Auswahl im Beutel
            //Falls falsche Eingabe, dann wird automatisch zufällig eine Auswahl getroffen
            try {
                inputBeutelInhalt = readln().toInt()
            } catch (ex: Exception) {
                println("Fehlerhafte Eingabe. Die Auswahl wird zufällig ermittelt und dann geht es weiter...")
                inputBeutelInhalt = (1..2).random()
            }

            //Je nach Wahl haben die Tränke unterschiedliche Wirkungen
            when (inputBeutelInhalt) {
                0 -> {
                    //Heiltrank 1 trinken, Kraft um 50% erhöht
                    if (iHeiltrank in 1..3) {
                        println("Heiltrank wird getrunken.")
                        //heilPK um 50% erhöhen
                        Held.heilPK = ((Held.heilPK * 1.5).toInt())
                        println("Kraft von ${Held.name} erhöht sich um 50% auf ${Held.heilPK} PK.")
                        //Trank aus Liste entfernen
                        beutelInhalt.removeAt(0)
                        iHeiltrank++
                        heiltrankGenutzt = true
                    }
                }

                1 -> {
                    //Heiltrank 2 trinken, Kraft um 60% erhöht
                    if (iHeiltrank in 1..3) {
                        println("Heiltrank wird getrunken.")
                        //heilPK um 60% erhöhen
                        Held.heilPK = ((Held.heilPK * 1.6).toInt())
                        println("Kraft von ${Held.name} erhöht sich um 60% auf ${Held.heilPK} PK.")
                        beutelInhalt.removeAt(inputBeutelInhalt)
                        iHeiltrank++
                        heiltrankGenutzt = true
                    }
                }

                2 -> {
                    //Heiltrank 3 trinken, KRaft um 70% erhöht
                    if (iHeiltrank in 1..3) {
                        println("Heiltrank wird getrunken.")
                        //heilPK um 70% erhöhen
                        Held.heilPK = ((Held.heilPK * 1.7).toInt())
                        println("Kraft von ${Held.name} erhöht sich um 70% auf ${Held.heilPK} PK.")
                        //Trank aus Liste entfernen
                        beutelInhalt.removeAt(inputBeutelInhalt)
                        iHeiltrank++
                        heiltrankGenutzt = true
                    } else {
                        println("Kein Heiltrank2 mehr im Beutel!")
                    }
                    println("****************************************************")
                }

                3 -> {
                    //Vitamintrank trinken, Kraft plus 10%
                    if (vitamine) {
                        Held.heilPK = ((Held.heilPK * 1.1).toInt())
                        println("Kraft von ${Held.name} wird um 10% erhöht auf ${Held.heilPK}!")
                        vitamine = false
                        beutelInhalt.removeAt(inputBeutelInhalt)

                        //ein zufälliger Held fällt eine Runde aus
                        println("Dafür setzt ein Held zufällig aus.")
                        heldSetztWiederEin.clear()
                        heldSetztWiederEin += alleHelden

                        val heldFaelltAus = alleHelden.random()

                        //println("Der Zufall wählt ${Held.name} und sie setzt nun eine Runde aus.")
                        if (alleHelden.size >1) {
                            println("Der Zufall wählt ${heldFaelltAus.name}.")
                            alleHelden.remove(heldFaelltAus)

                            eineRundeAussetzen = true
                        }
                    } else {
                        println("Vitamine sind aufgebraucht.")
                    }
                    println("****************************************************")
                }
            }
        }
    }
}