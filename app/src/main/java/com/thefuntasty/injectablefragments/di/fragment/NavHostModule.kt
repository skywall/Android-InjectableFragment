package com.thefuntasty.injectablefragments.di.fragment

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface NavHostModule {

    @ContributesAndroidInjector(modules = [FragmentBuilderModule::class])
    fun navHostFragmentInjector(): InjectingNavHostFragment
}
