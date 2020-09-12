package ru.beerproject.vezdekodravens

import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toFile
import kotlinx.android.synthetic.main.activity_target.*
import java.io.File

/**
 * Created by artsultanmaga05@gmail.com on 12.09.2020.
 */
class TargetActivity : AppCompatActivity() {

    override fun onResume() {
        next.setOnClickListener{
            val intent = Intent(this, TargetAdvancedActivity::class.java)
            startActivity(intent)
        }
        super.onResume()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        choose_photo.setOnClickListener {
            val intent = Intent()
            intent.type = "image/*"
            intent.action = Intent.ACTION_GET_CONTENT
            startActivityForResult(Intent.createChooser(intent, "Select Picture"), 100)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val a = data?.data?.toFile()
        image_from_storage.setImageDrawable(Drawable.createFromPath(a?.path))
    }
}