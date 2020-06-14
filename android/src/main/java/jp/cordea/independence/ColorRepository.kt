package jp.cordea.independence

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ColorRepository @Inject constructor(
    private val api: ColorApi
) {
    fun findAll() = api.getColors()
}
