
public class Producto extends Tienda{
	private String descripcion, fecha;
	private double iva, precio, i=0.09;
	private int codigo;
	public String getDescripcion() {
		return descripcion;
	}
	
	public Producto(int codigo, String fecha,String descripcion, double precio ) {
		this.codigo= codigo;
		this.fecha = fecha;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void consultar() {
		System.out.println("El codigo del producto es "+codigo+" su fecha de creación es "+fecha+" tiene como descripción "+descripcion+" el precio es "+getPrecio());
	}
	
	public void modificar(int codigo, String fecha, double precio) {
		this.codigo= codigo;
		this.fecha= fecha;
		this.precio= precio;
	}
		
	public void Total() {
		iva= precio*i;
		precio= precio + iva;
	}
	
	public String toString() {
		StringBuilder n = new StringBuilder();
		n.append("\nCodigo: ");
		n.append(codigo);
		n.append("\nFecha de Creación: ");
		n.append(fecha);
		n.append("\nDescripción: ");
		n.append(descripcion);
		n.append("\nPrecio: ");
		n.append(precio);
		return n.toString();
	}
}