package es.katarem.chessfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    @Override public void start(Stage primaryStage) throws Exception {
        View view = new View();
        primaryStage.setTitle("ChessFX");
        primaryStage.setScene(new Scene(view,900,900));
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
