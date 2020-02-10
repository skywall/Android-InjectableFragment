package com.thefuntasty.injectablefragments.di.activity

import com.thefuntasty.injectablefragments.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBuilderModule {

    @ContributesAndroidInjector
    fun mainActivityInjector(): MainActivity
}
