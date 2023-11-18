package com.example.foodu.onboarding.signin.googlesignin.repo

import com.example.foodu.extras.Constants.USERS
import com.example.foodu.onboarding.signin.googlesignin.domain.ProfileRepository
import com.example.foodu.onboarding.signin.googlesignin.domain.RevokeAccessResponse
import com.example.foodu.onboarding.signin.googlesignin.domain.SignOutResponse
import com.example.foodu.onboarding.signin.googlesignin.domain.model.Response
import com.google.android.gms.auth.api.identity.SignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(
    private val auth: FirebaseAuth,
    private var oneTapClient: SignInClient,
    private var signInClient: GoogleSignInClient,
    private val db: FirebaseFirestore
): ProfileRepository {
    override val displayName: String
        get() = auth.currentUser?.displayName.toString()
    override val photoUrl: String
        get() = auth.currentUser?.photoUrl.toString()

    override suspend fun signOut(): SignOutResponse {
        return try {
            oneTapClient.signOut().await()
            auth.signOut()
            Response.Success(true)
        }catch (e: Exception){
            Response.Failure(e)
        }
    }

    override suspend fun revokeAccess(): RevokeAccessResponse {
        return try {
            auth.currentUser?.apply {
                db.collection(USERS).document(uid).delete().await()
                signInClient.revokeAccess()
                oneTapClient.signOut().await()
                delete().await()
            }
            Response.Success(true)
        }catch (e: Exception){
            Response.Failure(e)
        }
    }

}