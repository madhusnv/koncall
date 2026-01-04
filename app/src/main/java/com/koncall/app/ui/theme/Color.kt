package com.koncall.app.ui.theme

import androidx.compose.ui.graphics.Color

// Premium Color Palette
object KonCallColors {
    // Primary Gradient Colors
    val Teal = Color(0xFF00C6AE)
    val TealDark = Color(0xFF00A896)
    val Violet = Color(0xFF7C3AED)
    val VioletDark = Color(0xFF6D28D9)
    
    // Background Hierarchy
    val BackgroundDeep = Color(0xFF0A0A0F)
    val BackgroundDefault = Color(0xFF0F0F14)
    val SurfaceDefault = Color(0xFF14141A)
    val SurfaceElevated = Color(0xFF1A1A22)
    val SurfaceVariant = Color(0xFF1E1E26)
    val SurfaceCard = Color(0xFF22222A)
    
    // Semantic Colors
    val Success = Color(0xFF10B981)
    val SuccessLight = Color(0xFF34D399)
    val Warning = Color(0xFFF59E0B)
    val WarningLight = Color(0xFFFBBF24)
    val Error = Color(0xFFEF4444)
    val ErrorLight = Color(0xFFF87171)
    val Info = Color(0xFF3B82F6)
    val InfoLight = Color(0xFF60A5FA)
    
    // Text Colors
    val TextPrimary = Color(0xFFFFFFFF)
    val TextSecondary = Color(0xFFB0B0B8)
    val TextTertiary = Color(0xFF787880)
    val TextMuted = Color(0xFF505058)
    
    // Call Type Colors
    val Incoming = Color(0xFF22C55E)
    val Outgoing = Color(0xFF3B82F6)
    val Missed = Color(0xFFEF4444)
    
    // Lead Stage Colors
    val StageNew = Color(0xFF3B82F6)
    val StageContacted = Color(0xFFEAB308)
    val StageInterested = Color(0xFF22C55E)
    val StageApplicationSubmitted = Color(0xFF8B5CF6)
    val StageDocumentsCollected = Color(0xFF6366F1)
    val StageEnrolled = Color(0xFF14B8A6)
    val StageJoined = Color(0xFF059669)
    
    // Accent with alpha
    val TealAlpha10 = Color(0x1A00C6AE)
    val TealAlpha20 = Color(0x3300C6AE)
    val VioletAlpha10 = Color(0x1A7C3AED)
    val VioletAlpha20 = Color(0x337C3AED)
    val ErrorAlpha10 = Color(0x1AEF4444)
    val SuccessAlpha10 = Color(0x1A10B981)
    val WarningAlpha10 = Color(0x1AF59E0B)
}

// Legacy colors for backwards compatibility during migration
val Purple80 = KonCallColors.Violet
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = KonCallColors.Teal
val PurpleGrey40 = KonCallColors.TextSecondary
val Pink40 = Color(0xFF7D5260)