class Hexe(name:String, heilPK:Int):Helden(name, heilPK,){

    //Zauber-Aktionen der Hexe des Westens:
    //Avis (Vogelheraufbeschwörungszauber)
     fun avis(gegner: Gegner){
        this.schadenPK=(150..250).random()
        val zauberName = "Avis (Vogelheraufbeschwörungszauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
     }

    //Finite Incantatem (Schutzzauber)
     fun finiteIncantatem(gegner: Gegner){
        this.schadenPK=(25..50).random()
        val zauberName = "Finite Incantatem (Schutzzauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
     }

    //Expecto Patronum (Schutzzauber)
    fun expectoPatronum(gegner: Gegner){
        this.schadenPK=(200..250).random()
        val zauberName = "Expecto Patronum (Schutzzauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
    }

    //Waddiwasi (Schleuderzauber)
    fun waddiwasi(gegner: Gegner){
        this.schadenPK=(240..280).random()
        val zauberName = "Waddiwasi (Schleuderzauber)"

        Utils.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)
        Utils.berechnungGegnerPunkte(gegner, schadenPK)
        Utils.berechnungLebenOderTod(gegner)
        Utils.trennZeile()
    }

}