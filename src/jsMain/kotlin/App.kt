import components.PostItem
import csstype.px
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div

val App = FC<Props> {
    div {
        css {
            width = 800.px
        }
        PostItem()
        PostItem()
        PostItem()
        PostItem()
    }
}