package Utils;

public class Insumo {
	public String nameS;
	public String mes;
	public double a�o;
	public String id;
	public String nombre;
	public int cant;
	public String descripcion;
	
	public Insumo(String name,String mes,double a�o,String id, String nombre, int cant, String descripcion) {
		super();
		this.nameS=name;
		this.mes=mes;
		this.a�o=a�o;
		this.id = id;
		this.nombre = nombre;
		this.cant=cant;
		this.descripcion = descripcion;
	}
	
	public void imprimir_linea(String mes,double a�o) {
		System.out.println(this.mes +"-"+ this.a�o +"\t\t\t"+this.nameS+"\t\t\t"+this.nombre+"\t\t\t"+String.valueOf(this.cant));
	}

	

}
