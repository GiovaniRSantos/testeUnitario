fun contXO(str: String): Boolean {
    val strLower = str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }
    return countO == countX && countO != 0
}

fun methodTest(): Boolean {
    return true
}

fun TestException() {
    val str: String? = null
    str!!.length == 0

}

fun olderAge(age: Int): Boolean {
    if (age < 18) {
        return false
    } else {
        return true
    }
}
