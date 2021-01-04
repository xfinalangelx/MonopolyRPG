package MonopolyRPG;

import MonopolyRPG.Controller.GameModePage;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GameModePage gameModePage=  new GameModePage();
        gameModePage.start();
        primaryStage.close();
    }
}
