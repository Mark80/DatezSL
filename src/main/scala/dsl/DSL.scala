package dsl

import java.time._


object DSL {

  implicit class DSLLocalDate(localDate: LocalDate) {

    def +(day: DD): LocalDate = localDate.plusDays(day.toInt)
    def +(month: MM): LocalDate = localDate.plusMonths(month.toInt)
    def +(year: YYYY): LocalDate = localDate.plusYears(year.toInt)

  }

  implicit class DD(val toInt: Int) {

    def days: DD = this

  }


  implicit class MM(val toInt: Int) {

    def months: MM = this

  }

  implicit class YYYY(val toInt: Int) {

    def years: YYYY = this

  }


}
