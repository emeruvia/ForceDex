package dev.emg.dexforce.data.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dev.emg.dexforce.data.model.People
import dev.emg.dexforce.data.utils.Constants
import dev.emg.dexforce.data.utils.Constants.Companion
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import java.util.Date

interface SwapiService {

  // Will return Luke Skywalker, only one people :)
  @GET("people/1/")
  suspend fun getPeople(): People

  companion object {
    fun create(): SwapiService {
      val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor())
        .build()
      val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
//        .add(Date::class.java, Rfc3339DateJsonAdapter())
        .build()
      val retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
      return retrofit.create(SwapiService::class.java)
    }
  }

}