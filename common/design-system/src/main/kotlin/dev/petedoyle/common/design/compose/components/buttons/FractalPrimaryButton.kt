/*
 * Copyright (C) 2022 Pete Doyle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.petedoyle.common.design.compose.components.buttons

import android.content.res.Configuration
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.petedoyle.common.design.compose.theme.FractalTheme

@Composable
fun FractalPrimaryButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    content: @Composable RowScope.() -> Unit,
) {
    Button(
        elevation = ButtonDefaults.elevation(0.dp, 0.dp, 0.dp, 0.dp, 0.dp),
        onClick = { onClick() },
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = FractalTheme.colors.primary_primary.value,
            contentColor = FractalTheme.colors.onprimary_onprimary.value,
            disabledBackgroundColor = FractalTheme.colors.primary_primarydisabled.value,
            disabledContentColor = FractalTheme.colors.onprimary_onprimarydisabled.value,
        ),
        modifier = modifier.defaultMinSize(minHeight = 48.dp),
        shape = FractalTheme.shapes.borderRounded,
    ) {
        content()
    }
}

@Preview(name = "Light", uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    backgroundColor = 0xff000000,
)
@Composable
private fun Preview() {
    FractalTheme {
        FractalPrimaryButton(onClick = {}) {
            Text(
                text = "Primary",
                style = FractalTheme.typography.label1,
                color = FractalTheme.colors.onprimary_onprimary.value,
            )
        }
    }
}
