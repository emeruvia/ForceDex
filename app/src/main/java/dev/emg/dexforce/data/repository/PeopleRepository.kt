package dev.emg.dexforce.data.repository

import dev.emg.dexforce.data.api.SwapiService
import dev.emg.dexforce.data.api.SwapiService.Companion

class PeopleRepository {

  private val swapiService by lazy { SwapiService.create() }

  suspend fun getPeople() = swapiService.getPeople()

}