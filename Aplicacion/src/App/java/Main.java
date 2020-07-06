package App.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	public static final String VISTA_PRINCIPAL = "/App/resources/fxml/vistaPrincipal.fxml";
    private double x,y;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(Main.VISTA_PRINCIPAL));
        primaryStage.setScene(new Scene(root));

        //set stage bordeless
        primaryStage.initStyle(StageStyle.UNDECORATED);
        //drag it here
        root.setOnMousePressed(event ->{
            x = event.getSceneX();
            y = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getSceneX() - x);
            primaryStage.setY(event.getSceneY() - y);
        });
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
