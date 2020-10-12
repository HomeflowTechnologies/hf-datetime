package com.homeflow.date

import java.text.SimpleDateFormat
import java.util.*

object HomeflowDate {
  private var date: Date? = null
  private lateinit var df: SimpleDateFormat

  /**
   * Agregar dias
   */
  fun addDay(day: Int): HomeflowDate {
    val calendar = Calendar.getInstance()
    calendar.time
    calendar.add(Calendar.DATE, day)
    date = calendar.time
    return this
  }

  /**
   * Agregar meses
   * @var int months
   */
  fun addMonth(month: Int): HomeflowDate {
    val calendar = Calendar.getInstance()
    calendar.time
    calendar.add(Calendar.MONTH, month)
    date = calendar.time
    return this
  }

  /**
   * Agregar Años
   * @var years
   */
  fun addYear(year: Int): HomeflowDate {
    val calendar = Calendar.getInstance()
    calendar.time
    calendar.add(Calendar.YEAR, year)
    date = calendar.time
    return this
  }

  /**
   * Verificar si hoy es Lunes.
   * @var String date (yyyy-MM-dd)
   */
  fun isMonday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return if (date!!.isNotEmpty()) {
      calendar.time = df.parse(date)!!
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY
    } else {
      calendar.time
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY
    }
  }

  /**
   * Verificar si hoy es Martes.
   * @var String date (yyyy-MM-dd)
   */
  fun isTuesday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return if (date!!.isNotEmpty()) {
      calendar.time = df.parse(date)!!
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY
    } else {
      calendar.time
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY
    }
  }

  /**
   * Verificar si hoy es Miercoles.
   * @var String date (yyyy-MM-dd)
   */
  fun isWednesday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return if (date!!.isNotEmpty()) {
      calendar.time = df.parse(date)!!
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY
    } else {
      calendar.time
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY
    }
  }

  /**
   * Verificar si hoy es Jueves.
   * @var String date (yyyy-MM-dd)
   */
  fun isThursday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return if (date!!.isNotEmpty()) {
      calendar.time = df.parse(date)!!
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY
    } else {
      calendar.time
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY
    }
  }

  /**
   * Verificar si hoy es Viernes.
   * @var String date (yyyy-MM-dd)
   */
  fun isFriday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return if (date!!.isNotEmpty()) {
      calendar.time = df.parse(date)!!
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY
    } else {
      calendar.time
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY
    }
  }

  /**
   * Verificar si hoy es Sabado.
   * @var String date (yyyy-MM-dd)
   */
  fun isSaturday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return if (date!!.isNotEmpty()) {
      calendar.time = df.parse(date)!!
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
    } else {
      calendar.time
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
    }
  }

  /**
   * Verificar si hoy es Domingo.
   * @var String date (yyyy-MM-dd)
   */
  fun isSunday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return if (date!!.isNotEmpty()) {
      calendar.time = df.parse(date)!!
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
    } else {
      calendar.time
      calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
    }
  }

  /**
   * Obtener el primer dia de la semana (Domingo).
   */
  fun firstDayWeek(format: String): Date {
    df = SimpleDateFormat(format, Locale.getDefault())
    val calendar = Calendar.getInstance()
    calendar.set(Calendar.DAY_OF_WEEK, calendar.firstDayOfWeek)
    return df.parse(df.format(calendar.time))!!
  }

  /**
   * Obtener el primer dia de la semana desde Lunes.
   */
  fun firstDayWeekMonday(format: String): Date {
    df = SimpleDateFormat(format, Locale.getDefault())
    val calendar = Calendar.getInstance()
    while (calendar[Calendar.DAY_OF_WEEK] != Calendar.MONDAY) {
      calendar.add(Calendar.DATE, -1)
    }
    return df.parse(df.format(calendar.time))!!
  }

  /**
   * Obtener el ultimo dia de la semana.
   */
  fun lastDayWeek(format: String): Date {
    df = SimpleDateFormat(format, Locale.getDefault())
    val calendar = Calendar.getInstance()
    while (calendar[Calendar.DAY_OF_WEEK] != Calendar.MONDAY) {
      calendar.add(Calendar.DATE, -6)
    }
    return df.parse(df.format(calendar.time))!!
  }

  /**
   * Verifiar si la fecha esta en el rango de la semana.
   */
  fun isDateinWeek(date: String, format: String): Boolean {
    df = SimpleDateFormat(format, Locale.getDefault())
    val compare = df.parse(date)
    val firstDay = firstDayWeekMonday(format)
    val lastDay = lastDayWeek(format)
    return (firstDay.before(compare) || firstDay.compareTo(compare) == 0) && (lastDay.after(compare) || lastDay.compareTo(compare) == 0)
  }

  fun format(format: String): String {
    df = SimpleDateFormat(format, Locale.getDefault())
    return df.format(date!!)
  }

}
