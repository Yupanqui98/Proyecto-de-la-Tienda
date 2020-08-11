import java.util.ArrayList;

public class Tienda {

	private  ArrayList<Producto>productos = new ArrayList<>();
	
	public void AgregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	
	public void Mostrar() {
		for (int i = 0; i < productos.size(); i++) {
			System.out.println(productos.get(i));
		}
	}	
}
