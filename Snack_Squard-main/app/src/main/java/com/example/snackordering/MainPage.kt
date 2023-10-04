package com.example.snackordering

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.snackordering.ui.theme.SnackOrderingTheme

import android.content.Intent as Intent1


class MainPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SnackOrderingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    FinalView(this)
                    val context = LocalContext.current
                    //PopularFoodColumn(context)
                }
            }
        }
    }
}


@Composable
fun TopPart(context: Context) {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffeceef0)), Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = " ",modifier=Modifier.size(30.dp).clickable {
                val intent = Intent1(context, Home::class.java)
                context.startActivity(intent)  }
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Mandakini", style = MaterialTheme.typography.subtitle1, color = Color.Black)
            Row {

                Text(text = "Location" , color = Color.Black)
            }

        }
       Icon(
            imageVector = Icons.Default.ShoppingCart,
            contentDescription = "shopping cart",
           modifier= Modifier.size(30.dp).clickable {
               val intent = Intent(context, Cart::class.java)
               context.startActivity(intent)
           }

            )

    }
}



@Composable
fun PopularFood(
    @DrawableRes drawable: Int,
    @StringRes text1: Int,


    context: Context
) {
    val t =stringResource(id = text1)


    Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize()
                .background(Color.White)


        ) {



           Card(
                modifier = Modifier
                    .wrapContentSize()
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = Color.White)
                    .padding(16.dp)
            )
            {
                Row(modifier = Modifier
                    .background(color = Color.White)
                    .size(width = 3200.dp, height = 100.dp)
                    .clickable { },Arrangement.SpaceBetween) {
                    androidx.compose.material3.Card(
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, color = Color.Magenta),
                        modifier = Modifier
                            .size(80.dp)
                            .padding(10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = drawable),
                            contentDescription = "Food Image",
                            contentScale = ContentScale.Crop,

                            )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(6.dp),
                        verticalArrangement = Arrangement.aligned(Alignment.CenterVertically)
                    ) {
                        androidx.compose.material3.Text(
                            text =t,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        androidx.compose.material3.Text(text = " ", color = Color.Black)

                    }
                    androidx.compose.material3.Card(
                        shape = CircleShape, border = BorderStroke(2.dp, color = Color.Magenta),
                        modifier = Modifier
                            .size(90.dp)
                            .padding(30.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.addi),
                            contentDescription = " ",modifier=Modifier.clickable {
                                val intent=Intent(context, TargetActivity::class.java)

                                intent.putExtra("data4", t)

                                startActivity(context,intent,null)  }
                        )

                    }
                }

            }





        }

}



private val FoodList = listOf(
    R.drawable.sandwish to R.string.sandwich,
    R.drawable.burger to R.string.burgers,
    R.drawable.pack to R.string.pack,

    ).map { DrawableStringPair(it.first , it.second)}
private data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text1: Int,

    )


@Composable
fun App(context: Context) {



    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffeceef0))
            .padding(10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Surface(modifier = Modifier, elevation = 5.dp) {
            TopPart(context)
        }


        Spacer(modifier = Modifier.padding(10.dp))
        Row(modifier = Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
            Text(text = "Menu", style = MaterialTheme.typography.h5, color = Color.Black)

        }

        PopularFoodColumn(context) // <- call the function with parentheses
    }
}




@Composable
fun PopularFoodColumn(context: Context) {


    LazyColumn(
        modifier = Modifier.fillMaxSize(),

        content = {
            items(FoodList) { item ->
                PopularFood(context = context,drawable = item.drawable, text1 = item.text1)
                abstract class Context
            }
        },
        verticalArrangement = Arrangement.spacedBy(16.dp))
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FinalView(mainPage: MainPage) {

    SnackOrderingTheme {

        Scaffold() {

            val context = LocalContext.current
            App(context)
        }
    }
}