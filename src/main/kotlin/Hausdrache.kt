class Hausdrache(name:String, heilPK:Int):Helden(name, heilPK){

    //Zauber-Aktionen von Ursula:
    //Avis (Vogelheraufbeschwörungszauber)
     fun avis(gegner: Gegner){
        this.schadenPK=(200..250).random()
        val zauberName = "Avis (Vogelheraufbeschwörungszauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= schadenPK
        if (gegner.heilPK > 0) {
            println("Neue PK Schurke: ${gegner.heilPK}")
        } else {
            println("Der Schurke ist tot. + + +")
        }
        println("------------------------------------------------------")
     }

    //Stupor (Schockzauber)
     fun stupor(gegner: Gegner){
        this.schadenPK=120
        val zauberName = "Stupor (Schockzauber)"
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

    //Sectumsempra (Verwundungszauber)
    fun sectumsempra(gegner: Gegner){
        this.schadenPK=280
        val zauberName = "Sectumsempra (Verwundungszauber)"
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

    //Aguamenti (Wasser-Aufrufzauber)
    fun aguamenti(gegner: Gegner){
        this.schadenPK=(50..230).random()
        val zauberName = "Aguamenti (Wasser-Aufrufzauber)"
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
}