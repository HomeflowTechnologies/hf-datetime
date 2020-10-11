package com.homeflow.date

import java.text.SimpleDateFormat
import java.util.*

object HomeflowDate {
  private var date: Date? = null

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
   */
  fun isMonday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    calendar.time
    val weekday = calendar.get(Calendar.DAY_OF_WEEK)
    if (weekday == Calendar.MONDAY) {
      return true
    }
    return false
  }

  /**
   * Verificar si hoy es Martes.
   */
  fun isTuesday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    calendar.time
    val weekday = calendar.get(Calendar.DAY_OF_WEEK)
    if (weekday == Calendar.TUESDAY) {
      return true
    }
    return false
  }

  /**
   * Verificar si hoy es Miercoles.
   */
  fun isWednesday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    calendar.time
    val weekday = calendar.get(Calendar.DAY_OF_WEEK)
    if (weekday == Calendar.WEDNESDAY) {
      return true
    }
    return false
  }

  /**
   * Verificar si hoy es Jueves.
   */
  fun isThursday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    calendar.time
    val weekday = calendar.get(Calendar.DAY_OF_WEEK)
    if (weekday == Calendar.THURSDAY) {
      return true
    }
    return false
  }

  /**
   * Verificar si hoy es Viernes.
   */
  fun isFriday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    calendar.time
    val weekday = calendar.get(Calendar.DAY_OF_WEEK)
    if (weekday == Calendar.FRIDAY) {
      return true
    }
    return false
  }

  /**
   * Verificar si hoy es Sabado.
   */
  fun isSaturday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    calendar.time
    val weekday = calendar.get(Calendar.DAY_OF_WEEK)
    if (weekday == Calendar.SATURDAY) {
      return true
    }
    return false
  }

  /**
   * Verificar si hoy es Domingo.
   */
  fun isSunday(date: String? = null): Boolean {
    val calendar = Calendar.getInstance()
    calendar.time
    val weekday = calendar.get(Calendar.DAY_OF_WEEK)
    if (weekday == Calendar.SUNDAY) {
      return true
    }
    return false
  }

  /**
   * Obtener el primer dia de la semana (Domingo).
   */
  fun firstDayWeek(): Date {
    val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    val calendar = Calendar.getInstance()
    calendar.set(Calendar.DAY_OF_WEEK, calendar.firstDayOfWeek)
    return formatter.parse(formatter.format(calendar.time))!!
  }

  /**
   * Obtener el primer dia de la semana desde Lunes.
   */
  fun firstDayWeekMonday(): Date {
    val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    val calendar = Calendar.getInstance()
    while (calendar[Calendar.DAY_OF_WEEK] != Calendar.MONDAY) {
      calendar.add(Calendar.DATE, -1)
    }
    return formatter.parse(formatter.format(calendar.time))!!
  }

  /**
   * Obtener el ultimo dia de la semana.
   */
  fun lastDayWeek(): Date {
    val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    val calendar = Calendar.getInstance()
    while (calendar[Calendar.DAY_OF_WEEK] != Calendar.MONDAY) {
      calendar.add(Calendar.DATE, -6)
    }
    return formatter.parse(formatter.format(calendar.time))!!
  }

  /**
   * Verifiar si la fecha esta en el rango de la semana.
   */
  fun isDateinWeek(date: String): Boolean {
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    val compare = simpleDateFormat.parse(date)
    val firstDay = firstDayWeekMonday()
    val lastDay = lastDayWeek()
    return (firstDay.before(compare) || firstDay.compareTo(compare) == 0) && (lastDay.after(compare) || lastDay.compareTo(compare) == 0)
  }

  fun format(format: String): String {
    val df = SimpleDateFormat(format, Locale.getDefault())
    return df.format(date!!)
  }

}
