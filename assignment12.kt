fun main(args: Array<String>) {
    println(isStringPalindrome("kayak"))
}

fun isStringPalindrome(randomString: String) :Boolean {
    var stringLength: Int = randomString.length
	var runBackwards: Int = randomString.length - 1

    for (i in 0..(stringLength/2)) {
        if (randomString.get(i) == randomString.get(runBackwards)) {
            return true
        }
        runBackwards--
    }
    return false
}
