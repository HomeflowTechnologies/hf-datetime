package com.homeflow.datatime

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.homeflow.datatime.databinding.ActivityMainBinding
import com.homeflow.date.HomeflowDate
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    //HomeflowDate.addDay(7).format("yyyy/MM/dd")

    val calendar =  Calendar.getInstance()
    calendar.set(Calendar.DAY_OF_WEEK, calendar.firstDayOfWeek)
    val formatter = SimpleDateFormat("yyyy/MM/dd")
    Log.e("DATE: ", formatter.format(calendar.time).toString())
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