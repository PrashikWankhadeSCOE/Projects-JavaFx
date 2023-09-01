import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPage extends Application{
    static int count = 0;
    public static void main(String [] args){
        launch(args);    
    }
    public void start(Stage primaryStage){
        primaryStage.setTitle("Welcome to Login Page By Prashik");
        primaryStage.show();

        GridPane grid  = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25 , 25, 25, 25));

        Scene scene = new Scene(grid,500,450);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Welcome Please Login");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle,0,0,2,1);

        Label userName = new Label("User Name :");
        grid.add(userName,0,1);

        TextField userField = new TextField();
        grid.add(userField,1,1);

        Label pass = new Label("Password :");
        grid.add(pass, 0, 2);

        PasswordField pBox = new PasswordField();
        grid.add(pBox, 1, 2);

        Button btn = new Button("Sign In");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,4);

        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);

        btn.setOnAction( new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                actiontarget.setFill(Color.FIREBRICK);
                count++;
                actiontarget.setText("Thankyou For pressing the button :-) "+ count);
            }
        });
    }
}