package com.example.foodu.onboarding

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodu.data.DataStoreRepository
import com.example.foodu.extras.FooduRoutes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


class SplashViewModel
    @Inject constructor(
        private val repository: DataStoreRepository
    ): ViewModel() {
        private val _isLoading: MutableState<Boolean> = mutableStateOf(true)
    val isLoading: State<Boolean> = _isLoading

    private val _startDestination: MutableState<String> = mutableStateOf(FooduRoutes.WELCOME)
    val startDestination: State<String> = _startDestination

    init {
        viewModelScope.launch {
            repository.readOnBoardingState().collect{completed ->
                if (completed){
                    _startDestination.value = FooduRoutes.SIGNIN
                }else{
                    _startDestination.value = FooduRoutes.WELCOME
                }
            }
            _isLoading.value = false
        }
    }
}