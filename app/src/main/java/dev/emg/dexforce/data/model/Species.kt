package dev.emg.dexforce.data.model

import com.squareup.moshi.Json

data class Species(
  @field:Json(name = "name") val name: String = "",
  @field:Json(name = "classification") val classification: String = "",
  @field:Json(name = "designation") val designation: String = "",
  @field:Json(name = "average_height") val avgHeight: String = "",
  @field:Json(name = "average_lifespan") val avgLifespan: String = "",
  @field:Json(name = "eye_colors") val eyeColors: String = "",
  @field:Json(name = "hair_colors") val hairColors: String = "",
  @field:Json(name = "skin_colors") val skinColors: String = "",
  @field:Json(name = "language") val language: String = "",
  @field:Json(name = "homeworld") val homeworld: String = "",
  @field:Json(name = "people") val people: Array<People>? = null,
  @field:Json(name = "fimls") val films: Array<Films>? = null,
  @field:Json(name = "url") val url: String = "",
  @field:Json(name = "created") val created: String = "",
  @field:Json(name = "edited") val edited: String = ""
)