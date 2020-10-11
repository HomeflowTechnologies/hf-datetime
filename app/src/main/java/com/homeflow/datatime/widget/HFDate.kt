package com.homeflow.datatime.widget

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

object HFDate {

  /**
   * Agregar dias
   */
  fun addDays(days: Int): Date {
    val calendar = Calendar.getInstance()
    calendar.time
    calendar.add(Calendar.DATE, days)
    return calendar.time
  }

  /**
   * Agregar meses
   * @var int months
   */
  fun addMonth(months: Int): Date {
    val calendar = Calendar.getInstance()
    calendar.time
    calendar.add(Calendar.MONTH, months)
    return calendar.time
  }

  /**
   * Agregar Años
   * @var years
   */
  fun addYears(years: Int): Date {
    val calendar = Calendar.getInstance()
    calendar.time
    calendar.add(Calendar.YEAR, years)
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

  @SuppressLint("SimpleDateFormat")
  fun firstDayWeek(): Date {
    val cal: Calendar = Calendar.getInstance()
    cal.set(Calendar.HOUR_OF_DAY, 0)
    cal.clear(Calendar.MINUTE)
    cal.clear(Calendar.SECOND);
    cal.clear(Calendar.MILLISECOND);

    cal.set(Calendar.DAY_OF_WEEK, cal.firstDayOfWeek)
    val formatter = SimpleDateFormat("yyyy/MM/dd")

    val date = formatter.format(cal.time)
    return formatter.parse(date)!!

  }

  fun firstDayWeek_Calendar(): Calendar {
    val calendar: Calendar = Calendar.getInstance()
    calendar.set(Calendar.HOUR_OF_DAY, 0)
    calendar.clear(Calendar.MINUTE)
    calendar.clear(Calendar.SECOND);
    calendar.clear(Calendar.MILLISECOND);

    calendar.set(Calendar.DAY_OF_WEEK, calendar.firstDayOfWeek)
    return calendar
  }

  @SuppressLint("SimpleDateFormat")
  fun lastDayWeek(): Date {
    val calendar = firstDayWeek_Calendar()
    calendar.add(Calendar.DAY_OF_YEAR, 6)
    val formatter = SimpleDateFormat("yyyy/MM/dd")
    val date = formatter.format(calendar.time)
    return formatter.parse(date)!!
  }

  @SuppressLint("SimpleDateFormat")
  fun isDateinWeek(fecha: String): Boolean {
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
    val dateTime = simpleDateFormat.parse(fecha)
    val primerdia = firstDayWeek()
    val ultimodia = lastDayWeek();
    return (primerdia.before(dateTime) || primerdia.compareTo(dateTime) == 0) && (ultimodia.after(dateTime) || ultimodia.compareTo(dateTime) == 0)
  }

}

