package com.dicoding.ninthProject.core.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.ninthProject.core.R
import com.dicoding.ninthProject.core.databinding.ItemListMovieBinding
import com.dicoding.ninthProject.core.domain.model.Movie
import com.dicoding.ninthProject.core.utils.DiffUtils

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ListViewHolder>() {

    private var listData = ArrayList<Movie>()
    var onItemClick: ((Movie) -> Unit)? = null

    fun setData(newListData: List<Movie>?) {
        if (newListData == null) return
        val diffUtilCallback = DiffUtils(listData, newListData)
        val diffResult = DiffUtil.calculateDiff(diffUtilCallback)
        listData.clear()
        listData.addAll(newListData)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_movie, parent, false))

    override fun getItemCount() = listData.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemListMovieBinding.bind(itemView)
        fun bind(data: Movie) {
            with(binding) {
                ivItemImage.setRoundedGlide(data.posterPath)
                tvItemTitle.text = data.title

            }
        }

        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(listData[adapterPosition])
            }
        }
    }

    private fun ImageView.setRoundedGlide(urlPath: String) {
        Glide.with(context).load("https://image.tmdb.org/t/p/w500/$urlPath")
            .into(this)
    }
}