package com.app.dagger.mvp.kotlin.adapter

import android.app.Activity
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.app.dagger.mvp.kotlin.R
import com.app.dagger.mvp.kotlin.activity.CountryListActivity
import com.app.dagger.mvp.kotlin.model.CountryModel


class CountryListAdapter : RecyclerView.Adapter<CountryListAdapter.CountryListViewHolder>() {

    var countryList: List<CountryModel> = ArrayList()
    lateinit var context: Context
    lateinit var activity: Activity


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CountryListViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.country_list_item,
                parent, false)
        return CountryListViewHolder(view)
    }


    override fun onBindViewHolder(holder: CountryListViewHolder, position: Int) {

        val countryData = countryList.get(position)
        holder.textView.text = countryData.name

        //loadImage(countryData.flag, holder.imageView)

    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    fun setItems(results: List<CountryModel>) {
        countryList = results
        notifyDataSetChanged()
    }

    /**
     * Method to load SVG logo image using library
     */
//    private fun loadImage(urlString: String?, imageView: ImageView) {
////        SvgLoader.pluck()
////                .with(activity)
////                .setPlaceHolder(R.mipmap.ic_launcher, R.mipmap.ic_launcher)
////                .load(urlString, imageView)
//    }

    fun setContext(context: Context, countryListActivity1: CountryListActivity) {
        this.context = context
        this.activity = countryListActivity1
    }


    inner class CountryListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.tvName)
        //var imageView: ImageView = itemView.findViewById(R.id.ivLogo)

    }
}

