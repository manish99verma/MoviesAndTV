package com.example.moviestv.data.repository.datasourceImpl.tv_show

import com.example.moviestv.data.model.tv_show.TVShow
import com.example.moviestv.data.repository.datasource.tv_show.TVShowCacheDataSource
import com.example.moviestv.data.repository.list_types.TVShowListType

class TVShowCacheDataSourceImpl : TVShowCacheDataSource {
    private var tvShowsMap = HashMap<String, MutableList<TVShow>?>()
    override fun getTvShowsList(tvShowListType: TVShowListType): List<TVShow>? {
        TODO("Not yet implemented")
    }

    override fun saveTVShowsList(tvShowListType: TVShowListType, list: List<TVShow>) {
        TODO("Not yet implemented")
    }

/*    override fun getLatestTVShows(): List<TVShow>? {
        return tvShowsMap[ListTypes.LATEST.TYPE]
    }

    override fun saveLatestTVShows(tvShowsList: List<TVShow>) {
        var list = tvShowsMap[ListTypes.LATEST.TYPE]

        if (list == null)
            list = mutableListOf()
        else
            list.clear()

        list.addAll(tvShowsList)
    }

    override fun getPopularTVShows(): List<TVShow>? {
        return tvShowsMap[ListTypes.POPULAR.TYPE]
    }

    override fun savePopularTVShows(tvShowsList: List<TVShow>) {
        var list = tvShowsMap[ListTypes.POPULAR.TYPE]

        if (list == null)
            list = mutableListOf()
        else
            list.clear()

        list.addAll(tvShowsList)
    }

    override fun getTopRatedTVShows(): List<TVShow>? {
        return tvShowsMap[ListTypes.TOP_RATED.TYPE]
    }

    override fun saveTopRatedTVShows(tvShowsList: List<TVShow>) {
        var list = tvShowsMap[ListTypes.TOP_RATED.TYPE]

        if (list == null)
            list = mutableListOf()
        else
            list.clear()

        list.addAll(tvShowsList)
    }*/

}