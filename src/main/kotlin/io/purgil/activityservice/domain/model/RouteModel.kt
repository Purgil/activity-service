package io.purgil.activityservice.domain.model

import io.purgil.activityservice.domain.vo.RouteDifficulty
import java.util.Locale.IsoCountryCode
import java.util.UUID

data class Route(
        val id: UUID = UUID.randomUUID(),
        val name: String,
        val distance: Double,
        val difficulty: RouteDifficulty,
        val country: IsoCountryCode,
        val state: String,
        val city: String,
        val zipCode: String,
        val elevationGain: Double,
        var rating: Double,
        var avgTime: Double,

        val coordinates: List<Coordinate>,
)

data class Coordinate(
        val latitude: Double,
        val longitude: Double
)
