package com.example.snackordering

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.snackordering.ui.theme.SnackOrderingTheme


class Cart : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SnackOrderingTheme {
                androidx.compose.material.Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = androidx.compose.material.MaterialTheme.colors.background
                ) {
                    Image(
                        painterResource(
                            id = R.drawable.abg
                        ),
                        contentDescription = "",
                        alpha = 0.3F,
                        contentScale = ContentScale.FillHeight,

                        )

                    val mContext = LocalContext.current
                    val name1 = intent.getStringExtra("data")
                    val name11 = intent.getStringExtra("data1")

                    val res = name1?.toInt()?.times(100)
                    // A surface container using the 'background' color from the theme
                    

                    Column(

                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {


                        Row(
                            modifier = Modifier.padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "OrderSummary", fontSize = 28.sp,color = Color.White, fontWeight = FontWeight.ExtraBold)
                        }
                        Spacer(modifier = Modifier.height(16.dp))



                        Row(
                            modifier = Modifier.fillMaxWidth().padding(20.dp),
                            Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "Total Quantity ",color = Color.White, fontWeight = FontWeight.ExtraBold)


                            Text(
                                name1 ?: "No Data",color = Color.White, fontWeight = FontWeight.ExtraBold
                            )
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth().padding(20.dp),
                            Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "Delivery location",color = Color.White, fontWeight = FontWeight.ExtraBold)
                            Text(
                                name11 ?: "No Data",color = Color.White, fontWeight = FontWeight.ExtraBold
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(20.dp),
                            Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "Total payable amount",color = Color.White, fontWeight = FontWeight.ExtraBold)
                            Text(
                                text = "Rs. " + res,color = Color.White, fontWeight = FontWeight.ExtraBold
                            )
                        }
                        Button(onClick = {

                                Toast.makeText(mContext, "Order Placed Successfully", Toast.LENGTH_SHORT).show()}
                        ,
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White))
                        {
                            Text(text = "Order Place", color = Color.Black)
                        }

                        }

                    }
                }

            }
        }
    }




