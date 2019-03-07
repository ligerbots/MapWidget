package org.ligerbots.MapPlugin.DataTypes;

import java.util.HashMap;
import java.util.Map;

import edu.wpi.first.shuffleboard.api.data.ComplexData;

public final class FieldPosition extends ComplexData<FieldPosition> {
    private final double x;
    private final double y;
    
    public FieldPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public FieldPosition() {
        this.x = 0.0;
        this.y = 0.0;
    }
    @Override
    public Map<String, Object> asMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("x", this.x);
        map.put("y", this.y);
        return map;
    }

    public double getX() {
      return x;
    }
    
    public double getY() {
       return y;
    }
}