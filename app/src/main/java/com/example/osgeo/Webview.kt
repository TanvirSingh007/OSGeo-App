package com.example.osgeo

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_webview.*
import kotlinx.android.synthetic.main.projects_row.view.*

class Webview: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        pr_webview.loadUrl("https://www.google.com")
    }
}