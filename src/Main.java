import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Butchokoi on 1/17/2016.
 */
public class Main extends Application{

    Stage window;
    Scene scene, scene1, scene2;
    Button button;

    public static  void  main(String[] args){
        launch(args);
    }

    //Handle checkbox options
    private void handleOptions(CheckBox box1, CheckBox box2){
        String message = "Users order:\n";

        if(box1.isSelected()){
            message+="bacon";
        }
        if(box2.isSelected()){
            message+="Tuna";
        }

        System.out.println(message);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFx");

        //checkboxes

        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);

        Button button2 = new Button("Order Now!");
        button2.setOnAction(e->handleOptions(box1,box2));



        TextField nameInput = new TextField();
        button = new Button("Click Me");
        button.setOnAction(e -> {
            isInt(nameInput, nameInput.getText());
        });

        //layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput,button,box1,box2,button2);

        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();

        /*
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        //new label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name input
        TextField nameInput = new TextField("Bucky");
        GridPane.setConstraints(nameInput,1,0);

        //new label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput,1,1);


        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid,300,200);
        window.setScene(scene);
        window.show();
        */

        /* -- embedding windows
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
        */
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

    private boolean isInt(TextField input, String message){
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is: " + age);
            return  true;
        }catch (NumberFormatException e){
            System.out.println("Error: " + message + " is not a number");
            return  false;
        }
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
