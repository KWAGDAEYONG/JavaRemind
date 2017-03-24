package javaFX;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by user on 2017-03-24.
 */
public class HBoxApp extends Application {
    @Override
    public void start(Stage primaryStage){
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);

        TextField textField = new TextField();
        textField.setPrefWidth(200);

        Button button = new Button();
        button.setText("확인");

        ObservableList list = hBox.getChildren();
        list.add(textField);
        list.add(button);

        Scene scene = new Scene(hBox);

        primaryStage.setTitle("hbox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[]args){
        launch(args);
    }
}
