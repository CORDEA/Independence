package jp.cordea.independence

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel @ViewModelInject constructor(
    @Assisted private val handle: SavedStateHandle
) : ViewModel()
