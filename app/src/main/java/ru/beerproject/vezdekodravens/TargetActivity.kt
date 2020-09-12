package ru.beerproject.vezdekodravens

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_target.*

/**
 * Created by artsultanmaga05@gmail.com on 12.09.2020.
 */
class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        choose_photo.setOnClickListener {
            Log.d("Tag", "ЕБАТЬ РФБОТАЕТ")
        }
    }
}