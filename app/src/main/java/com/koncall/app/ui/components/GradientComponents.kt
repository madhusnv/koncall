package com.koncall.app.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.koncall.app.ui.theme.KonCallColors

/**
 * Gradient Brush utilities for KonCall theme
 */
object KonCallGradients {
    val primaryGradient = Brush.linearGradient(
        colors = listOf(KonCallColors.Teal, KonCallColors.Violet)
    )
    
    val primaryGradientHorizontal = Brush.horizontalGradient(
        colors = listOf(KonCallColors.Teal, KonCallColors.Violet)
    )
    
    val primaryGradientVertical = Brush.verticalGradient(
        colors = listOf(KonCallColors.Teal, KonCallColors.Violet)
    )
    
    val subtleGradient = Brush.linearGradient(
        colors = listOf(
            KonCallColors.TealAlpha20,
            KonCallColors.VioletAlpha20
        )
    )
    
    val surfaceGradient = Brush.verticalGradient(
        colors = listOf(
            KonCallColors.SurfaceElevated,
            KonCallColors.SurfaceDefault
        )
    )
}

/**
 * A gradient-filled button with the KonCall primary gradient
 */
@Composable
fun GradientButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(12.dp),
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color.White,
            disabledContainerColor = Color.Transparent,
            disabledContentColor = KonCallColors.TextTertiary
        ),
        contentPadding = PaddingValues(0.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = if (enabled) KonCallGradients.primaryGradientHorizontal 
                           else Brush.horizontalGradient(
                               colors = listOf(KonCallColors.TextMuted, KonCallColors.TextMuted)
                           ),
                    shape = shape
                )
                .padding(horizontal = 24.dp, vertical = 14.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                content = content
            )
        }
    }
}

/**
 * A card with gradient border
 */
@Composable
fun GradientBorderCard(
    modifier: Modifier = Modifier,
    borderWidth: Dp = 1.dp,
    shape: Shape = RoundedCornerShape(16.dp),
    backgroundColor: Color = KonCallColors.SurfaceCard,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .clip(shape)
            .background(brush = KonCallGradients.primaryGradient, shape = shape)
            .padding(borderWidth)
            .background(color = backgroundColor, shape = shape)
    ) {
        content()
    }
}

/**
 * A hero card with full gradient background
 */
@Composable
fun GradientCard(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(20.dp),
    onClick: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = Color.Transparent,
        onClick = onClick ?: {}
    ) {
        Box(
            modifier = Modifier
                .background(brush = KonCallGradients.primaryGradient, shape = shape)
        ) {
            content()
        }
    }
}

/**
 * Pulsing animation for sync indicators
 */
@Composable
fun PulsingDot(
    color: Color = KonCallColors.Teal,
    size: Dp = 8.dp
) {
    val infiniteTransition = rememberInfiniteTransition(label = "pulse")
    val scale by infiniteTransition.animateFloat(
        initialValue = 0.8f,
        targetValue = 1.2f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulseScale"
    )
    val alpha by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0.5f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulseAlpha"
    )
    
    Box(
        modifier = Modifier
            .size(size * scale)
            .background(
                color = color.copy(alpha = alpha),
                shape = RoundedCornerShape(50)
            )
    )
}

/**
 * Elevated surface card with subtle gradient background
 */
@Composable
fun ElevatedSurfaceCard(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(16.dp),
    onClick: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    Card(
        modifier = modifier,
        shape = shape,
        colors = CardDefaults.cardColors(
            containerColor = KonCallColors.SurfaceCard
        ),
        onClick = onClick ?: {}
    ) {
        content()
    }
}

/**
 * Stats card with accent color
 */
@Composable
fun StatCard(
    modifier: Modifier = Modifier,
    accentColor: Color,
    onClick: (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = accentColor.copy(alpha = 0.1f)
        ),
        onClick = onClick ?: {}
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .drawBehind {
                    // Left accent border
                    drawLine(
                        color = accentColor,
                        start = Offset(0f, size.height * 0.2f),
                        end = Offset(0f, size.height * 0.8f),
                        strokeWidth = 3.dp.toPx()
                    )
                }
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            content = content
        )
    }
}
