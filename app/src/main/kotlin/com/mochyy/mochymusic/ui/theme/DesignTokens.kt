package com.mochyy.mochymusic.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * One place for the app's design tokens, so screens stop inventing their own greys and gaps.
 * Premium minimalist dark: deep charcoal surfaces, one muted lavender accent, soft grey text.
 * [MochyTheme] builds the Material colour scheme from these; new UI should read them from here.
 */
object Tokens {
    object Palette {
        val Background = Color(0xFF121214)      // deep charcoal
        val BackgroundAlt = Color(0xFF1A1A1D)   // secondary, dark neutral grey
        val Surface = Color(0xFF212125)         // elevated charcoal
        val SurfaceHigh = Color(0xFF2B2B30)
        val Outline = Color(0xFF3A3A40)

        val Accent = Color(0xFFB9A7F0)          // muted lavender
        val OnAccent = Color(0xFF1E1A33)
        val AccentContainer = Color(0xFF3B3558)
        val OnAccentContainer = Color(0xFFE6DFFF)

        val TextPrimary = Color(0xFFF5F5F7)     // high-contrast white
        val TextSecondary = Color(0xFFA6A6AE)   // soft grey
    }

    object Spacing {
        val Xs = 4.dp
        val Sm = 8.dp
        val Md = 12.dp
        val Lg = 16.dp
        val Xl = 24.dp
        val Xxl = 32.dp
    }

    object Radius {
        val Small = 8.dp
        val Medium = 12.dp
        val Large = 20.dp
    }

    object Elevation {
        val None = 0.dp
        val Low = 2.dp
        val Medium = 6.dp
    }
}
