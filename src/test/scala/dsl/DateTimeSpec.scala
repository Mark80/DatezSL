package dsl

import java.time.Month._
import java.time._

import org.scalatest._

import DSL._

class DateTimeSpec extends FlatSpec with Matchers {

  val lastDayOfYear = LocalDate.of(2015, 12, 31)
  val moment = LocalDate.of(2000, 12, 21)

  "Create date" should "return exact date" in {
    lastDayOfYear.getDayOfMonth shouldBe 31
  }

  it should "return exact month" in {

    val month: Month = lastDayOfYear.getMonth
    month shouldBe DECEMBER
    month.getValue shouldBe 12

  }

  "Add 2 days to last day of 2015" should "return a 2 jannuary 2016" in {

    val twoJannuary = lastDayOfYear.plusDays(2)

    twoJannuary.getDayOfMonth shouldBe 2
    twoJannuary.getYear shouldBe 2016
    twoJannuary.getMonth shouldBe JANUARY

  }

  "on datetime" should "add days with +" in {

    val twoDaysLater = moment + 2.days + 3.days
    twoDaysLater.getDayOfMonth shouldBe 26

  }


  it should "add months with +" in {

    val twoMonthsLater = moment + 2.months
    twoMonthsLater.getMonth.getValue shouldBe 2

  }


  it should "add months and days with +" in {

    val newDate = moment + 2.months + 2.days
    newDate.getMonth.getValue shouldBe 2
    newDate.getDayOfMonth shouldBe 23

  }

  it should "add year with +" in {

    val nextYear = moment + 1.years
    nextYear.getYear shouldBe 2001

  }



}





