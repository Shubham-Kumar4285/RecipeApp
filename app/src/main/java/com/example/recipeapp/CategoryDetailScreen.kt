package com.example.recipeapp

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CategoryDetailScreen(category: Category){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp, bottom = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
        Text(text = category.strCategory,fontSize=30.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
        Spacer(modifier = Modifier.padding(5.dp))
        Image(painter = rememberAsyncImagePainter(category.strCategoryThumb), contentDescription = null,modifier= Modifier
            .size(300.dp)
            .aspectRatio(1f).clip(RectangleShape), contentScale = ContentScale.Fit)
        Text(text = "Description", fontWeight = FontWeight.Bold,fontSize=20.sp)
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = category.strCategoryDescription,
            fontSize=18.sp,fontFamily= FontFamily.Monospace,
            textAlign = TextAlign.Justify,
            modifier = Modifier.verticalScroll(rememberScrollState()).padding(start = 10.dp,end=10.dp)
        )


    }

}

