package com.koncall.app.data.repository

import com.koncall.app.data.local.entity.LeadEntity

/**
 * Exception thrown when a conflict is detected during lead update.
 * This happens when the server version is newer than the local version,
 * indicating another user modified the lead while we were editing.
 */
class ConflictException(
    message: String,
    val serverVersion: LeadEntity,
    val localVersion: LeadEntity
) : Exception(message) {
    
    /**
     * Returns a user-friendly message describing the conflict.
     */
    fun getUserMessage(): String {
        return "This lead was modified by another user. Please refresh and try again."
    }
}
