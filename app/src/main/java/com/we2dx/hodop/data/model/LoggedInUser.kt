package com.we2dx.hodop.data.model

/**
 * Data class that captures user information for logged in users retrieved from SignUpRepository
 */
data class LoggedInUser(
    val userId: String,
    val displayName: String
)
