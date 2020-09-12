package ru.beerproject.vezdekodravens

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.type_select_activity.*

class TypeSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.type_select_activity)

        target.setOnClickListener{
            val intent = Intent(this, TypeSelectActivity::class.java)
            startActivity(intent)
        }
    }
}