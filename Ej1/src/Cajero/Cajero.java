package Cajero;

public class Cajero {
	private String ubicacion;
	private double sueldo;
	public Cajero(String ubicacion, double sueldo) {
		super();
		this.ubicacion = ubicacion;
		this.sueldo = sueldo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
