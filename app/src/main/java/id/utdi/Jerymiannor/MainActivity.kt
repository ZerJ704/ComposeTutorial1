package id.utdi.Jerymiannor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import id.utdi.Jerymiannor.ui.theme.ComposeTutorial1Theme
import androidx.compose.foundation.layout.Column
//Tahap 2
//Ditambahkan kode baris 14 untuk membuat kolom pada teks yang ditampilkan

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}
data class Message(val author: String, val body: String)
//Tahap 1
// Add text element berada pada baris ke-19 dengan namenya diubah dari hello world menjadi android

//Tahap 2
//Setcontent diubah sehingga menampilkan lebih dari satu teks

@Composable
fun MessageCard(msg: Message) {
    Column {
        Text(text = msg.author)
        Text(text = msg.body)
    }
}
//Tahap 1
//Define composable function ditambahkan dengan anotasi @Composable
//Lalu MessageCard di panggil dengan function -> fun MessageCard
//dan didalamnya terdapat message text "Hello $name!" untuk menampilkan pesan
//Hello Android! atau Hello ditambah variabel $name pada MainActivity

//Tahap 2
//text pada fun MessageCard di ubah dan ditambahkan enjadi dua teks
@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
    )
}
//Tahap 1
//Untuk melihat fungsi composable di android studio digunakan anotasi @Preview
//Lalu untuk melihat preview yaitu dengan mengklik tombol split dibagian kanan atas
//Hasil yang akan tampil yaitu Hello Android!

//Tahap 2
//Message pada msg diubah dan ditambahkan juga menjadi dua teks