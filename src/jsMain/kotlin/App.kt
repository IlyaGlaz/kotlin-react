import components.Counter
import react.FC
import react.Props
import react.dom.html.ReactHTML.div

val App = FC<Props> {
    div {
       Counter()
       Counter()
       Counter()
       Counter()
    }
}