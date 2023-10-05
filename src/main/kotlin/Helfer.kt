class Helfer(name:String, heilPK:Int):Gegner(name, heilPK,) {

    //Aufruf Helfer gecastet
    fun zufallsAngriff(helfer:Gegner, helden:Helden){
        var aktionsListe: List<Int> = listOf(1,2,3,4)
        var aktion = aktionsListe.random()
        when (aktion){
            1 -> {expectoPatronum(helden)}
            2 -> {incendio(helden)}
            3 -> {impervius(helden)}
            4 -> {petrificusTotalus(helden)}
        }
    }

    //Zauber-Aktionen:
    //Expecto Patronum (Schutzzauber)
    fun expectoPatronum(helden: Helden){
        this.schadenPK=(200..300).random()
        var zauberName = "Expecto Patronum (Schutzzauber)"
        println("Unterboss $name zaubert einmalig mit $zauberName ($schadenPK SchadenPK)")
        println("gegen Held ${helden.name} (${helden.heilPK} PK)")
        helden.heilPK -= schadenPK
        println("Held verliert. Neue PK Held: ${helden.heilPK}")
        println("------------------------------------------------------") }

    //Incendio (Feuerzauber)
    fun incendio(helden: Helden) {
        this.schadenPK=(80..180).random()
        var zauberName = "Incendio (Feuerzauber)"
        println("Unterboss ${this.name} zaubert einmalig mit $zauberName (${this.schadenPK} SchadenPK)")
        println("gegen Held ${helden.name} (${helden.heilPK} PK)")
        helden.heilPK -= schadenPK
        println("Held verliert. Neue PK Held: ${helden.heilPK}")
        println("------------------------------------------------------")}

    //Impervius (Alltagszauber)
    fun impervius(helden: Helden){
        this.schadenPK=(40..80).random()
        var zauberName = "Impervius (Alltagszauber)"
        println("Unterboss ${this.name} zaubert einmalig mit $zauberName (${this.schadenPK} SchadenPK)")
        println("gegen Held ${helden.name} (${helden.heilPK} PK)")
        helden.heilPK -= schadenPK
        println("Held verliert. Neue PK Held: ${helden.heilPK}")
        println("------------------------------------------------------")}

    //Petrificus Totalus (Versteinerungszauber)
    fun petrificusTotalus(helden: Helden){
        this.schadenPK=(50..300).random()
        var zauberName = "Petrificus Totalus (Versteinerungszauber)"
        println("${this.name} zaubert einmalig mit $zauberName (${this.schadenPK} SchadenPK)")
        println("gegen Held ${helden.name} (${helden.heilPK} PK)")
        helden.heilPK -= schadenPK
        println("Held verliert. Neue PK Held: ${helden.heilPK}")
        println("------------------------------------------------------")}
}