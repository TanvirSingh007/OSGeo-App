package com.example.osgeo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.projects_row.view.*



class MainAdapter(private val context: Context, private val hobbies: List<PROJECTS>) :
    RecyclerView.Adapter<MainAdapter.CustomViewHolder>() {

    private var myOnClickListener: MyOnClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder =
        CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.projects_row, parent, false))


        override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
            holder.itemView.project_name?.text = hobbies[position].title

            if (holder.itemView.project_name?.text == "deegree") {
                val thumbnailImageView = holder?.itemView?.project_image
                thumbnailImageView.setImageResource(R.drawable.deegree)
            }

            if (holder.itemView.project_name?.text == "GDAL/OGR") {
                val thumbnailImageView = holder?.itemView?.project_image
                thumbnailImageView.setImageResource(R.drawable.gdal)
            }

            if (holder.itemView.project_name?.text == "GeoMoose") {
                val thumbnailImageView = holder?.itemView?.project_image
                thumbnailImageView.setImageResource(R.drawable.geomoose)
            }

            if (holder.itemView.project_name?.text == "GeoNetwork") {
                val thumbnailImageView = holder?.itemView?.project_image
                thumbnailImageView.setImageResource(R.drawable.geonetwork)
            }

            if (holder.itemView.project_name?.text == "GeoNode") {
                val thumbnailImageView = holder?.itemView?.project_image
                thumbnailImageView.setImageResource(R.drawable.geonode)
            }

        }

        override fun getItemCount(): Int = hobbies.size

        fun setMyOnClickListener(myOnClickListener: MyOnClickListener) {
            this.myOnClickListener = myOnClickListener
        }

        inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            init {
                itemView.setOnClickListener {
                    myOnClickListener?.myOnClick(adapterPosition)
                }
            }
        }
    }






