import java.lang.Exception

open class Arena(var zauberin: Zauberin, var hexe: Hexe, var hausdrache: Hausdrache,
                 var entgegner: Entgegner) {

    //Eingabedaten des User
    var inputHeld: Int = 0
    var auswahlZauber: Int = 0

    //Heiltrankbeutel der Zauberinnen
    var beutel: Beutel = Beutel()

    //Lieblingszauber der einzelnen Zauberinnen
    var zauberListe: MutableList<String> = mutableListOf(
        "Petrificus Totalus (Versteinerungszauber)",
        "Avis (Vogelheraufbeschwörungszauber)", "Expelliarmus (Entwaffnungszauber)", "Incendio (Feuerzauber)"
    )

    var hexenListe: MutableList<String> = mutableListOf(
        "Avis (Vogelheraufbeschwörungszauber)",
        "Finite Incantatem (Schutzzauber)", "Expecto Patronum (Schutzzauber)", "Waddiwasi (Schleuderzauber)"
    )

    var hausdracheListe: MutableList<String> = mutableListOf(
        "Avis (Vogelheraufbeschwörungszauber)", "Stupor (Schockzauber)",
        "Sectumsempra (Verwundungszauber)", "Aguamenti (Wasser-Aufrufzauber)"
    )


    //Zauberin auswählen:
    fun heldinWaehlen() {

        println("Welche Zauberin zaubert?")

        //Heldinnen mit LebensPunkten anzeigen
        anzeigeHeldinnen()

        println("Spielende mit Eingabe '99'.Gib eine Zahl ein :")

            //Eingabefehler des Users abfangen / Spiel beenden
            try {
                inputHeld = readln().toInt()

                //check, ob Spiel vom Spieler angebrochen werden will
                checkSpielAbbrechen(inputHeld)

                //check auf gültige Eingabe der Zahl im Range
                checkGueltigeEingabe("Heldin")

            } catch (ex: Exception) {
                println("Gib eine gültige Zahl ein. Sonst kann das Spiel nicht weitergehen!")
                heldinWaehlen()
            }


        //Heldin wieder hinzufügen nach 1 Runde aussetzen (Vitamintrank trinken)
        if (eineRundeAussetzen) {
            nachAussetzenWiederHinzufuegen()
        }
    }

    private fun nachAussetzenWiederHinzufuegen() {
            alleHelden = heldSetztWiederEin
            eineRundeAussetzen = false
    }

    private fun anzeigeHeldinnen() {
        var a = 1
        for (i in 0 until alleHelden.size) {
            println("$a für ${alleHelden[i].name} (${alleHelden[i].heilPK} PK)")
            a++
        }
    }


    //Auswahl des Zaubers vom User
    fun zauberAuswaehlen() {
        zauberin.trennZeile()
        println("Wähle einen Zauber: ")

        //Liste der möglichen Zauber anzeigen
        when (inputHeld) {
            1 -> { aktionenHeldinAnzeigen(zauberListe) }    //Aktionen der Zauberin anzeigen
            2 -> { aktionenHeldinAnzeigen(hexenListe) }     //Aktionen der Hexe anzeigen
            3 -> { aktionenHeldinAnzeigen(hausdracheListe) }//Aktionen des Hausdrachen anzeigen
        }

        //Auswahl des Zaubers
        println("Spielende mit Eingabe '99'. Wähle eine Zahl:")

        //Fehlerhafte Eingaben des Users abfangen
        try {
            auswahlZauber = readln().toInt()

            //check Abbruch durch den Spieler mit Eingabe 99
            checkSpielAbbrechen(auswahlZauber)

            //check auf gültige Eingabe im Range
            checkGueltigeEingabe("Zauber")

        } catch (ex: Exception) {
            println("Gib eine der obigen Zahlen ein. Sonst geht das Spiel nicht weiter!")
            zauberAuswaehlen()
        }

        //Spiel beginnt
        //Zauber + Zauberinnen werden entsprechend zugeordnet
        if (auswahlZauber == 1) {
            if (alleHelden[inputHeld - 1] == zauberin && zauberin.heilPK > 0) {
                zauberin.petrificusTotalus(entgegner)
            }
            if (alleHelden[inputHeld - 1] == hexe && hexe.heilPK > 0) {
                hexe.avis(entgegner)
            }
            if (alleHelden[inputHeld - 1] == hausdrache && hausdrache.heilPK > 0) {
                hausdrache.avis(entgegner)
            }
        }

        if (auswahlZauber == 2) {
            if (alleHelden[inputHeld - 1] == zauberin && zauberin.heilPK > 0) {
                zauberin.avis(entgegner)
            }
            if (alleHelden[inputHeld - 1] == hexe && hexe.heilPK > 0) {
                hexe.finiteIncantatem(entgegner)
            }
            if (alleHelden[inputHeld - 1] == hausdrache && hausdrache.heilPK > 0) {
                hausdrache.stupor(entgegner)
            }
        }

        if (auswahlZauber == 3) {
            if (alleHelden[inputHeld - 1] == zauberin && zauberin.heilPK > 0) {
                zauberin.expelliarmus(entgegner)
            }
            if (alleHelden[inputHeld - 1] == hexe && hexe.heilPK > 0) {
                hexe.expectoPatronum(entgegner)
            }
            if (alleHelden[inputHeld - 1] == hausdrache && hausdrache.heilPK > 0) {
                hausdrache.sectumsempra(entgegner)
            }
        }

        if (auswahlZauber == 4) {
            if (alleHelden[inputHeld - 1] == zauberin && zauberin.heilPK > 0) {
                zauberin.incendio(entgegner)
            }
            if (alleHelden[inputHeld - 1] == hexe && hexe.heilPK > 0) {
                hexe.waddiwasi(entgegner)
            }
            if (alleHelden[inputHeld - 1] == hausdrache && hausdrache.heilPK > 0) {
                hausdrache.aguamenti(entgegner)
            }
        }
//-----------------------------------------------------------------------------------------
        //check: falls heilPK <=0, dann Held tot + aus Liste entfernen
        for (i in 0 until alleHelden.size) {
            if (alleHelden[i].heilPK <= 0) {
                println("${alleHelden[i].name} ist tot.")
                println("      + + +")
                alleHelden.removeAt(i)
                break
            }
        }


        //Beutel nutzen, wenn eingegebener Held unter 250 PK
        if (alleHelden[inputHeld - 1].heilPK > 0) {
            if (alleHelden[inputHeld - 1].heilPK in 1..250 && entgegner.heilPK > 0) {
                beutel.beutelNutzen(alleHelden[inputHeld - 1], alleHelden)
            }
        }


        //Gegner mit Zufallsangriff auf random-Zauberin
        entgegner.zufallsAngriff(entgegner, alleHelden.random())


        //check: falls heilPK <=0, dann Zauberin tot + aus Liste entfernen
        for (i in 0 until alleHelden.size) {
            if (alleHelden[i].heilPK <= 0) {
                println("${alleHelden[i].name} ist tot.")
                println("      + + +")
                alleHelden.removeAt(i)
                break
            }
        }
    }

    private fun checkGueltigeEingabe(check: String) {

        when (check) {
            //check, ob Eingabe der Heldin korrekt ist
            "Heldin" -> {
                if (inputHeld < 1 || inputHeld > 3) {
                    println("Gib eine gültige Zahl zwischen 1 und 3 ein.")
                    inputHeld = 0
                    heldinWaehlen()

                } else {
                    println("${alleHelden[inputHeld - 1].name} tritt diese Runde an.")
                }

            }
            //check, ob Eingabe des Zaubers korrekt ist
            "Zauber" -> {
                if (auswahlZauber < 1 || auswahlZauber > 4) {
                    println("Gib eine gültige Zahl zwischen 1 und 4 ein.")
                    auswahlZauber = 0
                    zauberAuswaehlen()
                }
            }
        }
    }

    //Auflistung der Zauber der jeweils ausgewählten Heldin
    private fun aktionenHeldinAnzeigen(zauberSpruchListe: MutableList<String>) {
        var a = 1
        for (i in 0 until zauberSpruchListe.size) {
            println("$a Zauber: ${zauberSpruchListe[i]}")
            a++
        }
    }

    //check, ob das Spiel vom Spieler selbst abgebrochen werden soll (Eingabe der Zahl 99)
    //nur möglich bei Eingabe Heldin und Eingabe Zauber
    private fun checkSpielAbbrechen(input: Int) {
        if (input == 99) {
            println("Spiel wurde vom Spieler abgebrochen. Das Spiel ist beendet.")
            System.exit(0)
        }
    }

//___________________________________________________________________________________


    //Vorspann
        //Die Geschichte + Vorstellung der einzelnen Mitglieder der Teams
        fun vorstellung() {
            //Einführung
            println()
            println("Willkommen in der magischen Welt von drei Zauberinnen und einem düsteren Schurken!")
            println()
            println("Es war einmal in einem abgelegenen Wald, tief verborgen vor den Augen der Menschen, \n" +
                    "ein geheimnisvolles Dorf von Zauberinnen. Diese Zauberinnen waren bekannt für ihre mächtigen \n" +
                    "Zauberkräfte und ihre Weisheit. Doch eines Tages tauchte ein finsterer Schurke namens \n" +
                    "Snape auf begleitet von seiner hinterhältigen Assistentin Lestrange. Snape wollte \n" +
                    "die Kräfte der Zauberinnen stehlen, um die Welt in Dunkelheit zu hüllen und sie in ewiger \n" +
                    "Finsternis zu versklaven.")
            println()
            println("Die drei mächtigsten Zauberinnen des Dorfes Maleficent, die 'Hexe des Westens' und Ursula \n" +
                    "beschlossen sich Sanpe und Lestrange entgegenzustellen. Sie trafen sich in einer geheimen \n" +
                    "Hütte am Rande des Waldes, um ihren Plan zu schmieden. Die Hexe des Westens, sprach: \"Wir \n" +
                    "müssen unsere Kräfte vereinen und unsere mächtigsten Zaubersprüche einsetzen, um Snape\n" +
                    "aufzuhalten.")
            println()
            println("Ursula fügte hinzu: \"Wir müssen auch vorsichtig sein, denn Snape ist gerissen und \n" +
                    "Lestrange ist eine Meisterin der Täuschung.\"")
            println()
            println("Maleficent schlug vor: \"Lasst uns einen Schutzzauber weben, um uns vor ihren Angriffen\n" +
                    "zu schützen, und dann werden wir unsere mächtigsten Zaubersprüche auf sie loslassen.\"")
            println()
            println("Die drei Zauberinnen begannen einen mächtigen Schutzzauber zu weben, der sie vor Snapes \n" +
                    "dunklen Machenschaften schützen sollte. Als der Schutzzauber vollendet war, begaben sie \n" +
                    "sich in den Wald, wo Snape und Lestrange bereits auf sie warteten.")
            println()
            println("Snape lachte düster und sagte: \"Ihr Zauberinnen könnt nichts gegen meine Macht ausrichten!\"")
            println()
            println("Doch die Zauberinnen ließen sich nicht einschüchtern und ein entschlossener Kampf entbrennt...")
            println()

            //Vorstellung Heldenteam
            println("Das Heldenteam besteht aus folgenden mächtigen Zauberinnen:")
            for (i in 0 until alleHelden.size) {
                println("Hallo! Mein Name ist ${alleHelden[i].name} und ich bin ${alleHelden[i].heilPK} Punkte stark.")
            }
            println()

            //Vorstellung Gegnerteam
            println("Das Team der Gegner besteht aus folgenden finsteren Mächten:")
            for (i in 0 until alleGegner.size) {
                println("HaHa! Mein Name ist ${alleGegner[i].name} und ich bin ${alleGegner[i].heilPK} Punkte stark.")
            }
            println()
        }
}































