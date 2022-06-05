package com.example.task_10;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TableView<RightPyramid> table = new TableView<RightPyramid>();

        TableColumn<RightPyramid,Double > EquilateralTriangle= new TableColumn<RightPyramid,Double>("EquilateralTriangle");
        TableColumn<RightPyramid, Double> side= new TableColumn<RightPyramid, Double>("side");
        TableColumn<RightPyramid, Double> height = new TableColumn<RightPyramid, Double>("height");
        TableColumn<RightPyramid, Double> bisector= new TableColumn<RightPyramid, Double>("bisector");
        TableColumn<RightPyramid, Double> perimeter = new TableColumn<RightPyramid, Double>("perimeter");
        TableColumn<RightPyramid, Double> square = new TableColumn<RightPyramid, Double>("square");
        TableColumn<RightPyramid, Double> RightPyramid= new TableColumn<RightPyramid, Double>("RightPyramid");
        TableColumn<RightPyramid, Double> volume = new TableColumn<RightPyramid, Double>("volume");
        TableColumn<RightPyramid, Double> squarePyramid= new TableColumn<RightPyramid, Double>("squarePyramid");
        TableColumn<RightPyramid, Double> apothem= new TableColumn<RightPyramid, Double>("apothem");

        EquilateralTriangle.getColumns().addAll(side, height, bisector ,perimeter,square);
        RightPyramid.getColumns().addAll( apothem,volume,squarePyramid);

        side.setCellValueFactory(new PropertyValueFactory<>("side"));
        height.setCellValueFactory(new PropertyValueFactory<>("height"));
        bisector.setCellValueFactory(new PropertyValueFactory<>("bisector"));
        perimeter.setCellValueFactory(new PropertyValueFactory<>("perimeter"));
        square.setCellValueFactory(new PropertyValueFactory<>("square"));
        volume.setCellValueFactory(new PropertyValueFactory<>("volume"));
        apothem.setCellValueFactory(new PropertyValueFactory<>("apothem"));
        squarePyramid.setCellValueFactory(new PropertyValueFactory<>("squarePyramid"));

        side.setSortType(TableColumn.SortType.DESCENDING);
        ObservableList<RightPyramid> list = getPyramids();
        table.setItems(list);

        table.getColumns().addAll( EquilateralTriangle,RightPyramid);
        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);
        stage.setTitle("TableView (pyramids)");
        Scene scene = new Scene(root, 900, 400);
        stage.setScene(scene);
        stage.show();
    }

    private ObservableList<RightPyramid> getPyramids() {
        Random random = new Random();
        int number_pyramid = 10;
        Pyramids pyramids = new Pyramids();
        for (int i = 0; i < number_pyramid; i++) {
            pyramids.add(new RightPyramid(random.nextInt(5), random.nextInt(5)));
        }
        ObservableList<RightPyramid> list = FXCollections.observableArrayList(pyramids.getPyramids());
        return list;
    }

    public static void main(String[] args) {
        launch();
    }
}