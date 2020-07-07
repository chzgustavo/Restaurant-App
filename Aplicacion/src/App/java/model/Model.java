package App.java.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private String nombreCompania;
	private String nombreAirport;
	private String fecha;
	private String costo;
	private static List<String> datosCliente;
	
	public Model() {
		
		datosCliente = new ArrayList<String>();
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public String getNombreAirport() {
		return nombreAirport;
	}

	public void setNombreAirport(String nombreAirport) {
		this.nombreAirport = nombreAirport;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}
	
	public void agregarDatos() {
		datosCliente.add(getNombreCompania());
		datosCliente.add(getNombreAirport());
		datosCliente.add(getFecha());
		datosCliente.add(getCosto());
	}
	
	public void eliminarDatos() {
		datosCliente.clear();
	}	
}
