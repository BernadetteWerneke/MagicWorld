class Zauberin (name:String, heilPK:Int):Helden(name, heilPK) {

    //Zauber-Aktionen von Maleficient:
    //Petrificus Totalus (Versteinerungszauber)
    fun petrificusTotalus(gegner: Gegner) {
        this.schadenPK = (250..350).random()
        val zauberName = "Petrificus Totalus (Versteinerungszauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= schadenPK
        println("Gegner verliert.")
        if (gegner.heilPK > 0) {
            println("Neue PK Schurke: ${gegner.heilPK}")
        } else {
            println("Der Schurke ist tot. + + +")
        }
        println("------------------------------------------------------")
    }

    //Avis (Vogel-Heraufbeschwörungszauber)
    fun avis(gegner: Gegner){
        this.schadenPK=(280..320).random()
        val zauberName = "Avis (Vogel-Heraufbeschwörungszauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= schadenPK
        println("Gegner verliert.")
        if (gegner.heilPK > 0) {
                println("Neue PK Schurke: ${gegner.heilPK}")
        } else {
            println("Der Schurke ist tot. + + +")
        }
        println("------------------------------------------------------")
    }

    //Expelliarmus (Entwaffnungszauber)
    fun expelliarmus(gegner: Gegner){
        schadenPK=(80..150).random()
        val zauberName = "Expelliarmus (Entwaffnungszauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= schadenPK
        println("Gegner verliert.")
        if (gegner.heilPK > 0) {
            println("Neue PK Schurke: ${gegner.heilPK}")
        } else {
            println("Der Schurke ist tot. + + +")
        }
        println("------------------------------------------------------")
    }

    //Incendio (Feuerzauber)
    fun incendio(gegner: Gegner){
        this.schadenPK=(150..250).random()
        val zauberName = "Incendio (Feuerzauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= schadenPK
        println("Gegner verliert.")
        if (gegner.heilPK > 0) {
            println("Neue PK Schurke: ${gegner.heilPK}")
        } else {
            println("Der Schurke ist tot. + + + ")
        }
        println("------------------------------------------------------")}

}



