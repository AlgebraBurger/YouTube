import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Butchokoi on 1/17/2016.
 */
public class Main extends Application{

    Stage window;
    Scene scene1, scene2;


    public static  void  main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Title here");

        HBox topMenu = new HBox();

        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA,buttonB,buttonC);

        VBox leftMenu = new VBox();
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        leftMenu.getChildren().addAll(buttonD,buttonE,buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane,300,250);
        window.setScene(scene);
        window.show();

        /*
        Label label1 = new Label("Welcome to the first scene!");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> {
            window.setScene(scene2);
        });

        //button 3
        Button button3 = new Button("This is for Alert Box");
        button3.setOnAction(e -> AlertBox.display("Title of Window","Wow this is a cool alertBox"));

        //button 4
        Button button4 = new Button("Confim Box");
        button4.setOnAction(e-> {
            boolean result = ConfirmBox.display("Confirm Box Title","Are you sure bro?");
            System.out.println(result);
        });

        window.setOnCloseRequest(e->{
            e.consume();
            closeProgram();
        });

        //button 5
        Button button5 = new Button("Close Application");
        button5.setOnAction(e->{
            closeProgram();
        });

        //Layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1, button3, button4, button5);

        scene1 = new Scene(layout1,200,200);


        //button 2
        Button button2 = new Button("This scence is Button 2");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2,600,200);

        window.setScene(scene1);

        window.show();
        */

    }

    private void closeProgram(){

        Boolean answer = ConfirmBox.display("Title","Are you sure you want to exit?");

        if(answer){
            window.close();
        }

        /*
        System.out.println("File is Saved");
        window.close();
        */
    }
}
