import java.awt.List
import java.lang.Exception

class Beutel{

    var beutelInhalt: MutableList<String> = mutableListOf("Heiltrank1", "Heiltrank2", "Heiltrank3", "1xVitamine")

    var iHeiltrank = 1
    var vitamine = true
    var heiltrankGenutzt = false

    //var eineRundeAussetzen = false

        fun beutelNutzen(Held: Helden, alleHelden: MutableList<Helden>) {

            var inputBeutelInhalt = 0


            println("${Held.name} ist sehr schwach und holt den magischen Beutel hervor.")
            println("Inhalt: ${this.beutelInhalt}")                     //full: "Heiltrank1", "Heiltrank2", "Heiltrank3", "1xVitamine"
            println("1 Heiltrank aus Beutel nutzen")
            println("2 Vitamine aus Beutel nutzen")
            println("Wähle aus dem Beutel eines der Dinge:")

            try {
                inputBeutelInhalt =
                    readln().toInt()
            } catch (ex: Exception){
                println("Fehlerhafte Eingabe. Die Auswahl wird zufällig ermittelt und dann geht es weiter...")
                inputBeutelInhalt = (1..2).random()
            }

            when (inputBeutelInhalt) {
                1 -> {
                    //Heiltrank trinken
                    if (iHeiltrank in 1..3) {
                        println("Heiltrank wird getrunken.")
                        //heilPK um 50% erhöhen
                        Held.heilPK = ((Held.heilPK * 1.5).toInt())
                        println("Kraft von ${Held.name} erhöht sich um 50% auf ${Held.heilPK} PK.")
                        //Trank aus Liste entfernen
                        beutelInhalt.removeAt(0)
                        iHeiltrank++
                        heiltrankGenutzt = true
                    } else {
                        println("Kein Heiltrank mehr im Beutel!")
                    }
                    println("****************************************************")
                }

                2 -> {
                    //Vitamintrank trinken, heilPK plus 10%, jemand aus Team fällt aus
                    if (vitamine) {
                        Held.heilPK = ((Held.heilPK * 1.1).toInt())
                        println("Kraft von ${Held.name} wird um 10% erhöht auf ${Held.heilPK}!")
                        vitamine = false
                        beutelInhalt.removeLast()
                        println("Dafür setzt ein zufällig gewählter Held aus.")
                        val heldFaelltAus = alleHelden.random()
                        println("${heldFaelltAus.name} setzt eine Runde aus.")
                        //randomHeld für 1 Runde entfernen
                        //alleHelden.remove(heldFaelltAus)
                        eineRundeAussetzen = true
                    }else{
                        println("Vitamine sind aufgebraucht.")
                        }
                        println("****************************************************")
                    }
                }
            }
        }