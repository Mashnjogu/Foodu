package com.example.foodu.onboarding.signin.googlesignin

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodu.onboarding.signin.googlesignin.domain.AuthRepository
import com.example.foodu.onboarding.signin.googlesignin.domain.OneTapSignInResponse
import com.example.foodu.onboarding.signin.googlesignin.domain.SignInWithGoogleResponse
import com.example.foodu.onboarding.signin.googlesignin.domain.model.Response
import com.google.android.gms.auth.api.identity.SignInClient
import com.google.android.gms.auth.api.identity.SignInCredential
import com.google.firebase.auth.AuthCredential
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val repo: AuthRepository,
    val oneTapClient: SignInClient
) : ViewModel(){

    val isUserAuthenticated get() = repo.isUserAuthenticatedInFirebase

    var oneTapSignInResponse by mutableStateOf<OneTapSignInResponse>(Response.Success(null))
    private set
    var signInWithGoogleResponse by mutableStateOf<SignInWithGoogleResponse>(Response.Success(false))
    private set

    fun oneTapSignIn() = viewModelScope.launch{
        oneTapSignInResponse = Response.Loading
        oneTapSignInResponse = repo.oneTapSignInWithGoogle()
    }

    fun signInWithGoogle(googleCredential: AuthCredential)= viewModelScope.launch{
        oneTapSignInResponse = Response.Loading
        signInWithGoogleResponse = repo.FirebaseSignInWithGoogle(googleCredential =googleCredential )
    }
}