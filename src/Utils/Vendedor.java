package Utils;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
	
	public String id;
	public String name;
	
	public List<Reporte> reportes;

	public Vendedor(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.reportes = new ArrayList<Reporte>();
	}
	
	public void Crear_Reporte(Cliente c,Cocinero coci) {
		Reporte r= new Reporte(c,this,coci, c.postres);
		this.reportes.add(r);
		c.agregar_reporte(r);
	}
	
	public void imprimir_reporte() {
		for( Reporte r:this.reportes) {
			r.imprimir_Reporte();
		}
	}
	
	
	

}
