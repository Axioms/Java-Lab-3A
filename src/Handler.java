

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class Handler implements EventHandler<ActionEvent> {
    String text;
    Label label1;

    public Handler(String text, Label label1) {
        this.text = text;
        this.label1 = label1;
    }

    @Override
    public void handle(ActionEvent event) {
        label1.setText("You Pressed " + text);
        System.out.println("You Pressed " + text);
    }
}
