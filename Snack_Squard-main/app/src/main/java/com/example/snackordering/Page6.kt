package com.example.snackordering

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.snackordering.ui.theme.SnackOrderingTheme

class Page6 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SnackOrderingTheme {
                // A surface container using the 'background' color from the theme

                FinalView6(this)

            }
        }
    }
}

@Composable
fun TopPart6(context: Context) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffeceef0)), Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = " ",modifier= Modifier.size(30.dp).clickable {
                val intent = Intent(context, Home::class.java)
                context.startActivity(intent)
            }
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            androidx.compose.material.Text(text = "Thali palace", style = androidx.compose.material.MaterialTheme.typography.subtitle1, color = Color.Black)
            Row {

                androidx.compose.material.Text(text = "Location" , color = Color.Black)
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
fun PopularFood6(
    @DrawableRes drawable: Int,
    @StringRes text1: Int,



    context: Context
) {
    val t =stringResource(id = text1)
    androidx.compose.material3.Card(
        modifier = Modifier
            .padding(top=2.dp, bottom = 2.dp, start = 6.dp)
            .fillMaxSize()

    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(20.dp)
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
                    .size(width = 280.dp, height = 100.dp)
                    .clickable { }) {
                    Card(
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(2.dp, color = Color.Magenta),
                        modifier = Modifier
                            .size(100.dp)
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

                        androidx.compose.material.Text(
                            text = t,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        androidx.compose.material.Text(text ="" , color = Color.Black)

                    }
                    Card(
                        shape = CircleShape, border = BorderStroke(2.dp, color = Color.Magenta),
                        modifier = Modifier
                            .size(90.dp)
                            .padding(30.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.addi),
                            contentDescription = " ",modifier= Modifier.clickable {
                                val intent=Intent(context, TargetActivity::class.java)

                                startActivity(context,intent,null)

                            }
                        )

                    }
                }

            }





        }
    }
}


/**
 * Returns string representation of the [Triple] including its [first], [second] and [third] values.
 */




private val FoodList1 = listOf(
    R.drawable.veg_thali to R.string.Vegthali,
    R.drawable.non_veg_thali to R.string.Nonvegthali,
    R.drawable.seafood_thali to R.string.seafoodthali,


    ).map { DrawableStringTriple6(it.first,it.second) }

private data class DrawableStringTriple6(
    @DrawableRes val drawable:  Int,
    @StringRes val text1: Int,



    )



@Composable
fun App6(context: Context) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffeceef0))
            .padding(10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        androidx.compose.material.Surface(modifier = Modifier, elevation = 5.dp) {
            TopPart6(context)
        }


        Spacer(modifier = Modifier.padding(10.dp))
        Row(modifier = Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
            androidx.compose.material.Text(text = "Menu", style = androidx.compose.material.MaterialTheme.typography.h5, color = Color.Black)

        }

        PopularFoodColumn6(context) // <- call the function with parentheses
    }
}




@Composable
fun PopularFoodColumn6(context: Context) {

    LazyColumn(
        modifier = Modifier.fillMaxSize(),

        content = {
            items(FoodList1) { item ->
                PopularFood(context = context,drawable = item.drawable, text1 = item.text1)
                abstract class Context
            }


        },
        verticalArrangement = Arrangement.spacedBy(16.dp))
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FinalView6(Page6: Page6) {
    SnackOrderingTheme {
        Scaffold() {

            val context = LocalContext.current
            App6(context)
        }
    }
}