package com.thefuntasty.injectablefragments.ui

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.thefuntasty.injectablefragments.R
import javax.inject.Inject

class SecondFragment @Inject constructor(
    private val sharedPrefs: SharedPreferences
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sharedPrefs.contains("A")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
}
