package Utils;

public class Insumo {
	public String nameS;
	public String mes;
	public double año;
	public String id;
	public String nombre;
	public int cant;
	public String descripcion;
	
	public Insumo(String name,String mes,double año,String id, String nombre, int cant, String descripcion) {
		super();
		this.nameS=name;
		this.mes=mes;
		this.año=año;
		this.id = id;
		this.nombre = nombre;
		this.cant=cant;
		this.descripcion = descripcion;
	}
	
	public void imprimir_linea(String mes,double año) {
		System.out.println(this.mes +"-"+ this.año +"\t\t\t"+this.nameS+"\t\t\t"+this.nombre+"\t\t\t"+String.valueOf(this.cant));
	}

	

}
