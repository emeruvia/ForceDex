package dev.emg.dexforce.data.model

import com.squareup.moshi.Json

data class Starships(
  @field:Json(name = "name") val name: String = "",
  @field:Json(name = "model") val model: String = "",
  @field:Json(name = "starship_class") val starshipClass: String = "",
  @field:Json(name = "manufacturer") val manufacturer: String = "",
  @field:Json(name = "cost_in_credits") val costInCredits: String = "",
  @field:Json(name = "length") val length: String = "",
  @field:Json(name = "crew") val crew: String = "",
  @field:Json(name = "passengers") val passengers: String = "",
  @field:Json(name = "max_atmosphering_speed") val maxAtmospheringSpeed: String = "",
  @field:Json(name = "hyperdrive_rating") val hyperdriveRating: String = "",
  @field:Json(name = "mglt") val mglt: String = "",
  @field:Json(name = "cargo_capacity") val cargoCapacity: String = "",
  @field:Json(name = "consumables") val consumables: String = "",
  @field:Json(name = "films") val films: Array<Films>,
  @field:Json(name = "pilots") val pilots: Array<People>,
  @field:Json(name = "url") val url: String = "",
  @field:Json(name = "created") val created: String = "",
  @field:Json(name = "edited") val edited: String = ""
)