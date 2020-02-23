package dev.emg.dexforce.data.model

import com.squareup.moshi.Json

data class Planets(
  @field:Json(name = "name") val name: String = "",
  @field:Json(name = "diameter") val diameter: String = "",
  @field:Json(name = "rotation_period") val rotationPeriod: String = "",
  @field:Json(name = "orbital_period") val orbitalPeriod: String = "",
  @field:Json(name = "gravity") val gravity: String = "",
  @field:Json(name = "population") val population: String = "",
  @field:Json(name = "climate") val climate: String = "",
  @field:Json(name = "terrain") val terrain: String = "",
  @field:Json(name = "surface_water") val surfaceWater: String = "",
  @field:Json(name = "residents") val residents: Array<People>,
  @field:Json(name = "films") val films: Array<Films>,
  @field:Json(name = "url") val url: String = "",
  @field:Json(name = "created") val created: String = "",
  @field:Json(name = "edited") val edited: String = ""
)