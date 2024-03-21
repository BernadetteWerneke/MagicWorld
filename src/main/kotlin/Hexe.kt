class Hexe(name:String, heilPK:Int):Helden(name, heilPK,){

    //Zauber-Aktionen der Hexe des Westens:
    //Avis (Vogelheraufbeschwörungszauber)
     fun avis(gegner: Gegner){
        this.schadenPK=(150..250).random()
        val zauberName = "Avis (Vogelheraufbeschwörungszauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        AllgemeineFkt.trennZeile()
     }

    //Finite Incantatem (Schutzzauber)
     fun finiteIncantatem(gegner: Gegner){
        this.schadenPK=(25..50).random()
        val zauberName = "Finite Incantatem (Schutzzauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        AllgemeineFkt.trennZeile()
     }

    //Expecto Patronum (Schutzzauber)
    fun expectoPatronum(gegner: Gegner){
        this.schadenPK=(200..250).random()
        val zauberName = "Expecto Patronum (Schutzzauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        AllgemeineFkt.trennZeile()
    }

    //Waddiwasi (Schleuderzauber)
    fun waddiwasi(gegner: Gegner){
        this.schadenPK=(240..280).random()
        val zauberName = "Waddiwasi (Schleuderzauber)"

        zauberin.textBeschreibungSpielrunde(name, heilPK, zauberName, schadenPK, gegner)

        zauberin.berechnungGegnerPunkte(gegner, schadenPK)

        zauberin.berechnungLebenOderTod(gegner)

        AllgemeineFkt.trennZeile()
    }

}