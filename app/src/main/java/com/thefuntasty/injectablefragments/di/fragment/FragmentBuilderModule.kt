package com.thefuntasty.injectablefragments.di.fragment

import androidx.fragment.app.Fragment
import com.thefuntasty.injectablefragments.ui.FirstFragment
import com.thefuntasty.injectablefragments.ui.SecondFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface FragmentBuilderModule {

    @Binds
    @IntoMap
    @FragmentKey(FirstFragment::class)
    fun bindFirstFragment(firstFragment: FirstFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(SecondFragment::class)
    fun bindSecondFragment(secondFragment: SecondFragment): Fragment
}
