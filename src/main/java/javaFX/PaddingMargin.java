package javaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by user on 2017-03-24.
 */
public class PaddingMargin extends Application {
    @Override
    public void start(Stage primaryStage){
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(50,10,10,50));
        Button button = new Button();
        button.setPrefSize(100,100);
        //hBox.setMargin(button,new Insets(10,10,50,50));

        hBox.getChildren().add(button);

        Scene scene = new Scene(hBox);
        primaryStage.setTitle("패딩마진");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[]args){
        launch(args);
    }
}
