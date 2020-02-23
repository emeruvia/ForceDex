package dev.emg.dexforce.data.model

import com.squareup.moshi.Json

data class People(
  @field:Json(name="name") val name: String = "",
  @field:Json(name="birth_year") val birthYear: String = "",
  @field:Json(name="eye_color") val eyeColor: String = "",
  @field:Json(name="gender") val gender: String = "",
  @field:Json(name="hair_color") val hairColor: String = "",
  @field:Json(name="height") val height: String = "",
  @field:Json(name="mass") val mass: String = "",
  @field:Json(name="skin_color") val skinColor: String = "",
  @field:Json(name="homeworld") val homeworld: String = "",
//  @field:Json(name="films") val films: Array<Films>,
//  @field:Json(name="species") val species: Array<Species> = arrayOf(),
//  @field:Json(name="starships") val starships: Array<Starships> = arrayOf(),
//  @field:Json(name="vehicles") val vehicles: Array<Vehicles> = arrayOf(),
  @field:Json(name="url") val url: String = "",
  @field:Json(name="created") val created: String = "",
  @field:Json(name="edited") val edited: String = ""
)