class Entgegner(name: String, heilPK: Int) : Gegner(name, heilPK) {

    //Gegner ist immer Entgegner Snape
     var helferCasten = false
     var keinHelferMehr = false
     var zauberName = ""

    //Angriff des Gegners
    fun zufallsAngriff(entgegner: Entgegner, helden: Helden) {

        //per Würfel wird der Helfer gecastet (einmalig pro Runde) oder nicht
        castingHelferPerZufall()
        //Zufallsauswahl, welcher Zauber der Gegner benutzt
        zauberAuswaehlen(this, helden)
        //check, ob Helfer noch eingesetzt werden kann
        checkHelferEinsatz(helden)
        //Schweregrad des Zaubers des Gegners festlegen
        zauberHaerteFestlegen()
        //Attacke des Gegners
        textBeschreibungSpielrundeGegner(entgegner.name, heilPK, zauberName, helden, schadenPK)
        //Punktestand anzeigen
        berechnungPunkte(helden, schadenPK)
        }

    //check, ob Helfer noch verfügbar
    private fun checkHelferEinsatz(helden: Helden): Boolean {
        if (helferCasten && !keinHelferMehr) {                  //weitere total zufällige Zauberattacke von Helfer, nur 1x pro Kampf
            helfer.zufallsAngriff(helfer, helden)               //Auswahl Angriff des Helfers auf Zauberinnen
            keinHelferMehr = true
        }
        return keinHelferMehr
    }

    //Zufallsauswahl, ob Helfer eingesetzt wird
    private fun castingHelferPerZufall(): Boolean {
        val wuerfel = (1..6).random()
        //Falls Würfel 1 oder 6 ist, kommt Snapes Assistentin ins Spiel, um einen Zauber auf die Heldinnen zusätzlich anzuwenden
        if (wuerfel == 1 || wuerfel == 6) {
            helferCasten = true
        }
        return helferCasten
    }

    //Festlegung der Härte des gegnerischen Zaubers
    private fun zauberHaerteFestlegen(): Int {
         return (40..330).random().also { this.schadenPK = it }
    }

    private fun berechnungPunkte(helden: Helden, schadenPK: Int) {
        helden.heilPK -= schadenPK
        println("Heldin verliert. Neue PK Heldin: ${helden.heilPK}")
        Utils.trennZeile()
    }

    private fun textBeschreibungSpielrundeGegner(gegnerName: String, heilPK: Int, zauberName: String, helden: Helden, schadenPK: Int) {
        println("${gegnerName} (${heilPK} PK) zaubert mit $zauberName (${schadenPK} SchadenPK).")
        println("gegen Heldin ${helden.name} (${helden.heilPK} PK)")
    }

    private fun zauberAuswaehlen(entgegner: Entgegner, helden: Helden): String {
            //Zauber zufällig auswählen
            //check, ob Held oder Gegner noch lebendig sind
            if (helden.heilPK > 0 && entgegner.heilPK >0) {
                //Liste aller Zauber des Gegners
                val aktionsListe: List<Int> = listOf(1, 2, 3, 4, 5, 6)
                //zufällige Auswahl des Zaubers des Gegeners
                val aktion = aktionsListe.random()
    
                //entsprechende Zauber werden der Aktionsliste zugeordnet
                when (aktion) {
                    1 -> { entgegner.zauberName = "Petrificus Totalus (Versteinerungszauber)" }   //Petrificus Totalus (Versteinerungszauber)
                    2 -> { entgegner.zauberName = "Stupor (Schockzauber)" }                       //Stupor (Schockzauber)
                    3 -> { entgegner.zauberName = "Confringo (Sprengzauber)" }                    //Confringo (Sprengzauber)
                    4 -> { entgegner.zauberName = "Sectumsempra (Verwundungszauber)"}             //Sectumsempra (Verwundungszauber)
                    5 -> { entgegner.zauberName = "Confundo (Verwirrungszauber)"}                 //Confundo (Verwirrungszauber)
                    6 -> { entgegner.zauberName = "Avis (Vogel-Heraufbeschwörungszauber)"}        //Avis (Vogel-Heraufbeschwörungszauber)
                }
            }
            return entgegner.zauberName
        }

}