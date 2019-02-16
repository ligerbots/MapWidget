package org.ligerbots.MapPlugin;

import javax.swing.ImageIcon;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * Widget
 */
@Description(dataTypes = { Boolean.class }, name = "MapWidget")
public class MapWidget extends SimpleAnnotatedWidget {
    public void UpdatePosition() {
        
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