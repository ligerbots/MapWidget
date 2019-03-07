package org.ligerbots.MapPlugin;

import java.util.List;

import com.google.common.collect.ImmutableList;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

import org.ligerbots.MapPlugin.DataTypes.FieldPosition;
import org.ligerbots.MapPlugin.Widgets.*;
/**
 * Hello world!
 *
 */
@Description(group = "org.ligerbots", 
    name = "MapPlugin", 
    summary = "Displays Robot position in real time.", 
    version = "0.0.8")
public class App extends Plugin {

    @Override
    public List<ComponentType> getComponents() {
        return ImmutableList.of(
            WidgetType.forAnnotatedWidget(MapWidget.class)
        );
    }
}