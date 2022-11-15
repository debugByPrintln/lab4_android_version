package com.itmo.lab4_android_version

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itmo.lab4_android_version.data.DataStorage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val android = DataStorage.getVersionsList()
        val versions = DataStorage.getVersionsList()
        val adapter = AndroidAdapter(this, versions) {position ->
            val androids = android[position]
            val intent = DetailsActivity.createIntent(this, androids)
            startActivity(intent)
        }

        androidList.adapter = adapter
    }
}