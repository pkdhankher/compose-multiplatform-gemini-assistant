package di

import org.koin.core.context.startKoin
import org.koin.dsl.module


val dataModule = module {
//    single {
//        val json = Json { ignoreUnknownKeys = true }
//        HttpClient {
//            install(ContentNegotiation) {
//                // TODO Fix API so it serves application/json
//                json(json, contentType = ContentType.Any)
//            }
//        }
//    }

//    single<GeminiRepository> { GeminiRepositoryImpl(get()) }
//    single { GeminiService(get()) }
}

//val screenModelsModule = module {
//    factoryOf(::ChatViewModel)
//}

fun initKoin() {
    startKoin {
        modules(
            dataModule,
//            screenModelsModule,
        )
    }
}
