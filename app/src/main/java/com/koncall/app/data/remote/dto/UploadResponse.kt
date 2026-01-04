package com.koncall.app.data.remote.dto

import com.google.gson.annotations.SerializedName

data class UploadResponse(
    val success: Boolean,
    val url: String?,
    val filename: String?,
    val size: Long?
)
