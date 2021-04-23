package Utils;

import java.util.ArrayList;
import java.util.List;

public class ReporteMA{
	public int id;
	public int mes;
	public double año;
	
	public Cliente cliente;
	public Vendedor vendedor;
	public Cocinero cocinero;
	public Sucursal sucu;
	public List<Insumo> insumos;
	
	public ReporteMA(Cliente cliente, Vendedor vendedor, Cocinero coci,Sucursal sucu, List<Insumo> insumos) {
		super();
		this.id=(int)(Math.random() * (3000 - 1000 + 1) + 1000);
		this.mes=mes;
		this.año=año;
		this.cliente=cliente;
		this.vendedor=vendedor;
		this.cocinero=cocinero;
		this.sucu=sucu;
		this.insumos=new ArrayList<Insumo>();
		this.insumos.addAll(insumos);
	}
	
	public void actualizar_insumo(List<Insumo> insumos) {
		this.insumos.removeAll(this.insumos);
		this.insumos.addAll(insumos);
	}
	
	public void imprimir_reporte(String mes,double año) {
		System.out.println("REPORTE AGREGADO # \t\t\t"+String.valueOf(this.id));
		System.out.println("SUCURSAL: \t\t\t"+this.sucu.nombreS);
		System.out.println("ATENDIDO POR: \t\t\t"+this.vendedor.id+" - "+this.vendedor.name);
		System.out.println("COCINADO POR: \t\t\t"+this.cocinero.nombre+" - "+this.cocinero.nombre);
	}		
	
}
