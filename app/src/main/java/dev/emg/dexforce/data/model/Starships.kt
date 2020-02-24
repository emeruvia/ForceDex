package dev.emg.dexforce.data.model

import com.squareup.moshi.Json

data class Starships(
  @field:Json(name = "name") val name: String = "",
  @field:Json(name = "model") val model: String = "",
  @field:Json(name = "starship_class") val starshipClass: String = "",
  @field:Json(name = "manufacturer") val manufacturer: String = "",
  @field:Json(name = "cost_in_credits") val costInCredits: String = "",
  @field:Json(name = "length") val length: String = "",
  @field:Json(name = "crew") val crew: String = "",
  @field:Json(name = "passengers") val passengers: String = "",
  @field:Json(name = "max_atmosphering_speed") val maxAtmospheringSpeed: String = "",
  @field:Json(name = "hyperdrive_rating") val hyperdriveRating: String = "",
  @field:Json(name = "mglt") val mglt: String = "",
  @field:Json(name = "cargo_capacity") val cargoCapacity: String = "",
  @field:Json(name = "consumables") val consumables: String = "",
  @field:Json(name = "films") val films: Array<String> = arrayOf(),
  @field:Json(name = "pilots") val pilots: Array<String> = arrayOf(),
  @field:Json(name = "url") val url: String = "",
  @field:Json(name = "created") val created: String = "",
  @field:Json(name = "edited") val edited: String = ""
) {
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Starships

    if (name != other.name) return false
    if (model != other.model) return false
    if (starshipClass != other.starshipClass) return false
    if (manufacturer != other.manufacturer) return false
    if (costInCredits != other.costInCredits) return false
    if (length != other.length) return false
    if (crew != other.crew) return false
    if (passengers != other.passengers) return false
    if (maxAtmospheringSpeed != other.maxAtmospheringSpeed) return false
    if (hyperdriveRating != other.hyperdriveRating) return false
    if (mglt != other.mglt) return false
    if (cargoCapacity != other.cargoCapacity) return false
    if (consumables != other.consumables) return false
    if (!films.contentEquals(other.films)) return false
    if (!pilots.contentEquals(other.pilots)) return false
    if (url != other.url) return false
    if (created != other.created) return false
    if (edited != other.edited) return false

    return true
  }

  override fun hashCode(): Int {
    var result = name.hashCode()
    result = 31 * result + model.hashCode()
    result = 31 * result + starshipClass.hashCode()
    result = 31 * result + manufacturer.hashCode()
    result = 31 * result + costInCredits.hashCode()
    result = 31 * result + length.hashCode()
    result = 31 * result + crew.hashCode()
    result = 31 * result + passengers.hashCode()
    result = 31 * result + maxAtmospheringSpeed.hashCode()
    result = 31 * result + hyperdriveRating.hashCode()
    result = 31 * result + mglt.hashCode()
    result = 31 * result + cargoCapacity.hashCode()
    result = 31 * result + consumables.hashCode()
    result = 31 * result + films.contentHashCode()
    result = 31 * result + pilots.contentHashCode()
    result = 31 * result + url.hashCode()
    result = 31 * result + created.hashCode()
    result = 31 * result + edited.hashCode()
    return result
  }
}