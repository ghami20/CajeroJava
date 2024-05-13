package Cajero;

public class Cuenta {
	private String operaciones;
	private double saldo;
	private Cliente cliente;
	private int nroCliente;
	public Cuenta(String operaciones, double saldo, Cliente cliente, int nroCliente) {
		super();
		this.operaciones = operaciones;
		this.saldo = saldo;
		this.cliente = cliente;
		this.nroCliente = nroCliente;
	}
	public String getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	@Override
	public String toString() {
		return "Cuenta [operaciones=" + operaciones + ", saldo=" + saldo + ", cliente=" + cliente + ", nroCliente="
				+ nroCliente + "]";
	}
	
	
}
