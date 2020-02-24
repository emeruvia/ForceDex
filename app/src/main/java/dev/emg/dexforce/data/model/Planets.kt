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
  @field:Json(name = "residents") val residents: Array<String> = arrayOf(),
  @field:Json(name = "films") val films: Array<String> = arrayOf(),
  @field:Json(name = "url") val url: String = "",
  @field:Json(name = "created") val created: String = "",
  @field:Json(name = "edited") val edited: String = ""
) {
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Planets

    if (name != other.name) return false
    if (diameter != other.diameter) return false
    if (rotationPeriod != other.rotationPeriod) return false
    if (orbitalPeriod != other.orbitalPeriod) return false
    if (gravity != other.gravity) return false
    if (population != other.population) return false
    if (climate != other.climate) return false
    if (terrain != other.terrain) return false
    if (surfaceWater != other.surfaceWater) return false
    if (!residents.contentEquals(other.residents)) return false
    if (!films.contentEquals(other.films)) return false
    if (url != other.url) return false
    if (created != other.created) return false
    if (edited != other.edited) return false

    return true
  }

  override fun hashCode(): Int {
    var result = name.hashCode()
    result = 31 * result + diameter.hashCode()
    result = 31 * result + rotationPeriod.hashCode()
    result = 31 * result + orbitalPeriod.hashCode()
    result = 31 * result + gravity.hashCode()
    result = 31 * result + population.hashCode()
    result = 31 * result + climate.hashCode()
    result = 31 * result + terrain.hashCode()
    result = 31 * result + surfaceWater.hashCode()
    result = 31 * result + residents.contentHashCode()
    result = 31 * result + films.contentHashCode()
    result = 31 * result + url.hashCode()
    result = 31 * result + created.hashCode()
    result = 31 * result + edited.hashCode()
    return result
  }
}