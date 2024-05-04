package TestInKotlin

infix fun List<String>.shouldContain(expected: String) {
    assert(this.contains(expected))
}

fun myTest() {
    val realValue = listOf("a", "b", "c")
    val expectedValue = "a"
    realValue shouldContain expectedValue
}



