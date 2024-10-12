package com.sagar.compose_tutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ComposeTutorialLibraryCard() {
    Box(
        modifier = Modifier.clip(RoundedCornerShape(25)).size(100.dp).background(Color.Red)
    )
}