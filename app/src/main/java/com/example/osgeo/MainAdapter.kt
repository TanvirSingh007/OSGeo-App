package com.example.osgeo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.projects_row.view.*
import android.content.Intent

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    val ProjectTitles = listOf("deegree", "GDAL/OGR", "GeoMoose", "GeoNetwork", "GeoNode")

    //number of items
    override fun getItemCount(): Int {
        return ProjectTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.projects_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val projectTitle = ProjectTitles.get(position)
        holder?.view?.project_name?.text = projectTitle

        if (projectTitle == "deegree") {
            val thumbnailImageView = holder?.view?.project_image
            thumbnailImageView.setImageResource(R.drawable.deegree)
        }

        if (projectTitle == "GDAL/OGR") {
            val thumbnailImageView = holder?.view?.project_image
            thumbnailImageView.setImageResource(R.drawable.gdal)
        }

        if (projectTitle == "GeoMoose") {
            val thumbnailImageView = holder?.view?.project_image
            thumbnailImageView.setImageResource(R.drawable.geomoose)
        }

        if (projectTitle == "GeoNetwork") {
            val thumbnailImageView = holder?.view?.project_image
            thumbnailImageView.setImageResource(R.drawable.geonetwork)
        }

        if (projectTitle == "GeoNode") {
            val thumbnailImageView = holder?.view?.project_image
            thumbnailImageView.setImageResource(R.drawable.geonode)
        }


    }
}

    class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {
companion object{

}
        init {
            view.setOnClickListener {
                val intent = Intent(view.context, Webview::class.java)
                view.context.startActivity(intent)
            }
        }

    }



