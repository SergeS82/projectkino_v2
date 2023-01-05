package com.amsdevelops.filmssearch

import android.animation.Animator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import com.amsdevelops.filmssearch.databinding.FragmentSplashScreenBinding
import kotlinx.android.synthetic.main.fragment_splash_screen.view.*

class SplashScreen : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var b: FragmentSplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b = FragmentSplashScreenBinding.bind(requireView())
        b.lottieAnim.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator) {
            }
            override fun onAnimationEnd(animation: Animator) {
                requireActivity().supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_placeholder, HomeFragment())
                    .commit()
            }
            override fun onAnimationCancel(animation: Animator) {
            }
            override fun onAnimationRepeat(animation: Animator) {
            }
        })
    }

}