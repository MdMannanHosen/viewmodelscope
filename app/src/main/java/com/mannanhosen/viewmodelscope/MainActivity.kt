package com.mannanhosen.viewmodelscope

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import com.mannanhosen.viewmodelscope.ui.theme.ViewModelScopeTheme

class MainActivity : ComponentActivity() {
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewModelScopeTheme {
                viewModel = ViewModelProvider(this)[MainViewModel::class.java]
            }
        }
    }
}

