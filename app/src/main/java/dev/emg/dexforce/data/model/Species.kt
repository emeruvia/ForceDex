package dev.emg.dexforce.data.model

data class Species(
  val name: String = "",
  val classification: String = "",
  val designation: String = "",
  val average_height: String = "",
  val average_lifespan: String = "",
  val eye_colors: String = "",
  val hair_colors: String = "",
  val skin_colors: String = "",
  val language: String = "",
  val homeworld: String = "",
  val people: Array<People>? = null,
  val films: Array<Films>? = null,
  val url: String = "",
  val created: String = "",
  val edited: String = ""
)