package com.mnafis.compose_ui_android_experiment.movie_mania.service.models

import com.google.gson.annotations.SerializedName


data class MovieListResponse(
    @SerializedName("Search") val list: List<Movie>
)