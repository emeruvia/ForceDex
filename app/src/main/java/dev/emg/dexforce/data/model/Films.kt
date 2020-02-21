package dev.emg.dexforce.data.model

import java.util.Date

data class Films(
  val title: String = "",
  val episode_id: Int = 0,
  val opening_crawl: String = "",
  val director: String = "",
  val producer: String = "",
  val release_date: Date? = null,
  val species: Array<Species> = arrayOf(),
  val starships: Array<Starships> = arrayOf(),
  val vehicles: Array<Vehicles> = arrayOf(),
  val characters: Array<People> = arrayOf(),
  val planets: Array<Planets> = arrayOf(),
  val url: String = "",
  val created: String = "",
  val edited: String = ""
)