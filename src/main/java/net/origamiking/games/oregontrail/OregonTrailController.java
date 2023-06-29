package net.origamiking.games.oregontrail;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class OregonTrailController {
    @FXML
    private TextArea textArea;

    public void initialize() {
//        textArea.setFont(new javafx.scene.text.Font("Times New Roman", 16));
    }

    public void appendTextln(String text) {
        textArea.appendText(" " + text + "\n");
        textArea.positionCaret(textArea.getText().length());
    }

    public void appendText(String text) {
        textArea.appendText(text);
        textArea.positionCaret(textArea.getText().length());
    }

    public void clearWindow() {
        textArea.clear();
    }
}
