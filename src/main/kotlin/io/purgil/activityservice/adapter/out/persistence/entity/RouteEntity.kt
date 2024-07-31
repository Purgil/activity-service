package io.purgil.activityservice.adapter.out.persistence.entity

import org.springframework.data.annotation.*
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime
import java.util.*

@Table("route")
class RouteEntity(
        @Id
        val id: UUID? = null,

        @CreatedBy val createdBy: String? = null,
        @CreatedDate val createdAt: LocalDateTime? = null,
        @LastModifiedBy val lastModifiedBy: String? = null,
        @LastModifiedDate val lastModifiedAt: LocalDateTime? = null
)
