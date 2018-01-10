package javafxpr;
import java.awt.Button;

//import javafx.application.Application;
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    //Override the start method in the Application class
    @Override
    public void start(Stage primaryStage) {
        // Set the stage title
        primaryStage.setTitle("MyJavaFX");
        // Create a button and place it in the scene
        Button btn = new Button("Hello World");
        Scene scene = new Scene(btn, 200, 250);
        // Place the scene in the stage
        primaryStage.setScene(scene);
        // Display the stage
        primaryStage.show();
    }
}