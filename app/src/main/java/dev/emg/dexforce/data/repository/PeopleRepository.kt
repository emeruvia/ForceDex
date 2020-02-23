package dev.emg.dexforce.data.repository

import dev.emg.dexforce.data.api.SwapiService
import dev.emg.dexforce.data.utils.RetrofitClient

class PeopleRepository {

  private val retrofitClient: SwapiService = RetrofitClient.service

  suspend fun getPeople() = retrofitClient.getPeople()

}