package MonopolyRPG;

import MonopolyRPG.Controller.GameModePage;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
    private static MusicList musicList;
    public static void main(String[] args) {
        musicList = new MusicList();
        musicList.play();
        GameModePage gameModePage=  new GameModePage();
        gameModePage.start();

    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
