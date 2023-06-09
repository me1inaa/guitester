package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;


public class FoodDemo extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //instantiate a VBox root node
        VBox root = new VBox();

        //instantiate a Food object
        Food food = new Food();

        root.getChildren().add(new FoodPane(food));
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    // static void setRoot(String fxml) throws IOException {
    //     scene.setRoot(loadFXML(fxml));
    // }

    // private static Parent loadFXML(String fxml) throws IOException {
    //     FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    //     return fxmlLoader.load();
    // }

    public static void main(String[] args) {
        launch();
    }

}