package by.mr.kukhto.viachaslau.lastfmver2.di.components

import android.content.Context
import by.mr.kukhto.viachaslau.lastfmver2.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun setContext(context: Context): Builder

        fun build(): AppComponent
    }
}