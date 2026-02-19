package com.jana.newsfeed.uii

import com.jana.newsfeed.model.Category

data class NewsUiItem(
    val id: Int,
    val headline: String,
    val badge: String,
    val category: Category

)