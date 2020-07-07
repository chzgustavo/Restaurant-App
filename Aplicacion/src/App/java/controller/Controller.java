package App.java.controller;

import App.java.model.Model;

public class Controller {

	private static Model modelo;

	public void setModelo(Model modelo) {
		Controller.modelo = modelo;		
	}

    public Model getModelo()
    {
    	return modelo;
    }    
}
