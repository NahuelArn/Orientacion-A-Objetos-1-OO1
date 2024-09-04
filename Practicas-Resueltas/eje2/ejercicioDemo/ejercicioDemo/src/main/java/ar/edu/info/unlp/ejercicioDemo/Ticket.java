package ar.edu.info.unlp.ejercicioDemo;

public class Ticket {
//	private date fecha;
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public double impuesto() {
		return this.precioTotal*0.21;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
}
