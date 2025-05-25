package com.loc.newsapp.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.loc.newsapp.presentation.Dimens
import com.loc.newsapp.presentation.Dimens.IndicatorSize
import com.loc.newsapp.ui.theme.BlueGray

@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize:Int,
    selectedPage : Int,
    selectedColor : Color = MaterialTheme.colorScheme.primary,
    unSelectedColor : Color= BlueGray
){
    repeat(pageSize){page ->
        Box(
            modifier = Modifier
                .size(IndicatorSize)
                .clip(CircleShape)
                .background(color = if (page == selectedPage) selectedColor else unSelectedColor)
        )

    }

}

@Composable
@Preview(showBackground = true)
fun PageIndicatorPreview(){
    Row {
        PageIndicator(pageSize = 7, selectedPage = 6)
    }

}