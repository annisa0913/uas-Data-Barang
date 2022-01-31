package com.informatika19100103.databarang.network

import android.telecom.Call
import com.informatika19100103.databarang.model.ResponseUserItem
import retrofit2.http.GET


interface apiservice {
    @GET("users")
    fun getData() : Call<List<ResponseUserItem?>?>
}