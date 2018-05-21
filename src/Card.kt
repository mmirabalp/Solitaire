//   Kotlin
//    val = immutable
//    var = mutable

//    val value: Int
//        get() {
//            return 0;
//        }

//    val value: Int
//        get() = 0

//    val value: Int =0
//
val diamonds = "Diamonds";
val harts = "Harts";

val clubs = "Clubs";
val spades = "Spades";

val redSuits = arrayOf(diamonds, harts);
val blackSuits = arrayOf(clubs, spades)

class Card(val value: Int, val suit: String, var faceUp: Boolean = false) {

}