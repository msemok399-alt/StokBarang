
package com.example.setok
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
class MainActivity: ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MaterialTheme {
        var stok by remember { mutableStateOf(0) }
        Column(Modifier.fillMaxSize().padding(16.dp)) {
          Text("Setok Barang")
          Spacer(Modifier.height(8.dp))
          Text("Stok: $stok")
          Spacer(Modifier.height(8.dp))
          Row {
            Button(onClick = { stok++ }) { Text("Masuk") }
            Spacer(Modifier.width(8.dp))
            Button(onClick = { if (stok>0) stok-- }) { Text("Keluar") }
          }
        }
      }
    }
  }
}
