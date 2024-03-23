
class Hausdrache(name:String, heilPK:Int):Helden(name, heilPK){

    //Zauber-Aktionen von Ursula:
    //Avis (Vogelheraufbeschwörungszauber)
     fun avis(gegner: Gegner){
        this.schadenPK=(200..250).random()
        val zauberName = "Avis (Vogelheraufbeschwörungszauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
     }

    //Stupor (Schockzauber)
     fun stupor(gegner: Gegner){
        this.schadenPK=120
        val zauberName = "Stupor (Schockzauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
     }

    //Sectumsempra (Verwundungszauber)
    fun sectumsempra(gegner: Gegner){
        this.schadenPK=280
        val zauberName = "Sectumsempra (Verwundungszauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
    }

    //Aguamenti (Wasser-Aufrufzauber)
    fun aguamenti(gegner: Gegner){
        this.schadenPK=(50..230).random()
        val zauberName = "Aguamenti (Wasser-Aufrufzauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
    }
}