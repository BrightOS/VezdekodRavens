package ru.beerproject.vezdekodravens

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_type_select.*

class TypeSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_select)

        target.setOnClickListener{
            val intent = Intent(this, TargetActivity::class.java)
            startActivity(intent)
        }
    }
}