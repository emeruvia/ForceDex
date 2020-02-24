package dev.emg.dexforce.data.model

import com.squareup.moshi.Json

data class People(
  @field:Json(name = "name") val name: String = "",
  @field:Json(name = "birth_year") val birthYear: String = "",
  @field:Json(name = "eye_color") val eyeColor: String = "",
  @field:Json(name = "gender") val gender: String = "",
  @field:Json(name = "hair_color") val hairColor: String = "",
  @field:Json(name = "height") val height: String = "",
  @field:Json(name = "mass") val mass: String = "",
  @field:Json(name = "skin_color") val skinColor: String = "",
  @field:Json(name = "homeworld") val homeworld: String = "",
  @field:Json(name = "films") val films: Array<String> = arrayOf(),
  @field:Json(name = "species") val species: Array<String> = arrayOf(),
  @field:Json(name = "starships") val starships: Array<String> = arrayOf(),
  @field:Json(name = "vehicles") val vehicles: Array<String> = arrayOf(),
  @field:Json(name = "url") val url: String = "",
  @field:Json(name = "created") val created: String = "",
  @field:Json(name = "edited") val edited: String = ""
) {
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as People

    if (name != other.name) return false
    if (birthYear != other.birthYear) return false
    if (eyeColor != other.eyeColor) return false
    if (gender != other.gender) return false
    if (hairColor != other.hairColor) return false
    if (height != other.height) return false
    if (mass != other.mass) return false
    if (skinColor != other.skinColor) return false
    if (homeworld != other.homeworld) return false
    if (!films.contentEquals(other.films)) return false
    if (!species.contentEquals(other.species)) return false
    if (!starships.contentEquals(other.starships)) return false
    if (!vehicles.contentEquals(other.vehicles)) return false
    if (url != other.url) return false
    if (created != other.created) return false
    if (edited != other.edited) return false

    return true
  }

  override fun hashCode(): Int {
    var result = name.hashCode()
    result = 31 * result + birthYear.hashCode()
    result = 31 * result + eyeColor.hashCode()
    result = 31 * result + gender.hashCode()
    result = 31 * result + hairColor.hashCode()
    result = 31 * result + height.hashCode()
    result = 31 * result + mass.hashCode()
    result = 31 * result + skinColor.hashCode()
    result = 31 * result + homeworld.hashCode()
    result = 31 * result + films.contentHashCode()
    result = 31 * result + species.contentHashCode()
    result = 31 * result + starships.contentHashCode()
    result = 31 * result + vehicles.contentHashCode()
    result = 31 * result + url.hashCode()
    result = 31 * result + created.hashCode()
    result = 31 * result + edited.hashCode()
    return result
  }
}