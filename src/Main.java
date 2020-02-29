

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.window = primaryStage;

        //label creation and styling

        Label currentButton = new Label("");

        currentButton.getStyleClass().add("text");
        //button def

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");
        button1.getStyleClass().add("button");

        //Create Event Handlers

        Handler HandlerBtn1 = new Handler("Button 1", currentButton);
        Handler HandlerBtn2 = new Handler("Button 2", currentButton);
        Handler HandlerBtn3 = new Handler("Button 3", currentButton);
        Handler HandlerBtn4 = new Handler("Button 4", currentButton);
        Handler HandlerBtn5 = new Handler("Button 5", currentButton);
        Handler HandlerBtn6 = new Handler("Button 6", currentButton);

        //Apply Event Handlers

        button1.setOnAction(HandlerBtn1);
        button2.setOnAction(HandlerBtn2);
        button3.setOnAction(HandlerBtn3);
        button4.setOnAction(HandlerBtn4);
        button5.setOnAction(HandlerBtn5);
        button6.setOnAction(HandlerBtn6);

        //button styling

        HBox firstRow = new HBox(10 );
        HBox secondRow = new HBox(10 );
        HBox thirdRow = new HBox(10 );
        HBox forthRow = new HBox(10 );
        firstRow.getStyleClass().addAll("row", "apples");
        secondRow.getStyleClass().add("row");
        thirdRow.getStyleClass().add("row");
        forthRow.getStyleClass().add("row");

        //making layout

        firstRow.getChildren().addAll(new Node[]{button1, button2});
        secondRow.getChildren().addAll(new Node[]{button3, button4});
        thirdRow.getChildren().addAll(new Node[]{button5, button6});
        forthRow.getChildren().add(currentButton);

        //Creating and styling main layout

        VBox mainDisplay = new VBox(10);
        mainDisplay.getStyleClass().addAll("mainDisplay", "background");

        //adding sub-layout to main layout

        mainDisplay.getChildren().addAll(new Node[]{firstRow, secondRow, thirdRow, forthRow});

        //making scene

        Scene scene1 = new Scene(mainDisplay, 400, 400);

        //importing css

        scene1.getStylesheets().add("Scene.css");

        window.setScene(scene1);
        window.setTitle("Lab 3A");
        window.show();

    }
}