package com.example.tasklist.core

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.UserProfileChangeRequest
import kotlinx.coroutines.tasks.await

object FirebaseAuthentication {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    /**
     * Registrar nuevo usuario en Firebase Authentication
     */
    suspend fun registerUser(email: String, password: String, displayName: String): Result<FirebaseUser?> {
        return try {
            val authResult = auth.createUserWithEmailAndPassword(email, password).await()
            authResult.user?.updateProfile(
                UserProfileChangeRequest.Builder().setDisplayName(displayName).build()
            )?.await()
            Result.success(authResult.user)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    /**
     * Iniciar sesión con correo y contraseña
     */
    suspend fun loginUser(email: String, password: String): Result<FirebaseUser?> {
        return try {
            val authResult = auth.signInWithEmailAndPassword(email, password).await()
            Result.success(authResult.user)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    /**
     * Obtener usuario actual
     */
    fun getCurrentUser(): FirebaseUser? {
        return auth.currentUser
    }

    /**
     * Cerrar sesión
     */
    fun logout() {
        auth.signOut()
    }
}
