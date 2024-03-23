package com.example.jetpackcompose

import android.util.Size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun MyText(text: String,color:Color,size:Int){

Text(text = text, color= color, fontSize = size.sp)



}