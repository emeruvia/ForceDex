package dev.emg.dexforce.data.model

data class People(
  val name: String = "",
  val birth_year: String = "",
  val eye_color: String = "",
  val gender: String = "",
  val hair_color: String = "",
  val height: String = "",
  val mass: String = "",
  val skin_color: String = "",
  val homeworld: String = "",
  val films: Array<Films> = arrayOf(),
  val species: Array<Species> = arrayOf(),
  val starships: Array<Starships> = arrayOf(),
  val vehicles: Array<Vehicles> = arrayOf(),
  val url: String = "",
  val created: String = "",
  val edited: String = ""
)