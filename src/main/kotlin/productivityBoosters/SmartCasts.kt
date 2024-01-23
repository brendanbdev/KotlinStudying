package productivityBoosters

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

fun main() {
//-----------------------------------------------------------------------------------------------------
//  SMART CASTS - The Kotlin compiler is smart enough to perform type casts automatically in most
//  cases, including:
//  1. Casts from nullable types to their non-nullable counterparts.
//  2. Casts from a supertype to a subtype.
//
//  This way, you can automatically use variables as desired in most cases without doing obvious casts
//  manually.

    // 1. Declares a nullable variable.
    val date: ChronoLocalDate? = LocalDate.now()

    if (date != null) {
        // 2. Smart-cast to non-nullable (thus allowing direct access to isLeapYear).
        println(date.isLeapYear)
    }

    // 3. Smart-cast inside a condition (this is possible because, like Java, Kotlin uses
    // short-circuiting).
    if (date != null && date.isLeapYear) {
        println("It's a leap year!")
    }

    // 4. Smart-cast inside a condition (also enabled by short-circuiting).
    if (date == null || !date.isLeapYear) {
        println("There's no Feb 29 this year...")
    }

    if (date is LocalDate) {
        // 5. Smart-cast to the subtype LocalDate.
        val month = date.monthValue
        println(month)
    }
}