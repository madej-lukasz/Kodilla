package com.kodilla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class BlackJack extends Application {

    private Image imageback = new Image("file:table.png");
    private Image card = new Image("file:resources/Cards/2_of_clubs.png");
    private FlowPane cards = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(200, 200, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView img = new ImageView(card);
        cards.getChildren().add(img);

        grid.add(cards, 0, 0, 3, 1);

        Scene scene = new Scene(grid, 800, 400, Color.BLACK);


        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}