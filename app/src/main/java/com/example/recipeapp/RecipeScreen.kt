package com.example.recipeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter

@Composable
fun RecipeScreen(modifier:Modifier=Modifier,viewState:MainViewModel.RecipeState,navigateToDetail: (Category) -> Unit){
    val recipeViewModel:MainViewModel=viewModel()

    Box(modifier = Modifier.fillMaxSize()){
        when{
            viewState.loading->{
                CircularProgressIndicator(modifier.align(Alignment.Center))
            }
            viewState.error!=null->{
                Text(text = "Error Occurred !")
            }
            else->{
                CategoryScreen(categoryList = viewState.categories, navigateToDetail)

            }
        }

    }

}

@Composable
fun CategoryScreen(categoryList: List<Category>,navigateToDetail: (Category) -> Unit){
    LazyVerticalGrid(GridCells.Fixed(2), modifier = Modifier.fillMaxSize()){
        items(categoryList){
            category->
            CategoryItem(category = category,navigateToDetail)

        }

    }

}



@Composable
fun CategoryItem(category:Category,navigateToDetail:(Category)->Unit){
    Column (
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
            .clickable {
                       navigateToDetail(category)
            },
        horizontalAlignment = Alignment.CenterHorizontally

    ){
       Image(painter = rememberAsyncImagePainter(category.strCategoryThumb), contentDescription = null,modifier= Modifier
           .wrapContentSize()
           .aspectRatio(1f).clip(CircleShape), contentScale = ContentScale.Fit)
        Text(text = category.strCategory,color= MaterialTheme.colorScheme.inverseSurface,style= TextStyle(fontWeight = FontWeight.Bold),modifier=Modifier.padding(top=4.dp))


    }
}
