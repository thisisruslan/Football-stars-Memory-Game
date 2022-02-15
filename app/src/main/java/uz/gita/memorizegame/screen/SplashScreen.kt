package uz.gita.memorizegame.screen

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.gita.memorizegame.R

class SplashScreen : Fragment(R.layout.screen_splash) {
    private lateinit var handler: Handler
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            findNavController().navigate(R.id.action_splashScreen_to_menuScreen)
        }, 2000)
    }

    override fun onPause() {
        handler.removeCallbacksAndMessages(null)
        super.onPause()
    }
}