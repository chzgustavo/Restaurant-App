package App.java.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ControllerItem extends Controller implements Initializable {

    @FXML private Label nombreCompania;
    @FXML private Label nombreAirport;
    @FXML private Label fecha;
    @FXML private Label costo;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		nombreCompania.setText(getModelo().getNombreCompania());
		nombreAirport.setText(getModelo().getNombreAirport());
		fecha.setText(getModelo().getFecha());
		costo.setText(getModelo().getCosto());

	}    
}
