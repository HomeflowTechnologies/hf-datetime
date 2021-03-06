package com.homeflow.date.cobranzas

import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

object HomeflowCobranzas {
  private lateinit var df: SimpleDateFormat

  /**
   * Fecha de la última cotización.
   * @var int plazo
   */
  fun lastQuoteDate(plazo: Int, format: String): String {
    val calendar = Calendar.getInstance()
    calendar.time
    df = SimpleDateFormat(format, Locale.getDefault())
    var sunday = 0

    for (i: Int in 1..plazo) {
      val week = calendar.get(Calendar.DAY_OF_WEEK)
      if (week == Calendar.SUNDAY) {
        sunday += 1
      }
      calendar.add(Calendar.DATE, 1)
    }

    calendar.add(Calendar.DATE, sunday)
    val weekday = calendar.get(Calendar.DAY_OF_WEEK)
    if (weekday == Calendar.SUNDAY) {
      calendar.add(Calendar.DATE, 1)
    }

    return df.format(calendar.time)
  }

  /**
   * Obtener fecha de inicio y finalización sin meter Domingos.
   * @var int plazo
   * @var int periocicidad
   */
  fun getStartEndDate(plazo: Int, periodicidad: Int, format: String): MutableList<String> {
    val startEndDate: MutableList<String> = ArrayList()
    df = SimpleDateFormat(format, Locale.getDefault())
    val calendar = Calendar.getInstance()
    calendar.time
    for (i: Int in 1..plazo) {
      val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)
      when (periodicidad) {
        1 -> {
          calendar.add(Calendar.DATE, if (dayOfWeek > 6) 9 - dayOfWeek else 1)
        }
        else -> {
          calendar.add(
            Calendar.DATE,
            if (dayOfWeek == Calendar.SATURDAY) periodicidad + 3 else periodicidad
          )
        }
      }

      if (i == 1) {
        startEndDate.add(df.format(calendar.time))
      } else if (i == plazo) {
        startEndDate.add(df.format(calendar.time))
      }
    }
    return startEndDate
  }

  /**
   * Obtener plan de pago.
   * @var int plazo
   * @var int periocicidad
   */
  fun getPaymentPlan(plazo: Int, periodicidad: Int, format: String): MutableList<String> {
    val paymentPlan: MutableList<String> = ArrayList()
    df = SimpleDateFormat(format, Locale.getDefault())
    val calendar = Calendar.getInstance()
    calendar.time
    for (i: Int in 1..plazo) {
      val dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)
      when (periodicidad) {
        1 -> {
          calendar.add(Calendar.DATE, if (dayOfWeek > 6) 9 - dayOfWeek else 1)
          paymentPlan.add(df.format(calendar.time))
        }
        else -> {
          calendar.add(
            Calendar.DATE,
            if (dayOfWeek == Calendar.SATURDAY) periodicidad + 3 else periodicidad
          )
          paymentPlan.add(df.format(calendar.time))
        }
      }
    }

    return paymentPlan
  }
}
