package com.takusemba.jethub.developer

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.compose.Recomposer
import androidx.fragment.app.Fragment
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.ContentGravity
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxHeight
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextAlign
import androidx.ui.unit.dp
import com.takusemba.jethub.compose.JethubTheme

class DeveloperFragment : Fragment(R.layout.fragment_developer) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    (view as ViewGroup).setContent(Recomposer.current()) {
      JethubTheme {
        Column(
          modifier = Modifier.fillMaxWidth().fillMaxHeight(),
          verticalArrangement = Arrangement.Center,
          horizontalGravity = Alignment.CenterHorizontally
        ) {
          Box(
            gravity = ContentGravity.Center
          ) {
            Text(
              text = "Developer Fragment",
              textAlign = TextAlign.Center,
              fontWeight= FontWeight.Bold,
              modifier = Modifier.padding(22.dp)
            )
            Text(
              text = "This screen is under development...",
              textAlign = TextAlign.Center,
              modifier = Modifier.padding(16.dp)
            )
          }
        }
      }
    }
  }
}