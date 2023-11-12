package components

import react.FC
import react.Props
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.useState

val Counter = FC<Props> {
    var counter: Int by useState(0)

    div {
        h1 {
            +"$counter"
        }
        button {
            onClick = {
                counter++
            }
            +"Increment"
        }
        button {
            onClick = {
                counter--
            }
            +"Decrement"
        }
    }
}
