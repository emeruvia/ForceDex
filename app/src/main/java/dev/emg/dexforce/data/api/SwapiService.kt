package dev.emg.dexforce.data.api

import dev.emg.dexforce.data.model.People
import retrofit2.http.GET

interface SwapiService {

  // Will return Luke Skywalker, only one people :)
  @GET("people/1/")
  suspend fun getPeople(): People


}