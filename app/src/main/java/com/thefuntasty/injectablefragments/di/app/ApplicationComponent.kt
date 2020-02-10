package com.thefuntasty.injectablefragments.di.app

import com.thefuntasty.injectablefragments.App
import com.thefuntasty.injectablefragments.di.activity.ActivityBuilderModule
import com.thefuntasty.injectablefragments.di.fragment.FragmentBuilderModule
import com.thefuntasty.injectablefragments.di.fragment.NavHostModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class,
        ApplicationModule::class,
        ActivityBuilderModule::class,
        FragmentBuilderModule::class,
        NavHostModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<App> {
        override fun create(@BindsInstance application: App): ApplicationComponent
    }
}
