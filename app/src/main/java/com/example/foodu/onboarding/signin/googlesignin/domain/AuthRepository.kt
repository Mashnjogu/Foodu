package com.example.foodu.onboarding.signin.googlesignin.domain

import com.example.foodu.onboarding.signin.googlesignin.domain.model.Response
import com.google.android.gms.auth.api.identity.BeginSignInResult
import com.google.android.gms.auth.api.identity.SignInCredential
import com.google.firebase.auth.AuthCredential


typealias OneTapSignInResponse = Response<BeginSignInResult>
typealias SignInWithGoogleResponse = Response<Boolean>
interface AuthRepository {
    val isUserAuthenticatedInFirebase: Boolean

    suspend fun oneTapSignInWithGoogle(): OneTapSignInResponse

    suspend fun FirebaseSignInWithGoogle(googleCredential: AuthCredential): SignInWithGoogleResponse
}