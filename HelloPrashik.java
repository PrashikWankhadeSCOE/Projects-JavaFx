
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloPrashik extends Application{
    public static void main(String [] args){
        launch(args);
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("HelloPrashik");
        Button btn = new Button();
        Button btn2 = new Button();
        btn.setText("Click to see Joke");
        btn2.setText("Click to see quote");

        Text outputText = new Text();
        outputText.setVisible(false);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event){
                outputText.setText("What did one snowman say to the other? \n Do you smell carrots?");
                outputText.setVisible(true);
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                outputText.setText("The way to get started is to quit talking and begin doing");
                outputText.setVisible(true);
            }
        });

        /*StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
        */

        GridPane root = new GridPane();
        root.add(btn,5,5);
        root.add(btn2,5,6);
        root.add(outputText,5,7);

        Scene scene = new Scene(root,900,700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}