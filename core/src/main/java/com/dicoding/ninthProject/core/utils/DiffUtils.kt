package com.dicoding.ninthProject.core.utils

import androidx.annotation.Nullable
import androidx.recyclerview.widget.DiffUtil
import com.dicoding.ninthProject.core.domain.model.Movie

class DiffUtils(private val oldList: List<Movie>, private val newList: List<Movie>) :
    DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].movieId == newList[newItemPosition].movieId
    }

    override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        val (movieId,
            overview,
            title,
            posterPath,
            releaseDate,
            voteAverage,
            voteCount,
            originalLanguage,
            isFavorite) = oldList[oldPosition]
        val (movieId1,
            overview1,
            title1,
            posterPath1,
            releaseDate1,
            voteAverage1,
            voteCount1,
            originalLanguage1,
            isFavorite1) = newList[newPosition]

        return movieId == movieId1
                && overview == overview1
                && title == title1
                && posterPath == posterPath1
                && releaseDate == releaseDate1
                && voteAverage == voteAverage1
                && voteCount == voteCount1
                && originalLanguage == originalLanguage1
                && isFavorite == isFavorite1
    }

    @Nullable
    override fun getChangePayload(oldPosition: Int, newPosition: Int): Any? {
        return super.getChangePayload(oldPosition, newPosition)
    }
}