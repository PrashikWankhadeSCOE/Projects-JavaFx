import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AreYouIdiot extends Application{

    void popup(Stage primaryStage){
        Label label = new Label("Thanks for accepting");
        VBox pane = new VBox();
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 500, 400);
        
        pane.getChildren().add(label);
        primaryStage.setTitle("Thanks for accepting");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        
        Label label = new Label("Are you idiot");

        Button yes = new Button("Yes");

        yes.setOnAction(event -> {
            popup(primaryStage);
        });

        Button no = new Button("No");
        
        no.setOnMouseEntered(event -> {
            // Move the "No" button to a random location within the scene
            Random random = new Random();
            double newX = random.nextDouble() * (pane.getWidth() - no.getWidth());
            double newY = random.nextDouble() * (pane.getHeight() - no.getHeight());
            no.setLayoutX(newX);
            no.setLayoutY(newY);
        });

        pane.getChildren().addAll(label, yes, no);
        Scene scene = new Scene(pane, 500, 400);

        primaryStage.setTitle("Are you idiot ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}