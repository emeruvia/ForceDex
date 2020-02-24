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
  @field:Json(name = "people") val people: Array<String> = arrayOf(),
  @field:Json(name = "fimls") val films: Array<String> = arrayOf(),
  @field:Json(name = "url") val url: String = "",
  @field:Json(name = "created") val created: String = "",
  @field:Json(name = "edited") val edited: String = ""
) {
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Species

    if (name != other.name) return false
    if (classification != other.classification) return false
    if (designation != other.designation) return false
    if (avgHeight != other.avgHeight) return false
    if (avgLifespan != other.avgLifespan) return false
    if (eyeColors != other.eyeColors) return false
    if (hairColors != other.hairColors) return false
    if (skinColors != other.skinColors) return false
    if (language != other.language) return false
    if (homeworld != other.homeworld) return false
    if (!people.contentEquals(other.people)) return false
    if (!films.contentEquals(other.films)) return false
    if (url != other.url) return false
    if (created != other.created) return false
    if (edited != other.edited) return false

    return true
  }

  override fun hashCode(): Int {
    var result = name.hashCode()
    result = 31 * result + classification.hashCode()
    result = 31 * result + designation.hashCode()
    result = 31 * result + avgHeight.hashCode()
    result = 31 * result + avgLifespan.hashCode()
    result = 31 * result + eyeColors.hashCode()
    result = 31 * result + hairColors.hashCode()
    result = 31 * result + skinColors.hashCode()
    result = 31 * result + language.hashCode()
    result = 31 * result + homeworld.hashCode()
    result = 31 * result + people.contentHashCode()
    result = 31 * result + films.contentHashCode()
    result = 31 * result + url.hashCode()
    result = 31 * result + created.hashCode()
    result = 31 * result + edited.hashCode()
    return result
  }
}