package by.mr.kukhto.viachaslau.lastfmver2.presentation.others

import android.content.Context
import android.graphics.Typeface

class SingletonFonts private constructor() {
    companion object {

        var font1: Typeface? = null
            get() = field
        var font2: Typeface? = null
            get() = field
        var font3: Typeface? = null
            get() = field

        @Volatile
        private var instance: SingletonFonts? = null

        fun getInstance(activity: Context): SingletonFonts? {
            var localInstance = instance
            if (localInstance == null) {
                synchronized(SingletonFonts::class.java) {
                    localInstance = instance
                    if (localInstance == null) {
                        localInstance = SingletonFonts()
                        instance = localInstance
                    }
                }
                font1 = Typeface.createFromAsset(activity.assets, "fonts/28_days_later.ttf")
                font2 = Typeface.createFromAsset(activity.assets, "fonts/1979_regular.ttf")
                font3 = Typeface.createFromAsset(activity.assets, "fonts/abosanovash.ttf")

            }
            return localInstance
        }
    }


}