package com.assigment.sushil.ui.cars

import android.arch.lifecycle.MutableLiveData
import com.assigment.sushil.base.BaseViewModel
import com.assigment.sushil.model.Article
import com.assigment.sushil.utils.getFormatedDate



class ArticleViewModel: BaseViewModel() {
    private val title = MutableLiveData<String>()
    private val ingress = MutableLiveData<String>()
    private  val image = MutableLiveData<String>()
    private  val date = MutableLiveData<String>()



    fun bind(article: Article){
        title.value = article.title
        ingress.value = article.ingress
        image.value = article.image
        date.value = article.dateTime
    }

    fun getTitle():MutableLiveData<String>{
        return title
    }

    fun getIngress():MutableLiveData<String>{
        return ingress
    }

    fun getImage():MutableLiveData<String>{
        return image
    }

    fun getDate():MutableLiveData<String>{

        val modifiedDate = getFormatedDate(date.value.toString())
        date.value = modifiedDate;

        return date
    }
}