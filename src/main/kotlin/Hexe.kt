class Hexe(name:String, heilPK:Int):Helden(name, heilPK,){

    //Zauber-Aktionen der Hexe des Westens:
    //Avis (Vogelheraufbeschwörungszauber)
     fun avis(gegner: Gegner){
        this.schadenPK=(150..250).random()
        var zauberName = "Avis (Vogelheraufbeschwörungszauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        zauberin.trennZeile()
     }

    //Finite Incantatem (Schutzzauber)
     fun finiteIncantatem(gegner: Gegner){
        this.schadenPK=(25..50).random()
        var zauberName = "Finite Incantatem (Schutzzauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        zauberin.trennZeile()
     }

    //Expecto Patronum (Schutzzauber)
    fun expectoPatronum(gegner: Gegner){
        this.schadenPK=(200..250).random()
        var zauberName = "Expecto Patronum (Schutzzauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        zauberin.trennZeile()
    }

    //Waddiwasi (Schleuderzauber)
    fun waddiwasi(gegner: Gegner){
        this.schadenPK=(240..280).random()
        var zauberName = "Waddiwasi (Schleuderzauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        zauberin.trennZeile()
    }

}