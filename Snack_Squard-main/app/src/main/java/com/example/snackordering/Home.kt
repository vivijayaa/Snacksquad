package com.example.snackordering

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme

import androidx.compose.material3.Card

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.snackordering.ui.theme.SnackOrderingTheme

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SnackOrderingTheme {
                androidx.compose.material.Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // A surface container using the 'background' color from the theme

                    home(this)
                }

            }
        }
    }
}

@Composable
fun home(context: Context) {
    Image(painterResource(id = R.drawable.abg
    ), contentDescription = "",
        alpha =0.3F,
        contentScale = ContentScale.FillHeight,

        )
    val intent =Intent(context,Home::class.java)
    val name1 = intent.getStringExtra("details")

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()

            .verticalScroll(rememberScrollState())

    )
    {
        Row()
        {
            Card(
                shape = CircleShape, border = BorderStroke(2.dp, color = Color.Magenta),
                modifier = Modifier
                    .size(50.dp)
                    .padding(1.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.imgi), contentDescription = " ")
            }

            Text(
                text = "Hello ", color = Color.White, fontWeight = FontWeight.ExtraBold,fontSize = 18.sp,
                modifier = Modifier.padding(horizontal = 5.dp, vertical = 25.dp)
            )
            Text(
                name1 ?: " ",color = Color.White, fontWeight = FontWeight.ExtraBold
            ,  modifier = Modifier.padding(horizontal = 5.dp, vertical = 25.dp)
            )


        }



        Text(
            text = "-----------------------------Restaurent list---------------------------- ",
            color = Color.White, fontWeight = FontWeight.ExtraBold
        )
        Card(modifier= Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(5.dp))
            .padding(16.dp)
        )
        {
            Row(modifier= Modifier

                .size(width = 280.dp, height = 100.dp)
                .clickable {context.startActivity(
                    Intent(
                        context,
                        MainPage::class.java
                    ) )} )
            {
                Card(shape= CircleShape, border = BorderStroke(2.dp,color= Color.Magenta),
                    modifier= Modifier
                        .size(90.dp)
                        .padding(5.dp)) {
                    Image(painter = painterResource(id = R.drawable.order), contentDescription =" " )

                }
                Column(modifier = Modifier
                    .fillMaxHeight()
                    .padding(6.dp),
                    verticalArrangement = Arrangement.aligned(Alignment.CenterVertically)
                ) {
                    Text(text = "Mandakini", fontWeight = FontWeight.Bold,color= Color.Black)

                }
            }

        }
        Card(modifier= Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(5.dp))

            .padding(16.dp)
        )
        {
            Row(modifier= Modifier

                .size(width = 280.dp, height = 100.dp)
                .clickable {context.startActivity(
                    Intent(
                        context,
                        Mainpage2::class.java
                    ) )} )
            {
                Card(shape= CircleShape, border = BorderStroke(2.dp,color= Color.Magenta),
                    modifier= Modifier
                        .size(90.dp)
                        .padding(5.dp)) {
                    Image(painter = painterResource(id = R.drawable.order), contentDescription =" " )

                }
                Column(modifier = Modifier
                    .fillMaxHeight()
                    .padding(6.dp),
                    verticalArrangement = Arrangement.aligned(Alignment.CenterVertically)
                ) {
                    Text(text = "sweettooth", fontWeight = FontWeight.Bold,color= Color.Black)

                }
            }

        }
        Card(modifier= Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(5.dp))

            .padding(16.dp)
        )
        {
            Row(modifier= Modifier

                .size(width = 280.dp, height = 100.dp)
                .clickable {context.startActivity(
                    Intent(
                        context,
                        page3::class.java
                    ) )} )
            {
                Card(shape= CircleShape, border = BorderStroke(2.dp,color= Color.Magenta),
                    modifier= Modifier
                        .size(90.dp)
                        .padding(5.dp)) {
                    Image(painter = painterResource(id = R.drawable.order), contentDescription =" " )

                }
                Column(modifier = Modifier
                    .fillMaxHeight()
                    .padding(6.dp),
                    verticalArrangement = Arrangement.aligned(Alignment.CenterVertically)
                ) {
                    Text(text = "ClassicRider cafe", fontWeight = FontWeight.Bold,color= Color.Black)

                }
            }

        }
        Card(modifier= Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(5.dp))

            .padding(16.dp)
        )
        {
            Row(modifier= Modifier

                .size(width = 280.dp, height = 100.dp)
                .clickable {context.startActivity(
                    Intent(
                        context,
                        Page4::class.java
                    ) )} )
            {
                Card(shape= CircleShape, border = BorderStroke(2.dp,color= Color.Magenta),
                    modifier= Modifier
                        .size(90.dp)
                        .padding(5.dp)) {
                    Image(painter = painterResource(id = R.drawable.order), contentDescription =" " )

                }
                Column(modifier = Modifier
                    .fillMaxHeight()
                    .padding(6.dp),
                    verticalArrangement = Arrangement.aligned(Alignment.CenterVertically)
                ) {
                    Text(text = "Juice shop", fontWeight = FontWeight.Bold,color= Color.Black)

                }
            }

        }
        Card(modifier= Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(5.dp))

            .padding(16.dp)
        )
        {
            Row(modifier= Modifier

                .size(width = 280.dp, height = 100.dp)
                .clickable {context.startActivity(
                    Intent(
                        context,
                        Page5::class.java
                    ) )} )
            {
                Card(shape= CircleShape, border = BorderStroke(2.dp,color= Color.Magenta),
                    modifier= Modifier
                        .size(90.dp)
                        .padding(5.dp)) {
                    Image(painter = painterResource(id = R.drawable.order), contentDescription =" " )

                }
                Column(modifier = Modifier
                    .fillMaxHeight()
                    .padding(6.dp),
                    verticalArrangement = Arrangement.aligned(Alignment.CenterVertically)
                ) {
                    Text(text = "Waffel Shop", fontWeight = FontWeight.Bold,color= Color.Black)

                }
            }

        }
        Card(modifier= Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(5.dp))

            .padding(16.dp)
        )
        {
            Row(modifier= Modifier

                .size(width = 280.dp, height = 100.dp)
                .clickable {context.startActivity(
                    Intent(
                        context,
                        Page6::class.java
                    ) )} )
            {
                Card(shape= CircleShape, border = BorderStroke(2.dp,color= Color.Magenta),
                    modifier= Modifier
                        .size(90.dp)
                        .padding(5.dp)) {
                    Image(painter = painterResource(id = R.drawable.order), contentDescription =" " )

                }
                Column(modifier = Modifier
                    .fillMaxHeight()
                    .padding(6.dp),
                    verticalArrangement = Arrangement.aligned(Alignment.CenterVertically)
                ) {
                    Text(text = "Thali place", fontWeight = FontWeight.Bold,color= Color.Black)

                }
            }

        }
    }
}
private fun startMainPage(context: Context) {
    val intent = Intent(context, MainPage::class.java)
    ContextCompat.startActivity(context, intent, null)
}