package com.example.jetpacknav3

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.example.jetpacknav3.presentation.screen0.ScreenZeroContent
import com.example.jetpacknav3.presentation.screen0.ScreenZeroState
import com.example.jetpacknav3.presentation.screen1.ScreenOneContent
import com.example.jetpacknav3.presentation.screen1.ScreenOneState
import com.example.jetpacknav3.presentation.screen2.ScreenTwoContent
import com.example.jetpacknav3.presentation.screen2.ScreenTwoState
import com.example.jetpacknav3.presentation.unknown.UnknownContent

@Composable
fun MainNav(modifier: Modifier = Modifier) {
    val backstack = remember { mutableStateListOf<Any>(ScreenZeroState) }
    NavDisplay(
        modifier = modifier,
        backStack = backstack,
        onBack = {
            backstack.removeLastOrNull()
        },
        entryProvider = entryProvider {
            entry<ScreenZeroState> {
                ScreenZeroContent(
                    gotoScreenOne = {
                        //TODO
                    },
                    gotoScreenTwo = {
                        //TODO
                    },
                    gotoUnknown = {
                        //TODO
                    }
                )
            }
        }
    )
}