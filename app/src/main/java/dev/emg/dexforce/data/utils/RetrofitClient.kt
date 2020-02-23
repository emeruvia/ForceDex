package dev.emg.dexforce.data.utils

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dev.emg.dexforce.data.api.SwapiService
import org.json.JSONArray
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.Date

object RetrofitClient {

  val service: SwapiService by lazy {
    Retrofit.Builder()
      .baseUrl(Constants.BASE_URL)
      .addConverterFactory(MoshiConverterFactory.create(customMoshiConverter))
      .build()
      .create(SwapiService::class.java)
  }

  private val customMoshiConverter: Moshi by lazy {
    Moshi.Builder()
      .add(Date::class.java, Rfc3339DateJsonAdapter())
      .add(KotlinJsonAdapterFactory())
      .build()
  }

}