package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sample.controllers.MainMenuController;

public class Main extends Application {
    public static Parent root;
    public static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        root = FXMLLoader.load(getClass().getResource("fxml/mainMenu.fxml"));
        primaryStage.setTitle("Шахматы");
        scene = new Scene(root, 640, 480);
        primaryStage.setWidth(640);
        primaryStage.setHeight(480);
        primaryStage.setMinWidth(640);
        primaryStage.setMinHeight(480);
        scene.getStylesheets().addAll("sample/css/styles.css");
        primaryStage.setScene(scene);
        primaryStage.show();

        MainMenuController.stage = primaryStage;

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                MainMenuController.quit();
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}