package com.homeflow.datatime

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.homeflow.datatime.databinding.ActivityMainBinding
import com.homeflow.date.HomeflowDate
import com.homeflow.date.cobranzas.HomeflowCobranzas
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    /**
     * Homeflow Cobranzas
     */
    val payment = HomeflowCobranzas.getPaymentPlan(5, 7, "yyyy-MM-dd")
    Log.d("DATE: ", payment.toString())

    /**
     * Homeflow Date
     */
    val addDay = HomeflowDate.addDay(2).format("yyyy-MM-dd")
    val sunday = HomeflowDate.isSunday()

    Log.d("DATE: ", sunday.toString())
    Log.d("DATE: ", addDay)
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.menu_main, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    return when (item.itemId) {
      R.id.action_settings -> true
      else -> super.onOptionsItemSelected(item)
    }
  }
}