package ru.beerproject.vezdekodravens

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class TypeSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.type_select_activity)

        x_base_butt.setOnClickListener{
            val intent = Intent(this, TypeSelectActivity::class.java)
            startActivity(intent)
        }
    }
}