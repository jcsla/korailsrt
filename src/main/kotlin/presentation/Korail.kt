package presentation

import data.api.KorailApi
import presentation.di.AppComponent
import presentation.di.DaggerAppComponent

object Korail {

    private val appComponent: AppComponent by lazy {
        val appComponent = DaggerAppComponent.builder().build()
        appComponent
    }

    val api: KorailApi by lazy {
        appComponent.korailApi()
    }
}