package ar.edu.info.unlp.ejercicioDemo;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPeso() * producto.getPrecioPorKilo();
		this.pesoTotal += producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		//preguntar como capturar la fecha
		Ticket ticked = new Ticket ();
		
		ticked.setCantidadDeProductos(this.cantidadDeProductos);
		ticked.setPesoTotal(this.pesoTotal);
		ticked.setPrecioTotal(this.precioTotal);
		return ticked;
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

