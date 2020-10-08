fun main() {
    println(commision(34.0))
    println(commision(350.0))
    println(commision(35000.0))
}

fun commision(amount: Double): Double {
    return if (amount * 0.0075 < 35) {
        35.0
    } else {
        amount * 0.0075
    }
}