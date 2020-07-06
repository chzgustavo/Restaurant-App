package App.java.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ControllerItem implements Initializable {

    @FXML private Label nombreCompania;
    @FXML private Label nombreAirport;
    @FXML private Label fecha;
    @FXML private Label costo;
	
    
    public Label getNombreCompania() {
		return nombreCompania;
	}


	public void setNombreCompania(Label nombreCompania) {
		this.nombreCompania = nombreCompania;
	}


	public Label getNombreAirport() {
		return nombreAirport;
	}


	public void setNombreAirport(Label nombreAirport) {
		this.nombreAirport = nombreAirport;
	}


	public Label getFecha() {
		return fecha;
	}


	public void setFecha(Label fecha) {
		this.fecha = fecha;
	}


	public Label getCosto() {
		return costo;
	}


	public void setCosto(Label costo) {
		this.costo = costo;
	}

	public void setLabelNombreCompania(String name) {
		nombreCompania.setText(name);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//nombreCompania.setText("Apple");
		
	}
    
    
}
