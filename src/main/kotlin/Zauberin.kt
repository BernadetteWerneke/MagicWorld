class Zauberin (name:String, heilPK:Int):Helden(name, heilPK) {

    //Zauber-Aktionen von Maleficient:
    //Petrificus Totalus (Versteinerungszauber)
    fun petrificusTotalus(gegner: Gegner) {
        this.schadenPK = (250..350).random()
        val zauberName = "Petrificus Totalus (Versteinerungszauber)"

        textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        berechnungGegnerPunkte(gegner, schadenPK)

        berechnungLebenOderTod(gegner)

        trennZeile()
    }

    //Avis (Vogel-Heraufbeschwörungszauber)
    fun avis(gegner: Gegner) {
        this.schadenPK = (280..320).random()
        val zauberName = "Avis (Vogel-Heraufbeschwörungszauber)"

        textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        berechnungGegnerPunkte(gegner, schadenPK)

        berechnungLebenOderTod(gegner)

        trennZeile()
    }

    //Expelliarmus (Entwaffnungszauber)
    fun expelliarmus(gegner: Gegner) {
        schadenPK = (80..150).random()
        val zauberName = "Expelliarmus (Entwaffnungszauber)"

        textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        berechnungGegnerPunkte(gegner, schadenPK)

        berechnungLebenOderTod(gegner)

        trennZeile()
    }

    //Incendio (Feuerzauber)
    fun incendio(gegner: Gegner) {
        this.schadenPK = (150..250).random()
        val zauberName = "Incendio (Feuerzauber)"

        textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        berechnungGegnerPunkte(gegner, schadenPK)

        berechnungLebenOderTod(gegner)

        trennZeile()

    }


    fun trennZeile() {
        println("------------------------------------------------------")
    }

    fun berechnungLebenOderTod(gegner: Gegner) {
        if (gegner.heilPK > 0) {
            println("Neue PK Schurkengegner: ${gegner.heilPK}")
        } else {
            println("Der Schurke ist tot. + + +")
        }
    }

    fun berechnungGegnerPunkte(gegner: Gegner, schadenPK: Int) {
        gegner.heilPK -= schadenPK
        println("Gegner verliert.")
    }

    fun textBeschreibungSpielrunde(
        heldinName: String,
        heilPK: Int,
        zauberName: String,
        schadenPK: Int,
        gegner: Gegner
    ) {
        println("Zauberin ${heldinName} (${heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
    }

}




