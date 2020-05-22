package com.assigment.sushil.network

import com.assigment.sushil.model.ArticleResponse
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * The interface which provides methods to get result of webservices
 */
interface ArticleApi {
    /**
     * Get the list of the Article from the API
     */
    @GET("article/get_articles_list")
    fun getArticles(): Observable<ArticleResponse>
}