package io.purgil.activityservice.domain.model

import io.purgil.activityservice.domain.vo.RouteDifficulty
import java.util.Locale.IsoCountryCode
import java.util.UUID

data class Route(
        val id: UUID? = null,
        val name: String,
        val activities: List<Activity> = mutableListOf(),
        val motherActivity: Activity? = null,
        val distance: Double,
        val difficulty: RouteDifficulty,
        val country: IsoCountryCode,
        val state: String,
        val city: String,
        val zipCode: String,
        val elevationGain: Double, // 누적 고도 상승
        val coordinates: List<Coordinate>,
        var rating: Double,
        var averageDuration: Int,
)
data class Coordinate(
        val latitude: Double,
        val longitude: Double,
)
