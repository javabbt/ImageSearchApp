package com.yannick.imagesearchapp.api

import com.yannick.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)