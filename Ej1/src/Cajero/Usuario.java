package Cajero;


public abstract class Usuario {

	private String nombre;
	private int pin;
	private String rol;
	private String dni;
	public Usuario(String nombre, int pin, String rol, String dni) {
		super();
		this.nombre = nombre;
		this.pin = pin;
		this.rol = rol;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", pin=" + pin + ", rol=" + rol + ", dni=" + dni + "]";
	}
	
	
	
	
	
}
