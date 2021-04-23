package Utils;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public String Mes;
	public double Año;
	public String Nombre;
	public List<Postre> postres;
	public List<Insumo> insumos;
	
	public List<Reporte> reportes;
	public List<ReporteMA> reportesMA;
	
	public Cliente(String mes,double año,String nombre) {
		super();
		this.Nombre = nombre;
		this.Mes = mes;
		this.Año = año;
		this.postres = new ArrayList<Postre>();
		this.reportes = new ArrayList<Reporte>();
		this.insumos = new ArrayList<Insumo>();
		this.reportesMA = new ArrayList<ReporteMA>();
	}
	
	public void agregar_Postre(Postre p) {
		this.postres.add(p);
	}
	
	public void agregar_reporte(Reporte r) {
		this.reportes.add(r);
	}
	
	public void imprimir_postre() {
		System.out.println("POSTRE DE: \t\t\t"+this.Nombre);
		System.out.println("FECHA \t\t\t\t\t POSTRE ID \t\t\t\t NOMBRE POSTRE \t\t\t\t CANTIDAD \t\t\t\t PRECIO UNIDAD \t\t\t\t TOTAL");
		for(Postre p: this.postres) {
			p.imprimir_linea();
		}
		System.out.println("\n");
	}
	
	public void imprimir_reporte() {
		for(Reporte r: this.reportes) {
			r.imprimir_Reporte();
		}
	}
	
	public void imprimir_insumo() {
		System.out.println("FECHA \t\t\t\t SUCURSAL \t\t\t\t NOMBRE INSUMO \t\t\t\t CANTIDAD");
		for(Insumo i: this.insumos) {
			i.imprimir_linea(Mes,Año);
		}
		System.out.println("\n");
	}
	
	public void imprimir_reporteMA(String Mes,double Año) {
		for(ReporteMA rma:this.reportesMA) {
			rma.imprimir_reporte(Mes,Año);
		}
		
	}
	
}
