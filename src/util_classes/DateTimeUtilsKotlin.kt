package util_classes

import java.time.format.DateTimeFormatter

private val formatter: DateTimeFormatter = DateTimeFormatter
    .ofPattern("yyyy-MM-dd")
fun getCurrentDate(): String {
    return java.time.LocalDate.now().format(formatter)
}

