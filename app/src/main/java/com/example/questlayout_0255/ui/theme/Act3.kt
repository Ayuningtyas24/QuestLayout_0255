package com.example.questlayout_0255.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))

        // Komponen berikutnya akan ditambahkan di tahap selanjutnya...
    }
    Card(
        modifier = Modifier
            .fillMaxWidth(fraction = 1f)
            .padding(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.card_0_bg)
        )
    ) {
        // Konten di dalam Card akan ditambahkan selanjutnya...
    }
}