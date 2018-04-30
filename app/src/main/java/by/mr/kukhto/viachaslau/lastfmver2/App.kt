package by.mr.kukhto.viachaslau.lastfmver2

import android.app.Application
import by.mr.kukhto.viachaslau.lastfmver2.di.components.AppComponent
import by.mr.kukhto.viachaslau.lastfmver2.di.components.DaggerAppComponent


class App : Application() {

    var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .setContext(this)
                .build()
    }

}