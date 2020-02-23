package dev.emg.dexforce.data.model

import com.squareup.moshi.Json

data class Vehicles(
  @field:Json(name = "name") val name: String = "",
  @field:Json(name = "model") val model: String = "",
  @field:Json(name = "vehicle_class") val vehicleClass: String = "",
  @field:Json(name = "manufacturer") val manufacturer: String = "",
  @field:Json(name = "length") val length: String = "",
  @field:Json(name = "cost_in_credits") val costInCredits: String = "",
  @field:Json(name = "crew") val crew: String = "",
  @field:Json(name = "passengers") val passengers: String = "",
  @field:Json(name = "max_atmosphering_speed") val maxAtmosphericSpeed: String = "",
  @field:Json(name = "cargo_capacity") val cargoCapacity: String = "",
  @field:Json(name = "consumables") val consumables: String = "",
  @field:Json(name = "films") val films: Array<Films>? = null,
  @field:Json(name = "pilots") val pilots: Array<People>? = null,
  @field:Json(name = "url") val url: String = "",
  @field:Json(name = "created") val created: String = "",
  @field:Json(name = "edited") val edited: String = ""
)