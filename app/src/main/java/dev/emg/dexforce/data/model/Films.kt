package dev.emg.dexforce.data.model

import com.squareup.moshi.Json
import java.util.Date

data class Films(
  @field:Json(name = "title") val title: String = "",
  @field:Json(name = "episode_id") val episodeId: Int = 0,
  @field:Json(name = "opening_crawl") val openingCrawl: String = "",
  @field:Json(name = "director") val director: String = "",
  @field:Json(name="producer") val producer: String = "",
  @field:Json(name="release_date") val releaseDate: Date
//  @field:Json(name="species") val species: Array<Species> = arrayOf(),
//  @field:Json(name="starships") val starships: Array<Starships> = arrayOf(),
//  @field:Json(name="vehicles") val vehicles: Array<Vehicles> = arrayOf(),
//  @field:Json(name="characters") val characters: Array<People> = arrayOf(),
//  @field:Json(name="planets") val planets: Array<Planets> = arrayOf(),
//  @field:Json(name="url") val url: String = "",
//  @field:Json(name="created") val created: String = "",
//  @field:Json(name="edited") val edited: String = ""
)