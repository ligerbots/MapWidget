package org.ligerbots.MapPlugin;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * Widget
 */
@Description(dataTypes = { Boolean.class }, name = "MapWidget")
public class MapWidget extends SimpleAnnotatedWidget {

    @Override
    public Pane getView() {
        Text t = new Text();
        t.setText("Hi how are you");

        Pane root = new Pane();
        root.getChildren().addAll(t);
        root.setPrefSize(500, 500);
        return root;
    }
}