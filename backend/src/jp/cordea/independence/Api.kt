package jp.cordea.independence

import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.route

fun Routing.api() {
    route("api") {
        get("colors") {
            call.respond(
                listOf(
                    Color("Pink", "#E91E63"),
                    Color("Purple", "#9C27B0"),
                    Color("Indigo", "#3F51B5"),
                    Color("Cyan", "#00BCD4"),
                    Color("Green", "#4CAF50"),
                    Color("Lime", "#CDDC39"),
                    Color("Orange", "#FF9800")
                )
            )
        }
    }
}
