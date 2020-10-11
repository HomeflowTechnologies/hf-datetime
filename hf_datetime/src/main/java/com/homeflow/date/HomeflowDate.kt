package com.homeflow.date

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

object HomeflowDate {

  /**
   * Agregar dias
   */
  fun addDay(day: Int): HomeflowDate {
    val calendar = Calendar.getInstance()
    calendar.time
    calendar.add(Calendar.DATE, day)
    return this
    //return calendar.time
  }

  /**
   * Agregar meses
   * @var int months
   */
  fun addMonth(month: Int): Date {
    val calendar = Calendar.getInstance()
    calendar.time
    calendar.add(Calendar.MONTH, month)
    return calendar.time
  }

  /**
   * Agregar Años
   * @var years
   */
  fun addYear(year: Int): Date {
    val calendar = Calendar.getInstance()
    calendar.time
    calendar.add(Calendar.YEAR, year)
    return calendar.time
  }

  /**
   * Verificar si hoy es Lunes.
   */
  fun isMonday(): Boolean {
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
  fun isTuesday(): Boolean {
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
  fun isWednesday(): Boolean {
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
  fun isThursday(): Boolean {
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
  fun isFriday(): Boolean {
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
  fun isSaturday(): Boolean {
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
  fun isSunday(): Boolean {
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
  @SuppressLint("SimpleDateFormat")
  fun firstDayWeek(): Date {
    val formatter = SimpleDateFormat("yyyy/MM/dd")
    val calendar = Calendar.getInstance()
    calendar.set(Calendar.DAY_OF_WEEK, calendar.firstDayOfWeek)
    return formatter.parse(formatter.format(calendar.time))!!
  }

  /**
   * Obtener el primer dia de la semana desde Lunes.
   */
  @SuppressLint("SimpleDateFormat")
  fun firstDayWeekMonday(): Date {
    val formatter = SimpleDateFormat("yyyy/MM/dd")
    val calendar = Calendar.getInstance()
    while (calendar[Calendar.DAY_OF_WEEK] != Calendar.MONDAY) {
      calendar.add(Calendar.DATE, -1)
    }
    return formatter.parse(formatter.format(calendar.time))!!
  }

  /**
   * Obtener el ultimo dia de la semana.
   */
  @SuppressLint("SimpleDateFormat")
  fun lastDayWeek(): Date {
    val formatter = SimpleDateFormat("yyyy/MM/dd")
    val calendar = Calendar.getInstance()
    while (calendar[Calendar.DAY_OF_WEEK] != Calendar.MONDAY) {
      calendar.add(Calendar.DATE, -6)
    }
    return formatter.parse(formatter.format(calendar.time))!!
  }

  /**
   * Verifiar si la fecha esta en el rango de la semana.
   */
  @SuppressLint("SimpleDateFormat")
  fun isDateinWeek(date: String): Boolean {
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
    val compare = simpleDateFormat.parse(date)
    val firstDay = firstDayWeekMonday()
    val lastDay = lastDayWeek()
    return (firstDay.before(compare) || firstDay.compareTo(compare) == 0) && (lastDay.after(compare) || lastDay.compareTo(compare) == 0)
  }

}
