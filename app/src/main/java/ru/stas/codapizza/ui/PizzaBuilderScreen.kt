package ru.stas.codapizza.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.stas.codapizza.R
import ru.stas.codapizza.model.Topping
import ru.stas.codapizza.model.ToppingPlacement

@Preview
@Composable
fun PizzaBuilderScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        ToppingsList(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f, fill = true)

        )
        OrderButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

    }
}
    @Composable
    fun ToppingsList(
        modifier: Modifier = Modifier
    ) {
        LazyColumn(
            modifier = modifier
        ) {
            items(Topping.values()) { topping ->
                ToppingCell(
                    topping = topping,
                    placement = ToppingPlacement.Left,
                    onClickTopping = {
// TODO
                    }
                )
            }
        }
    }

    @Composable
    fun OrderButton(
        modifier: Modifier = Modifier
    ) {
        Button(
            modifier = modifier,
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = stringResource(R.string.place_order_button)
                    .uppercase(java.util.Locale.ROOT)
            )
        }
    }


