package io.behzod.downloader

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material.icons.filled.TrackChanges
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.behzod.uicomponents.TopButton
import io.behzod.uicomponents.UrlField

@Composable
fun Downloader(
  modifier: Modifier = Modifier
) {
  Box(
    modifier = modifier
      .fillMaxSize()
      .padding(16.dp)
  ) {

    Column(modifier = modifier.fillMaxSize()) {
      Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
      ) {
        TopButton(imageVector = Icons.Default.TrackChanges)
        TopButton(imageVector = Icons.Default.Cloud)

      }

      UrlField(
        modifier = modifier.padding(top = 24.dp),
        url = "",
        onValueChanged = {},
        onDone = {}
      )
    }

  }

}

@Preview
@Composable
fun DownloaderPreview() {
  Downloader()
}
