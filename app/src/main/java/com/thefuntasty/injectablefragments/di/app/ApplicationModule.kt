package com.thefuntasty.injectablefragments.di.app

import android.content.Context
import android.content.SharedPreferences
import com.thefuntasty.injectablefragments.App
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun sharedPrefs(app: App): SharedPreferences =
        app.getSharedPreferences("inj_fragment", Context.MODE_PRIVATE)
}
