package dev.emg.dexforce.data.model

data class Planets(
  val name: String = "",
  val diameter: String = "",
  val rotation_period: String = "",
  val orbital_period: String = "",
  val gravity: String = "",
  val population: String = "",
  val climate: String = "",
  val terrain: String = "",
  val surface_water: String = "",
  val residents: Array<People>? = null,
  val films: Array<Films>? = null,
  val url: String = "",
  val created: String = "",
  val edited: String = ""
)