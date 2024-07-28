package io.purgil.activityservice.domain.vo

enum class RouteDifficulty(private val label: String) {
    EASY("쉬움"),
    MEDIUM("보통"),
    HARD("어려움"),
    VERY_HARD("매우 어려움"),
    EXTREMELY_HARD("극도로 어려움"),
    ;
    private fun getLabel(): String = label
}
