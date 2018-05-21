class TableauPile(var cards: MutableList<Card>) {
    init {
        cards.last().faceUp = true;
    }

    fun addCards(newCard: MutableList<Card>): Boolean {
        if (newCard.first().value == cards.last().value - 1 &&
                suitCheck(newCard.first(), cards.last())) {

        }
    }

    private fun suitCheck(c1: Card, c2: Card): Boolean {
        if ((redSuits.contains(c1.suit) && blackSuits.contains(c2.suit)) || (blackSuits.contains(c1.suit) && redSuits.contains(c2.suit))) {
            return true
        }
        return false

    }
}