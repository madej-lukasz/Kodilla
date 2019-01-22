import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Draughts extends Application {

    private Image imageback = new Image("board.png");
    private FlowPane brownCounters = new FlowPane();



    private void addCounters(FlowPane brownCounters){
        BrownCounter counter = new BrownCounter();
        ImageView img = new ImageView(counter.getBrownCounter());
        brownCounters.getChildren().add(img);

    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(600, 600, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setBackground(background);
        grid.setAlignment(Pos.CENTER);

        Scene scene = new Scene(grid, 660, 660, Color.BLACK);

        ColumnConstraints column1 = new ColumnConstraints(85);
        ColumnConstraints column2 = new ColumnConstraints(85);
        ColumnConstraints column3 = new ColumnConstraints(85);
        ColumnConstraints column4 = new ColumnConstraints(85);
        ColumnConstraints column5 = new ColumnConstraints(85);
        ColumnConstraints column6 = new ColumnConstraints(85);
        ColumnConstraints column7 = new ColumnConstraints(85);
        ColumnConstraints column8 = new ColumnConstraints(85);
        grid.getColumnConstraints().addAll(column1,column2,column3,column4,column5,column6,column7,column8);

        RowConstraints row1 = new RowConstraints(85);
        RowConstraints row2 = new RowConstraints(85);
        RowConstraints row3 = new RowConstraints(85);
        RowConstraints row4 = new RowConstraints(85);
        RowConstraints row5 = new RowConstraints(85);
        RowConstraints row6 = new RowConstraints(85);
        RowConstraints row7 = new RowConstraints(85);
        RowConstraints row8 = new RowConstraints(85);
        grid.getRowConstraints().addAll(row1,row2,row3,row4,row5,row6,row7,row8);

        addCounters(brownCounters);
        grid.add(brownCounters, 0, 0);





        primaryStage.setResizable(false);
        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
