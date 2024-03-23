class Zauberin (name:String, heilPK:Int):Helden(name, heilPK) {

    //Zauber-Aktionen von Maleficient:
    //Petrificus Totalus (Versteinerungszauber)
    fun petrificusTotalus(gegner: Gegner) {
        this.schadenPK = (250..350).random()
        val zauberName = "Petrificus Totalus (Versteinerungszauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
    }

    //Avis (Vogel-Heraufbeschwörungszauber)
    fun avis(gegner: Gegner) {
        this.schadenPK = (280..320).random()
        val zauberName = "Avis (Vogel-Heraufbeschwörungszauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
    }

    //Expelliarmus (Entwaffnungszauber)
    fun expelliarmus(gegner: Gegner) {
        schadenPK = (80..150).random()
        val zauberName = "Expelliarmus (Entwaffnungszauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
    }

    //Incendio (Feuerzauber)
    fun incendio(gegner: Gegner) {
        this.schadenPK = (150..250).random()
        val zauberName = "Incendio (Feuerzauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
    }

}




