package io.github.artcraftandroid.capcraft.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * The editor's palette, restyled to the MotionFlow design tokens: an indigo-black
 * editor, violet accent, periwinkle selection and a violet-to-cyan brand gradient.
 *
 * Every property name is unchanged so the rest of the app keeps compiling; only the
 * values moved. Values marked "derived" have no MotionFlow equivalent and were
 * interpolated between neighbouring MotionFlow tokens.
 */
object Palette {
    val Black = Color(0xFF0A0A10)
    /** The editor's chrome: top bar, timeline and dock. */
    val Chrome = Color(0xFF0E0E16)
    /** Panels and sheets over the editor. */
    val Panel = Color(0xFF161622)
    /** Cards and raised rows. */
    val Card = Color(0xFF1E1E2D)
    /** Derived: one step above [Card]. */
    val CardPressed = Color(0xFF28283A)
    val Divider = Color(0xFF2A2A3D)
    /** MotionFlow primary (violet). */
    val Accent = Color(0xFFC546FF)
    /** Words on the accent: white, as in MotionFlow's onPrimary. */
    val OnAccent = Color(0xFFFFFFFF)
    /** The editor's top part: top bar, preview surround and play bar. */
    val EditorTop = Color(0xFF0E0E16)
    /** The timeline and the bottom bar under it. */
    val Timeline = Color(0xFF161622)
    /** The bottom bar while a clip is selected, and the panels. */
    val DockSelected = Color(0xFF1E1E2D)
    /** The back button of a bottom bar level. */
    val DockBack = Color(0xFF2A2A3D)
    /** Labels and icons in the bottom bar. Derived: a cool near-white. */
    val DockText = Color(0xFFD2D2E4)
    /** The resolution chip in the top bar. */
    val Chip = Color(0xFF1E1E2D)
    /** The "add audio" / "add text" rows and their tiles. */
    val HintRow = Color(0xFF1E1E2D)
    val HintIcon = Color(0xFF6E6E85)
    val Text = Color(0xFFFFFFFF)
    val TextSecondary = Color(0xFFA2A2B8)
    val TextTertiary = Color(0xFF6E6E85)
    /** Derived: between MotionFlow's muted text and its outline. */
    val Disabled = Color(0xFF4A4A5E)
    /** Timeline clip colours by row (unchanged: they carry meaning). */
    val TextClip = Color(0xFFE67300)
    /** Captions, a lighter amber than titles. */
    val CaptionClip = Color(0xFFDA9208)
    val EffectClip = Color(0xFF7E61EE)
    val FilterClip = Color(0xFFE36BBF)
    val StickerClip = Color(0xFFDCB108)
    val AudioClip = Color(0xFF2A5256)
    /** Beat marks on sound clips. */
    val Beat = Color(0xFFFFD60A)
    val AudioWave = Color(0xFF00A3FF)
    val OverlayClip = Color(0xFF1E1E2D)
    val Danger = Color(0xFFFF5C7A)

    // MotionFlow brand tokens, new in this restyle.
    val Violet = Color(0xFFC546FF)
    val Indigo = Color(0xFF6C63FF)
    val Cyan = Color(0xFF00A3FF)
    /** Selected tab / toggle (periwinkle). */
    val Active = Color(0xFF6B7CFF)
    val Gold = Color(0xFFFFC857)
    val BrandGradient: List<Color> = listOf(Color(0xFF9F3CF9), Color(0xFF5B7CFF), Color(0xFF00CEFD))
    fun brandBrush(): Brush = Brush.linearGradient(BrandGradient)
}

object Type {
    val Title = TextStyle(color = Palette.Text, fontSize = 17.sp, fontWeight = FontWeight.SemiBold)
    val Body = TextStyle(color = Palette.Text, fontSize = 14.sp)
    val BodyStrong = TextStyle(color = Palette.Text, fontSize = 14.sp, fontWeight = FontWeight.Medium)
    val Small = TextStyle(color = Palette.TextSecondary, fontSize = 12.sp)
    val Tiny = TextStyle(color = Palette.TextSecondary, fontSize = 10.sp)
    val DockLabel = TextStyle(color = Palette.Text, fontSize = 10.sp)
}

/** MotionFlow's corner radii. */
private val CapCraftShapes = Shapes(
    extraSmall = RoundedCornerShape(6.dp),
    small = RoundedCornerShape(10.dp),
    medium = RoundedCornerShape(14.dp),
    large = RoundedCornerShape(20.dp),
    extraLarge = RoundedCornerShape(28.dp),
)

@Composable
fun CapCraftTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Palette.Violet,
            onPrimary = Palette.OnAccent,
            secondary = Palette.Cyan,
            onSecondary = Palette.OnAccent,
            background = Palette.Black,
            onBackground = Palette.Text,
            surface = Palette.Chrome,
            onSurface = Palette.Text,
            surfaceVariant = Palette.Panel,
            onSurfaceVariant = Palette.TextSecondary,
            surfaceContainerLowest = Palette.Black,
            surfaceContainerLow = Palette.Chrome,
            surfaceContainer = Palette.Panel,
            surfaceContainerHigh = Palette.Card,
            surfaceContainerHighest = Palette.Card,
            outline = Palette.Divider,
            outlineVariant = Palette.Divider,
            error = Palette.Danger,
        ),
        shapes = CapCraftShapes,
        content = content,
    )
}
