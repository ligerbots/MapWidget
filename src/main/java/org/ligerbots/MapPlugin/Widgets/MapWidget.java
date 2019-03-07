package org.ligerbots.MapPlugin.Widgets;

import org.ligerbots.MapPlugin.DataTypes.FieldPosition;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 * Widget
 */
@Description(dataTypes = { Boolean.class, FieldPosition.class }, name = "MapWidget")
public class MapWidget extends SimpleAnnotatedWidget {
    protected Circle cache_point;

    public void UpdatePosition(FieldPosition new_position) {
        if (cache_point != null) { cache_point.setVisible(false); }
        Circle current_point = new Circle();
        current_point.setRadius(5);
        current_point.setCenterX(new_position.getX());
        current_point.setCenterY(new_position.getY());
        cache_point = current_point;
    }

    @Override
    public Pane getView() {
        Image map = new Image("file:///C:/map.png", 500, 250, true, true);
        ImageView image_frame = new ImageView(map);
    
        
        Text t = new Text(50, 50, System.getProperty("user.dir"));

        Pane root = new Pane();
        root.getChildren().addAll(t, image_frame);
        root.setPrefSize(map.getWidth(), map.getHeight());
        return root;
    }
}