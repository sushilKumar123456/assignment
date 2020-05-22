package com.assigment.sushil.model
import com.google.gson.annotations.SerializedName

data class ArticleResponse(
        @SerializedName("status_code") var statusCode: String,
        @SerializedName("content") var content: List<Article>
)

