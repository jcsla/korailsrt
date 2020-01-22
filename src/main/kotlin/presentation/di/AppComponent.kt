package presentation.di

import dagger.Component
import data.api.KorailApi
import data.di.ApiModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApiModule::class
    ]
)
interface AppComponent {

    fun korailApi(): KorailApi
}