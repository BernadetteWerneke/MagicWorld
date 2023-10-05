class Hexe(name:String, heilPK:Int):Helden(name, heilPK,){

    //Zauber-Aktionen:
    //Avis (Vogelheraufbeschwörungszauber)
     fun avis(gegner: Gegner){
        this.schadenPK=(150..250).random()
        var zauberName = "Avis (Vogelheraufbeschwörungszauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= this.schadenPK
        println("Gegner verliert. Neue PK Gegener: ${gegner.heilPK}")
        println("------------------------------------------------------")}

    //Finite Incantatem (Schutzzauber)
     fun finiteIncantatem(gegner: Gegner){
        this.schadenPK=(25..50).random()
        var zauberName = "Finite Incantatem (Schutzzauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= schadenPK
        println("Gegner verliert. Neue PK Gegener: ${gegner.heilPK}")
        println("------------------------------------------------------")}

    //Expecto Patronum (Schutzzauber)
    fun expectoPatronum(gegner: Gegner){
        this.schadenPK=(200..250).random()
        var zauberName = "Expecto Patronum (Schutzzauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= this.schadenPK
        println("Gegner verliert. Neue PK Gegener: ${gegner.heilPK}")
        println("------------------------------------------------------")}

    //Waddiwasi (Schleuderzauber)
    fun waddiwasi(gegner: Gegner){
        this.schadenPK=(240..280).random()
        var zauberName = "Waddiwasi (Schleuderzauber)"
        println("Zauberin ${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        gegner.heilPK -= this.schadenPK
        println("Gegner verliert. Neue PK Gegener: ${gegner.heilPK}")
        println("------------------------------------------------------")
    }

}