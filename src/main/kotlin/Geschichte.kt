class Geschichte {

    companion object{

    //Vorspann
    //Die Geschichte + Vorstellung der einzelnen Mitglieder der Teams
    //Einführung in die Handlungen
    fun vorstellung() {
        //Einführung
        println()
        println("Willkommen in der magischen Welt von drei Zauberinnen und einem düsteren Schurken!")
        println()
        println(
            "Es war einmal in einem abgelegenen Wald, tief verborgen vor den Augen der Menschen, \n" +
                    "ein geheimnisvolles Dorf von Zauberinnen. Diese Zauberinnen waren bekannt für ihre mächtigen \n" +
                    "Zauberkräfte und ihre Weisheit. Doch eines Tages tauchte ein finsterer Schurke namens \n" +
                    "Snape auf begleitet von seiner hinterhältigen Assistentin Lestrange. Snape wollte \n" +
                    "die Kräfte der Zauberinnen stehlen, um die Welt in Dunkelheit zu hüllen und sie in ewiger \n" +
                    "Finsternis zu versklaven."
        )
        println()
        println(
            "Die drei mächtigsten Zauberinnen des Dorfes Maleficent, die 'Hexe des Westens' und Ursula \n" +
                    "beschlossen sich Sanpe und Lestrange entgegenzustellen. Sie trafen sich in einer geheimen \n" +
                    "Hütte am Rande des Waldes, um ihren Plan zu schmieden. Die Hexe des Westens, sprach: \"Wir \n" +
                    "müssen unsere Kräfte vereinen und unsere mächtigsten Zaubersprüche einsetzen, um Snape\n" +
                    "aufzuhalten."
        )
        println()
        println(
            "Ursula fügte hinzu: \"Wir müssen auch vorsichtig sein, denn Snape ist gerissen und \n" +
                    "Lestrange ist eine Meisterin der Täuschung.\""
        )
        println()
        println(
            "Maleficent schlug vor: \"Lasst uns einen Schutzzauber weben, um uns vor ihren Angriffen\n" +
                    "zu schützen, und dann werden wir unsere mächtigsten Zaubersprüche auf sie loslassen.\""
        )
        println()
        println(
            "Die drei Zauberinnen begannen einen mächtigen Schutzzauber zu weben, der sie vor Snapes \n" +
                    "dunklen Machenschaften schützen sollte. Als der Schutzzauber vollendet war, begaben sie \n" +
                    "sich in den Wald, wo Snape und Lestrange bereits auf sie warteten."
        )
        println()
        println("Snape lachte düster und sagte: \"Ihr Zauberinnen könnt nichts gegen meine Macht ausrichten!\"")
        println()
        println("Doch die Zauberinnen ließen sich nicht einschüchtern und ein entschlossener Kampf entbrennt...")
        println()

        //Vorstellung Heldenteam
        println("Das Heldenteam besteht aus folgenden mächtigen Zauberinnen:")
        for (i in 0 until alleHelden.size) {
            println("Hallo! Mein Name ist ${alleHelden[i].name} und ich bin ${alleHelden[i].heilPK} Punkte stark.")
        }
        println()

        //Vorstellung Gegnerteam
        println("Das Team der Gegner besteht aus folgenden finsteren Mächten:")
        for (i in 0 until alleGegner.size) {
            println("HaHa! Mein Name ist ${alleGegner[i].name} und ich bin ${alleGegner[i].heilPK} Punkte stark.")
        }
        AllgemeineFkt.trennZeile()
        println()
    }
}
}