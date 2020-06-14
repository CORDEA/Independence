package jp.cordea.independence

import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface ColorApi {
    @GET("/api/colors")
    fun getColors(): Flow<List<Color>>
}
