package jp.cordea.independence

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.routing.Routing

fun Application.main() {
    install(Routing) {
        api()
    }
}
