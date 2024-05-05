package extension_methods

fun IntArray.print() {
    this.forEachIndexed { i, num ->
        println("$i) $num")
    }
}

