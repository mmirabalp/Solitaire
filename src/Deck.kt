
import java.util.*

class Deck {

    val cards = Array(52, { return Card(it % 13, getSuit(it)) })

    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDeck.removeAt(0)

    fun reset(){
        cardsInDeck = cards.toMutableList();
        Collections.shuffle(cardsInDeck);
    }

    private fun getSuit(i: Int) = when (i / 13) {
        0 -> clubs;
        1 -> diamonds;
        2 -> harts;
        else -> spades;
    }


}