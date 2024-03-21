class Hausdrache(name:String, heilPK:Int):Helden(name, heilPK){

    //Zauber-Aktionen von Ursula:
    //Avis (Vogelheraufbeschwörungszauber)
     fun avis(gegner: Gegner){
        this.schadenPK=(200..250).random()
        val zauberName = "Avis (Vogelheraufbeschwörungszauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        AllgemeineFkt.trennZeile()
     }

    //Stupor (Schockzauber)
     fun stupor(gegner: Gegner){
        this.schadenPK=120
        val zauberName = "Stupor (Schockzauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        AllgemeineFkt.trennZeile()
     }

    //Sectumsempra (Verwundungszauber)
    fun sectumsempra(gegner: Gegner){
        this.schadenPK=280
        val zauberName = "Sectumsempra (Verwundungszauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        AllgemeineFkt.trennZeile()
    }

    //Aguamenti (Wasser-Aufrufzauber)
    fun aguamenti(gegner: Gegner){
        this.schadenPK=(50..230).random()
        val zauberName = "Aguamenti (Wasser-Aufrufzauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        AllgemeineFkt.trennZeile()
    }
}