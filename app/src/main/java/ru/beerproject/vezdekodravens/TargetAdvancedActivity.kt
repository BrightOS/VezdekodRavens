package ru.beerproject.vezdekodravens

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_target_advanced.*
import java.util.*
import javax.xml.datatype.DatatypeConstants
import javax.xml.datatype.DatatypeConstants.MONTHS

class TargetAdvancedActivity : AppCompatActivity() {

    override fun onResume() {
        date_title.visibility = View.GONE
        date_picker.visibility = View.GONE
        super.onResume()
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target_advanced)

        radio.setOnCheckedChangeListener { _, isChecked ->
            when (isChecked) {
                R.id.idk -> {
                    date_title.visibility = View.GONE
                    date_picker.visibility = View.GONE
                    next.alpha = 1f
                }
                R.id.until -> {
                    date_title.visibility = View.VISIBLE
                    date_picker.visibility = View.VISIBLE
                    next.alpha = 0.4f
                }
            }
        }

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        val months: Array<String> = arrayOf("января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря")

        date_picker.setOnClickListener {
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                date_picker.setTextColor(getColor(android.R.color.black))
                next.alpha = 1f
                if (year == c.get(Calendar.YEAR))
                    date_picker.text = "" + dayOfMonth + " " + months[monthOfYear]
                else
                    date_picker.text = "" + dayOfMonth + " " + months[monthOfYear] + " " + year + " года"
            }, year, month, day)

            dpd.show()
        }
    }
}
