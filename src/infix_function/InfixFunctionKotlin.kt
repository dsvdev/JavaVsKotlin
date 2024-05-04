package infix_function

import string_patterns.User

fun main() {
    val user = User("Name", 25)
    val user2 = User("Name2", 27)
    if (user olderThen user2) {
        println("YES")
        return
    }
    println("NO")
}

infix fun User.olderThen(another: User): Boolean {
    return this.age > another.age
}

