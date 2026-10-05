package com.example.myprofilee

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// =========================
// WARNA TEMA UNGU
// =========================

val PurpleMain = Color(0xFF6A4C93)
val PurpleDark = Color(0xFF4A3268)
val PurpleLight = Color(0xFFE9DDF5)
val BackgroundColor = Color(0xFFF8F5FA)
val TextDark = Color(0xFF2D2433)
val TextGray = Color(0xFF77717B)

@Composable
fun App() {
    MaterialTheme {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(BackgroundColor)
                .padding(horizontal = 22.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // =========================
            // AVATAR
            // =========================

            Box(
                modifier = Modifier
                    .size(105.dp)
                    .clip(CircleShape)
                    .background(PurpleLight),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "TM",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = PurpleDark
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            // =========================
            // NAMA
            // =========================

            Text(
                text = "TARISA MENOVA",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = TextDark,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Teknik Informatika",
                fontSize = 14.sp,
                color = TextGray
            )

            Spacer(modifier = Modifier.height(20.dp))

            // =========================
            // BIO
            // =========================

            Text(
                text = "Halo! Saya Tarisa, mahasiswa Teknik Informatika " +
                        "yang sedang mempelajari Pengembangan Aplikasi Mobile.",
                fontSize = 13.sp,
                color = TextGray,
                textAlign = TextAlign.Center,
                lineHeight = 20.sp,
                modifier = Modifier.padding(horizontal = 5.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // =========================
            // PROFILE CARD
            // =========================

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 5.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(17.dp),
                    verticalArrangement = Arrangement.spacedBy(15.dp)
                ) {

                    // NIM
                    ProfileItem(
                        icon = "🎓",
                        title = "NIM",
                        value = "124140039"
                    )

                    // EMAIL
                    ProfileItem(
                        icon = "✉",
                        title = "Email",
                        value = "tarisamenova@gmail.com"
                    )

                    // PHONE
                    ProfileItem(
                        icon = "📱",
                        title = "Phone",
                        value = "082289677534"
                    )

                    // LOCATION
                    ProfileItem(
                        icon = "📍",
                        title = "Location",
                        value = "Padang Panjang, Sumatera Barat,\nIndonesia"
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // =========================
            // BUTTON FOLLOW
            // =========================

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = PurpleMain
                )
            ) {
                Text(
                    text = "Follow",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            }
        }
    }
}


// =====================================
// KOMPONEN UNTUK ITEM PROFILE
// =====================================

@Composable
fun ProfileItem(
    icon: String,
    title: String,
    value: String
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        // Kotak icon
        Box(
            modifier = Modifier
                .size(42.dp)
                .clip(RoundedCornerShape(11.dp))
                .background(PurpleLight),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = icon,
                fontSize = 18.sp
            )
        }

        Spacer(modifier = Modifier.width(13.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {

            Text(
                text = title,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = PurpleDark
            )

            Spacer(modifier = Modifier.height(3.dp))

            Text(
                text = value,
                fontSize = 13.sp,
                color = TextDark,
                lineHeight = 18.sp
            )
        }
    }
}