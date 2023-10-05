class Hausdrache(name:String, heilPK:Int):Helden(name, heilPK,){

    //Zauber-Aktionen:
    //Avis (Vogelheraufbeschwörungszauber)
     fun avis(gegner: Gegner){
        this.schadenPK=(200..250).random()
        var zauberName = "Avis (Vogelheraufbeschwörungszauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= schadenPK
        println("Gegner verliert. Neue PK Gegener: ${gegner.heilPK}")
        println("------------------------------------------------------")
     }

    //Stupor (Schockzauber)
     fun stupor(gegner: Gegner){
        this.schadenPK=120
        var zauberName = "Stupor (Schockzauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= schadenPK
        println("Gegner verliert. Neue PK Gegener: ${gegner.heilPK}")
        println("------------------------------------------------------")

     }

    //Sectumsempra (Verwundungszauber)
    fun sectumsempra(gegner: Gegner){
        this.schadenPK=280
        var zauberName = "Sectumsempra (Verwundungszauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= schadenPK
        println("Gegner verliert. Neue PK Gegener: ${gegner.heilPK}")
        println("------------------------------------------------------")
    }

    //Aguamenti (Wasser-Aufrufzauber)
    fun aguamenti(gegner: Gegner){
        this.schadenPK=(50..230).random()
        var zauberName = "Aguamenti (Wasser-Aufrufzauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= schadenPK
        println("Gegner verliert. Neue PK Gegener: ${gegner.heilPK}")
        println("------------------------------------------------------")
    }
}