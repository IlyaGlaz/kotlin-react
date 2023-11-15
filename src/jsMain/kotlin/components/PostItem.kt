package components

import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.strong

val PostItem = FC<Props> {
    div {
        css {
            display = Display.flex
            padding = 15.px
            border = Border(2.px, LineStyle.solid, NamedColor.teal)
            marginTop = 15.px
            justifyContent = JustifyContent.spaceBetween
            alignItems = AlignItems.center
        }
        div {
            strong { +"1. Kotlin" }
            div {
                +"Kotlin is best"
            }
        }
        div {
            button {
                +"Удалить"
            }
        }
    }
}