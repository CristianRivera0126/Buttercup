package Utils;

import java.util.ArrayList;
import java.util.List;

public class Reporte {
	public int id;
	
	public Cliente cliente;
	public Vendedor vendedor;
	public Cocinero cocinero;
	public List<Postre> postres;
	
	public Reporte(Cliente cliente, Vendedor vendedor, Cocinero coci, List<Postre> postres) {
	this.id=(int)(Math.random() * (3000 - 1000 + 1) + 1000);
	this.cliente=cliente;
	this.vendedor=vendedor;
	this.cocinero=coci;
	this.postres=new ArrayList<Postre>();
	this.postres.addAll(postres);
	}
	
	public void actualizar_postre(List<Postre> postres) {
		this.postres.removeAll(this.postres);
		this.postres.addAll(postres);
	}
	
	public void imprimir_Reporte() {
		System.out.println("REPORTE # \t\t\t"+String.valueOf(this.id));
		System.out.println("CLIENTE: \t\t\t"+this.cliente.Nombre);
		System.out.println("ATENDIDO POR: \t\t\t"+this.vendedor.id+" - "+this.vendedor.name);
		System.out.println("COCINADO POR: \t\t\t"+this.cocinero.id+" - "+this.cocinero.nombre);
		System.out.println("\n");	
		
	}

}
