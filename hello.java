
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class hello extends Application {

	@Override
	public void start(Stage primaryStage){
		
		Button btn = new Button();
		btn.setText("Say 'Hellow welcome to page'");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				System.out.println("Hellow Welcome");
				
			}
		});
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root,300,250);
		
		primaryStage.setTitle("Hellow");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
