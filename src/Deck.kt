class Deck {

    val cards = Array(52, { return Card(it % 13, getSuit(it)) })

    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDeck.removeAt(0)

    fun reset(){
        cardsInDeck = cards.toMutableList()
        Collection.shuffle(cardsInDeck)
    }

    private fun getSuit(i: Int) = when (i / 13) {
        0 -> "Clubs"
        1 -> "Diamonds"
        2 -> "Harts"
        else -> "Spades"
    }


}