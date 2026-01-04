package com.koncall.app.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// KonCall Premium Dark Color Scheme
private val KonCallDarkColorScheme = darkColorScheme(
    // Primary colors
    primary = KonCallColors.Teal,
    onPrimary = KonCallColors.TextPrimary,
    primaryContainer = KonCallColors.TealAlpha20,
    onPrimaryContainer = KonCallColors.Teal,
    
    // Secondary colors (Violet accent)
    secondary = KonCallColors.Violet,
    onSecondary = KonCallColors.TextPrimary,
    secondaryContainer = KonCallColors.VioletAlpha20,
    onSecondaryContainer = KonCallColors.Violet,
    
    // Tertiary colors
    tertiary = KonCallColors.Success,
    onTertiary = KonCallColors.TextPrimary,
    tertiaryContainer = KonCallColors.SuccessAlpha10,
    onTertiaryContainer = KonCallColors.Success,
    
    // Error colors
    error = KonCallColors.Error,
    onError = KonCallColors.TextPrimary,
    errorContainer = KonCallColors.ErrorAlpha10,
    onErrorContainer = KonCallColors.Error,
    
    // Background colors
    background = KonCallColors.BackgroundDeep,
    onBackground = KonCallColors.TextPrimary,
    
    // Surface colors
    surface = KonCallColors.SurfaceDefault,
    onSurface = KonCallColors.TextPrimary,
    surfaceVariant = KonCallColors.SurfaceVariant,
    onSurfaceVariant = KonCallColors.TextSecondary,
    
    // Other
    outline = KonCallColors.TextTertiary,
    outlineVariant = KonCallColors.TextMuted,
    inverseSurface = KonCallColors.TextPrimary,
    inverseOnSurface = KonCallColors.BackgroundDeep,
    inversePrimary = KonCallColors.TealDark,
    surfaceTint = KonCallColors.Teal
)

@Composable
fun KonCallTheme(
    darkTheme: Boolean = true, // Always dark for premium look
    dynamicColor: Boolean = false, // Disabled for consistent branding
    content: @Composable () -> Unit
) {
    val colorScheme = KonCallDarkColorScheme
    
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = KonCallColors.BackgroundDeep.toArgb()
            window.navigationBarColor = KonCallColors.BackgroundDeep.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
            WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}