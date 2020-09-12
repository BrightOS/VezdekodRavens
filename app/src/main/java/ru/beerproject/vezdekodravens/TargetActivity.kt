package ru.beerproject.vezdekodravens

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
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


            uploadMessage?.let {
                uploadMessage!!.onReceiveValue(null)
                uploadMessage = null
            }
            uploadMessage = filePathCallback
            val intent =
            startActivityForResult(intent, 100)
        }
    }


    var uploadMessage: ValueCallback<Array<Uri>>? = null

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100) {
            if (uploadMessage == null) return
            uploadMessage!!.onReceiveValue(
                    WebChromeClient.FileChooserParams.parseResult(
                            resultCode,
                            data
                    )
            )
            uploadMessage = null
        }
    }
}