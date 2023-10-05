class Entgegner(name: String, heilPK: Int) : Gegner(name, heilPK) {

    //Gegner ist immer Entgegner Snape
    var helferCasten = false
    var keinHelferMehr = false

    fun zufallsAngriff(entgegner: Entgegner, helden: Helden) {

        //Helfer casten, zufällig
        val wuerfel = (1..6).random()
        if (wuerfel == 1 || wuerfel == 6) {
            helferCasten = true
        }

        if (helden.heilPK > 0 && entgegner.heilPK >0) {
            val aktionsListe: List<Int> = listOf(1, 2, 3, 4, 5, 6)
            val aktion = aktionsListe.random()
            when (aktion) {
                1 -> { petrificusTotalus(helden) }

                2 -> { stupor(helden) }

                3 -> { confringo(helden) }

                4 -> { sectumsempra(helden) }

                5 -> { confundo(helden) }

                6 -> { avis(helden) }
            }
            if (helferCasten && !keinHelferMehr) {                  //weitere Zauberattacke von Helfer, nur 1x pro Kampf
                helfer.zufallsAngriff(helfer, helden)
                keinHelferMehr = true
            }

        }
    }

    //Zauber-Aktionen:
    //Petrificus Totalus (Versteinerungszauber)
    fun petrificusTotalus(helden: Helden) {
        this.schadenPK = (200..300).random()
        var zauberName = "Petrificus Totalus (Versteinerungszauber)"
        println("${this.name} (${this.heilPK} PK) zaubert mit $zauberName (${this.schadenPK} SchadenPK).")
        println("gegen Held ${helden.name} (${helden.heilPK} PK)")
        helden.heilPK -= schadenPK
        println("Held verliert. Neue PK Held: ${helden.heilPK}")
        println("------------------------------------------------------")
    }

    //Stupor (Schockzauber)
    fun stupor(helden: Helden) {
        this.schadenPK = (180..250).random()
        var zauberName = "Stupor (Schockzauber)"
        println("${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("gegen Held ${helden.name} (${helden.heilPK} PK)")
        helden.heilPK -= schadenPK
        println("Held verliert. Neue PK Held: ${helden.heilPK}")
        println("------------------------------------------------------")
    }

    //Confringo (Sprengzauber)
    fun confringo(helden: Helden) {
        this.schadenPK = (280..330).random()
        var zauberName = "Confringo (Sprengzauber)"
        println("${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("gegen Held ${helden.name} (${helden.heilPK} PK)")
        helden.heilPK -= schadenPK
        println("Held verliert. Neue PK Held: ${helden.heilPK}")
        println("------------------------------------------------------")
    }

    //Sectumsempra (Verwundungszauber)
    fun sectumsempra(helden: Helden) {
        this.schadenPK = (50..280).random()
        var zauberName = "Sectumsempra (Verwundungszauber)"
        println("${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("gegen Held ${helden.name} (${helden.heilPK} PK)")
        helden.heilPK -= schadenPK
        println("Held verliert. Neue PK Held: ${helden.heilPK}")
        println("------------------------------------------------------")
    }

    //Confundo (Verwirrungszauber)
    fun confundo(helden: Helden) {
        this.schadenPK = (20..80).random()
        var zauberName = "Confundo (Verwirrungszauber)"
        println("${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("gegen Held ${helden.name} (${helden.heilPK} PK)")
        helden.heilPK -= schadenPK
        println("Held verliert. Neue PK Held: ${helden.heilPK}")
        println("------------------------------------------------------")
    }

    //Avis (Vogel-Heraufbeschwörungszauber)
    fun avis(helden: Helden) {
        this.schadenPK = (280..320).random()
        var zauberName = "Avis (Vogel-Heraufbeschwörungszauber)"
        println("${this.name} (${this.heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
        println("gegen Held ${helden.name} (${helden.heilPK} PK)")
        helden.heilPK -= schadenPK
        println("Held verliert. Neue PK Held: ${helden.heilPK}")
        println("------------------------------------------------------")
    }
}