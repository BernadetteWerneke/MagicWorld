
class Utils {
    //Funtkionalitäten, die überall gebraucht werden
    companion object {

        fun trennZeile() {
            println("------------------------------------------------------")
        }

        fun berechnungLebenOderTod(gegner: Gegner) {
            if (gegner.heilPK > 0) {
                println("Neue PK Schurkengegner: ${gegner.heilPK}")
            } else {
                println("Der Schurke ist tot. + + +")
                spielen = false
                trennZeile()
                Geschichte.GegnerTod()
                trennZeile()
            }
        }

        fun textBeschreibungSpielrunde(
            heldinName: String,
            heilPK: Int,
            zauberName: String,
            schadenPK: Int,
            gegner: Gegner
        ) {
            println("Zauberin ${heldinName} (${heilPK} PK) zaubert mit $zauberName ($schadenPK SchadenPK).")
            println("Gegner: ${gegner.name} (${gegner.heilPK} PK)")
        }

        fun berechnungGegnerPunkte(gegner: Gegner, schadenPK: Int) {
            gegner.heilPK -= schadenPK
            println("Gegner verliert.")
        }
    }
}