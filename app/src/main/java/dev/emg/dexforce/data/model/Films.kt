package dev.emg.dexforce.data.model

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import java.util.Date

data class Films(
  @field:Json(name = "title") val title: String = "",
  @field:Json(name = "episode_id") val episodeId: Int = 0,
  @field:Json(name = "opening_crawl") val openingCrawl: String = "",
  @field:Json(name = "director") val director: String = "",
  @field:Json(name = "producer") val producer: String = "",
  @field:Json(name = "release_date") val releaseDate: Date,
  @field:Json(name = "species") val species: Array<String> = arrayOf(),
  @field:Json(name = "starships") val starships: Array<String> = arrayOf(),
  @field:Json(name = "vehicles") val vehicles: Array<String> = arrayOf(),
  @field:Json(name = "characters") val characters: Array<String> = arrayOf(),
  @field:Json(name = "planets") val planets: Array<String> = arrayOf(),
  @field:Json(name = "url") val url: String = "",
  @field:Json(name = "created") val created: String = "",
  @field:Json(name = "edited") val edited: String = ""
) {
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Films

    if (title != other.title) return false
    if (episodeId != other.episodeId) return false
    if (openingCrawl != other.openingCrawl) return false
    if (director != other.director) return false
    if (producer != other.producer) return false
    if (releaseDate != other.releaseDate) return false
    if (!species.contentEquals(other.species)) return false
    if (!starships.contentEquals(other.starships)) return false
    if (!vehicles.contentEquals(other.vehicles)) return false
    if (!characters.contentEquals(other.characters)) return false
    if (!planets.contentEquals(other.planets)) return false
    if (url != other.url) return false
    if (created != other.created) return false
    if (edited != other.edited) return false

    return true
  }

  override fun hashCode(): Int {
    var result = title.hashCode()
    result = 31 * result + episodeId
    result = 31 * result + openingCrawl.hashCode()
    result = 31 * result + director.hashCode()
    result = 31 * result + producer.hashCode()
    result = 31 * result + releaseDate.hashCode()
    result = 31 * result + species.contentHashCode()
    result = 31 * result + starships.contentHashCode()
    result = 31 * result + vehicles.contentHashCode()
    result = 31 * result + characters.contentHashCode()
    result = 31 * result + planets.contentHashCode()
    result = 31 * result + url.hashCode()
    result = 31 * result + created.hashCode()
    result = 31 * result + edited.hashCode()
    return result
  }
}