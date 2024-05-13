package Cajero;

public class Empleado extends Usuario{
	private String puesto;
	private double sueldo;
	private String departamento;
	public Empleado(String nombre, int pin, String rol, String dni, String puesto, double sueldo, String departamento) {
		super(nombre, pin, rol, dni);
		this.puesto = puesto;
		this.sueldo = sueldo;
		this.departamento = departamento;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Empleado [puesto=" + puesto + ", sueldo=" + sueldo + ", departamento=" + departamento + "]";
	}
	
}
