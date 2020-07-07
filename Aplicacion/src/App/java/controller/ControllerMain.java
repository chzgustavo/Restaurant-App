package App.java.controller;

import com.jfoenix.controls.JFXButton;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMain extends Controller implements Initializable {


	public static final String ITEM = "/App/resources/fxml/Item.fxml";
	
    @FXML private VBox pnItems = null;
    @FXML private ScrollPane scrollPane = null;
    @FXML private JFXButton btnVisiongeneral;
    @FXML private JFXButton btnOrden;
    @FXML private JFXButton btnClientes;
    @FXML private JFXButton btnMenus;
    @FXML private JFXButton btnPaquetes;
    @FXML private JFXButton btnConfiguracion;
    @FXML private JFXButton btnSalir;
    @FXML private Pane pnlVisionGeneral;
    @FXML private Pane pnlOrdenes;
    @FXML private Pane pnlClientes;
    @FXML private Pane pnlMenus;
    @FXML private Pane pnlPaquetes;
    @FXML private Pane pnlConfiguracion;
    

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        Node [] nodes = new Node[10];
        for (int i = 0; i < nodes.length ; i++) {
        	 if(i == 0) {
                 getModelo().setNombreCompania("Apple  Inc.");
                 getModelo().setNombreAirport("Ezeiza, Argentina");
                 getModelo().setCosto("$1500");
                 getModelo().setFecha("25-12-2020");

             } else {
                 getModelo().setNombreCompania("Microsoft");
                 getModelo().setNombreAirport("Changi, Singapur");
                 getModelo().setCosto("$150");
                 getModelo().setFecha("20-12-2020");

             }
            try {
                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource(ControllerMain.ITEM));

                //give the items some effect
                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color: #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color: #02030A");
                });
                          
                pnItems.getChildren().add(nodes[i]);
               
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        pnlVisionGeneral.setStyle("-fx-background-color: #02030A");
        pnlVisionGeneral.toFront();
    }

    @FXML
    void clickSalir(MouseEvent event) {
        Platform.exit();
        System.exit(0);
    }

    public void handleClicks(ActionEvent actionEvent){
        if(actionEvent.getSource() == btnClientes){
            pnlClientes.setStyle("-fx-background-color: #E5C930");
            pnlClientes.toFront();
        } else if(actionEvent.getSource() == btnMenus){
            pnlMenus.setStyle("-fx-background-color: #B9E530");
            pnlMenus.toFront();
        } else if(actionEvent.getSource() == btnVisiongeneral){
            pnlVisionGeneral.setStyle("-fx-background-color: #02030A");
            pnlVisionGeneral.toFront();
        } else if(actionEvent.getSource() == btnOrden){
            pnlOrdenes.setStyle("-fx-background-color: #EFA551");
            pnlOrdenes.toFront();
        } else if(actionEvent.getSource() == btnPaquetes){
            pnlPaquetes.setStyle("-fx-background-color: #30AEE5");
            pnlPaquetes.toFront();
        } else if(actionEvent.getSource() == btnConfiguracion){
            pnlConfiguracion.setStyle("-fx-background-color: #A030E5");
            pnlConfiguracion.toFront();
        }
    }
}
