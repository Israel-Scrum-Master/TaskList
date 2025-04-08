import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encuentra la vista LottieAnimationView por su ID
        val lottieAnimationView = findViewById<LottieAnimationView>(R.id.lottie_animation_view)

        // Reproducir la animación manualmente (si no está en autoPlay)
        // lottieAnimationView.playAnimation()  // Esto es redundante si ya está en autoPlay
    }
}
