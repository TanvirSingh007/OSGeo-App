package com.example.osgeo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_first_page.*
import kotlinx.android.synthetic.main.activity_webview.*

class FirstPage : AppCompatActivity(), MyOnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        val mainAdapter = MainAdapter(this, ProjectSupplier.projects)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mainAdapter
        mainAdapter.setMyOnClickListener(this)




    }
        override fun myOnClick(position: Int) {
        val name = ProjectSupplier.projects[position].title
        if (name == "deegree") {
            startActivity(
                Intent(this, Webview::class.java)
            )
        }
        else {
            startActivity(
                Intent(this, pr_webview::class.java).putExtra(
                    "hobby_name",
                    ProjectSupplier.projects[position].title
                )

            )

        }
    }
}
