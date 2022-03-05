const val ITEM_PRICE = 100U
const val DISCOUNT = 100U
const val DISCOUNT_START = 1_000U
const val DISCOUNT_END = 10_000U
const val MUSIC_LOVER = true

fun main() {
print("Введите количество композиций: ")
    val itemCount = readLine()?.toUInt() ?: return

    val totalPrice = ITEM_PRICE * itemCount
    val discount5 = totalPrice * 5U / 100U
    val discount1 = totalPrice * 1U / 100U

    val calculation =
        if (totalPrice in (DISCOUNT_START + 1U) until DISCOUNT_END) totalPrice - DISCOUNT else if (totalPrice > DISCOUNT_END) totalPrice - discount5 else totalPrice
    val result = if (MUSIC_LOVER) calculation - discount1 else calculation
    println("Итого: $result рублей")
}

