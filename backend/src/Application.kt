import io.ktor.server.application.*
import io.ktor.server.netty.*

fun Application.module() {
  log.info("Hello from module!")
}

fun main(args: Array<String>) {
  EngineMain.main(args)
}
