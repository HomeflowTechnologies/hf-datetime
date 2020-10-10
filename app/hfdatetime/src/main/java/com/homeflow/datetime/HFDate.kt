package com.homeflow.datetime

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

}