package io.purgil.activityservice.domain.model

import io.purgil.sharedlib.domain.model.Image
import io.purgil.sharedlib.domain.model.User
import java.time.LocalDateTime
import java.util.UUID

data class Activity(
        val id: UUID? = null,
        val user: User, // subscribe to user-service
        val motherRouteId: UUID,
        val route: UUID,
        val images: List<Image> = mutableListOf(), // subscribe to image-service
        val title: String,
        val description: String? = null,
        val totalDuration: Int,
        val movingDuration: Int,
        val calories: Int,
        val createdAt: LocalDateTime? = LocalDateTime.now(),
        val createdBy: String? = null,
        var lastModifiedAt: LocalDateTime? = LocalDateTime.now(),
        var lastModifiedBy: String? = null,
)

data class Split(
        val id: UUID? = null,
        val activityId: UUID,
        val duration: Int,
        val distance: Double,
        val elevationGain: Double,
        val calories: Int,
        val createdAt: LocalDateTime? = LocalDateTime.now(),
        val createdBy: String? = null,
        var lastModifiedAt: LocalDateTime? = LocalDateTime.now(),
        var lastModifiedBy: String? = null,
)
