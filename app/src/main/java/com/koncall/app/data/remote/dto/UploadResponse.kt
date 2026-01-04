package com.koncall.app.data.remote.dto

import com.google.gson.annotations.SerializedName

data class UploadResponse(
    val data: UploadData
)

data class UploadData(
    val url: String,
    val filename: String
)
