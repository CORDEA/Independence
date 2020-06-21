package jp.cordea.independence

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.routing.Routing
import io.ktor.serialization.json

fun Application.main() {
    install(ContentNegotiation) {
        json()
    }
    install(Routing) {
        api()
    }
}
