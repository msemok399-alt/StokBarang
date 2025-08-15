
package com.example.setokbarang

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                var count by remember { mutableStateOf(0) }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Text("Aplikasi Setok Barang", style = MaterialTheme.typography.headlineSmall)
                    Spacer(Modifier.height(8.dp))
                    Text("Stok saat ini: $count")
                    Spacer(Modifier.height(8.dp))
                    Row {
                        Button(onClick = { count++ }) { Text("Stok Masuk") }
                        Spacer(Modifier.width(8.dp))
                        Button(onClick = { if (count > 0) count-- }) { Text("Stok Keluar") }
                    }
                }
            }
        }
    }
}
