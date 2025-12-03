package com.example.shape_painter;

import com.example.shape_painter.factory.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

public class HelloController {

    @FXML
    private Pane canvas;

    @FXML
    private ComboBox<String> shapeSelector;

    private ShapeCreator getCreatorFor(String type) {
        return switch (type) {
            case "Kreis" -> new CircleCreator(canvas);
            case "Rechteck" -> new RectangleCreator(canvas);
            case "Dreieck" -> new TriangleCreator(canvas);
            case "MichaCircle" -> new MichaCircleCreator(canvas);
            default -> null;
        };
    }

    @FXML
    void initialize(){
        shapeSelector.getItems().addAll("Kreis", "Rechteck", "Dreieck","MichaCircle");
    }
    @FXML
     void onShow(ActionEvent actionEvent) {
        String selected = shapeSelector.getValue();
        ShapeCreator creator = getCreatorFor(selected);
        if (creator != null) {
            Shape shape = creator.createShape();
            canvas.getChildren().add(shape);
        }
    }
}
